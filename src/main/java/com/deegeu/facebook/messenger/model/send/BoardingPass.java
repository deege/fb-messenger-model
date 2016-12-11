
package com.deegeu.facebook.messenger.model.send;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class BoardingPass {

    @SerializedName("passenger_name")
    @Expose
    private String passengerName;
    @SerializedName("pnr_number")
    @Expose
    private String pnrNumber;
    @SerializedName("travel_class")
    @Expose
    private String travelClass;
    @SerializedName("seat")
    @Expose
    private String seat;
    @SerializedName("auxiliary_fields")
    @Expose
    private List<AuxiliaryField> auxiliaryFields = null;
    @SerializedName("secondary_fields")
    @Expose
    private List<SecondaryField> secondaryFields = null;
    @SerializedName("logo_image_url")
    @Expose
    private String logoImageUrl;
    @SerializedName("header_image_url")
    @Expose
    private String headerImageUrl;
    @SerializedName("qr_code")
    @Expose
    private String qrCode;
    @SerializedName("above_bar_code_image_url")
    @Expose
    private String aboveBarCodeImageUrl;
    @SerializedName("flight_info")
    @Expose
    private FlightInfo flightInfo;

    /**
     * 
     * @return
     *     The passengerName
     */
    public String getPassengerName() {
        return passengerName;
    }

    /**
     * 
     * @param passengerName
     *     The passenger_name
     */
    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    /**
     * 
     * @return
     *     The pnrNumber
     */
    public String getPnrNumber() {
        return pnrNumber;
    }

    /**
     * 
     * @param pnrNumber
     *     The pnr_number
     */
    public void setPnrNumber(String pnrNumber) {
        this.pnrNumber = pnrNumber;
    }

    /**
     * 
     * @return
     *     The travelClass
     */
    public String getTravelClass() {
        return travelClass;
    }

    /**
     * 
     * @param travelClass
     *     The travel_class
     */
    public void setTravelClass(String travelClass) {
        this.travelClass = travelClass;
    }

    /**
     * 
     * @return
     *     The seat
     */
    public String getSeat() {
        return seat;
    }

    /**
     * 
     * @param seat
     *     The seat
     */
    public void setSeat(String seat) {
        this.seat = seat;
    }

    /**
     * 
     * @return
     *     The auxiliaryFields
     */
    public List<AuxiliaryField> getAuxiliaryFields() {
        return auxiliaryFields;
    }

    /**
     * 
     * @param auxiliaryFields
     *     The auxiliary_fields
     */
    public void setAuxiliaryFields(List<AuxiliaryField> auxiliaryFields) {
        this.auxiliaryFields = auxiliaryFields;
    }

    /**
     * 
     * @return
     *     The secondaryFields
     */
    public List<SecondaryField> getSecondaryFields() {
        return secondaryFields;
    }

    /**
     * 
     * @param secondaryFields
     *     The secondary_fields
     */
    public void setSecondaryFields(List<SecondaryField> secondaryFields) {
        this.secondaryFields = secondaryFields;
    }

    /**
     * 
     * @return
     *     The logoImageUrl
     */
    public String getLogoImageUrl() {
        return logoImageUrl;
    }

    /**
     * 
     * @param logoImageUrl
     *     The logo_image_url
     */
    public void setLogoImageUrl(String logoImageUrl) {
        this.logoImageUrl = logoImageUrl;
    }

    /**
     * 
     * @return
     *     The headerImageUrl
     */
    public String getHeaderImageUrl() {
        return headerImageUrl;
    }

    /**
     * 
     * @param headerImageUrl
     *     The header_image_url
     */
    public void setHeaderImageUrl(String headerImageUrl) {
        this.headerImageUrl = headerImageUrl;
    }

    /**
     * 
     * @return
     *     The qrCode
     */
    public String getQrCode() {
        return qrCode;
    }

    /**
     * 
     * @param qrCode
     *     The qr_code
     */
    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }

    /**
     * 
     * @return
     *     The aboveBarCodeImageUrl
     */
    public String getAboveBarCodeImageUrl() {
        return aboveBarCodeImageUrl;
    }

    /**
     * 
     * @param aboveBarCodeImageUrl
     *     The above_bar_code_image_url
     */
    public void setAboveBarCodeImageUrl(String aboveBarCodeImageUrl) {
        this.aboveBarCodeImageUrl = aboveBarCodeImageUrl;
    }

    /**
     * 
     * @return
     *     The flightInfo
     */
    public FlightInfo getFlightInfo() {
        return flightInfo;
    }

    /**
     * 
     * @param flightInfo
     *     The flight_info
     */
    public void setFlightInfo(FlightInfo flightInfo) {
        this.flightInfo = flightInfo;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(passengerName).append(pnrNumber).append(travelClass).append(seat).append(auxiliaryFields).append(secondaryFields).append(logoImageUrl).append(headerImageUrl).append(qrCode).append(aboveBarCodeImageUrl).append(flightInfo).toHashCode();
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
        return new EqualsBuilder().append(passengerName, rhs.passengerName).append(pnrNumber, rhs.pnrNumber).append(travelClass, rhs.travelClass).append(seat, rhs.seat).append(auxiliaryFields, rhs.auxiliaryFields).append(secondaryFields, rhs.secondaryFields).append(logoImageUrl, rhs.logoImageUrl).append(headerImageUrl, rhs.headerImageUrl).append(qrCode, rhs.qrCode).append(aboveBarCodeImageUrl, rhs.aboveBarCodeImageUrl).append(flightInfo, rhs.flightInfo).isEquals();
    }

}
