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

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

final public class Payload {

    @SerializedName("template_type")
    @Expose
    private String templateType;
    
    @SerializedName("text")
    @Expose
    private String text;
    
    @SerializedName("buttons")
    @Expose
    private List<Button> buttons = null;
    
    @SerializedName("elements")
    @Expose
    private List<Element> elements = null;
    
    @SerializedName("recipient_name")
    @Expose
    private String recipientName;
    @SerializedName("order_number")
    @Expose
    private String orderNumber;
    @SerializedName("currency")
    @Expose
    private String currency;
    @SerializedName("payment_method")
    @Expose
    private String paymentMethod;
    @SerializedName("order_url")
    @Expose
    private String orderUrl;
    @SerializedName("timestamp")
    @Expose
    private String timestamp;
    @SerializedName("address")
    @Expose
    private Address address;
    @SerializedName("summary")
    @Expose
    private Summary summary;
    @SerializedName("adjustments")
    @Expose
    private List<Adjustment> adjustments = null;
    
    @SerializedName("intro_message")
    @Expose
    private String introMessage;
    @SerializedName("locale")
    @Expose
    private String locale;
    @SerializedName("boarding_pass")
    @Expose
    private List<BoardingPass> boardingPass = null;
    
    @SerializedName("pnr_number")
    @Expose
    private String pnrNumber;
    @SerializedName("flight_info")
    @Expose
    private List<FlightInfo> flightInfo = null;
    @SerializedName("checkin_url")
    @Expose
    private String checkinUrl;
    
    @SerializedName("passenger_info")
    @Expose
    private List<PassengerInfo> passengerInfo = null;
    
    @SerializedName("passenger_segment_info")
    @Expose
    private List<PassengerSegmentInfo> passengerSegmentInfo = null;
    @SerializedName("price_info")
    @Expose
    private List<PriceInfo> priceInfo = null;
    @SerializedName("base_price")
    @Expose
    private String basePrice;
    @SerializedName("tax")
    @Expose
    private String tax;
    @SerializedName("total_price")
    @Expose
    private String totalPrice;
    
    @SerializedName("update_type")
    @Expose
    private String updateType;
    
    @SerializedName("update_flight_info")
    @Expose
    private UpdateFlightInfo updateFlightInfo;
    
    @SerializedName("top_element_style")
    @Expose
    private String topElementStyle;
    
    @SerializedName("url")
    @Expose
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    
    public String getUpdateType() {
        return updateType;
    }

    public void setUpdateType(String updateType) {
        this.updateType = updateType;
    }

    public UpdateFlightInfo getUpdateFlightInfo() {
        return updateFlightInfo;
    }

    public void setUpdateFlightInfo(UpdateFlightInfo updateFlightInfo) {
        this.updateFlightInfo = updateFlightInfo;
    }

    public String getIntroMessage() {
        return introMessage;
    }

    public void setIntroMessage(String introMessage) {
        this.introMessage = introMessage;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public List<BoardingPass> getBoardingPass() {
        return boardingPass;
    }

    public void setBoardingPass(List<BoardingPass> boardingPass) {
        this.boardingPass = boardingPass;
    }

    public String getPnrNumber() {
        return pnrNumber;
    }

    public void setPnrNumber(String pnrNumber) {
        this.pnrNumber = pnrNumber;
    }

    public List<FlightInfo> getFlightInfo() {
        return flightInfo;
    }

    public void setFlightInfo(List<FlightInfo> flightInfo) {
        this.flightInfo = flightInfo;
    }

    public String getCheckinUrl() {
        return checkinUrl;
    }

    public void setCheckinUrl(String checkinUrl) {
        this.checkinUrl = checkinUrl;
    }

    public List<PassengerInfo> getPassengerInfo() {
        return passengerInfo;
    }

    public void setPassengerInfo(List<PassengerInfo> passengerInfo) {
        this.passengerInfo = passengerInfo;
    }

    public List<PassengerSegmentInfo> getPassengerSegmentInfo() {
        return passengerSegmentInfo;
    }

    public void setPassengerSegmentInfo(List<PassengerSegmentInfo> passengerSegmentInfo) {
        this.passengerSegmentInfo = passengerSegmentInfo;
    }

    public List<PriceInfo> getPriceInfo() {
        return priceInfo;
    }

    public void setPriceInfo(List<PriceInfo> priceInfo) {
        this.priceInfo = priceInfo;
    }

    public String getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(String basePrice) {
        this.basePrice = basePrice;
    }

    public String getTax() {
        return tax;
    }

    public void setTax(String tax) {
        this.tax = tax;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getRecipientName() {
        return recipientName;
    }

    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getOrderUrl() {
        return orderUrl;
    }

    public void setOrderUrl(String orderUrl) {
        this.orderUrl = orderUrl;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Summary getSummary() {
        return summary;
    }

    public void setSummary(Summary summary) {
        this.summary = summary;
    }

    public List<Adjustment> getAdjustments() {
        return adjustments;
    }

    public void setAdjustments(List<Adjustment> adjustments) {
        this.adjustments = adjustments;
    }

    public String getTopElementStyle() {
        return topElementStyle;
    }

    public void setTopElementStyle(String topElementStyle) {
        this.topElementStyle = topElementStyle;
    }
    
    /**
     * 
     * @return
     *     The elements
     */
    public List<Element> getElements() {
        return elements;
    }

    /**
     * 
     * @param elements
     *     The elements
     */
    public void setElements(List<Element> elements) {
        this.elements = elements;
    }
    
    /**
     * 
     * @return
     *     The templateType
     */
    public String getTemplateType() {
        return templateType;
    }

    /**
     * 
     * @param templateType
     *     The template_type
     */
    public void setTemplateType(String templateType) {
        this.templateType = templateType;
    }

    /**
     * 
     * @return
     *     The text
     */
    public String getText() {
        return text;
    }

    /**
     * 
     * @param text
     *     The text
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * 
     * @return
     *     The buttons
     */
    public List<Button> getButtons() {
        return buttons;
    }

    /**
     * 
     * @param buttons
     *     The buttons
     */
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
