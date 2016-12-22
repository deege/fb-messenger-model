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

import com.deegeu.facebook.messenger.model.send.Adjustment;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 *
 * @author dspiess
 */
final public class AdjustmentBuilder {
    private String name;
    private long amount;
    
    public AdjustmentBuilder() { }
    
    public AdjustmentBuilder name(String name) {
        this.name = name;
        return this;
    }

    public AdjustmentBuilder amount(long amount) {
        this.amount = amount;
        return this;
    }

    public Adjustment build() {
        Adjustment adjustment = new Adjustment();
        
        adjustment.setAmount(amount);
        adjustment.setName(name);
        
        return adjustment;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
