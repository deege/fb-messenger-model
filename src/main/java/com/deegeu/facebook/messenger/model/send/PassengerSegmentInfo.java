
package com.deegeu.facebook.messenger.model.send;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class PassengerSegmentInfo {

    @SerializedName("segment_id")
    @Expose
    private String segmentId;
    @SerializedName("passenger_id")
    @Expose
    private String passengerId;
    @SerializedName("seat")
    @Expose
    private String seat;
    @SerializedName("seat_type")
    @Expose
    private String seatType;
    @SerializedName("product_info")
    @Expose
    private List<ProductInfo> productInfo = null;

    /**
     * 
     * @return
     *     The segmentId
     */
    public String getSegmentId() {
        return segmentId;
    }

    /**
     * 
     * @param segmentId
     *     The segment_id
     */
    public void setSegmentId(String segmentId) {
        this.segmentId = segmentId;
    }

    /**
     * 
     * @return
     *     The passengerId
     */
    public String getPassengerId() {
        return passengerId;
    }

    /**
     * 
     * @param passengerId
     *     The passenger_id
     */
    public void setPassengerId(String passengerId) {
        this.passengerId = passengerId;
    }

    /**
     * 
     * @return
     *     The seat
     */
    public String getSeat() {
        return seat;
    }

    /**
     * 
     * @param seat
     *     The seat
     */
    public void setSeat(String seat) {
        this.seat = seat;
    }

    /**
     * 
     * @return
     *     The seatType
     */
    public String getSeatType() {
        return seatType;
    }

    /**
     * 
     * @param seatType
     *     The seat_type
     */
    public void setSeatType(String seatType) {
        this.seatType = seatType;
    }

    /**
     * 
     * @return
     *     The productInfo
     */
    public List<ProductInfo> getProductInfo() {
        return productInfo;
    }

    /**
     * 
     * @param productInfo
     *     The product_info
     */
    public void setProductInfo(List<ProductInfo> productInfo) {
        this.productInfo = productInfo;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(segmentId).append(passengerId).append(seat).append(seatType).append(productInfo).toHashCode();
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
        return new EqualsBuilder().append(segmentId, rhs.segmentId).append(passengerId, rhs.passengerId).append(seat, rhs.seat).append(seatType, rhs.seatType).append(productInfo, rhs.productInfo).isEquals();
    }

}
