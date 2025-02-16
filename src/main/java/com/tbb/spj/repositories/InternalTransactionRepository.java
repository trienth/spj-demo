package com.tbb.spj.repositories;

import com.tbb.spj.dto.InternalTransactionDto;
import com.tbb.spj.dto.InternalTransactionView;
import com.tbb.spj.entities.InternalTransaction;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InternalTransactionRepository extends JpaRepository<InternalTransaction, Long> {
    List<InternalTransaction> findByStatus(String status);

    List<InternalTransactionView> findAllByStatus(@Param("status") String status);

    @Query(value = "SELECT new com.tbb.spj.dto.InternalTransactionDto(u.transactionId, u.status, u.inquiryCounter, u.additionalInformation, u.accountingReference, u.accountingDate) " +
            "FROM InternalTransaction u WHERE u.status = :status")
    List<InternalTransactionDto> findPendingTransaction(@Param("status") String status);

    @Query(value = "SELECT new com.tbb.spj.dto.InternalTransactionDto(u.transactionId, u.status, u.inquiryCounter, u.additionalInformation, u.accountingReference, u.accountingDate) " +
            "FROM InternalTransaction u WHERE u.status = :status")
    Page<InternalTransactionDto> findAllPendingTransaction(@Param("status") String status, Pageable pageable);

}