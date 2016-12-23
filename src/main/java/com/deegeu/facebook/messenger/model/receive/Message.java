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

final public class Message {

    @SerializedName("is_echo")
    @Expose
    private boolean isEcho;
    
    @SerializedName("app_id")
    @Expose
    private Long appId;
    
    @SerializedName("metadata")
    @Expose
    private String metadata;
    
    @SerializedName("mid")
    @Expose
    private String mid;
    
    @SerializedName("seq")
    @Expose
    private Long seq;
    
    @SerializedName("text")
    @Expose
    private String text;

    @SerializedName("quick_reply")
    @Expose
    private String quickReply;
    
    @SerializedName("attachments")
    @Expose
    private List<Attachment> attachments;

    public Long getAppId() {
        return appId;
    }

    public void setAppId(Long appId) {
        this.appId = appId;
    }
    
    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    public boolean getIsEcho() {
        return isEcho;
    }

    public void setIsEcho(boolean isEcho) {
        this.isEcho = isEcho;
    }

    public String getQuickReply() {
        return quickReply;
    }

    public void setQuickReply(String quickReply) {
        this.quickReply = quickReply;
    }

    public List<Attachment> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<Attachment> attachments) {
        this.attachments = attachments;
    }

    /**
     * 
     * @return
     *     The mid
     */
    public String getMid() {
        return mid;
    }

    /**
     * 
     * @param mid
     *     The mid
     */
    public void setMid(String mid) {
        this.mid = mid;
    }

    /**
     * 
     * @return
     *     The seq
     */
    public Long getSeq() {
        return seq;
    }

    /**
     * 
     * @param seq
     *     The seq
     */
    public void setSeq(Long seq) {
        this.seq = seq;
    }

    /**
     * 
     * @return
     *     The text
     */
    public String getText() {
        return text;
    }

    /**
     * 
     * @param text
     *     The text
     */
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
