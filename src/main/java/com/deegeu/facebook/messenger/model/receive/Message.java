
package com.deegeu.facebook.messenger.model.receive;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Message {

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
    
    @SerializedName("is_echo")
    @Expose
    private Boolean isEcho;
    
    
    @SerializedName("metadata")
    @Expose
    private String metadata;

    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    public Boolean getIsEcho() {
        return isEcho;
    }

    public void setIsEcho(Boolean isEcho) {
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
