package com.airlines.catalog.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import javax.validation.constraints.*;

/* Create a class ReservationDetails with attributes
firstName not blank, lastName not blank,
gender, age between 1 and 120, flightId as int, travelClass not blank,
ticketPrice as double and not blank,
currencyCode exactly  3 characters, reservationStatus,  paymentStatus,
paymentMode,  ContactEmail should be valid email, contactNumber should be valid phone number
*/
@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
public class ReservationDetails {
    @NotBlank(message = "First Name is required")
    private String firstName;
    @NotBlank(message = "Last Name is required")
    private String lastName;
    private String gender;
    @Min(value = 1, message = "Age should be greater than 1")
    @Max(value = 120, message = "Age should be less than 120")
    private int age;
    @NotNull(message = "Flight Id is required")
    private int flightId;
    @NotBlank(message = "Travel Class is required")
    private String travelClass;
    @NotNull(message = "Ticket Price is required")
    private double ticketPrice;
    @NotBlank(message = "Currency Code is required")
    @Pattern(regexp = "^[A-Z]{3}$", message = "Currency Code should be exactly 3 characters")
    private String currencyCode;
    private String reservationStatus;
    private String paymentStatus;
    private String paymentMode;
    @Email(message = "Contact Email should be valid email")
    private String contactEmail;
    // Phone Number should be 12 or more digits and starts with +
    @Pattern(regexp = "^\\+[0-9]{12,}$", message = "Contact Number should be valid phone number")
    private String contactNumber;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getFlightId() {
        return flightId;
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }

    public String getTravelClass() {
        return travelClass;
    }

    public void setTravelClass(String travelClass) {
        this.travelClass = travelClass;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getReservationStatus() {
        return reservationStatus;
    }

    public void setReservationStatus(String reservationStatus) {
        this.reservationStatus = reservationStatus;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
}
