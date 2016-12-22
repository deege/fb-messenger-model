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
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * 
 * @author dspiess
 */
final public class AddressBuilder {
    private String street1;

    private String street2;

    private String city;

    private String postalCode;

    private String state;

    private String country;
    
    public AddressBuilder() { }
    
    public AddressBuilder street1(String street1) {
        this.street1 = street1;
        return this;
    }
    
    public AddressBuilder street2(String street2) {
        this.street2 = street2;
        return this;
    }
    
    public AddressBuilder city(String city) {
        this.city = city;
        return this;
    }
    
    public AddressBuilder postalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }
    
    public AddressBuilder state(String state) {
        this.state = state;
        return this;
    }
    
    public AddressBuilder country(String country) {
        this.country = country;
        return this;
    }
    
    public Address build() {
        Address address = new Address();
        
        if (this.street1 == null) {
            throw new IllegalArgumentException(
                    "AddressBuilder 'street_1' cannot be null.");
        }
        if (this.city == null) {
            throw new IllegalArgumentException(
                    "AddressBuilder 'city' cannot be null.");
        }
        if (this.postalCode == null) {
            throw new IllegalArgumentException(
                    "AddressBuilder 'postal_code' cannot be null.");
        }
        if (this.state == null) {
            throw new IllegalArgumentException(
                    "AddressBuilder 'state' cannot be null.");
        }
        if (this.country == null) {
            throw new IllegalArgumentException(
                    "AddressBuilder 'country' cannot be null.");
        }
        
        address.setCity(city);
        address.setCountry(country);
        address.setPostalCode(postalCode);
        address.setState(state);
        address.setStreet1(street1);
        address.setStreet2(street2);
        
        return address;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }     
}
