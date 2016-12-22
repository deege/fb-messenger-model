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
package com.deegeu.facebook.messenger.model.send.builder;

import com.deegeu.facebook.messenger.model.send.Address;
import com.deegeu.facebook.messenger.model.send.Adjustment;
import com.deegeu.facebook.messenger.model.send.BoardingPass;
import com.deegeu.facebook.messenger.model.send.Button;
import com.deegeu.facebook.messenger.model.send.Element;
import com.deegeu.facebook.messenger.model.send.FlightInfo;
import com.deegeu.facebook.messenger.model.send.PassengerInfo;
import com.deegeu.facebook.messenger.model.send.PassengerSegmentInfo;
import com.deegeu.facebook.messenger.model.send.Payload;
import com.deegeu.facebook.messenger.model.send.PriceInfo;
import com.deegeu.facebook.messenger.model.send.Summary;
import com.deegeu.facebook.messenger.model.send.UpdateFlightInfo;
import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 *
 * @author dspiess
 */
final public class PayloadBuilder {  
    private static final int MIN_NUM_ELEMENTS_LIST = 2;
    
    private static final int MAX_NUM_ELEMENTS_LIST = 4;
    
    private static final int MAX_NUM_ELEMENTS_GENERIC = 10;
    
    private static final int MAX_NUM_BUTTONS = 3;
    
    private Address address;
    
    private List<Adjustment> adjustments = null;
    
    private String basePrice;
    
    private List<BoardingPass> boardingPass = null;
    
    private List<Button> buttons = null;
    
    private String checkinUrl;

    private String currency;
    
    private List<Element> elements = null;
    
    private List<FlightInfo> flightInfo = null;

    private String introMessage;
    
    private String locale;

    private String orderNumber;
    
    private String orderUrl;
    
    private List<PassengerInfo> passengerInfo = null;

    private List<PassengerSegmentInfo> passengerSegmentInfo = null;
    
    private String paymentMethod;
    
    private String pnrNumber;
    
    private List<PriceInfo> priceInfo = null;

    private String recipientName;

    private Summary summary;
    
    private String tax;

    private String templateType;

    private String text;
    
    private String timestamp;
    
    private String topElementStyle;
    
    private String totalPrice;

    private String updateType;

    private UpdateFlightInfo updateFlightInfo;

    public PayloadBuilder() { }
    
    public PayloadBuilder templateType(String templateType) {
        this.templateType = templateType;
        return this;
    }

    public PayloadBuilder text(String text) {
        this.text = text;
        return this;
    }

    public PayloadBuilder buttons(List<Button> buttons) {
        this.buttons = buttons;
        return this;
    }

    public PayloadBuilder elements(List<Element> elements) {
        this.elements = elements;
        return this;
    }

    public PayloadBuilder recipientName(String recipientName) {
        this.recipientName = recipientName;
        return this;
    }

