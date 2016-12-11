
package com.deegeu.facebook.messenger.model.receive;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Messaging {

    @SerializedName("sender")
    @Expose
    private Sender sender;
    
    @SerializedName("recipient")
    @Expose
    private Recipient recipient;
    
    @SerializedName("timestamp")
    @Expose
    private Long timestamp;
    
    @SerializedName("message")
    @Expose
    private Message message;
    
    @SerializedName("read")
    @Expose
    private ReadReceipt readReceipt;
    
    @SerializedName("delivery")
    @Expose
    private Delivery delivery;
    
    @SerializedName("optin")
    @Expose
    private Optin optin;
    
    @SerializedName("postback")
    @Expose
    private Postback postback;

    /**
     * 
     * @return 
     */
    public ReadReceipt getRead() {
        return readReceipt;
    }

    /**
     * 
     * @param readReceipt 
     */
    public void setRead(ReadReceipt readReceipt) {
        this.readReceipt = readReceipt;
    }

    /**
     * 
     * @return
     *     The sender
     */
    public Sender getSender() {
        return sender;
    }

    /**
     * 
     * @param sender
     *     The sender
     */
    public void setSender(Sender sender) {
        this.sender = sender;
    }

    /**
     * 
     * @return
     *     The recipient
     */
    public Recipient getRecipient() {
        return recipient;
    }

    /**
     * 
     * @param recipient
     *     The recipient
     */
    public void setRecipient(Recipient recipient) {
        this.recipient = recipient;
    }

    /**
     * 
     * @return
     *     The timestamp
     */
    public Long getTimestamp() {
        return timestamp;
    }

    /**
     * 
     * @param timestamp
     *     The timestamp
     */
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * 
     * @return
     *     The message
     */
    public Message getMessage() {
        return message;
    }

    /**
     * 
     * @param message
     *     The message
     */
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
