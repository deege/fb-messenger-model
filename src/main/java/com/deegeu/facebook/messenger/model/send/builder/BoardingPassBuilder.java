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
import java.net.URL;
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

    private URL logoImageUrl;

    private URL headerImageUrl;

    private String qrCode;

    private URL aboveBarCodeImageUrl;

    private FlightInfo flightInfo;
    
    private URL barcodeImageUrl;
    
    public BoardingPassBuilder() { }

    public BoardingPassBuilder barcodeImageUrl(URL barcodeImageUrl) {
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

    public BoardingPassBuilder logoImageUrl(URL logoImageUrl) {
        this.logoImageUrl = logoImageUrl;
        return this;
    }

    public BoardingPassBuilder headerImageUrl(URL headerImageUrl) {
        this.headerImageUrl = headerImageUrl;
        return this;
    }

    public BoardingPassBuilder qrCode(String qrCode) {
        this.qrCode = qrCode;
        return this;
    }

    public BoardingPassBuilder aboveBarCodeImageUrl(URL aboveBarCodeImageUrl) {
        this.aboveBarCodeImageUrl = aboveBarCodeImageUrl;
        return this;
    }

    public BoardingPassBuilder flightInfo(FlightInfo flightInfo) {
        this.flightInfo = flightInfo;
        return this;
    }
    
    public BoardingPass build() {
        validateBoardingPass();
        
        BoardingPass pass = new BoardingPass();
        
        if (this.aboveBarCodeImageUrl != null) {
            pass.setAboveBarCodeImageUrl(this.aboveBarCodeImageUrl.toString());
        }
        pass.setAuxiliaryFields(this.auxiliaryFields);
        pass.setFlightInfo(this.flightInfo);
        if (this.headerImageUrl != null) {
            pass.setHeaderImageUrl(this.headerImageUrl.toString());
        }
        if (this.logoImageUrl != null) {
            pass.setLogoImageUrl(this.logoImageUrl.toString());
        }
        pass.setPassengerName(this.passengerName);
        pass.setPnrNumber(this.pnrNumber);
        pass.setQrCode(this.qrCode);
        pass.setSeat(this.seat);
        pass.setSecondaryFields(this.secondaryFields);
        pass.setTravelClass(this.travelClass);
        if (this.barcodeImageUrl != null) {
            pass.setBarcodeImageUrl(this.barcodeImageUrl.toString());
        }
        return pass;
    }

    private void validateBoardingPass() throws IllegalArgumentException {
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
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
