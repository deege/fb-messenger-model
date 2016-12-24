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
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
final public class Element {

    @JsonProperty("title")
    @SerializedName("title")
    @Expose
    private String title;
    
    @JsonProperty("item_url")
    @SerializedName("item_url")
    @Expose
    private String itemUrl;
    
    @JsonProperty("image_url")
    @SerializedName("image_url")
    @Expose
    private String imageUrl;
    
    @JsonProperty("subtitle")
    @SerializedName("subtitle")
    @Expose
    private String subtitle;
    
    @JsonProperty("default_action")
    @SerializedName("default_action")
    @Expose
    private DefaultAction defaultAction;
    
    @JsonProperty("buttons")
    @SerializedName("buttons")
    @Expose
    private List<Button> buttons = null;
    
    @JsonProperty("quantity")
    @SerializedName("quantity")
    @Expose
    private long quantity;
    
    @JsonProperty("price")
    @SerializedName("price")
    @Expose
    private long price;
    
    @JsonProperty("currency")
    @SerializedName("currency")
    @Expose
    private String currency;

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("item_url")
    public String getItemUrl() {
        return itemUrl;
    }

    @JsonProperty("item_url")
    public void setItemUrl(String itemUrl) {
        this.itemUrl = itemUrl;
    }

    @JsonProperty("image_url")
    public String getImageUrl() {
        return imageUrl;
    }

    @JsonProperty("image_url")
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @JsonProperty("subtitle")
    public String getSubtitle() {
        return subtitle;
    }

    @JsonProperty("subtitle")
    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    @JsonProperty("buttons")
    public List<Button> getButtons() {
        return buttons;
    }

    @JsonProperty("buttons")
    public void setButtons(List<Button> buttons) {
        this.buttons = buttons;
    }

    @JsonProperty("default_action")
    public DefaultAction getDefaultAction() {
        return defaultAction;
    }

    @JsonProperty("default_action")
    public void setDefaultAction(DefaultAction defaultAction) {
        this.defaultAction = defaultAction;
    }

    @JsonProperty("quantity")
    public long getQuantity() {
        return quantity;
    }

    @JsonProperty("quantity")
    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    @JsonProperty("price")
    public long getPrice() {
        return price;
    }

    @JsonProperty("price")
    public void setPrice(long price) {
        this.price = price;
    }

    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }
    
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(title)
                .append(itemUrl)
                .append(imageUrl)
                .append(subtitle)
                .append(buttons)
                .append(defaultAction)
                .append(quantity)
                .append(price)
                .append(currency)
                .toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Element) == false) {
            return false;
        }
        Element rhs = ((Element) other);
        return new EqualsBuilder()
                .append(title, rhs.title)
                .append(itemUrl, rhs.itemUrl)
                .append(imageUrl, rhs.imageUrl)
                .append(subtitle, rhs.subtitle)
                .append(buttons, rhs.buttons)
                .append(defaultAction, rhs.defaultAction)
                .append(quantity, rhs.quantity)
                .append(price, rhs.price)
                .append(currency, rhs.currency)
                .isEquals();
    }

}
