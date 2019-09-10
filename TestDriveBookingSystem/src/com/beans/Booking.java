package com.beans;

public class Booking {
	private int bookId;
	private String customerName;
	private String LicenseNo;
	private String vehicleMake;
	private String proposedDate;
	
	public Booking(){
		
	}
	
	public Booking(int bookId, String customerName, String licenseNo, String vehicleMake, String proposedDate) {
		super();
		this.bookId = bookId;
		this.customerName = customerName;
		this.LicenseNo = licenseNo;
		this.vehicleMake = vehicleMake;
		this.proposedDate = proposedDate;
	}
	
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getLicenseNo() {
		return LicenseNo;
	}
	public void setLicenseNo(String licenseNo) {
		LicenseNo = licenseNo;
	}
	public String getVehicleMake() {
		return vehicleMake;
	}
	public void setVehicleMake(String vehicleMake) {
		this.vehicleMake = vehicleMake;
	}
	public String getProposedDate() {
		return proposedDate;
	}
	public void setProposedDate(String proposedDate) {
		this.proposedDate = proposedDate;
	}
	
}
