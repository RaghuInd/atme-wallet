package com.atme.wallet.entity;

public class FundTransferDTO {

	private String fromEmailId;
	private String toEmailId;
	private Double amount;
	public FundTransferDTO() {
		super();
	}
	public FundTransferDTO(String fromEmailId, String toEmailId, Double amount) {
		super();
		this.fromEmailId = fromEmailId;
		this.toEmailId = toEmailId;
		this.amount = amount;
	}
	public String getFromEmailId() {
		return fromEmailId;
	}
	public void setFromEmailId(String fromEmailId) {
		this.fromEmailId = fromEmailId;
	}
	public String getToEmailId() {
		return toEmailId;
	}
	public void setToEmailId(String toEmailId) {
		this.toEmailId = toEmailId;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
}
