package com.airlines.catalog.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import lombok.NoArgsConstructor;
import javax.persistence.*;

/* Create an Entity class Flight mapped to database table flight with following attributes:
 id as id, departureDate, departureTime, departureAirportCode,
 arrivalDate, arrivalTime, arrivalAirportCode,  flightNumber, flightDuration,
 ticketPrice as double, ticketCurrency,seatCapacity as int and seatAvailable as int,
 They should be mapped to database columns with _ as separator */
@Entity
@Table(name = "flight")
@Accessors(chain = true)
@NoArgsConstructor
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getDepartureAirportCode() {
        return departureAirportCode;
    }

    public void setDepartureAirportCode(String departureAirportCode) {
        this.departureAirportCode = departureAirportCode;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getArrivalAirportCode() {
        return arrivalAirportCode;
    }

    public void setArrivalAirportCode(String arrivalAirportCode) {
        this.arrivalAirportCode = arrivalAirportCode;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getFlightDuration() {
        return flightDuration;
    }

    public void setFlightDuration(String flightDuration) {
        this.flightDuration = flightDuration;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public String getTicketCurrency() {
        return ticketCurrency;
    }

    public void setTicketCurrency(String ticketCurrency) {
        this.ticketCurrency = ticketCurrency;
    }

    public int getSeatCapacity() {
        return seatCapacity;
    }

    public void setSeatCapacity(int seatCapacity) {
        this.seatCapacity = seatCapacity;
    }

    public int getSeatAvailable() {
        return seatAvailable;
    }

    public void setSeatAvailable(int seatAvailable) {
        this.seatAvailable = seatAvailable;
    }

    @Column(name = "departure_date")
    private String departureDate;
    @Column(name = "departure_time")
    private String departureTime;
    @Column(name = "departure_airport_code")
    private String departureAirportCode;
    @Column(name = "arrival_date")
    private String arrivalDate;
    @Column(name = "arrival_time")
    private String arrivalTime;
    @Column(name = "arrival_airport_code")
    private String arrivalAirportCode;
    @Column(name = "flight_number")
    private String flightNumber;
    @Column(name = "flight_duration")
    private String flightDuration;
    @Column(name = "ticket_price")
    private double ticketPrice;
    @Column(name = "ticket_currency")
    private String ticketCurrency;
    @Column(name = "seat_capacity")
    private int seatCapacity;
    @Column(name = "seat_available")
    private int seatAvailable;

    //Create a tostring method to convert attributes to string
    @Override
    public String toString() {
        return "Flight{" +
                "id=" + id +
                ", departureDate='" + departureDate + '\'' +
                ", departureTime='" + departureTime + '\'' +
                ", departureAirportCode='" + departureAirportCode + '\'' +
                ", arrivalDate='" + arrivalDate + '\'' +
                ", arrivalTime='" + arrivalTime + '\'' +
                ", arrivalAirportCode='" + arrivalAirportCode + '\'' +
                ", flightNumber='" + flightNumber + '\'' +
                ", flightDuration='" + flightDuration + '\'' +
                ", ticketPrice=" + ticketPrice +
                ", ticketCurrency='" + ticketCurrency + '\'' +
                ", seatCapacity=" + seatCapacity +
                ", seatAvailable=" + seatAvailable +
                '}';
    }
    //Create a toJson method to convert the attributes to Json String
    public String toJson() {
        return "{" +
                "\"id\":" + id +
                ", \"departureDate\":\"" + departureDate + '\"' +
                ", \"departureTime\":\"" + departureTime + '\"' +
                ", \"departureAirportCode\":\"" + departureAirportCode + '\"' +
                ", \"arrivalDate\":\"" + arrivalDate + '\"' +
                ", \"arrivalTime\":\"" + arrivalTime + '\"' +
                ", \"arrivalAirportCode\":\"" + arrivalAirportCode + '\"' +
                ", \"flightNumber\":\"" + flightNumber + '\"' +
                ", \"flightDuration\":\"" + flightDuration + '\"' +
                ", \"ticketPrice\":" + ticketPrice +
                ", \"ticketCurrency\":\"" + ticketCurrency + '\"' +
                ", \"seatCapacity\":" + seatCapacity +
                ", \"seatAvailable\":" + seatAvailable +
                '}';
    }
}
