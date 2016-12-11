
package com.deegeu.facebook.messenger.model.receive;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class MessageResponse {

    @SerializedName("object")
    @Expose
    private String object;
    
    @SerializedName("entry")
    @Expose
    private List<Entry> entry = null;

    /**
     * 
     * @return
     *     The object
     */
    public String getObject() {
        return object;
    }

    /**
     * 
     * @param object
     *     The object
     */
    public void setObject(String object) {
        this.object = object;
    }

    /**
     * 
     * @return
     *     The entry
     */
    public List<Entry> getEntry() {
        return entry;
    }

    /**
     * 
     * @param entry
     *     The entry
     */
    public void setEntry(List<Entry> entry) {
        this.entry = entry;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(object).append(entry).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MessageResponse) == false) {
            return false;
        }
        MessageResponse rhs = ((MessageResponse) other);
        return new EqualsBuilder().append(object, rhs.object).append(entry, rhs.entry).isEquals();
    }

}
