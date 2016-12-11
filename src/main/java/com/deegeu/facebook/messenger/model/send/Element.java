
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
