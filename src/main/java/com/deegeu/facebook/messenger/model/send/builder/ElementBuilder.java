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
import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 *
 * @author dspiess
 */
final public class ElementBuilder {
    private String title;

    private String itemUrl;

    private String imageUrl;

    private String subtitle;

    private DefaultAction defaultAction;

    private List<Button> buttons = null;

    private long quantity;

    private long price;

    private String currency;
    
    public ElementBuilder() { }

    public ElementBuilder title(String title) {
        this.title = title;
        return this;
    }

    public ElementBuilder itemUrl(String itemUrl) {
        this.itemUrl = itemUrl;
        return this;
    }

    public ElementBuilder imageUrl(String imageUrl) {
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

    public ElementBuilder price(long price) {
        this.price = price;
        return this;
    }

    public ElementBuilder currency(String currency) {
        this.currency = currency;
        return this;
    }
    
    public Element build() {
        Element element = new Element();
        
        element.setButtons(buttons);
        element.setImageUrl(imageUrl);
        element.setItemUrl(itemUrl);
        element.setSubtitle(subtitle);
        element.setTitle(title);
        
        return element;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
