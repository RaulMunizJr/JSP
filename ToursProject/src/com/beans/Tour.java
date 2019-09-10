package com.beans;

public class Tour {

	private int tourId;
	private String tourName;
	private String startingLocation;
	private String[] placesOfInterest;
	private double tourCost;
	private int noOfDays;
	private double discountPer;
	
	public Tour(){
		
	}
	
	public Tour(int tourId, String tourName, String startingLocation, String[] placesOfInterest,
			double tourCost, int noOfDays, double discountPer) {
		super();
		this.tourId = tourId;
		this.tourName = tourName;
		this.startingLocation = startingLocation;
		this.placesOfInterest = placesOfInterest;
		this.tourCost = tourCost;
		this.noOfDays = noOfDays;
		this.discountPer = discountPer;
	}
	
	public int getTourId() {
		return tourId;
	}
	public void setTourId(int tourId) {
		this.tourId = tourId;
	}
	public String getTourName() {
		return tourName;
	}
	public void setTourName(String tourName) {
		this.tourName = tourName;
	}
	public String getStartingLocation() {
		return startingLocation;
	}
	public void setStartingLocation(String startingLocation) {
		this.startingLocation = startingLocation;
	}
	public String[] getPlacesOfInterest() {
		return placesOfInterest;
	}
	public void setPlacesOfInterest(String[] placesOfInterest) {
		this.placesOfInterest = placesOfInterest;
	}
	public double getTourCost() {
		return tourCost;
	}
	public void setTourCost(double tourCost) {
		this.tourCost = tourCost;
	}
	public int getNoOfDays() {
		return noOfDays;
	}
	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}
	public double getDiscountPer() {
		return discountPer;
	}
	public void setDiscountPer(double discountPer) {
		this.discountPer = discountPer;
	}
	
}
