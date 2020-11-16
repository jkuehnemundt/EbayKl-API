/**
 * @author Jannik Kühnemundt
 */
package de.jkueh.ebaykl;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;

/**
 * Class represents an Adress
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Address {
    private String street;
    private String state;
    private String zipCode;
    private double longitude;
    private double latitude;
    private float radius;

    @JsonProperty("state")
    private void unpackState(HashMap<String,String> state) {
        this.state = state.get("value");
    }

    @JsonProperty("street")
    private void unpackStreet(HashMap<String,String> street) {
        this.street = street.get("value");
    }

    @JsonProperty("zip-code")
    private void unpackZipCode(HashMap<String,String> zipCode) {
        this.street = zipCode.get("value");
    }

    @JsonProperty("longitude")
    private void unpackLongitude(HashMap<String,String> longitude) {
        this.longitude = Double.parseDouble(longitude.get("value"));
    }

    @JsonProperty("latitude")
    private void unpackLatitude(HashMap<String,String> latitude) {
        this.latitude = Double.parseDouble(latitude.get("value"));
    }

    @JsonProperty("radius")
    private void unpackRadius(HashMap<String,String> radius) {
        this.latitude = Float.parseFloat(radius.get("value"));
    }

    /**
     * Gets the street
     * @return street
     */
    public String getStreet() {
        return street;
    }

    /**
     * Gets the state
     * @return
     */
    public String getState() {
        return state;
    }

    /**
     * Gets the zipCode
     * @return
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * Gets the longitude
     * @return longitude
     */
    public double getLongitude() {
        return longitude;
    }

    /**
     * Gets the latitude
     * @return latitude
     */
    public double getLatitude() {
        return latitude;
    }

    /**
     * Gets the radius
     * @return radius
     */
    public float getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return getState() + " " + getStreet() + " " + getZipCode() + " " + getLatitude() + " " + getLongitude() + " " + getRadius();
    }
}
