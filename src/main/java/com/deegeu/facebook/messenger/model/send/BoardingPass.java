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
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
final public class BoardingPass {

    @JsonProperty("passenger_name")
    @SerializedName("passenger_name")
    @Expose
    private String passengerName;
    
    @JsonProperty("pnr_number")
    @SerializedName("pnr_number")
    @Expose
    private String pnrNumber;
    
    @JsonProperty("travel_class")
    @SerializedName("travel_class")
    @Expose
    private String travelClass;
    
    @JsonProperty("seat")
    @SerializedName("seat")
    @Expose
    private String seat;
    
    @JsonProperty("auxiliary_fields")
    @SerializedName("auxiliary_fields")
    @Expose
    private List<AuxiliaryField> auxiliaryFields = null;
    
    @JsonProperty("secondary_fields")
    @SerializedName("secondary_fields")
    @Expose
    private List<SecondaryField> secondaryFields = null;
    
    @JsonProperty("logo_image_url")
    @SerializedName("logo_image_url")
    @Expose
    private String logoImageUrl;
    
    @JsonProperty("header_image_url")
    @SerializedName("header_image_url")
    @Expose
    private String headerImageUrl;
    
    @JsonProperty("qr_code")
    @SerializedName("qr_code")
    @Expose
    private String qrCode;
    
    @JsonProperty("above_bar_code_image_url")
    @SerializedName("above_bar_code_image_url")
    @Expose
    private String aboveBarCodeImageUrl;
    
    @JsonProperty("flight_info")
    @SerializedName("flight_info")
    @Expose
    private FlightInfo flightInfo;
    
    @JsonProperty("barcode_image_url")
    @SerializedName("barcode_image_url")
    @Expose
    private String barcodeImageUrl;

    @JsonProperty("barcode_image_url")
    public void setBarcodeImageUrl(String barcodeImageUrl) {
        this.barcodeImageUrl = barcodeImageUrl;
    }

    @JsonProperty("barcode_image_url")
    public String getBarcodeImageUrl() {
        return barcodeImageUrl;
    }
    
    @JsonProperty("passenger_name")
    public String getPassengerName() {
        return passengerName;
    }

    @JsonProperty("passenger_name")
    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    @JsonProperty("pnr_number")
    public String getPnrNumber() {
        return pnrNumber;
    }

    @JsonProperty("pnr_number")
    public void setPnrNumber(String pnrNumber) {
        this.pnrNumber = pnrNumber;
    }

    @JsonProperty("travel_class")
    public String getTravelClass() {
        return travelClass;
    }

    @JsonProperty("travel_class")
    public void setTravelClass(String travelClass) {
        this.travelClass = travelClass;
    }

    @JsonProperty("seat")
    public String getSeat() {
        return seat;
    }

    @JsonProperty("seat")
    public void setSeat(String seat) {
        this.seat = seat;
    }

    @JsonProperty("auxiliary_fields")
    public List<AuxiliaryField> getAuxiliaryFields() {
        return auxiliaryFields;
    }

    @JsonProperty("auxiliary_fields")
    public void setAuxiliaryFields(List<AuxiliaryField> auxiliaryFields) {
        this.auxiliaryFields = auxiliaryFields;
    }

    @JsonProperty("secondary_fields")
    public List<SecondaryField> getSecondaryFields() {
        return secondaryFields;
    }

    @JsonProperty("secondary_fields")
    public void setSecondaryFields(List<SecondaryField> secondaryFields) {
        this.secondaryFields = secondaryFields;
    }

    @JsonProperty("logo_image_url")
    public String getLogoImageUrl() {
        return logoImageUrl;
    }

    @JsonProperty("logo_image_url")
    public void setLogoImageUrl(String logoImageUrl) {
        this.logoImageUrl = logoImageUrl;
    }

    @JsonProperty("header_image_url")
    public String getHeaderImageUrl() {
        return headerImageUrl;
    }

    @JsonProperty("header_image_url")
    public void setHeaderImageUrl(String headerImageUrl) {
        this.headerImageUrl = headerImageUrl;
    }

    @JsonProperty("qr_code")
    public String getQrCode() {
        return qrCode;
    }

    @JsonProperty("qr_code")
    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }

    @JsonProperty("above_bar_code_image_url")
    public String getAboveBarCodeImageUrl() {
        return aboveBarCodeImageUrl;
    }

    @JsonProperty("above_bar_code_image_url")
    public void setAboveBarCodeImageUrl(String aboveBarCodeImageUrl) {
        this.aboveBarCodeImageUrl = aboveBarCodeImageUrl;
    }

    @JsonProperty("flight_info")
    public FlightInfo getFlightInfo() {
        return flightInfo;
    }

    @JsonProperty("flight_info")
    public void setFlightInfo(FlightInfo flightInfo) {
        this.flightInfo = flightInfo;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(passengerName)
                .append(pnrNumber)
                .append(travelClass)
                .append(seat)
                .append(auxiliaryFields)
                .append(secondaryFields)
                .append(logoImageUrl)
                .append(headerImageUrl)
                .append(qrCode)
                .append(aboveBarCodeImageUrl)
                .append(flightInfo)
                .append(barcodeImageUrl)
                .toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BoardingPass) == false) {
            return false;
        }
        BoardingPass rhs = ((BoardingPass) other);
        return new EqualsBuilder()
                .append(passengerName, rhs.passengerName)
                .append(pnrNumber, rhs.pnrNumber)
                .append(travelClass, rhs.travelClass)
                .append(seat, rhs.seat)
                .append(auxiliaryFields, rhs.auxiliaryFields)
                .append(secondaryFields, rhs.secondaryFields)
                .append(logoImageUrl, rhs.logoImageUrl)
                .append(headerImageUrl, rhs.headerImageUrl)
                .append(qrCode, rhs.qrCode)
                .append(aboveBarCodeImageUrl, rhs.aboveBarCodeImageUrl)
                .append(flightInfo, rhs.flightInfo)
                .append(barcodeImageUrl, rhs.barcodeImageUrl)
                .isEquals();
    }

}
