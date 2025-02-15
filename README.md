
# So sánh query dùng normal entity và dto projection
Dùng interface projection
Tạo 2 query với query method và @Query
Tạo 10 records trong db
Expose REST API để compare

``` sql
DO $$ 
DECLARE 
    i INT := 1;
BEGIN
    WHILE i <= 100000 LOOP
        INSERT INTO internal_transaction (
            transaction_id, channel_id, accounting_reference, amount, currency, status, create_date
        ) VALUES (
            nextval('internal_transaction_transaction_id_seq'), 
            'CH_' || i, 
            'AR_' || i, 
            random() * 1000, 
            CASE WHEN random() > 0.5 THEN 'USD' ELSE 'EUR' END, 
            CASE WHEN random() > 0.5 THEN 'COMPLETED' ELSE 'PENDING' END, 
            now() - (random() * interval '30 days')
        );
        i := i + 1;
    END LOOP;
END $$;
```

```
curl -X GET --location "http://localhost:8777/transactions/normal?status=PENDING"
```

```
curl -X GET --location "http://localhost:8777/transactions/dto?status=PENDING"
```

