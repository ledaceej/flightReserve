package com.airlines.catalog.model;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import javax.persistence.*;
import javax.persistence.GenerationType;

/* Build a Passenger Entity class with columns passengerId as Identity auto generated, adult, gender, firstName,
lastName mapped to passenger table, column names sepetated by _*/
@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
@Entity
@Table(name = "passenger")
public class Passenger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "passenger_id")
    private int passengerId;
    @Column(name = "adult")
    private boolean adult;
    @Column(name = "gender")
    private String gender;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    //Create a tostring method to convert the object to string
    @Override
    public String toString() {
        return "Passenger{" +
                "passengerId=" + passengerId +
                ", adult=" + adult +
                ", gender='" + gender + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public int getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(int passengerId) {
        this.passengerId = passengerId;
    }

    public boolean isAdult() {
        return adult;
    }

    public void setAdult(boolean adult) {
        this.adult = adult;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

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

    //Create a toJson method to convert the object to Json String
    public String toJson() {
        return "{" +
                "\"passengerId\":" + passengerId +
                ", \"adult\":" + adult +
                ", \"gender\":\"" + gender + '\"' +
                ", \"firstName\":\"" + firstName + '\"' +
                ", \"lastName\":\"" + lastName + '\"' +
                '}';
    }
}
