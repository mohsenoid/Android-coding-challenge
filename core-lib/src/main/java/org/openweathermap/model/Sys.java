package org.openweathermap.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Mohsen on 03/01/2017.
 */

public class Sys {

    @SerializedName("message")
    @Expose
    private Double message;
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("sunrise")
    @Expose
    private Integer sunrise;
    @SerializedName("sunset")
    @Expose
    private Integer sunset;
    @SerializedName("pod")
    @Expose
    private String pod;

    /**
     * No args constructor for use in serialization
     */
    public Sys() {
    }

    /**
     * @param message
     * @param sunset
     * @param sunrise
     * @param country
     */
    public Sys(Double message, String country, Integer sunrise, Integer sunset, String pod) {
        this.message = message;
        this.country = country;
        this.sunrise = sunrise;
        this.sunset = sunset;
        this.pod = pod;
    }

    /**
     * @return The message
     */
    public Double getMessage() {
        return message;
    }

    /**
     * @param message The message
     */
    public void setMessage(Double message) {
        this.message = message;
    }

    /**
     * @return The country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country The country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * @return The sunrise
     */
    public Integer getSunrise() {
        return sunrise;
    }

    /**
     * @param sunrise The sunrise
     */
    public void setSunrise(Integer sunrise) {
        this.sunrise = sunrise;
    }

    /**
     * @return The sunset
     */
    public Integer getSunset() {
        return sunset;
    }

    /**
     * @param sunset The sunset
     */
    public void setSunset(Integer sunset) {
        this.sunset = sunset;
    }

    /**
     * @return The pod
     */
    public String getPod() {
        return pod;
    }

    /**
     * @param pod The pod
     */
    public void setPod(String pod) {
        this.pod = pod;
    }

}
