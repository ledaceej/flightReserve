package com.airlines.catalog.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import lombok.NoArgsConstructor;
import javax.persistence.*;

/* Create an Entity class Airport mapped to table airport with following 4 attributes:
airportCode as id, airportName, airportCity and airportLocale.
They should be mapped to database columns with _ as separator.*/

@Entity
@Table(name = "airport")
@Accessors(chain = true)
@NoArgsConstructor
public class Airport {
    public String getAirportCode() {
        return airportCode;
    }

    public void setAirportCode(String airportCode) {
        this.airportCode = airportCode;
    }

    public String getAirportName() {
        return airportName;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }

    public String getAirportCity() {
        return airportCity;
    }

    public void setAirportCity(String airportCity) {
        this.airportCity = airportCity;
    }

    public String getAirportLocale() {
        return airportLocale;
    }

    public void setAirportLocale(String airportLocale) {
        this.airportLocale = airportLocale;
    }

    @Id
    @Column(name = "airport_code")
    private String airportCode;
    @Column(name = "airport_name")
    private String airportName;
    @Column(name = "airport_city")
    private String airportCity;
    @Column(name = "airport_locale")
    private String airportLocale;
}
