
package com.deegeu.facebook.messenger.model.send;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class DefaultAction {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("url")
    @Expose
    private String url;
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
     *     The messengerExtensions
     */
    public boolean isMessengerExtensions() {
        return messengerExtensions;
    }

    /**
     * 
     * @param messengerExtensions
     *     The messenger_extensions
     */
    public void setMessengerExtensions(boolean messengerExtensions) {
        this.messengerExtensions = messengerExtensions;
    }

    /**
     * 
     * @return
     *     The webviewHeightRatio
     */
    public String getWebviewHeightRatio() {
        return webviewHeightRatio;
    }

    /**
     * 
     * @param webviewHeightRatio
     *     The webview_height_ratio
     */
    public void setWebviewHeightRatio(String webviewHeightRatio) {
        this.webviewHeightRatio = webviewHeightRatio;
    }

    /**
     * 
     * @return
     *     The fallbackUrl
     */
    public String getFallbackUrl() {
        return fallbackUrl;
    }

    /**
     * 
     * @param fallbackUrl
     *     The fallback_url
     */
    public void setFallbackUrl(String fallbackUrl) {
        this.fallbackUrl = fallbackUrl;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(type).append(url).append(messengerExtensions).append(webviewHeightRatio).append(fallbackUrl).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DefaultAction) == false) {
            return false;
        }
        DefaultAction rhs = ((DefaultAction) other);
        return new EqualsBuilder().append(type, rhs.type).append(url, rhs.url).append(messengerExtensions, rhs.messengerExtensions).append(webviewHeightRatio, rhs.webviewHeightRatio).append(fallbackUrl, rhs.fallbackUrl).isEquals();
    }

}
