package com.airlines.catalog.dto;

import com.airlines.catalog.model.Airport;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

/* Create Class FlightDetails with following attributes
flightId as int, departureDate, departureTime, departureAirportCode as string, departureAirportName as string,
departureAirportCity, departureAirportLocale,
arrivalAirportCode, arrivalAirportName, arrivalAirportCity, arrivalAirportLocale,
arrivalDate, arrivalTime, ticketPrice as double,
ticketCurrency, flightNumber, flightDuration, seatAvailable as int
 */
@NoArgsConstructor
@Accessors(chain = true)
public class FlightDetails {
    private int flightId;
    private String departureDate;

    public int getFlightId() {
        return flightId;
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
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

    public String getDepartureAirportName() {
        return departureAirportName;
    }

    public void setDepartureAirportName(String departureAirportName) {
        this.departureAirportName = departureAirportName;
    }

    public String getDepartureAirportCity() {
        return departureAirportCity;
    }

    public void setDepartureAirportCity(String departureAirportCity) {
        this.departureAirportCity = departureAirportCity;
    }

    public String getDepartureAirportLocale() {
        return departureAirportLocale;
    }

    public void setDepartureAirportLocale(String departureAirportLocale) {
        this.departureAirportLocale = departureAirportLocale;
    }

    public String getArrivalAirportCode() {
        return arrivalAirportCode;
    }

    public void setArrivalAirportCode(String arrivalAirportCode) {
        this.arrivalAirportCode = arrivalAirportCode;
    }

    public String getArrivalAirportName() {
        return arrivalAirportName;
    }

    public void setArrivalAirportName(String arrivalAirportName) {
        this.arrivalAirportName = arrivalAirportName;
    }

    public String getArrivalAirportCity() {
        return arrivalAirportCity;
    }

    public void setArrivalAirportCity(String arrivalAirportCity) {
        this.arrivalAirportCity = arrivalAirportCity;
    }

    public String getArrivalAirportLocale() {
        return arrivalAirportLocale;
    }

    public void setArrivalAirportLocale(String arrivalAirportLocale) {
        this.arrivalAirportLocale = arrivalAirportLocale;
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

    public int getSeatAvailable() {
        return seatAvailable;
    }

    public void setSeatAvailable(int seatAvailable) {
        this.seatAvailable = seatAvailable;
    }

    private String departureTime;
    private String departureAirportCode;
    private String departureAirportName;
    private String departureAirportCity;
    private String departureAirportLocale;
    private String arrivalAirportCode;
    private String arrivalAirportName;
    private String arrivalAirportCity;
    private String arrivalAirportLocale;
    private String arrivalDate;
    private String arrivalTime;
    private double ticketPrice;
    private String ticketCurrency;
    private String flightNumber;
    private String flightDuration;
    private int seatAvailable;

    //Create toString method for the object
    @Override
    public String toString() {
        return "FlightDetails{" +
                "flightId=" + flightId +
                ", departureDate='" + departureDate + '\'' +
                ", departureTime='" + departureTime + '\'' +
                ", departureAirportCode='" + departureAirportCode + '\'' +
                ", departureAirportName='" + departureAirportName + '\'' +
                ", departureAirportCity='" + departureAirportCity + '\'' +
                ", departureAirportLocale='" + departureAirportLocale + '\'' +
                ", arrivalAirportCode='" + arrivalAirportCode + '\'' +
                ", arrivalAirportName='" + arrivalAirportName + '\'' +
                ", arrivalAirportCity='" + arrivalAirportCity + '\'' +
                ", arrivalAirportLocale='" + arrivalAirportLocale + '\'' +
                ", arrivalDate='" + arrivalDate + '\'' +
                ", arrivalTime='" + arrivalTime + '\'' +
                ", ticketPrice=" + ticketPrice +
                ", ticketCurrency='" + ticketCurrency + '\'' +
                ", flightNumber='" + flightNumber + '\'' +
                ", flightDuration='" + flightDuration + '\'' +
                ", seatAvailable=" + seatAvailable +
                '}';

    }
    //Create a toJson method to convert the attributes to Json String
    public String toJson() {
        return "{" +
                "\"flightId\":" + flightId +
                ", \"departureDate\":\"" + departureDate + '\"' +
                ", \"departureTime\":\"" + departureTime + '\"' +
                ", \"departureAirportCode\":\"" + departureAirportCode + '\"' +
                ", \"departureAirportName\":\"" + departureAirportName + '\"' +
                ", \"departureAirportCity\":\"" + departureAirportCity + '\"' +
                ", \"departureAirportLocale\":\"" + departureAirportLocale + '\"' +
                ", \"arrivalAirportCode\":\"" + arrivalAirportCode + '\"' +
                ", \"arrivalAirportName\":\"" + arrivalAirportName + '\"' +
                ", \"arrivalAirportCity\":\"" + arrivalAirportCity + '\"' +
                ", \"arrivalAirportLocale\":\"" + arrivalAirportLocale + '\"' +
                ", \"arrivalDate\":\"" + arrivalDate + '\"' +
                ", \"arrivalTime\":\"" + arrivalTime + '\"' +
                ", \"ticketPrice\":" + ticketPrice +
                ", \"ticketCurrency\":\"" + ticketCurrency + '\"' +
                ", \"flightNumber\":\"" + flightNumber + '\"' +
                ", \"flightDuration\":\"" + flightDuration + '\"' +
                ", \"seatAvailable\":" + seatAvailable +
                '}';
    }
}
