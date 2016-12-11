
package com.deegeu.facebook.messenger.model.send;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Summary {

    @SerializedName("subtotal")
    @Expose
    private double subtotal;
    @SerializedName("shipping_cost")
    @Expose
    private double shippingCost;
    @SerializedName("total_tax")
    @Expose
    private double totalTax;
    @SerializedName("total_cost")
    @Expose
    private double totalCost;

    /**
     * 
     * @return
     *     The subtotal
     */
    public double getSubtotal() {
        return subtotal;
    }

    /**
     * 
     * @param subtotal
     *     The subtotal
     */
    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    /**
     * 
     * @return
     *     The shippingCost
     */
    public double getShippingCost() {
        return shippingCost;
    }

    /**
     * 
     * @param shippingCost
     *     The shipping_cost
     */
    public void setShippingCost(double shippingCost) {
        this.shippingCost = shippingCost;
    }

    /**
     * 
     * @return
     *     The totalTax
     */
    public double getTotalTax() {
        return totalTax;
    }

    /**
     * 
     * @param totalTax
     *     The total_tax
     */
    public void setTotalTax(double totalTax) {
        this.totalTax = totalTax;
    }

    /**
     * 
     * @return
     *     The totalCost
     */
    public double getTotalCost() {
        return totalCost;
    }

    /**
     * 
     * @param totalCost
     *     The total_cost
     */
    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(subtotal).append(shippingCost).append(totalTax).append(totalCost).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Summary) == false) {
            return false;
        }
        Summary rhs = ((Summary) other);
        return new EqualsBuilder().append(subtotal, rhs.subtotal).append(shippingCost, rhs.shippingCost).append(totalTax, rhs.totalTax).append(totalCost, rhs.totalCost).isEquals();
    }

}
