
package com.deegeu.facebook.messenger.model.receive;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Entry {

    @SerializedName("id")
    @Expose
    private Long id;
    
    @SerializedName("time")
    @Expose
    private Long time;
    
    @SerializedName("messaging")
    @Expose
    private List<Messaging> messaging = null;

    /**
     * 
     * @return
     *     The id
     */
    public Long getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The time
     */
    public Long getTime() {
        return time;
    }

    /**
     * 
     * @param time
     *     The time
     */
    public void setTime(Long time) {
        this.time = time;
    }

    /**
     * 
     * @return
     *     The messaging
     */
    public List<Messaging> getMessaging() {
        return messaging;
    }

    /**
     * 
     * @param messaging
     *     The messaging
     */
    public void setMessaging(List<Messaging> messaging) {
        this.messaging = messaging;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(id).append(time).append(messaging).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Entry) == false) {
            return false;
        }
        Entry rhs = ((Entry) other);
        return new EqualsBuilder().append(id, rhs.id).append(time, rhs.time).append(messaging, rhs.messaging).isEquals();
    }

}
