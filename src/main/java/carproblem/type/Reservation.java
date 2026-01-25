package main.java.carproblem.type;

import java.util.Date;

public class Reservation {
	
	private long bookingId;
	private Date bookingDate;
	private Date startDate;
	private Date endDate;
	private Customer customer;
	private Car car;
	
	public Reservation(long bookingId, Date bookingDate, Date startDate, Date endDate, Customer customer, Car car) {
		this.bookingId = bookingId;
		this.bookingDate = bookingDate;
		this.startDate = startDate;
		this.endDate = endDate;
		this.customer = customer;
		this.car = car;
	}

	public Date getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public long getBookingId() {
		return bookingId;
	}

	public Customer getCustomer() {
		return customer;
	}
	
}
