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
final public class Payload {

    @JsonProperty("template_type")
    @SerializedName("template_type")
    @Expose
    private String templateType;
    
    @JsonProperty("text")
    @SerializedName("text")
    @Expose
    private String text;
    
    @JsonProperty("buttons")
    @SerializedName("buttons")
    @Expose
    private List<Button> buttons = null;
    
    @JsonProperty("elements")
    @SerializedName("elements")
    @Expose
    private List<Element> elements = null;
    
    @JsonProperty("recipient_name")
    @SerializedName("recipient_name")
    @Expose
    private String recipientName;
    
    @JsonProperty("order_number")
    @SerializedName("order_number")
    @Expose
    private String orderNumber;
    
    @JsonProperty("currency")
    @SerializedName("currency")
    @Expose
    private String currency;
    
    @JsonProperty("payment_method")
    @SerializedName("payment_method")
    @Expose
    private String paymentMethod;
    
    @JsonProperty("order_url")
    @SerializedName("order_url")
    @Expose
    private String orderUrl;
    
    @JsonProperty("timestamp")
    @SerializedName("timestamp")
    @Expose
    private String timestamp;
    
    @JsonProperty("address")
    @SerializedName("address")
    @Expose
    private Address address;
    
    @JsonProperty("summary")
    @SerializedName("summary")
    @Expose
    private Summary summary;
    
    @JsonProperty("adjustments")
    @SerializedName("adjustments")
    @Expose
    private List<Adjustment> adjustments = null;
    
    @JsonProperty("intro_message")
    @SerializedName("intro_message")
    @Expose
    private String introMessage;
    
    @JsonProperty("locale")
    @SerializedName("locale")
    @Expose
    private String locale;
    
    @JsonProperty("boarding_pass")
    @SerializedName("boarding_pass")
    @Expose
    private List<BoardingPass> boardingPass = null;
    
    @JsonProperty("pnr_number")
    @SerializedName("pnr_number")
    @Expose
    private String pnrNumber;
    
    @JsonProperty("flight_info")
    @SerializedName("flight_info")
    @Expose
    private List<FlightInfo> flightInfo = null;
    
    @JsonProperty("checkin_url")
    @SerializedName("checkin_url")
    @Expose
    private String checkinUrl;
    
    @JsonProperty("passenger_info")
    @SerializedName("passenger_info")
    @Expose
    private List<PassengerInfo> passengerInfo = null;
    
    @JsonProperty("passenger_segment_info")
    @SerializedName("passenger_segment_info")
    @Expose
    private List<PassengerSegmentInfo> passengerSegmentInfo = null;
    
    @JsonProperty("price_info")
    @SerializedName("price_info")
    @Expose
    private List<PriceInfo> priceInfo = null;
    
    @JsonProperty("base_price")
    @SerializedName("base_price")
    @Expose
    private String basePrice;
    
    @JsonProperty("tax")
    @SerializedName("tax")
    @Expose
    private String tax;
    
    @JsonProperty("total_price")
    @SerializedName("total_price")
    @Expose
    private String totalPrice;
    
    @JsonProperty("update_type")
    @SerializedName("update_type")
    @Expose
    private String updateType;
    
    @JsonProperty("update_flight_info")
    @SerializedName("update_flight_info")
    @Expose
    private UpdateFlightInfo updateFlightInfo;
    
    @JsonProperty("top_element_style")
    @SerializedName("top_element_style")
    @Expose
    private String topElementStyle;
    
