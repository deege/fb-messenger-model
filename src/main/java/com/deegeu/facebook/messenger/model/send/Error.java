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
package com.deegeu.facebook.messenger.model.send;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
final public class Error {

    @JsonProperty("message")
    @SerializedName("message")
    @Expose
    private String message;
    
    @JsonProperty("type")
    @SerializedName("type")
    @Expose
    private String type;
    
    @JsonProperty("code")
    @SerializedName("code")
    @Expose
    private long code;
    
    @JsonProperty("error_subcode")
    @SerializedName("error_subcode")
    @Expose
    private long errorSubcode;
    
    @JsonProperty("fbtrace_id")
    @SerializedName("fbtrace_id")
    @Expose
    private String fbtraceId;

    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("code")
    public long getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(long code) {
        this.code = code;
    }

    @JsonProperty("error_subcode")
    public long getErrorSubcode() {
        return errorSubcode;
    }

    @JsonProperty("error_subcode")
    public void setErrorSubcode(long errorSubcode) {
        this.errorSubcode = errorSubcode;
    }

    @JsonProperty("fbtrace_id")
    public String getFbtraceId() {
        return fbtraceId;
    }

    @JsonProperty("fbtrace_id")
    public void setFbtraceId(String fbtraceId) {
        this.fbtraceId = fbtraceId;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(message)
                .append(type)
                .append(code)
                .append(errorSubcode)
                .append(fbtraceId)
                .toHashCode();
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
        return new EqualsBuilder()
                .append(message, rhs.message)
                .append(type, rhs.type)
                .append(code, rhs.code)
                .append(errorSubcode, rhs.errorSubcode)
                .append(fbtraceId, rhs.fbtraceId)
                .isEquals();
    }

}

