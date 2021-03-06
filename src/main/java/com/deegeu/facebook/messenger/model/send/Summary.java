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
final public class Summary {

    @JsonProperty("subtotal")
    @SerializedName("subtotal")
    @Expose
    private double subtotal;
    
    @JsonProperty("shipping_cost")
    @SerializedName("shipping_cost")
    @Expose
    private double shippingCost;
    
    @JsonProperty("total_tax")
    @SerializedName("total_tax")
    @Expose
    private double totalTax;
    
    @JsonProperty("total_cost")
    @SerializedName("total_cost")
    @Expose
    private double totalCost;

    @JsonProperty("subtotal")
    public double getSubtotal() {
        return subtotal;
    }

    @JsonProperty("subtotal")
    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    @JsonProperty("shipping_cost")
    public double getShippingCost() {
        return shippingCost;
    }

    @JsonProperty("shipping_cost")
    public void setShippingCost(double shippingCost) {
        this.shippingCost = shippingCost;
    }

    @JsonProperty("total_tax")
    public double getTotalTax() {
        return totalTax;
    }

    @JsonProperty("total_tax")
    public void setTotalTax(double totalTax) {
        this.totalTax = totalTax;
    }

    @JsonProperty("total_cost")
    public double getTotalCost() {
        return totalCost;
    }

    @JsonProperty("total_cost")
    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(subtotal)
                .append(shippingCost)
                .append(totalTax)
                .append(totalCost)
                .toHashCode();
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
        return new EqualsBuilder()
                .append(subtotal, rhs.subtotal)
                .append(shippingCost, rhs.shippingCost)
                .append(totalTax, rhs.totalTax)
                .append(totalCost, rhs.totalCost)
                .isEquals();
    }

}
