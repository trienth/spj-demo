package com.tbb.spj.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table
public class InternalTransaction implements Serializable {
    @Id
    @GeneratedValue(generator = "internal_tx_seq", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "internal_tx_seq", sequenceName = "internal_transaction_transaction_id_seq", allocationSize = 1)
    private long transactionId;
    private String channelId;
    private String channelReference;
    private String accountingReference;
    private String accountingDate;
    private String accountingCompany;
    private String paymentService;
    private String priority;
    private String transactionDate;
    private String currency;
    private BigDecimal amount;
    private String senderName;
    private String senderAddress;
    private String senderAccount;
    private String senderAccountType;
    private String receiverName;
    private String receiverAddress;
    private String receiverAccount;
    private String receiverAccountType;
    private String paymentNarratives;
    private String status;
    private String errorCode;
    private String errorMessage;
    private String partnerId;
    private String batchId;
    private String additionalInformation;
    private String createDateTime;
    private String refundAccountingReference;
    private String orgAccountingReference;
    private String chargeCode;
    private String chargeAmount;
    private String chargeAccount;
    private String chargeCurrency;
    private Integer inquiryCounter;
    private Integer version;
    private LocalDateTime createDate;
    private LocalDateTime updateDate;

    public InternalTransaction() {
    }

    public long getTransactionId() {
        return this.transactionId;
    }

    public String getChannelId() {
        return this.channelId;
    }

    public String getChannelReference() {
        return this.channelReference;
    }

    public String getAccountingReference() {
        return this.accountingReference;
    }

    public String getAccountingDate() {
        return this.accountingDate;
    }

    public String getAccountingCompany() {
        return this.accountingCompany;
    }

    public String getPaymentService() {
        return this.paymentService;
    }

    public String getPriority() {
        return this.priority;
    }

    public String getTransactionDate() {
        return this.transactionDate;
    }

    public String getCurrency() {
        return this.currency;
    }

    public BigDecimal getAmount() {
        return this.amount;
    }

    public String getSenderName() {
        return this.senderName;
    }

    public String getSenderAddress() {
        return this.senderAddress;
    }

    public String getSenderAccount() {
        return this.senderAccount;
    }

    public String getSenderAccountType() {
        return this.senderAccountType;
    }

    public String getReceiverName() {
        return this.receiverName;
    }

    public String getReceiverAddress() {
        return this.receiverAddress;
    }

    public String getReceiverAccount() {
        return this.receiverAccount;
    }

    public String getReceiverAccountType() {
        return this.receiverAccountType;
    }

    public String getPaymentNarratives() {
        return this.paymentNarratives;
    }

    public String getStatus() {
        return this.status;
    }

