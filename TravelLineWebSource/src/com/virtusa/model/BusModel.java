package com.virtusa.model;

public class BusModel {

	private int busNo;
	private String busName;
	private String busType;
	private int totalSeats;
	private int fare;
	public int getBusNo() {
		return busNo;
	}
	public void setBusNo(int busNo) {
		this.busNo = busNo;
	}
	public String getBusName() {
		return busName;
	}
	public void setBusName(String busName) {
		this.busName = busName;
	}
	public String getBusType() {
		return busType;
	}
	public void setBusType(String busType) {
		busType = busType;
	}
	public int getTotalSeats() {
		return totalSeats;
	}
	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}
	public int getFare() {
		return fare;
	}
	public void setFare(int fare) {
		this.fare = fare;
	}
	@Override
	public String toString() {
		return "BusModel [busNo=" + busNo + ", busName=" + busName + ", BusType=" + busType + ", totalSeats="
				+ totalSeats + ", fare=" + fare + "]";
	}
	
}
