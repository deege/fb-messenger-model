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
final public class Button {

    @JsonProperty("type")
    @SerializedName("type")
    @Expose
    private String type;
    
    @JsonProperty("url")
    @SerializedName("url")
    @Expose
    private String url;
    
    @JsonProperty("title")
    @SerializedName("title")
    @Expose
    private String title;
    
    @JsonProperty("payload")
    @SerializedName("payload")
    @Expose
    private String payload;
    
    @JsonProperty("payment_summary")
    @SerializedName("payment_summary")
    @Expose
    private PaymentSummary paymentSummary;
    
    @JsonProperty("messenger_extensions")
    @SerializedName("messenger_extensions")
    @Expose
    private boolean messengerExtensions;
    
    @JsonProperty("webview_height_ratio")
    @SerializedName("webview_height_ratio")
    @Expose
    private String webviewHeightRatio;
    
    @JsonProperty("fallback_url")
    @SerializedName("fallback_url")
    @Expose
    private String fallbackUrl;

    @JsonProperty("messenger_extensions")
    public boolean isMessengerExtensions() {
        return messengerExtensions;
    }

    @JsonProperty("messenger_extensions")
    public void setMessengerExtensions(boolean messengerExtensions) {
        this.messengerExtensions = messengerExtensions;
    }

    @JsonProperty("webview_height_ratio")
    public String getWebviewHeightRatio() {
        return webviewHeightRatio;
    }

    @JsonProperty("webview_height_ratio")
    public void setWebviewHeightRatio(String webviewHeightRatio) {
        this.webviewHeightRatio = webviewHeightRatio;
    }

    @JsonProperty("fallback_url")
    public String getFallbackUrl() {
        return fallbackUrl;
    }

    @JsonProperty("fallback_url")
    public void setFallbackUrl(String fallbackUrl) {
        this.fallbackUrl = fallbackUrl;
    }

    @JsonProperty("payment_summary")
    public PaymentSummary getPaymentSummary() {
        return paymentSummary;
    }

    @JsonProperty("payment_summary")
    public void setPayloadSummary(PaymentSummary paymentSummary) {
        this.paymentSummary = paymentSummary;
    }
    
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("payload")
    public String getPayload() {
        return payload;
    }

    @JsonProperty("payload")
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
                .append(fallbackUrl)
                .append(paymentSummary)
                .toHashCode();
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
                .append(fallbackUrl, rhs.fallbackUrl)
                .append(paymentSummary, rhs.paymentSummary)
                .isEquals();
    }

}
