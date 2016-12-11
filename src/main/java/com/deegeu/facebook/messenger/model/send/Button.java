
package com.deegeu.facebook.messenger.model.send;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Button {

    @SerializedName("type")
    @Expose
    private String type;
    
    @SerializedName("url")
    @Expose
    private String url;
    
    @SerializedName("title")
    @Expose
    private String title;
    
    @SerializedName("payload")
    @Expose
    private String payload;
    
    @SerializedName("messenger_extensions")
    @Expose
    private boolean messengerExtensions;
    
    @SerializedName("webview_height_ratio")
    @Expose
    private String webviewHeightRatio;
    
    @SerializedName("fallback_url")
    @Expose
    private String fallbackUrl;

    /**
     * 
     * @return
     *     The type
     */
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 
     * @return
     *     The url
     */
    public String getUrl() {
        return url;
    }

    /**
     * 
     * @param url
     *     The url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 
     * @return
     *     The title
     */
    public String getTitle() {
        return title;
    }

    /**
     * 
     * @param title
     *     The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 
     * @return
     *     The payload
     */
    public String getPayload() {
        return payload;
    }

    /**
     * 
     * @param payload
     *     The payload
     */
    public void setPayload(String payload) {
        this.payload = payload;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(type)
                .append(url)
                .append(title)
                .append(payload)
                .append(messengerExtensions)
                .append(webviewHeightRatio)
                .append(fallbackUrl).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Button) == false) {
            return false;
        }
        Button rhs = ((Button) other);
        return new EqualsBuilder()
                .append(type, rhs.type)
                .append(url, rhs.url)
                .append(title, rhs.title)
                .append(payload, rhs.payload)
                .append(messengerExtensions, rhs.messengerExtensions)
                .append(webviewHeightRatio, rhs.webviewHeightRatio)
                .append(fallbackUrl, rhs.fallbackUrl).isEquals();
    }

}
