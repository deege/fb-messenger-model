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

public class Error {

    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("code")
    @Expose
    private long code;
    @SerializedName("error_subcode")
    @Expose
    private long errorSubcode;
    @SerializedName("fbtrace_id")
    @Expose
    private String fbtraceId;

    /**
     *
     * @return The message
     */
    public String getMessage() {
        return message;
    }

    /**
     *
     * @param message The message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     *
     * @return The type
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @param type The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     * @return The code
     */
    public long getCode() {
        return code;
    }

    /**
     *
     * @param code The code
     */
    public void setCode(long code) {
        this.code = code;
    }

    /**
     *
     * @return The errorSubcode
     */
    public long getErrorSubcode() {
        return errorSubcode;
    }

    /**
     *
     * @param errorSubcode The error_subcode
     */
    public void setErrorSubcode(long errorSubcode) {
        this.errorSubcode = errorSubcode;
    }

    /**
     *
     * @return The fbtraceId
     */
    public String getFbtraceId() {
        return fbtraceId;
    }

    /**
     *
     * @param fbtraceId The fbtrace_id
     */
    public void setFbtraceId(String fbtraceId) {
        this.fbtraceId = fbtraceId;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(message).append(type).append(code).append(errorSubcode).append(fbtraceId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Error) == false) {
            return false;
        }
        Error rhs = ((Error) other);
        return new EqualsBuilder().append(message, rhs.message).append(type, rhs.type).append(code, rhs.code).append(errorSubcode, rhs.errorSubcode).append(fbtraceId, rhs.fbtraceId).isEquals();
    }

}

