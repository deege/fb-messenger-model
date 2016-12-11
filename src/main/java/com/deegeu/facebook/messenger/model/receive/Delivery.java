/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deegeu.facebook.messenger.model.receive;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 *
 * @author dspiess
 */
public class Delivery {

    @SerializedName("mids")
    @Expose
    private List<String> mids = null;
    @SerializedName("watermark")
    @Expose
    private long watermark;
    @SerializedName("seq")
    @Expose
    private long seq;

    /**
     *
     * @return The mids
     */
    public List<String> getMids() {
        return mids;
    }

    /**
     *
     * @param mids The mids
     */
    public void setMids(List<String> mids) {
        this.mids = mids;
    }

    /**
     *
     * @return The watermark
     */
    public long getWatermark() {
        return watermark;
    }

    /**
     *
     * @param watermark The watermark
     */
    public void setWatermark(long watermark) {
        this.watermark = watermark;
    }

    /**
     *
     * @return The seq
     */
    public long getSeq() {
        return seq;
    }

    /**
     *
     * @param seq The seq
     */
    public void setSeq(long seq) {
        this.seq = seq;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(mids)
                .append(watermark)
                .append(seq)
                .toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Delivery) == false) {
            return false;
        }
        Delivery rhs = ((Delivery) other);
        return new EqualsBuilder()
                .append(mids, rhs.mids)
                .append(watermark, rhs.watermark)
                .append(seq, rhs.seq)
                .isEquals();
    }

}