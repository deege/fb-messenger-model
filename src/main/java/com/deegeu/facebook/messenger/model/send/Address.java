/*
 * The MIT License
 *
 * Copyright 2016 DJ Spiess and DeegeU.com.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.deegeu.facebook.messenger.model.send;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
final public class Address {

    @JsonProperty("street_1")
    @SerializedName("street_1")
    @Expose
    private String street1;
    
    @JsonProperty("street_2")
    @SerializedName("street_2")
    @Expose
    private String street2;
    
    @JsonProperty("city")
    @SerializedName("city")
    @Expose
    private String city;
    
    @JsonProperty("postal_code")
    @SerializedName("postal_code")
    @Expose
    private String postalCode;
    
    @JsonProperty("state")
    @SerializedName("state")
    @Expose
    private String state;
    
    @JsonProperty("country")
    @SerializedName("country")
    @Expose
    private String country;

    @JsonProperty("street_1")
    public String getStreet1() {
        return street1;
    }

    @JsonProperty("street_1")
    public void setStreet1(String street1) {
        this.street1 = street1;
    }

    @JsonProperty("street_2")
    public String getStreet2() {
        return street2;
    }

    @JsonProperty("street_2")
    public void setStreet2(String street2) {
        this.street2 = street2;
    }

    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    @JsonProperty("postal_code")
    public String getPostalCode() {
        return postalCode;
    }

    @JsonProperty("postal_code")
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @JsonProperty("state")
    public String getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(street1)
                .append(street2)
                .append(city)
                .append(postalCode)
                .append(state)
                .append(country)
                .toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Address) == false) {
            return false;
        }
        Address rhs = ((Address) other);
        return new EqualsBuilder()
                .append(street1, rhs.street1)
                .append(street2, rhs.street2)
                .append(city, rhs.city)
                .append(postalCode, rhs.postalCode)
                .append(state, rhs.state)
                .append(country, rhs.country)
                .isEquals();
    }

}
