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

import com.deegeu.facebook.messenger.model.send.Button;
import com.deegeu.facebook.messenger.model.send.PaymentSummary;
import java.net.URL;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 *
 * @author dspiess
 */
final public class ButtonBuilder {
    private static final int MAX_TITLE_LENGTH = 20;
    private static final int MAX_PAYLOAD_LENGTH = 1000;
    private static final String BUY_BUTTON_TITLE = "buy";
    
    public enum ButtonType {
        WEB_URL("web_url"), POSTBACK("postback"), PHONE_NUMBER("phone_number"),
        ELEMENT_SHARE("element_share"), PAYMENT("payment"),
        ACCOUNT_LINK("account_link"), ACCOUNT_UNLINK("account_unlink");
        
        final private String typeString;
        
        ButtonType(String typeString) {
            this.typeString = typeString;
        }
        
        public String type() {
            return this.typeString;
        }
    }
    
    public enum WebviewHeight {
        COMPACT("compact"), TALL("tall"), FULL("full");
        
        final private String webviewHeightString;
        
        WebviewHeight(String webviewHeightString) {
            this.webviewHeightString = webviewHeightString;
        }
        
        public String webviewHeight() {
            return this.webviewHeightString;
        }
    }
    
    private ButtonType type;

    private URL url;

    private String title;

    private String payload;
    
    private PaymentSummary paymentSummary;

    private boolean messengerExtensions;

    private WebviewHeight webviewHeightRatio;

    private URL fallbackUrl;

    public ButtonBuilder() { 
        // default 
        this.webviewHeightRatio = WebviewHeight.FULL;
    }
    
    public ButtonBuilder type(ButtonType type) {
        this.type = type;
        return this;
    }

    public ButtonBuilder url(URL url) {
        this.url = url;
        return this;
    }

    public ButtonBuilder title(String title) {
        this.title = title;
        return this;
    }

    public ButtonBuilder payload(String payload) {
        this.payload = payload;
        return this;
    }
    
    public ButtonBuilder paymentSummary(PaymentSummary paymentSummary) {
        this.paymentSummary = paymentSummary;
        return this;
    }

    public ButtonBuilder messengerExtensions(boolean messengerExtensions) {
        this.messengerExtensions = messengerExtensions;
        return this;
    }

    public ButtonBuilder webviewHeightRatio(WebviewHeight webviewHeightRatio) {
        this.webviewHeightRatio = webviewHeightRatio;
        return this;
    }

    public ButtonBuilder fallbackUrl(URL fallbackUrl) {
        this.fallbackUrl = fallbackUrl;
        return this;
    }

    public Button build() {
        if (this.type == null) {
            throw new IllegalArgumentException(
                    "ButtonBuilder 'type' cannot be null.");
        }
        
        if (this.type == ButtonType.WEB_URL) {
            validateWebUrlButton(); 
        }
        if (this.type == ButtonType.POSTBACK) {
            validatePostbackButton();
        }
        if (this.type == ButtonType.PHONE_NUMBER) {
            validatePhoneNumberButton();
        }
        if (this.type == ButtonType.PAYMENT) {
            validatePaymentButton();
        }
        
        Button button = new Button();    
        if (this.fallbackUrl != null) {
            button.setFallbackUrl(this.fallbackUrl.toString());
        }
        button.setMessengerExtensions(this.messengerExtensions);
        button.setPayload(this.payload);
        button.setTitle(this.title);
        button.setType(this.type.type());

        if (this.webviewHeightRatio != null) {
            button.setWebviewHeightRatio(this.webviewHeightRatio.webviewHeight());
        }
        if (this.url != null) {
            button.setUrl(this.url.toString());
        }
        
        return button;
    }

    private void validatePaymentButton() throws IllegalArgumentException {
        // Must equal 'buy' for payment buttons
        if (!BUY_BUTTON_TITLE.equalsIgnoreCase(this.title)) {
            this.title = BUY_BUTTON_TITLE;
        }
        if (this.payload == null) {
            throw new IllegalArgumentException(
                    "ButtonBuilder 'payload' cannot be null.");
        }
        if (this.paymentSummary == null) {
            throw new IllegalArgumentException(
                    "ButtonBuilder 'payment_summary' cannot be null.");
        }
    }

    private void validatePostbackButton() throws IllegalArgumentException {
        if (this.title == null) {
            throw new IllegalArgumentException(
                    "ButtonBuilder 'title' cannot be null.");
        }
        if (this.title.length() > MAX_TITLE_LENGTH) {
            throw new IllegalArgumentException(
                    "ButtonBuilder 'title' cannot be longer than " 
                            + MAX_TITLE_LENGTH + " characters.");
        }
        if (this.payload == null) {
            throw new IllegalArgumentException(
                    "ButtonBuilder 'payload' cannot be null.");
        }
        if (this.payload.length() > MAX_PAYLOAD_LENGTH) {
            throw new IllegalArgumentException(
                    "ButtonBuilder 'payload' cannot be longer than " 
                            + MAX_PAYLOAD_LENGTH + " characters.");
        }
    }   

    private void validateWebUrlButton() throws IllegalArgumentException {
        if (this.title == null) {
            throw new IllegalArgumentException(
                    "ButtonBuilder 'title' cannot be null.");
        }
        if (this.title.length() > MAX_TITLE_LENGTH) {
            throw new IllegalArgumentException(
                    "ButtonBuilder 'title' cannot be longer than " 
                            + MAX_TITLE_LENGTH + " characters.");
        }
        if (this.url == null) {
            throw new IllegalArgumentException(
                    "ButtonBuilder 'url' cannot be null.");
        }
        if (this.payload == null) {
            throw new IllegalArgumentException(
                    "ButtonBuilder 'payload' cannot be null.");
        }
        if (this.payload.length() > MAX_PAYLOAD_LENGTH) {
            throw new IllegalArgumentException(
                    "ButtonBuilder 'payload' cannot be longer than " 
                            + MAX_PAYLOAD_LENGTH + " characters.");
        }
    }
    
    private void validatePhoneNumberButton() throws IllegalArgumentException {
        if (this.title == null) {
            throw new IllegalArgumentException(
                    "ButtonBuilder 'title' cannot be null.");
        }
        if (this.title.length() > MAX_TITLE_LENGTH) {
            throw new IllegalArgumentException(
                    "ButtonBuilder 'title' cannot be longer than " 
                            + MAX_TITLE_LENGTH + " characters.");
        }
        if (this.payload == null) {
            throw new IllegalArgumentException(
                    "ButtonBuilder 'payload' cannot be null.");
        }
        if (this.payload.length() > MAX_PAYLOAD_LENGTH) {
            throw new IllegalArgumentException(
                    "ButtonBuilder 'payload' cannot be longer than " 
                            + MAX_PAYLOAD_LENGTH + " characters.");
        }
        if (!this.payload.startsWith("+")) {
            throw new IllegalArgumentException(
                    "ButtonBuilder 'payload' must start with '+' for phone numbers.");
        }
    }
    
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
