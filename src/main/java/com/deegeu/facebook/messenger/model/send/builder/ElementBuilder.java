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
import com.deegeu.facebook.messenger.model.send.DefaultAction;
import com.deegeu.facebook.messenger.model.send.Element;
import java.net.URL;
import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 *
 * @author dspiess
 */
final public class ElementBuilder {
    private String title;

    private URL itemUrl;

    private URL imageUrl;

    private String subtitle;

    private Double price;

    private List<Button> buttons = null;

    private DefaultAction defaultAction;
    
    private Long quantity;

    private String currency;
    
    public ElementBuilder() { }

    public ElementBuilder title(String title) {
        this.title = title;
        return this;
    }

    public ElementBuilder itemUrl(URL itemUrl) {
        this.itemUrl = itemUrl;
        return this;
    }

    public ElementBuilder imageUrl(URL imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public ElementBuilder subtitle(String subtitle) {
        this.subtitle = subtitle;
        return this;
    }

    public ElementBuilder defaultAction(DefaultAction defaultAction) {
        this.defaultAction = defaultAction;
        return this;
    }

    public ElementBuilder buttons(List<Button> buttons) {
        this.buttons = buttons;
        return this;
    }

    public ElementBuilder quantity(long quantity) {
        this.quantity = quantity;
        return this;
    }

    public ElementBuilder price(Double price) {
        this.price = price;
        return this;
    }

    public ElementBuilder currency(String currency) {
        this.currency = currency;
        return this;
    }
    
    public Element build() {
        if (this.price == null) {
            this.price = 0.0d;
        }
        
        Element element = new Element();
        
        element.setButtons(buttons);
        if (imageUrl != null) {
            element.setImageUrl(imageUrl.toString());
        }
        if (itemUrl != null) {
            element.setItemUrl(itemUrl.toString());
        }
        element.setSubtitle(subtitle);
        element.setTitle(title);
        
        element.setDefaultAction(defaultAction);
        element.setQuantity(quantity);
        element.setCurrency(currency);
        
        return element;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