    @JsonProperty("url")
    @SerializedName("url")
    @Expose
    private String url;

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }
    
    @JsonProperty("update_type")
    public String getUpdateType() {
        return updateType;
    }

    @JsonProperty("update_type")
    public void setUpdateType(String updateType) {
        this.updateType = updateType;
    }

    @JsonProperty("update_flight_info")
    public UpdateFlightInfo getUpdateFlightInfo() {
        return updateFlightInfo;
    }

    @JsonProperty("update_flight_info")
    public void setUpdateFlightInfo(UpdateFlightInfo updateFlightInfo) {
        this.updateFlightInfo = updateFlightInfo;
    }

    @JsonProperty("intro_message")
    public String getIntroMessage() {
        return introMessage;
    }

    @JsonProperty("intro_message")
    public void setIntroMessage(String introMessage) {
        this.introMessage = introMessage;
    }

    @JsonProperty("locale")
    public String getLocale() {
        return locale;
    }

    @JsonProperty("locale")
    public void setLocale(String locale) {
        this.locale = locale;
    }

    @JsonProperty("boarding_pass")
    public List<BoardingPass> getBoardingPass() {
        return boardingPass;
    }

    @JsonProperty("boarding_pass")
    public void setBoardingPass(List<BoardingPass> boardingPass) {
        this.boardingPass = boardingPass;
    }

    @JsonProperty("pnr_number")
    public String getPnrNumber() {
        return pnrNumber;
    }

    @JsonProperty("pnr_number")
    public void setPnrNumber(String pnrNumber) {
        this.pnrNumber = pnrNumber;
    }

    @JsonProperty("flight_info")
    public List<FlightInfo> getFlightInfo() {
        return flightInfo;
    }

    @JsonProperty("flight_info")
    public void setFlightInfo(List<FlightInfo> flightInfo) {
        this.flightInfo = flightInfo;
    }

    @JsonProperty("checkin_url")
    public String getCheckinUrl() {
        return checkinUrl;
    }

    @JsonProperty("checkin_url")
    public void setCheckinUrl(String checkinUrl) {
        this.checkinUrl = checkinUrl;
    }

    @JsonProperty("passenger_info")
    public List<PassengerInfo> getPassengerInfo() {
        return passengerInfo;
    }

    @JsonProperty("passenger_info")
    public void setPassengerInfo(List<PassengerInfo> passengerInfo) {
        this.passengerInfo = passengerInfo;
    }

    @JsonProperty("passenger_segment_info")
    public List<PassengerSegmentInfo> getPassengerSegmentInfo() {
        return passengerSegmentInfo;
    }

    @JsonProperty("passenger_segment_info")
    public void setPassengerSegmentInfo(List<PassengerSegmentInfo> passengerSegmentInfo) {
        this.passengerSegmentInfo = passengerSegmentInfo;
    }

    @JsonProperty("price_info")
    public List<PriceInfo> getPriceInfo() {
        return priceInfo;
    }

    @JsonProperty("price_info")
    public void setPriceInfo(List<PriceInfo> priceInfo) {
        this.priceInfo = priceInfo;
    }

    @JsonProperty("base_price")
    public String getBasePrice() {
        return basePrice;
    }

    @JsonProperty("base_price")
    public void setBasePrice(String basePrice) {
        this.basePrice = basePrice;
    }

    @JsonProperty("tax")
    public String getTax() {
        return tax;
    }

    @JsonProperty("tax")
    public void setTax(String tax) {
        this.tax = tax;
    }

    @JsonProperty("total_price")
    public String getTotalPrice() {
        return totalPrice;
    }

    @JsonProperty("total_price")
    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }

    @JsonProperty("recipient_name")
    public String getRecipientName() {
        return recipientName;
    }

    @JsonProperty("recipient_name")
    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName;
    }

    @JsonProperty("order_number")
    public String getOrderNumber() {
        return orderNumber;
    }

    @JsonProperty("order_number")
    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @JsonProperty("payment_method")
    public String getPaymentMethod() {
        return paymentMethod;
    }

    @JsonProperty("payment_method")
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @JsonProperty("order_url")
    public String getOrderUrl() {
        return orderUrl;
    }

    @JsonProperty("order_url")
    public void setOrderUrl(String orderUrl) {
        this.orderUrl = orderUrl;
    }

    @JsonProperty("timestamp")
    public String getTimestamp() {
        return timestamp;
    }

    @JsonProperty("timestamp")
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    @JsonProperty("address")
    public Address getAddress() {
        return address;
    }

    @JsonProperty("address")
    public void setAddress(Address address) {
        this.address = address;
    }

    @JsonProperty("summary")
    public Summary getSummary() {
        return summary;
    }

    @JsonProperty("summary")
    public void setSummary(Summary summary) {
        this.summary = summary;
    }

    @JsonProperty("adjustments")
    public List<Adjustment> getAdjustments() {
        return adjustments;
    }

    @JsonProperty("adjustments")
    public void setAdjustments(List<Adjustment> adjustments) {
        this.adjustments = adjustments;
    }

    @JsonProperty("top_element_style")
    public String getTopElementStyle() {
        return topElementStyle;
    }

    @JsonProperty("top_element_style")
    public void setTopElementStyle(String topElementStyle) {
        this.topElementStyle = topElementStyle;
    }
    
    @JsonProperty("elements")
    public List<Element> getElements() {
        return elements;
    }

    @JsonProperty("elements")
    public void setElements(List<Element> elements) {
        this.elements = elements;
    }
    
    @JsonProperty("template_type")
    public String getTemplateType() {
        return templateType;
    }

    @JsonProperty("template_type")
    public void setTemplateType(String templateType) {
        this.templateType = templateType;
    }

    @JsonProperty("text")
    public String getText() {
        return text;
    }

    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    @JsonProperty("buttons")
    public List<Button> getButtons() {
        return buttons;
    }

    @JsonProperty("buttons")
    public void setButtons(List<Button> buttons) {
        this.buttons = buttons;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(templateType)
                .append(text)
                .append(buttons)
                .append(elements)
                .append(recipientName)
                .append(orderNumber)
                .append(currency)
                .append(paymentMethod)
                .append(orderUrl)
                .append(timestamp)
                .append(address)
                .append(summary)
                .append(adjustments)
                .append(introMessage)
                .append(locale)
                .append(boardingPass)
                .append(pnrNumber)
                .append(flightInfo)
                .append(checkinUrl)
                .append(passengerInfo)
                .append(passengerSegmentInfo)
                .append(priceInfo)
                .append(basePrice)
                .append(tax)
                .append(totalPrice)
                .append(topElementStyle)
                .append(updateType)
                .append(updateFlightInfo)
                .toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Payload) == false) {
            return false;
        }
        Payload rhs = ((Payload) other);
        return new EqualsBuilder()
                .append(templateType, rhs.templateType)
                .append(text, rhs.text)
                .append(buttons, rhs.buttons)
                .append(elements, rhs.elements)
                .append(recipientName, rhs.recipientName)
                .append(orderNumber, rhs.orderNumber)
                .append(currency, rhs.currency)
                .append(paymentMethod, rhs.paymentMethod)
                .append(orderUrl, rhs.orderUrl)
                .append(timestamp, rhs.timestamp)
                .append(address, rhs.address)
                .append(summary, rhs.summary)
                .append(adjustments, rhs.adjustments)              
                .append(introMessage, rhs.introMessage)
                .append(locale, rhs.locale)
                .append(boardingPass, rhs.boardingPass)
                .append(pnrNumber, rhs.pnrNumber)
                .append(flightInfo, rhs.flightInfo)
                .append(checkinUrl, rhs.checkinUrl)
                .append(passengerInfo, rhs.passengerInfo)
                .append(passengerSegmentInfo, rhs.passengerSegmentInfo)
                .append(priceInfo, rhs.priceInfo)
                .append(basePrice, rhs.basePrice)
                .append(tax, rhs.tax)
                .append(topElementStyle, this.topElementStyle)
                .append(totalPrice, rhs.totalPrice) 
                .append(updateType, rhs.updateType)
                .append(updateFlightInfo, rhs.updateFlightInfo)
                .isEquals();
    }

}
