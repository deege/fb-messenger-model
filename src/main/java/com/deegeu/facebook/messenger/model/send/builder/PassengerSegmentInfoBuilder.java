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

import com.deegeu.facebook.messenger.model.send.PassengerSegmentInfo;
import com.deegeu.facebook.messenger.model.send.ProductInfo;
import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 *
 * @author dspiess
 */
final public class PassengerSegmentInfoBuilder {
    private static final int PRODUCT_INFO_LIMIT = 4;
    
    private String segmentId;

    private String passengerId;

    private String seat;

    private String seatType;

    private List<ProductInfo> productInfo = null;
    
    public PassengerSegmentInfoBuilder() { }

    public PassengerSegmentInfoBuilder segmentId(String segmentId) {
        this.segmentId = segmentId;
        return this;
    }

    public PassengerSegmentInfoBuilder passengerId(String passengerId) {
        this.passengerId = passengerId;
        return this;
    }

    public PassengerSegmentInfoBuilder seat(String seat) {
        this.seat = seat;
        return this;
    }

    public PassengerSegmentInfoBuilder seatType(String seatType) {
        this.seatType = seatType;
        return this;
    }

    public PassengerSegmentInfoBuilder productInfo(List<ProductInfo> productInfo) {
        this.productInfo = productInfo;
        return this;
    }
    
    public PassengerSegmentInfo build() {
        if (this.segmentId == null) {
            throw new IllegalArgumentException("PassengerSegmentInfo 'segmentId' cannot be null.");
        }
        
        if (this.passengerId == null) {
            throw new IllegalArgumentException("PassengerSegmentInfo 'passengerId' cannot be null.");
        }
        
        if (this.seat == null) {
            throw new IllegalArgumentException("PassengerSegmentInfo 'seat' cannot be null.");
        }
        
        if (this.seatType == null) {
            throw new IllegalArgumentException("PassengerSegmentInfo 'seatType' cannot be null.");
        }
        
        if ((this.productInfo != null) && (this.productInfo.size() > PRODUCT_INFO_LIMIT)) {
            throw new IllegalArgumentException(
                    "PassengerSegmentInfo 'product_info' is limited to " 
                            + PRODUCT_INFO_LIMIT + " items.");
        }
        
        PassengerSegmentInfo info = new PassengerSegmentInfo();
        
        info.setPassengerId(passengerId);
        info.setProductInfo(productInfo);
        info.setSeat(seat);
        info.setSeatType(seatType);
        info.setSegmentId(segmentId);
        
        return info;
    }
 
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
