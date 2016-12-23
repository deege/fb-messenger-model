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

import com.deegeu.facebook.messenger.model.send.DepartureAirport;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 *
 * @author dspiess
 */
final public class DepartureAirportBuilder {

    private String airportCode;

    private String city;

    private String terminal;

    private String gate;
    
    public DepartureAirportBuilder() { }

    public DepartureAirportBuilder airportCode(String airportCode) {
        this.airportCode = airportCode;
        return this;
    }

    public DepartureAirportBuilder city(String city) {
        this.city = city;
        return this;
    }

    public DepartureAirportBuilder terminal(String terminal) {
        this.terminal = terminal;
        return this;
    }

    public DepartureAirportBuilder gate(String gate) {
        this.gate = gate;
        return this;
    }
    
    public DepartureAirport build() {
        validateDepartureAirport();
        
        DepartureAirport airport = new DepartureAirport();
        
        airport.setAirportCode(airportCode);
        airport.setCity(city);
        airport.setGate(gate);
        airport.setTerminal(terminal);
        
        return airport;
    }

    private void validateDepartureAirport() throws IllegalArgumentException {
        if (this.airportCode == null) {
            throw new IllegalArgumentException(
                    "DepartureAirport 'airportCode' cannot be null.");
        }
        if (this.city == null) {
            throw new IllegalArgumentException(
                    "DepartureAirport 'city' cannot be null.");
        }
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    } 
}
