/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deegeu.facebook.messenger.model.receive;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 *
 * @author dspiess
 */
public class AccountLinking {
    @SerializedName("status")
    @Expose
    private String status;
    
    @SerializedName("authorization_code")
    @Expose
    private Payload authorizationCode;
    
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(status).append(authorizationCode).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AccountLinking) == false) {
            return false;
        }
        AccountLinking rhs = ((AccountLinking) other);
        return new EqualsBuilder().append(status, rhs.status).append(authorizationCode, rhs.authorizationCode).isEquals();
    }
}
