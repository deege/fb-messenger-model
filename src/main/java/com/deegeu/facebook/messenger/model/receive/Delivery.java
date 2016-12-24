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
package com.deegeu.facebook.messenger.model.receive;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
final public class Delivery {

    @JsonProperty("mids")
    @SerializedName("mids")
    @Expose
    private List<String> mids = null;
    
    @JsonProperty("watermark")
    @SerializedName("watermark")
    @Expose
    private long watermark;
    
    @JsonProperty("seq")
    @SerializedName("seq")
    @Expose
    private long seq;

    @JsonProperty("mids")
    public List<String> getMids() {
        return mids;
    }

    @JsonProperty("mids")
    public void setMids(List<String> mids) {
        this.mids = mids;
    }

    @JsonProperty("watermark")
    public long getWatermark() {
        return watermark;
    }

    @JsonProperty("watermark")
    public void setWatermark(long watermark) {
        this.watermark = watermark;
    }

    @JsonProperty("seq")
    public long getSeq() {
        return seq;
    }

    @JsonProperty("seq")
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