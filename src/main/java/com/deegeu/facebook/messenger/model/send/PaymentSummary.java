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
import java.util.List;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
final public class PaymentSummary {

    @JsonProperty("currency")
    @SerializedName("currency")
    @Expose
    private String currency;
    
    @JsonProperty("payment_type")
    @SerializedName("payment_type")
    @Expose
    private String paymentType;
    
    @JsonProperty("is_test_payment")
    @SerializedName("is_test_payment")
    @Expose
    private Boolean isTestPayment;
    
    @JsonProperty("merchant_name")
    @SerializedName("merchant_name")
    @Expose
    private String merchantName;
    
    @JsonProperty("requested_user_info")
    @SerializedName("requested_user_info")
    @Expose
    private List<String> requestedUserInfo = null;
    
    @JsonProperty("price_list")
    @SerializedName("price_list")
    @Expose
    private List<PriceList> priceList = null;

    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @JsonProperty("payment_type")
    public String getPaymentType() {
        return paymentType;
    }

    @JsonProperty("payment_type")
    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    @JsonProperty("is_test_payment")
    public Boolean getIsTestPayment() {
        return isTestPayment;
    }

    @JsonProperty("is_test_payment")
    public void setIsTestPayment(Boolean isTestPayment) {
        this.isTestPayment = isTestPayment;
    }

    @JsonProperty("merchant_name")
    public String getMerchantName() {
        return merchantName;
    }

    @JsonProperty("merchant_name")
    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    @JsonProperty("requested_user_info")
    public List<String> getRequestedUserInfo() {
        return requestedUserInfo;
    }

    @JsonProperty("requested_user_info")
    public void setRequestedUserInfo(List<String> requestedUserInfo) {
        this.requestedUserInfo = requestedUserInfo;
    }

    @JsonProperty("price_list")
    public List<PriceList> getPriceList() {
        return priceList;
    }

    @JsonProperty("price_list")
    public void setPriceList(List<PriceList> priceList) {
        this.priceList = priceList;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(currency)
                .append(paymentType)
                .append(isTestPayment)
                .append(merchantName)
                .append(requestedUserInfo)
                .append(priceList)
                .toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PaymentSummary) == false) {
            return false;
        }
        PaymentSummary rhs = ((PaymentSummary) other);
        return new EqualsBuilder()
                .append(currency, rhs.currency)
                .append(paymentType, rhs.paymentType)
                .append(isTestPayment, rhs.isTestPayment)
                .append(merchantName, rhs.merchantName)
                .append(requestedUserInfo, rhs.requestedUserInfo)
                .append(priceList, rhs.priceList)
                .isEquals();
    }

}
