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

import com.deegeu.facebook.messenger.model.send.DefaultAction;
import java.net.URL;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 *
 * @author dspiess
 */
final public class DefaultActionBuilder {

    private String type;

    private URL url;

    private boolean messengerExtensions;

    private String webviewHeightRatio;

    private URL fallbackUrl;

    public DefaultActionBuilder() { }
    
    public DefaultActionBuilder type(String type) {
        this.type = type;
        return this;
    }

    public DefaultActionBuilder url(URL url) {
        this.url = url;
        return this;
    }

    public DefaultActionBuilder messengerExtensions(boolean messengerExtensions) {
        this.messengerExtensions = messengerExtensions;
        return this;
    }

    public DefaultActionBuilder webviewHeightRatio(String webviewHeightRatio) {
        this.webviewHeightRatio = webviewHeightRatio;
        return this;
    }

    public DefaultActionBuilder fallbackUrl(URL fallbackUrl) {
        this.fallbackUrl = fallbackUrl;
        return this;
    }

    public DefaultAction build() {
        DefaultAction action = new DefaultAction();
        
        if (this.fallbackUrl != null) {
            action.setFallbackUrl(fallbackUrl.toString());
        }
        action.setMessengerExtensions(messengerExtensions);
        action.setType(type);
        if (this.url != null) {
            action.setUrl(url.toString());
        }
        action.setWebviewHeightRatio(webviewHeightRatio);
        
        return action;
    }
      
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
