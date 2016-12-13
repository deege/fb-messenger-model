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

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Element {

    @SerializedName("title")
    @Expose
    private String title;
    
    @SerializedName("item_url")
    @Expose
    private String itemUrl;
    
    @SerializedName("image_url")
    @Expose
    private String imageUrl;
    
    @SerializedName("subtitle")
    @Expose
    private String subtitle;
    
    @SerializedName("default_action")
    @Expose
    private DefaultAction defaultAction;
    
    @SerializedName("buttons")
    @Expose
    private List<Button> buttons = null;
    
    @SerializedName("quantity")
    @Expose
    private long quantity;
    
    @SerializedName("price")
    @Expose
    private long price;
    
    @SerializedName("currency")
    @Expose
    private String currency;

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
     *     The itemUrl
     */
    public String getItemUrl() {
        return itemUrl;
    }

    /**
     * 
     * @param itemUrl
     *     The item_url
     */
    public void setItemUrl(String itemUrl) {
        this.itemUrl = itemUrl;
    }

    /**
     * 
     * @return
     *     The imageUrl
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * 
     * @param imageUrl
     *     The image_url
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**
     * 
     * @return
     *     The subtitle
     */
    public String getSubtitle() {
        return subtitle;
    }

    /**
     * 
     * @param subtitle
     *     The subtitle
     */
    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    /**
     * 
     * @return
     *     The buttons
     */
    public List<Button> getButtons() {
        return buttons;
    }

    /**
     * 
     * @param buttons
     *     The buttons
     */
    public void setButtons(List<Button> buttons) {
        this.buttons = buttons;
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
