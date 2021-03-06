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

import com.deegeu.facebook.messenger.model.send.ArrivalAirport;
import com.deegeu.facebook.messenger.model.send.DepartureAirport;
import com.deegeu.facebook.messenger.model.send.FlightSchedule;
import com.deegeu.facebook.messenger.model.send.UpdateFlightInfo;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 *
 * @author dspiess
 */
final public class UpdateFlightInfoBuilder {

    private String flightNumber;

    private DepartureAirport departureAirport;

    private ArrivalAirport arrivalAirport;

    private FlightSchedule flightSchedule;
    
    public UpdateFlightInfoBuilder() { }

    public UpdateFlightInfoBuilder flightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
        return this;
    }

    public UpdateFlightInfoBuilder departureAirport(DepartureAirport departureAirport) {
        this.departureAirport = departureAirport;
        return this;
    }

    public UpdateFlightInfoBuilder arrivalAirport(ArrivalAirport arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
        return this;
    }

    public UpdateFlightInfoBuilder flightSchedule(FlightSchedule flightSchedule) {
        this.flightSchedule = flightSchedule;
        return this;
    }
    
    public UpdateFlightInfo build() {
        if (this.arrivalAirport == null) {
            throw new IllegalArgumentException(
                    "UpdateFlightInfo 'arrivalAirport' cannot be null.");
        }
        if (this.departureAirport == null) {
            throw new IllegalArgumentException(
                    "UpdateFlightInfo 'departureAirport' cannot be null.");
        }
        if (this.flightNumber == null) {
            throw new IllegalArgumentException(
                    "UpdateFlightInfo 'flightNumber' cannot be null.");
        }
        if (this.flightSchedule == null) {
            throw new IllegalArgumentException(
                    "UpdateFlightInfo 'flightSchedule' cannot be null.");
        }
        
        UpdateFlightInfo flightInfo = new UpdateFlightInfo();
        
        flightInfo.setArrivalAirport(arrivalAirport);
        flightInfo.setDepartureAirport(departureAirport);
        flightInfo.setFlightNumber(flightNumber);
        flightInfo.setFlightSchedule(flightSchedule);
        
        return flightInfo;
    }
    
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