    public PayloadBuilder orderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
        return this;
    }

    public PayloadBuilder currency(String currency) {
        this.currency = currency;
        return this;
    }

    public PayloadBuilder paymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
        return this;
    }

    public PayloadBuilder orderUrl(String orderUrl) {
        this.orderUrl = orderUrl;
        return this;
    }

    public PayloadBuilder timestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public PayloadBuilder address(Address address) {
        this.address = address;
        return this;
    }

    public PayloadBuilder summary(Summary summary) {
        this.summary = summary;
        return this;
    }

    public PayloadBuilder adjustments(List<Adjustment> adjustments) {
        this.adjustments = adjustments;
        return this;
        
    }

    public PayloadBuilder introMessage(String introMessage) {
        this.introMessage = introMessage;
        return this;
    }

    public PayloadBuilder locale(String locale) {
        this.locale = locale;
        return this;
    }

    public PayloadBuilder boardingPass(List<BoardingPass> boardingPass) {
        this.boardingPass = boardingPass;
        return this;
    }

    public PayloadBuilder pnrNumber(String pnrNumber) {
        this.pnrNumber = pnrNumber;
        return this;
    }

    public PayloadBuilder flightInfo(List<FlightInfo> flightInfo) {
        this.flightInfo = flightInfo;
        return this;
    }

    public PayloadBuilder checkinUrl(String checkinUrl) {
        this.checkinUrl = checkinUrl;
        return this;
    }

    public PayloadBuilder passengerInfo(List<PassengerInfo> passengerInfo) {
        this.passengerInfo = passengerInfo;
        return this;
    }

    public PayloadBuilder passengerSegmentInfo(List<PassengerSegmentInfo> passengerSegmentInfo) {
        this.passengerSegmentInfo = passengerSegmentInfo;
        return this;
    }

    public PayloadBuilder priceInfo(List<PriceInfo> priceInfo) {
        this.priceInfo = priceInfo;
        return this;
    }

    public PayloadBuilder basePrice(String basePrice) {
        this.basePrice = basePrice;
        return this;
    }

    public PayloadBuilder tax(String tax) {
        this.tax = tax;
        return this;
    }

    public PayloadBuilder totalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
        return this;
    }
 
    public PayloadBuilder topElementStyle(String topElementStyle) {
        this.topElementStyle = topElementStyle;
        return this;
    }
    
    public PayloadBuilder updateType(String updateType) {
        this.updateType = updateType;
        return this;
    }

    public PayloadBuilder updateFlightInfo(UpdateFlightInfo updateFlightInfo) {
        this.updateFlightInfo = updateFlightInfo;
        return this;
    }
    
    public Payload build() {
        Payload payload = new Payload();
        
        if (this.templateType == null) {
            throw new IllegalArgumentException(
                    "PayloadBuilder 'templateType' cannot be null.");
        }
        
        if (this.elements == null) {
            throw new IllegalArgumentException(
                    "PayloadBuilder 'elements' cannot be null.");
        }
        
        if ("generic".equalsIgnoreCase(this.templateType)) {
            validateGenericTemplate();
        }
        
        if ("button".equalsIgnoreCase(this.templateType)) {
            validateButtonTemplate();
        }
        
        if ("list".equalsIgnoreCase(this.templateType)) {
            validateListTemplate();
        }
        
        if ("receipt".equalsIgnoreCase(this.templateType)) {
            validateReceiptTemplate();
        }
        
        if ("airline_boardingpass".equalsIgnoreCase(this.templateType)) {
            validateBoardingPassTemplate();
        }
        
        if ("airline_checkin".equalsIgnoreCase(this.templateType)) {
            vaildateAirlineCheckinTemplate(); 
        }
        
        if ("airline_itinerary".equalsIgnoreCase(this.templateType)) {
            validateAirlineItinerary();
        }
        
        if ("airline_update".equalsIgnoreCase(this.templateType)) {
            validateAirlineFlightUpdate(); 
        }
        
        payload.setAddress(address);
        payload.setAdjustments(adjustments);
        payload.setBasePrice(basePrice);
        payload.setBoardingPass(boardingPass);
        payload.setButtons(buttons);
        payload.setCheckinUrl(checkinUrl);
        payload.setCurrency(currency);
        payload.setElements(elements);
        payload.setFlightInfo(this.flightInfo);
        payload.setIntroMessage(introMessage);
        payload.setLocale(locale);
        payload.setOrderNumber(orderNumber);
        payload.setOrderUrl(orderUrl);
        payload.setPassengerInfo(this.passengerInfo);
        payload.setPassengerSegmentInfo(this.passengerSegmentInfo);
        payload.setPaymentMethod(paymentMethod);
        payload.setPnrNumber(pnrNumber);
        payload.setPriceInfo(priceInfo);
        payload.setRecipientName(recipientName);
        payload.setSummary(summary);
        payload.setTax(tax);
        payload.setTemplateType(templateType);
        payload.setText(text);
        payload.setTimestamp(timestamp);
        payload.setTotalPrice(totalPrice);
        payload.setUpdateFlightInfo(updateFlightInfo);
        payload.setUpdateType(updateType);

        return payload;
    }

    private void validateAirlineFlightUpdate() throws IllegalArgumentException {
        if (this.updateType == null) {
            throw new IllegalArgumentException("PayloadBuilder 'updateType' "
                    + "cannot be null for airline flight update template type.");
        }
        if (this.locale == null) {
            throw new IllegalArgumentException("PayloadBuilder 'locale' "
                    + "cannot be null for airline flight update template type.");
        }
        if (this.pnrNumber == null) {
            throw new IllegalArgumentException("PayloadBuilder 'pnrNumber' "
                    + "cannot be null for airline flight update template type.");
        }
        if (this.updateFlightInfo == null) {
            throw new IllegalArgumentException("PayloadBuilder 'updateFlightInfo' "
                    + "cannot be null for airline flight update template type.");
        }
    }

    private void validateAirlineItinerary() throws IllegalArgumentException {
        if (this.introMessage == null) {
            throw new IllegalArgumentException("PayloadBuilder 'introMessage' "
                    + "cannot be null for airline itinerary template type.");
        }
        if (this.locale == null) {
            throw new IllegalArgumentException("PayloadBuilder 'locale' "
                    + "cannot be null for airline itinerary template type.");
        }
        if (this.pnrNumber == null) {
            throw new IllegalArgumentException("PayloadBuilder 'pnrNumber' "
                    + "cannot be null for airline itinerary template type.");
        }
        if (this.passengerInfo == null) {
            throw new IllegalArgumentException("PayloadBuilder 'passenger_info' "
                    + "cannot be null for airline itinerary template type.");
        }
        if (this.flightInfo == null) {
            throw new IllegalArgumentException("PayloadBuilder 'flight_info' "
                    + "cannot be null for airline itinerary template type.");
        }
        if (this.passengerSegmentInfo == null) {
            throw new IllegalArgumentException("PayloadBuilder 'passenger_segment_info' "
                    + "cannot be null for airline itinerary template type.");
        }
        if (this.totalPrice == null) {
            throw new IllegalArgumentException("PayloadBuilder 'totalPrice' "
                    + "cannot be null for airline itinerary template type.");
        }
        if (this.currency == null) {
            throw new IllegalArgumentException("PayloadBuilder 'currency' "
                    + "cannot be null for airline itinerary template type.");
        }
    }

    private void vaildateAirlineCheckinTemplate() throws IllegalArgumentException {
        if (this.introMessage == null) {
            throw new IllegalArgumentException("PayloadBuilder 'introMessage' "
                    + "cannot be null for airline checkin template type.");
        }
        if (this.locale == null) {
            throw new IllegalArgumentException("PayloadBuilder 'locale' "
                    + "cannot be null for airline checkin template type.");
        }
        if (this.pnrNumber == null) {
            throw new IllegalArgumentException("PayloadBuilder 'pnrNumber' "
                    + "cannot be null for airline checkin template type.");
        }
        if (this.flightInfo == null) {
            throw new IllegalArgumentException("PayloadBuilder 'flight_info' "
                    + "cannot be null for airline checkin template type.");
        }
        if (this.checkinUrl == null) {
            throw new IllegalArgumentException("PayloadBuilder 'checkin_url' "
                    + "cannot be null for airline checkin template type.");
        }
    }

    private void validateBoardingPassTemplate() throws IllegalArgumentException {
        if (this.introMessage == null) {
            throw new IllegalArgumentException("PayloadBuilder 'introMessage' "
                    + "cannot be null for airline boarding pass template type.");
        }
        if (this.locale == null) {
            throw new IllegalArgumentException("PayloadBuilder 'locale' "
                    + "cannot be null for airline boarding pass template type.");
        }
        if (this.boardingPass == null) {
            throw new IllegalArgumentException("PayloadBuilder 'boarding_pass' "
                    + "cannot be null for airline boarding pass template type.");
        }
        if (this.boardingPass.size() < 1) {
            throw new IllegalArgumentException("PayloadBuilder 'boarding_pass' "
                    + "must contain at least 1 boarding pass for airline boarding pass template type.");
        }
    }

    private void validateReceiptTemplate() throws IllegalArgumentException {
        if (this.recipientName == null) {
            throw new IllegalArgumentException(
                    "PayloadBuilder 'receipt' cannot be null for receipt template type.");
        }
        if (this.orderNumber == null) {
            throw new IllegalArgumentException(
                    "PayloadBuilder 'order_number' cannot be null for receipt template type.");
        }
        if (this.currency == null) {
            throw new IllegalArgumentException(
                    "PayloadBuilder 'currency' cannot be null for receipt template type.");
        }
        if (this.paymentMethod == null) {
            throw new IllegalArgumentException(
                    "PayloadBuilder 'payment_method' cannot be null for receipt template type.");
        }
        if (this.summary == null) {
            throw new IllegalArgumentException(
                    "PayloadBuilder 'summary' cannot be null for receipt template type.");
        }

        if (this.elements.size() > 100) {
            throw new IllegalArgumentException(
                "PayloadBuilder 'elements' cannot contain more than 100 elements for receipt template type.");
        }
    }

    private void validateListTemplate() throws IllegalArgumentException {
        if ((this.elements.size() < MIN_NUM_ELEMENTS_LIST) || (this.elements.size() > MAX_NUM_ELEMENTS_LIST)) {
            throw new IllegalArgumentException("PayloadBuilder 'elements' must " +
                    "contain between " + MIN_NUM_ELEMENTS_LIST + " and "
                    + MAX_NUM_ELEMENTS_LIST + " elements for list templates.");
        }
        if ((this.buttons != null) && (this.buttons.size() > 1)) {
            throw new IllegalArgumentException(
                    "PayloadBuilder 'buttons' cannot contain more than 1 button for list template type.");
        }
        if (this.topElementStyle != null) {
            if (!"large".equalsIgnoreCase(this.topElementStyle) && !"compact".equalsIgnoreCase(this.topElementStyle)) {
                throw new IllegalArgumentException(
                        "PayloadBuilder 'top_element_style' must equal 'large' or 'compact' for list template type.");
            }
        } else {
            this.topElementStyle = "large";
        }
    }

    private void validateButtonTemplate() throws IllegalArgumentException {
        if ((this.buttons != null) && (this.buttons.size() > MAX_NUM_BUTTONS)) {
            throw new IllegalArgumentException(
                    "PayloadBuilder 'buttons' cannot contain more than "
                            + MAX_NUM_BUTTONS + " buttons for button template type.");
        }
        
        if ((this.text != null) && (this.text.length() > 640)) {
            throw new IllegalArgumentException(
                    "PayloadBuilder 'text' cannot be greater than 640 characters for button template type.");
        }
    }

    private void validateGenericTemplate() throws IllegalArgumentException {
        if (this.elements.size() > MAX_NUM_ELEMENTS_GENERIC) {
            throw new IllegalArgumentException("PayloadBuilder 'elements' must " +
                    "contain less than " + MAX_NUM_ELEMENTS_GENERIC + " elements for generic template type.");
        }
    }
    
    
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
