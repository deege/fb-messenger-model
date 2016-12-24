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
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
final public class Messaging {

    @JsonProperty("sender")
    @SerializedName("sender")
    @Expose
    private Sender sender;
    
    @JsonProperty("recipient")
    @SerializedName("recipient")
    @Expose
    private Recipient recipient;
    
    @JsonProperty("timestamp")
    @SerializedName("timestamp")
    @Expose
    private Long timestamp;
    
    @JsonProperty("message")
    @SerializedName("message")
    @Expose
    private Message message;
    
    @JsonProperty("read")
    @SerializedName("read")
    @Expose
    private ReadReceipt readReceipt;
    
    @JsonProperty("delivery")
    @SerializedName("delivery")
    @Expose
    private Delivery delivery;
    
    @JsonProperty("optin")
    @SerializedName("optin")
    @Expose
    private Optin optin;
    
    @JsonProperty("postback")
    @SerializedName("postback")
    @Expose
    private Postback postback;

    @JsonProperty("delivery")
    public Delivery getDelivery() {
        return delivery;
    }

    @JsonProperty("delivery")
    public void setDelivery(Delivery delivery) {
        this.delivery = delivery;
    }

    @JsonProperty("optin")
    public Optin getOptin() {
        return optin;
    }

    @JsonProperty("optin")
    public void setOptin(Optin optin) {
        this.optin = optin;
    }

    @JsonProperty("postback")
    public Postback getPostback() {
        return postback;
    }

    @JsonProperty("postback")
    public void setPostback(Postback postback) {
        this.postback = postback;
    }
    
    @JsonProperty("read")
    public ReadReceipt getRead() {
        return readReceipt;
    }

    @JsonProperty("read")
    public void setRead(ReadReceipt readReceipt) {
        this.readReceipt = readReceipt;
    }

    @JsonProperty("sender")
    public Sender getSender() {
        return sender;
    }

    @JsonProperty("sender")
    public void setSender(Sender sender) {
        this.sender = sender;
    }

    @JsonProperty("recipient")
    public Recipient getRecipient() {
        return recipient;
    }

    @JsonProperty("recipient")
    public void setRecipient(Recipient recipient) {
        this.recipient = recipient;
    }

    @JsonProperty("timestamp")
    public Long getTimestamp() {
        return timestamp;
    }

    @JsonProperty("timestamp")
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    @JsonProperty("message")
    public Message getMessage() {
        return message;
    }

    @JsonProperty("message")
    public void setMessage(Message message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(sender)
                .append(recipient)
                .append(timestamp)
                .append(message)
                .append(readReceipt)
                .append(delivery)
                .append(optin)
                .append(postback)
                .toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Messaging) == false) {
            return false;
        }
        Messaging rhs = ((Messaging) other);
        return new EqualsBuilder()
                .append(sender, rhs.sender)
                .append(recipient, rhs.recipient)
                .append(timestamp, rhs.timestamp)
                .append(message, rhs.message)
                .append(readReceipt, rhs.readReceipt)
                .append(delivery, rhs.delivery)
                .append(optin, rhs.optin)
                .append(postback, rhs.postback)
                .isEquals();
    }

}
