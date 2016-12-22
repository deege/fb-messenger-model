/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deegeu.facebook.messenger.model.send.builder;

import com.deegeu.facebook.messenger.model.send.AuxiliaryField;
import com.deegeu.facebook.messenger.model.send.BoardingPass;
import com.deegeu.facebook.messenger.model.send.FlightInfo;
import com.deegeu.facebook.messenger.model.send.SecondaryField;
import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 *
 * @author dspiess
 */
final public class BoardingPassBuilder {
    
    private String passengerName;

    private String pnrNumber;

    private String travelClass;

    private String seat;

    private List<AuxiliaryField> auxiliaryFields = null;

    private List<SecondaryField> secondaryFields = null;

    private String logoImageUrl;

    private String headerImageUrl;

    private String qrCode;

    private String aboveBarCodeImageUrl;

    private FlightInfo flightInfo;
    
    private String barcodeImageUrl;
    
    public BoardingPassBuilder() { }

    public BoardingPassBuilder barcodeImageUrl(String barcodeImageUrl) {
        this.barcodeImageUrl = barcodeImageUrl;
        return this;
    }
    
    public BoardingPassBuilder passengerName(String passengerName) {
        this.passengerName = passengerName;
        return this;
    }

    public BoardingPassBuilder pnrNumber(String pnrNumber) {
        this.pnrNumber = pnrNumber;
        return this;
    }

    public BoardingPassBuilder travelClass(String travelClass) {
        this.travelClass = travelClass;
        return this;
    }

    public BoardingPassBuilder seat(String seat) {
        this.seat = seat;
        return this;
    }

    public BoardingPassBuilder auxiliaryFields(List<AuxiliaryField> auxiliaryFields) {
        this.auxiliaryFields = auxiliaryFields;
        return this;
    }

    public BoardingPassBuilder secondaryFields(List<SecondaryField> secondaryFields) {
        this.secondaryFields = secondaryFields;
        return this;
    }

    public BoardingPassBuilder logoImageUrl(String logoImageUrl) {
        this.logoImageUrl = logoImageUrl;
        return this;
    }

    public BoardingPassBuilder headerImageUrl(String headerImageUrl) {
        this.headerImageUrl = headerImageUrl;
        return this;
    }

    public BoardingPassBuilder qrCode(String qrCode) {
        this.qrCode = qrCode;
        return this;
    }

    public BoardingPassBuilder aboveBarCodeImageUrl(String aboveBarCodeImageUrl) {
        this.aboveBarCodeImageUrl = aboveBarCodeImageUrl;
        return this;
    }

    public BoardingPassBuilder flightInfo(FlightInfo flightInfo) {
        this.flightInfo = flightInfo;
        return this;
    }
    
    public BoardingPass build() {
        BoardingPass pass = new BoardingPass();
        
        if (this.passengerName == null) {
            throw new IllegalArgumentException(
                    "BoardingPassBuilder 'passenger_name' cannot be null.");
        }
        if (this.pnrNumber == null) {
            throw new IllegalArgumentException(
                    "BoardingPassBuilder 'pnr_number' cannot be null.");
        }
        if (this.logoImageUrl == null) {
            throw new IllegalArgumentException(
                    "BoardingPassBuilder 'logo_image_url' cannot be null.");
        }
        if (this.aboveBarCodeImageUrl == null) {
            throw new IllegalArgumentException(
                    "BoardingPassBuilder 'above_bar_code_image_url' cannot be null.");
        }
        if (this.flightInfo == null) {
            throw new IllegalArgumentException(
                    "BoardingPassBuilder 'flightInfo' cannot be null.");
        }
        if ((this.qrCode == null) && (this.barcodeImageUrl == null)){
            throw new IllegalArgumentException(
                    "BoardingPassBuilder Either 'qr_code' or 'barcode_image_url' must be non null.");
        }
        
        pass.setAboveBarCodeImageUrl(aboveBarCodeImageUrl);
        pass.setAuxiliaryFields(auxiliaryFields);
        pass.setFlightInfo(flightInfo);
        pass.setHeaderImageUrl(headerImageUrl);
        pass.setLogoImageUrl(logoImageUrl);
        pass.setPassengerName(passengerName);
        pass.setPnrNumber(pnrNumber);
        pass.setQrCode(qrCode);
        pass.setSeat(seat);
        pass.setSecondaryFields(secondaryFields);
        pass.setTravelClass(travelClass);
        pass.setBarcodeImageUrl(barcodeImageUrl);
        return pass;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
