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

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
final public class Message {

    @JsonProperty("is_echo")
    @SerializedName("is_echo")
    @Expose
    private boolean isEcho;
    
    @JsonProperty("app_id")
    @SerializedName("app_id")
    @Expose
    private Long appId;
    
    @JsonProperty("metadata")
    @SerializedName("metadata")
    @Expose
    private String metadata;
    
    @JsonProperty("mid")
    @SerializedName("mid")
    @Expose
    private String mid;
    
    @JsonProperty("seq")
    @SerializedName("seq")
    @Expose
    private Long seq;
    
    @JsonProperty("text")
    @SerializedName("text")
    @Expose
    private String text;

    @JsonProperty("quick_reply")
    @SerializedName("quick_reply")
    @Expose
    private String quickReply;
    
    @JsonProperty("attachments")
    @SerializedName("attachments")
    @Expose
    private List<Attachment> attachments;

    @JsonProperty("app_id")
    public Long getAppId() {
        return appId;
    }

    @JsonProperty("app_id")
    public void setAppId(Long appId) {
        this.appId = appId;
    }
    
    @JsonProperty("metadata")
    public String getMetadata() {
        return metadata;
    }

    @JsonProperty("metadata")
    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    @JsonProperty("is_echo")
    public boolean getIsEcho() {
        return isEcho;
    }

    @JsonProperty("is_echo")
    public void setIsEcho(boolean isEcho) {
        this.isEcho = isEcho;
    }

    @JsonProperty("quick_reply")
    public String getQuickReply() {
        return quickReply;
    }

    @JsonProperty("quick_reply")
    public void setQuickReply(String quickReply) {
        this.quickReply = quickReply;
    }

    @JsonProperty("attachments")
    public List<Attachment> getAttachments() {
        return attachments;
    }

    @JsonProperty("attachments")
    public void setAttachments(List<Attachment> attachments) {
        this.attachments = attachments;
    }

    @JsonProperty("mid")
    public String getMid() {
        return mid;
    }

    @JsonProperty("mid")
    public void setMid(String mid) {
        this.mid = mid;
    }

    @JsonProperty("seq")
    public Long getSeq() {
        return seq;
    }

    @JsonProperty("seq")
    public void setSeq(Long seq) {
        this.seq = seq;
    }

    @JsonProperty("text")
    public String getText() {
        return text;
    }

    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(mid)
                .append(seq)
                .append(text)
                .append(quickReply)
                .append(attachments)
                .append(isEcho)
                .append(metadata)
                .toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Message) == false) {
            return false;
        }
        Message rhs = ((Message) other);
        return new EqualsBuilder()
                .append(mid, rhs.mid)
                .append(seq, rhs.seq)
                .append(quickReply, rhs.quickReply)
                .append(text, rhs.text)
                .append(attachments, rhs.attachments)
                .append(isEcho, rhs.isEcho)
                .append(metadata, rhs.metadata)
                .isEquals();
    }

}
