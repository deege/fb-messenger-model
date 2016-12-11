/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deegeu.facebook.messenger.model.send;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 *
 * @author dspiess
 */
public class MessageRequest {
    @SerializedName("recipient")
    @Expose
    private Recipient recipient;
    
    @SerializedName("message")
    @Expose
    private Message message;
    
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(recipient).append(message).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MessageRequest) == false) {
            return false;
        }
        MessageRequest rhs = ((MessageRequest) other);
        return new EqualsBuilder().append(recipient, rhs.recipient).append(message, rhs.message).isEquals();
    }
    
}
