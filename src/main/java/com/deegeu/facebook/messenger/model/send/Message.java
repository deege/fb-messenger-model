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
import java.util.List;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
final public class Message {

    @JsonProperty("attachment")
    @SerializedName("attachment")
    @Expose
    private Attachment attachment;
    
    @JsonProperty("text")
    @SerializedName("text")
    @Expose
    private String text;

    @JsonProperty("quick_replies")
    @SerializedName("quick_replies")
    @Expose
    private List<QuickReply> quickReplies = null;
    
    @JsonProperty("is_echo")
    @SerializedName("is_echo")
    @Expose
    private Boolean isEcho;
      
    @JsonProperty("metadata")
    @SerializedName("metadata")
    @Expose
    private String metadata;

    @JsonProperty("text")
    public String getText() {
        return text;
    }

    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    @JsonProperty("quick_replies")
    public List<QuickReply> getQuickReplies() {
        return quickReplies;
    }

    @JsonProperty("quick_replies")
    public void setQuickReply(List<QuickReply> quickReplies) {
        this.quickReplies = quickReplies;
    }

    @JsonProperty("is_echo")
    public Boolean getIsEcho() {
        return isEcho;
    }

    @JsonProperty("is_echo")
    public void setIsEcho(Boolean isEcho) {
        this.isEcho = isEcho;
    }

    @JsonProperty("metadata")
    public String getMetadata() {
        return metadata;
    }

    @JsonProperty("metadata")
    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }
   
    @JsonProperty("attachment")
    public Attachment getAttachment() {
        return attachment;
    }

    @JsonProperty("attachment")
    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(this.attachment)
                .append(this.isEcho)
                .append(this.metadata)
                .append(this.quickReplies)
                .append(this.text)
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
                .append(this.attachment, rhs.attachment)
                .append(this.isEcho, rhs.isEcho)
                .append(this.metadata, rhs.metadata)
                .append(this.quickReplies, rhs.quickReplies)
                .append(this.text, rhs.text)
                .isEquals();
    }

}
