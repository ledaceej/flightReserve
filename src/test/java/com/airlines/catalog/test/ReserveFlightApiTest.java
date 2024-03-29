package com.airlines.catalog.test;
import com.airlines.catalog.FlightBookingApplication;
import com.airlines.catalog.dto.ReservationDetails;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import static org.assertj.core.api.Assertions.assertThat;

/*
Create a BookingAPIReserveTest class to test the bookingApi using
web environment with random port.
*/
@SpringBootTest(classes = FlightBookingApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ReserveFlightApiTest {

    @Value("${local.server.port}")
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    /* Negative scenaio: 1, Invalid jwtToken
   create the reservationDetails object   with fields firstName, lastName, gender, age,
   flightId, travelClass, ticketPrice, currencyCode,paymentMode, contactNumber
   and contactEmail attributes
   Create the HTTP headers object and pass the jwtToken.
   Call /reserve end point using post method  pass reservationDetails as request body
   Assert that the response message is "Invalid Token"
 */
    @Test
    public void testInvalidJwtToken() {
        ReservationDetails reservationDetails = new ReservationDetails();
        reservationDetails.setFirstName("XXXX");
        reservationDetails.setLastName("XXX");
        reservationDetails.setGender("Male");
        reservationDetails.setAge(30);
        reservationDetails.setFlightId(1);
        reservationDetails.setTravelClass("First Class");
        reservationDetails.setTicketPrice(100.0);
        reservationDetails.setCurrencyCode("USD");
        reservationDetails.setPaymentMode("Credit Card");
        reservationDetails.setContactNumber("1234567890");
        reservationDetails.setContactEmail("XXXXXXXXXXXXXXXXXXXX");

        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer invalidJwtToken");

        HttpEntity<ReservationDetails> request = new HttpEntity<>(reservationDetails, headers);

        ResponseEntity<String> response = restTemplate.postForEntity("/reserve", request, String.class);

        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.UNAUTHORIZED);
        assertThat(response.getBody()).isEqualTo("Invalid Token");
    }
    /* Negative scenaio:  Invalid Contact number
   create the reservationDetails object  with fields firstName, lastName, gender, age,
   flightId, travelClass, ticketPrice, currencyCode,paymentMode, invalid contactNumber
   and contactEmail attributes
   create the HTTP headers object and pass the jwtToken
   call /reserve end point using post method, pass reservationDetails as request body
   assert that the response message contains "Contact Number should be valid phone number"
 */
    @Test
    public void testInvalidContactNumber() {
        ReservationDetails reservationDetails = new ReservationDetails();
        reservationDetails.setFirstName("XXXX");
        reservationDetails.setLastName("XXX");
        reservationDetails.setGender("Male");
        reservationDetails.setAge(30);
        reservationDetails.setFlightId(1);
        reservationDetails.setTravelClass("First Class");
        reservationDetails.setTicketPrice(100.0);
        reservationDetails.setCurrencyCode("USD");
        reservationDetails.setPaymentMode("Credit Card");
        reservationDetails.setContactNumber("XXXX");
        reservationDetails.setContactEmail("XXXXXXXXXXXXXXXXXXXX");

        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization","<Put your valid token>");
        HttpEntity<ReservationDetails> request = new HttpEntity<>(reservationDetails, headers);

        ResponseEntity<String> response = restTemplate.postForEntity("/reserve", request, String.class);

        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.BAD_REQUEST);
        assertThat(response.getBody()).contains("Contact Number should be valid phone number");
        assertThat(response.getBody()).contains("Contact Email should be valid email");
    }
    /* Positive scenario 1:
   create the reservationDetails object  with fields firstName, lastName, gender, age,
   flightId, travelClass, ticketPrice, currencyCode,paymentMode, contactNumber
   and contactEmail attributes
   create the HTTP headers object and pass the jwtToken
   call /reserve end point using post method, pass reservationDetails as request body
   assert that http status OK
   and  assert that the response message contains "reservation made successfully"
 */
    @Test
    public void testPositiveScenario() {
        ReservationDetails reservationDetails = new ReservationDetails();
        reservationDetails.setFirstName("XXXX");
        reservationDetails.setLastName("XXX");
        reservationDetails.setGender("Male");
        reservationDetails.setAge(30);
        reservationDetails.setFlightId(1);
        reservationDetails.setTravelClass("First Class");
        reservationDetails.setTicketPrice(100.0);
        reservationDetails.setCurrencyCode("USD");
        reservationDetails.setPaymentMode("Credit Card");
        reservationDetails.setContactNumber("+911234567890");
        reservationDetails.setContactEmail("XX@gmail.com");

        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization","<Put your valid token>");
        HttpEntity<ReservationDetails> request = new HttpEntity<>(reservationDetails, headers);
        ResponseEntity<String> response = restTemplate.postForEntity("/reserve", request, String.class);
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
    }
}

