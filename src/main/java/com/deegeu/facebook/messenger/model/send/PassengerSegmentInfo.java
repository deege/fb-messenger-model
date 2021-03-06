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
final public class PassengerSegmentInfo {

    @JsonProperty("segment_id")
    @SerializedName("segment_id")
    @Expose
    private String segmentId;
    
    @JsonProperty("passenger_id")
    @SerializedName("passenger_id")
    @Expose
    private String passengerId;
    
    @JsonProperty("seat")
    @SerializedName("seat")
    @Expose
    private String seat;
    
    @JsonProperty("seat_type")
    @SerializedName("seat_type")
    @Expose
    private String seatType;
    
    @JsonProperty("product_info")
    @SerializedName("product_info")
    @Expose
    private List<ProductInfo> productInfo = null;

    @JsonProperty("segment_id")
    public String getSegmentId() {
        return segmentId;
    }

    @JsonProperty("segment_id")
    public void setSegmentId(String segmentId) {
        this.segmentId = segmentId;
    }

    @JsonProperty("passenger_id")
    public String getPassengerId() {
        return passengerId;
    }

    @JsonProperty("passenger_id")
    public void setPassengerId(String passengerId) {
        this.passengerId = passengerId;
    }

    @JsonProperty("seat")
    public String getSeat() {
        return seat;
    }

    @JsonProperty("seat")
    public void setSeat(String seat) {
        this.seat = seat;
    }

    @JsonProperty("seat_type")
    public String getSeatType() {
        return seatType;
    }

    @JsonProperty("seat_type")
    public void setSeatType(String seatType) {
        this.seatType = seatType;
    }

    @JsonProperty("product_info")
    public List<ProductInfo> getProductInfo() {
        return productInfo;
    }

    @JsonProperty("product_info")
    public void setProductInfo(List<ProductInfo> productInfo) {
        this.productInfo = productInfo;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(segmentId)
                .append(passengerId)
                .append(seat)
                .append(seatType)
                .append(productInfo)
                .toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PassengerSegmentInfo) == false) {
            return false;
        }
        PassengerSegmentInfo rhs = ((PassengerSegmentInfo) other);
        return new EqualsBuilder()
                .append(segmentId, rhs.segmentId)
                .append(passengerId, rhs.passengerId)
                .append(seat, rhs.seat)
                .append(seatType, rhs.seatType)
                .append(productInfo, rhs.productInfo)
                .isEquals();
    }

}
