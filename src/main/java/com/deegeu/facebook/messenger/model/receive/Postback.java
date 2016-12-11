
package com.deegeu.facebook.messenger.model.receive;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Postback {

    @SerializedName("payload")
    @Expose
    private String payload;
    
    @SerializedName("referral")
    @Expose
    private Referral referral;

    /**
     * 
     * @return
     *     The payload
     */
    public String getPayload() {
        return payload;
    }

    /**
     * 
     * @param payload
     *     The payload
     */
    public void setPayload(String payload) {
        this.payload = payload;
    }

    /**
     * 
     * @return
     *     The referral
     */
    public Referral getReferral() {
        return referral;
    }

    /**
     * 
     * @param referral
     *     The referral
     */
    public void setReferral(Referral referral) {
        this.referral = referral;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(payload).append(referral).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Postback) == false) {
            return false;
        }
        Postback rhs = ((Postback) other);
        return new EqualsBuilder().append(payload, rhs.payload).append(referral, rhs.referral).isEquals();
    }

}