    public String getErrorCode() {
        return this.errorCode;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public String getPartnerId() {
        return this.partnerId;
    }

    public String getBatchId() {
        return this.batchId;
    }

    public String getAdditionalInformation() {
        return this.additionalInformation;
    }

    public String getCreateDateTime() {
        return this.createDateTime;
    }

    public String getRefundAccountingReference() {
        return this.refundAccountingReference;
    }

    public String getOrgAccountingReference() {
        return this.orgAccountingReference;
    }

    public String getChargeCode() {
        return this.chargeCode;
    }

    public String getChargeAmount() {
        return this.chargeAmount;
    }

    public String getChargeAccount() {
        return this.chargeAccount;
    }

    public String getChargeCurrency() {
        return this.chargeCurrency;
    }

    public Integer getInquiryCounter() {
        return this.inquiryCounter;
    }

    public Integer getVersion() {
        return this.version;
    }

    public LocalDateTime getCreateDate() {
        return this.createDate;
    }

    public LocalDateTime getUpdateDate() {
        return this.updateDate;
    }

    public void setTransactionId(long transactionId) {
        this.transactionId = transactionId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public void setChannelReference(String channelReference) {
        this.channelReference = channelReference;
    }

    public void setAccountingReference(String accountingReference) {
        this.accountingReference = accountingReference;
    }

    public void setAccountingDate(String accountingDate) {
        this.accountingDate = accountingDate;
    }

    public void setAccountingCompany(String accountingCompany) {
        this.accountingCompany = accountingCompany;
    }

    public void setPaymentService(String paymentService) {
        this.paymentService = paymentService;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public void setSenderAddress(String senderAddress) {
        this.senderAddress = senderAddress;
    }

    public void setSenderAccount(String senderAccount) {
        this.senderAccount = senderAccount;
    }

    public void setSenderAccountType(String senderAccountType) {
        this.senderAccountType = senderAccountType;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }

    public void setReceiverAccount(String receiverAccount) {
        this.receiverAccount = receiverAccount;
    }

    public void setReceiverAccountType(String receiverAccountType) {
        this.receiverAccountType = receiverAccountType;
    }

    public void setPaymentNarratives(String paymentNarratives) {
        this.paymentNarratives = paymentNarratives;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public void setPartnerId(String partnerId) {
        this.partnerId = partnerId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public void setAdditionalInformation(String additionalInformation) {
        this.additionalInformation = additionalInformation;
    }

    public void setCreateDateTime(String createDateTime) {
        this.createDateTime = createDateTime;
    }

    public void setRefundAccountingReference(String refundAccountingReference) {
        this.refundAccountingReference = refundAccountingReference;
    }

    public void setOrgAccountingReference(String orgAccountingReference) {
        this.orgAccountingReference = orgAccountingReference;
    }

    public void setChargeCode(String chargeCode) {
        this.chargeCode = chargeCode;
    }

    public void setChargeAmount(String chargeAmount) {
        this.chargeAmount = chargeAmount;
    }

    public void setChargeAccount(String chargeAccount) {
        this.chargeAccount = chargeAccount;
    }

    public void setChargeCurrency(String chargeCurrency) {
        this.chargeCurrency = chargeCurrency;
    }

    public void setInquiryCounter(Integer inquiryCounter) {
        this.inquiryCounter = inquiryCounter;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public void setUpdateDate(LocalDateTime updateDate) {
        this.updateDate = updateDate;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof InternalTransaction)) return false;
        final InternalTransaction other = (InternalTransaction) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getTransactionId() != other.getTransactionId()) return false;
        final Object this$channelId = this.getChannelId();
        final Object other$channelId = other.getChannelId();
        if (this$channelId == null ? other$channelId != null : !this$channelId.equals(other$channelId)) return false;
        final Object this$channelReference = this.getChannelReference();
        final Object other$channelReference = other.getChannelReference();
        if (this$channelReference == null ? other$channelReference != null : !this$channelReference.equals(other$channelReference))
            return false;
        final Object this$accountingReference = this.getAccountingReference();
        final Object other$accountingReference = other.getAccountingReference();
        if (this$accountingReference == null ? other$accountingReference != null : !this$accountingReference.equals(other$accountingReference))
            return false;
        final Object this$accountingDate = this.getAccountingDate();
        final Object other$accountingDate = other.getAccountingDate();
        if (this$accountingDate == null ? other$accountingDate != null : !this$accountingDate.equals(other$accountingDate))
            return false;
        final Object this$accountingCompany = this.getAccountingCompany();
        final Object other$accountingCompany = other.getAccountingCompany();
        if (this$accountingCompany == null ? other$accountingCompany != null : !this$accountingCompany.equals(other$accountingCompany))
            return false;
        final Object this$paymentService = this.getPaymentService();
        final Object other$paymentService = other.getPaymentService();
        if (this$paymentService == null ? other$paymentService != null : !this$paymentService.equals(other$paymentService))
            return false;
        final Object this$priority = this.getPriority();
        final Object other$priority = other.getPriority();
        if (this$priority == null ? other$priority != null : !this$priority.equals(other$priority)) return false;
        final Object this$transactionDate = this.getTransactionDate();
        final Object other$transactionDate = other.getTransactionDate();
        if (this$transactionDate == null ? other$transactionDate != null : !this$transactionDate.equals(other$transactionDate))
            return false;
        final Object this$currency = this.getCurrency();
        final Object other$currency = other.getCurrency();
        if (this$currency == null ? other$currency != null : !this$currency.equals(other$currency)) return false;
        final Object this$amount = this.getAmount();
        final Object other$amount = other.getAmount();
        if (this$amount == null ? other$amount != null : !this$amount.equals(other$amount)) return false;
        final Object this$senderName = this.getSenderName();
        final Object other$senderName = other.getSenderName();
        if (this$senderName == null ? other$senderName != null : !this$senderName.equals(other$senderName))
            return false;
        final Object this$senderAddress = this.getSenderAddress();
        final Object other$senderAddress = other.getSenderAddress();
        if (this$senderAddress == null ? other$senderAddress != null : !this$senderAddress.equals(other$senderAddress))
            return false;
        final Object this$senderAccount = this.getSenderAccount();
        final Object other$senderAccount = other.getSenderAccount();
        if (this$senderAccount == null ? other$senderAccount != null : !this$senderAccount.equals(other$senderAccount))
            return false;
        final Object this$senderAccountType = this.getSenderAccountType();
        final Object other$senderAccountType = other.getSenderAccountType();
        if (this$senderAccountType == null ? other$senderAccountType != null : !this$senderAccountType.equals(other$senderAccountType))
            return false;
        final Object this$receiverName = this.getReceiverName();
        final Object other$receiverName = other.getReceiverName();
        if (this$receiverName == null ? other$receiverName != null : !this$receiverName.equals(other$receiverName))
            return false;
        final Object this$receiverAddress = this.getReceiverAddress();
        final Object other$receiverAddress = other.getReceiverAddress();
        if (this$receiverAddress == null ? other$receiverAddress != null : !this$receiverAddress.equals(other$receiverAddress))
            return false;
        final Object this$receiverAccount = this.getReceiverAccount();
        final Object other$receiverAccount = other.getReceiverAccount();
        if (this$receiverAccount == null ? other$receiverAccount != null : !this$receiverAccount.equals(other$receiverAccount))
            return false;
        final Object this$receiverAccountType = this.getReceiverAccountType();
        final Object other$receiverAccountType = other.getReceiverAccountType();
        if (this$receiverAccountType == null ? other$receiverAccountType != null : !this$receiverAccountType.equals(other$receiverAccountType))
            return false;
        final Object this$paymentNarratives = this.getPaymentNarratives();
        final Object other$paymentNarratives = other.getPaymentNarratives();
        if (this$paymentNarratives == null ? other$paymentNarratives != null : !this$paymentNarratives.equals(other$paymentNarratives))
            return false;
        final Object this$status = this.getStatus();
        final Object other$status = other.getStatus();
        if (this$status == null ? other$status != null : !this$status.equals(other$status)) return false;
        final Object this$errorCode = this.getErrorCode();
        final Object other$errorCode = other.getErrorCode();
        if (this$errorCode == null ? other$errorCode != null : !this$errorCode.equals(other$errorCode)) return false;
        final Object this$errorMessage = this.getErrorMessage();
        final Object other$errorMessage = other.getErrorMessage();
        if (this$errorMessage == null ? other$errorMessage != null : !this$errorMessage.equals(other$errorMessage))
            return false;
        final Object this$partnerId = this.getPartnerId();
        final Object other$partnerId = other.getPartnerId();
        if (this$partnerId == null ? other$partnerId != null : !this$partnerId.equals(other$partnerId)) return false;
        final Object this$batchId = this.getBatchId();
        final Object other$batchId = other.getBatchId();
        if (this$batchId == null ? other$batchId != null : !this$batchId.equals(other$batchId)) return false;
        final Object this$additionalInformation = this.getAdditionalInformation();
        final Object other$additionalInformation = other.getAdditionalInformation();
        if (this$additionalInformation == null ? other$additionalInformation != null : !this$additionalInformation.equals(other$additionalInformation))
            return false;
        final Object this$createDateTime = this.getCreateDateTime();
        final Object other$createDateTime = other.getCreateDateTime();
        if (this$createDateTime == null ? other$createDateTime != null : !this$createDateTime.equals(other$createDateTime))
            return false;
        final Object this$refundAccountingReference = this.getRefundAccountingReference();
        final Object other$refundAccountingReference = other.getRefundAccountingReference();
        if (this$refundAccountingReference == null ? other$refundAccountingReference != null : !this$refundAccountingReference.equals(other$refundAccountingReference))
            return false;
        final Object this$orgAccountingReference = this.getOrgAccountingReference();
        final Object other$orgAccountingReference = other.getOrgAccountingReference();
        if (this$orgAccountingReference == null ? other$orgAccountingReference != null : !this$orgAccountingReference.equals(other$orgAccountingReference))
            return false;
        final Object this$chargeCode = this.getChargeCode();
        final Object other$chargeCode = other.getChargeCode();
        if (this$chargeCode == null ? other$chargeCode != null : !this$chargeCode.equals(other$chargeCode))
            return false;
        final Object this$chargeAmount = this.getChargeAmount();
        final Object other$chargeAmount = other.getChargeAmount();
        if (this$chargeAmount == null ? other$chargeAmount != null : !this$chargeAmount.equals(other$chargeAmount))
            return false;
        final Object this$chargeAccount = this.getChargeAccount();
        final Object other$chargeAccount = other.getChargeAccount();
        if (this$chargeAccount == null ? other$chargeAccount != null : !this$chargeAccount.equals(other$chargeAccount))
            return false;
        final Object this$chargeCurrency = this.getChargeCurrency();
        final Object other$chargeCurrency = other.getChargeCurrency();
        if (this$chargeCurrency == null ? other$chargeCurrency != null : !this$chargeCurrency.equals(other$chargeCurrency))
            return false;
        final Object this$inquiryCounter = this.getInquiryCounter();
        final Object other$inquiryCounter = other.getInquiryCounter();
        if (this$inquiryCounter == null ? other$inquiryCounter != null : !this$inquiryCounter.equals(other$inquiryCounter))
            return false;
        final Object this$version = this.getVersion();
        final Object other$version = other.getVersion();
        if (this$version == null ? other$version != null : !this$version.equals(other$version)) return false;
        final Object this$createDate = this.getCreateDate();
        final Object other$createDate = other.getCreateDate();
        if (this$createDate == null ? other$createDate != null : !this$createDate.equals(other$createDate))
            return false;
        final Object this$updateDate = this.getUpdateDate();
        final Object other$updateDate = other.getUpdateDate();
        if (this$updateDate == null ? other$updateDate != null : !this$updateDate.equals(other$updateDate))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof InternalTransaction;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final long $transactionId = this.getTransactionId();
        result = result * PRIME + (int) ($transactionId >>> 32 ^ $transactionId);
        final Object $channelId = this.getChannelId();
        result = result * PRIME + ($channelId == null ? 43 : $channelId.hashCode());
        final Object $channelReference = this.getChannelReference();
        result = result * PRIME + ($channelReference == null ? 43 : $channelReference.hashCode());
        final Object $accountingReference = this.getAccountingReference();
        result = result * PRIME + ($accountingReference == null ? 43 : $accountingReference.hashCode());
        final Object $accountingDate = this.getAccountingDate();
        result = result * PRIME + ($accountingDate == null ? 43 : $accountingDate.hashCode());
        final Object $accountingCompany = this.getAccountingCompany();
        result = result * PRIME + ($accountingCompany == null ? 43 : $accountingCompany.hashCode());
        final Object $paymentService = this.getPaymentService();
        result = result * PRIME + ($paymentService == null ? 43 : $paymentService.hashCode());
        final Object $priority = this.getPriority();
        result = result * PRIME + ($priority == null ? 43 : $priority.hashCode());
        final Object $transactionDate = this.getTransactionDate();
        result = result * PRIME + ($transactionDate == null ? 43 : $transactionDate.hashCode());
        final Object $currency = this.getCurrency();
        result = result * PRIME + ($currency == null ? 43 : $currency.hashCode());
        final Object $amount = this.getAmount();
        result = result * PRIME + ($amount == null ? 43 : $amount.hashCode());
        final Object $senderName = this.getSenderName();
        result = result * PRIME + ($senderName == null ? 43 : $senderName.hashCode());
        final Object $senderAddress = this.getSenderAddress();
        result = result * PRIME + ($senderAddress == null ? 43 : $senderAddress.hashCode());
        final Object $senderAccount = this.getSenderAccount();
        result = result * PRIME + ($senderAccount == null ? 43 : $senderAccount.hashCode());
        final Object $senderAccountType = this.getSenderAccountType();
        result = result * PRIME + ($senderAccountType == null ? 43 : $senderAccountType.hashCode());
        final Object $receiverName = this.getReceiverName();
        result = result * PRIME + ($receiverName == null ? 43 : $receiverName.hashCode());
        final Object $receiverAddress = this.getReceiverAddress();
        result = result * PRIME + ($receiverAddress == null ? 43 : $receiverAddress.hashCode());
        final Object $receiverAccount = this.getReceiverAccount();
        result = result * PRIME + ($receiverAccount == null ? 43 : $receiverAccount.hashCode());
        final Object $receiverAccountType = this.getReceiverAccountType();
        result = result * PRIME + ($receiverAccountType == null ? 43 : $receiverAccountType.hashCode());
        final Object $paymentNarratives = this.getPaymentNarratives();
        result = result * PRIME + ($paymentNarratives == null ? 43 : $paymentNarratives.hashCode());
        final Object $status = this.getStatus();
        result = result * PRIME + ($status == null ? 43 : $status.hashCode());
        final Object $errorCode = this.getErrorCode();
        result = result * PRIME + ($errorCode == null ? 43 : $errorCode.hashCode());
        final Object $errorMessage = this.getErrorMessage();
        result = result * PRIME + ($errorMessage == null ? 43 : $errorMessage.hashCode());
        final Object $partnerId = this.getPartnerId();
        result = result * PRIME + ($partnerId == null ? 43 : $partnerId.hashCode());
        final Object $batchId = this.getBatchId();
        result = result * PRIME + ($batchId == null ? 43 : $batchId.hashCode());
        final Object $additionalInformation = this.getAdditionalInformation();
        result = result * PRIME + ($additionalInformation == null ? 43 : $additionalInformation.hashCode());
        final Object $createDateTime = this.getCreateDateTime();
        result = result * PRIME + ($createDateTime == null ? 43 : $createDateTime.hashCode());
        final Object $refundAccountingReference = this.getRefundAccountingReference();
        result = result * PRIME + ($refundAccountingReference == null ? 43 : $refundAccountingReference.hashCode());
        final Object $orgAccountingReference = this.getOrgAccountingReference();
        result = result * PRIME + ($orgAccountingReference == null ? 43 : $orgAccountingReference.hashCode());
        final Object $chargeCode = this.getChargeCode();
        result = result * PRIME + ($chargeCode == null ? 43 : $chargeCode.hashCode());
        final Object $chargeAmount = this.getChargeAmount();
        result = result * PRIME + ($chargeAmount == null ? 43 : $chargeAmount.hashCode());
        final Object $chargeAccount = this.getChargeAccount();
        result = result * PRIME + ($chargeAccount == null ? 43 : $chargeAccount.hashCode());
        final Object $chargeCurrency = this.getChargeCurrency();
        result = result * PRIME + ($chargeCurrency == null ? 43 : $chargeCurrency.hashCode());
        final Object $inquiryCounter = this.getInquiryCounter();
        result = result * PRIME + ($inquiryCounter == null ? 43 : $inquiryCounter.hashCode());
        final Object $version = this.getVersion();
        result = result * PRIME + ($version == null ? 43 : $version.hashCode());
        final Object $createDate = this.getCreateDate();
        result = result * PRIME + ($createDate == null ? 43 : $createDate.hashCode());
        final Object $updateDate = this.getUpdateDate();
        result = result * PRIME + ($updateDate == null ? 43 : $updateDate.hashCode());
        return result;
    }

    public String toString() {
        return "InternalTransaction(transactionId=" + this.getTransactionId() + ", channelId=" + this.getChannelId() + ", channelReference=" + this.getChannelReference() + ", accountingReference=" + this.getAccountingReference() + ", accountingDate=" + this.getAccountingDate() + ", accountingCompany=" + this.getAccountingCompany() + ", paymentService=" + this.getPaymentService() + ", priority=" + this.getPriority() + ", transactionDate=" + this.getTransactionDate() + ", currency=" + this.getCurrency() + ", amount=" + this.getAmount() + ", senderName=" + this.getSenderName() + ", senderAddress=" + this.getSenderAddress() + ", senderAccount=" + this.getSenderAccount() + ", senderAccountType=" + this.getSenderAccountType() + ", receiverName=" + this.getReceiverName() + ", receiverAddress=" + this.getReceiverAddress() + ", receiverAccount=" + this.getReceiverAccount() + ", receiverAccountType=" + this.getReceiverAccountType() + ", paymentNarratives=" + this.getPaymentNarratives() + ", status=" + this.getStatus() + ", errorCode=" + this.getErrorCode() + ", errorMessage=" + this.getErrorMessage() + ", partnerId=" + this.getPartnerId() + ", batchId=" + this.getBatchId() + ", additionalInformation=" + this.getAdditionalInformation() + ", createDateTime=" + this.getCreateDateTime() + ", refundAccountingReference=" + this.getRefundAccountingReference() + ", orgAccountingReference=" + this.getOrgAccountingReference() + ", chargeCode=" + this.getChargeCode() + ", chargeAmount=" + this.getChargeAmount() + ", chargeAccount=" + this.getChargeAccount() + ", chargeCurrency=" + this.getChargeCurrency() + ", inquiryCounter=" + this.getInquiryCounter() + ", version=" + this.getVersion() + ", createDate=" + this.getCreateDate() + ", updateDate=" + this.getUpdateDate() + ")";
    }
}
