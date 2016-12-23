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
package com.deegeu.facebook.messenger.model.send.builder;

import com.deegeu.facebook.messenger.model.send.PaymentSummary;
import com.deegeu.facebook.messenger.model.send.PriceList;
import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 *
 * @author dspiess
 */
final public class PaymentSummaryBuilder {
    private String currency;

    private String paymentType;

    private Boolean isTestPayment;

    private String merchantName;

    private List<String> requestedUserInfo = null;

    private List<PriceList> priceList = null; 
    
    public PaymentSummaryBuilder() { }

    public PaymentSummaryBuilder currency(String currency) {
        this.currency = currency;
        return this;
    }

    public PaymentSummaryBuilder paymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }

    public PaymentSummaryBuilder isTestPayment(Boolean isTestPayment) {
        this.isTestPayment = isTestPayment;
        return this;
    }

    public PaymentSummaryBuilder merchantName(String merchantName) {
        this.merchantName = merchantName;
        return this;
    }

    public PaymentSummaryBuilder requestedUserInfo(List<String> requestedUserInfo) {
        this.requestedUserInfo = requestedUserInfo;
        return this;
    }

    public PaymentSummaryBuilder priceList(List<PriceList> priceList) {
        this.priceList = priceList;
        return this;
    }
    
    public PaymentSummary build() {
        PaymentSummary summary = new PaymentSummary(); 
        
        summary.setCurrency(currency);
        summary.setIsTestPayment(isTestPayment);
        summary.setMerchantName(merchantName);
        summary.setPaymentType(paymentType);
        summary.setPriceList(priceList);
        summary.setRequestedUserInfo(requestedUserInfo);
        
        return summary;
    }
    
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
