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
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 *
 * @author dspiess
 */
final public class ArrivalAirportBuilder {

    private String airportCode;
    private String city;
    private String terminal;
    private String gate;

    public ArrivalAirportBuilder airportCode(String airportCode) {
        this.airportCode = airportCode;
        return this;
    }

    public ArrivalAirportBuilder city(String city) {
        this.city = city;
        return this;
    }

    public ArrivalAirportBuilder terminal(String terminal) {
        this.terminal = terminal;
        return this;
    }

    public ArrivalAirportBuilder gate(String gate) {
        this.gate = gate;
        return this;
    }
    
    public ArrivalAirport build() {
        validateArrivalAirport();
        
        ArrivalAirport arrival = new ArrivalAirport();

        arrival.setAirportCode(airportCode);
        arrival.setCity(city);
        arrival.setTerminal(terminal);
        arrival.setGate(gate);
        
        return arrival;
    }

    private void validateArrivalAirport() throws IllegalArgumentException {
        if (this.airportCode == null) {
            throw new IllegalArgumentException(
                    "ArrivalAirportBuilder 'airportCode' cannot be null.");
        }
        if (this.city == null) {
            throw new IllegalArgumentException(
                    "ArrivalAirportBuilder 'city' cannot be null.");
        }
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
    
}
