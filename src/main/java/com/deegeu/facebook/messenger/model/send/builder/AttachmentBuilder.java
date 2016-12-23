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

import com.deegeu.facebook.messenger.model.send.Attachment;
import com.deegeu.facebook.messenger.model.send.Payload;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 *
 * @author dspiess
 */
final public class AttachmentBuilder {

    public enum AttachmentType {
        TEMPLATE("template"), AUDIO("audio"), FILE("file"),
        IMAGE("image"), VIDEO("video");
        
        final private String typeString;
        
        AttachmentType(String typeString) {
            this.typeString = typeString;
        }
        
        public String type() {
            return this.typeString;
        }
    }
    
    private AttachmentType type;
    private Payload payload;
    
    public AttachmentBuilder() { }

    public AttachmentBuilder type(AttachmentType type) {
        this.type = type;
        return this;
    }

    public AttachmentBuilder payload(Payload payload) {
        this.payload = payload;
        return this;
    }
    
    public Attachment build() {
        validateAttachment();
        
        Attachment attachment = new Attachment();
        
        attachment.setPayload(payload);
        attachment.setType(type.typeString);
        
        return attachment;
    }

    private void validateAttachment() throws IllegalArgumentException {
        if (this.payload == null) {
            throw new IllegalArgumentException(
                    "AttachmentBuilder 'payload' cannot be null.");
        }
        if (this.type == null) {
            throw new IllegalArgumentException(
                    "AttachmentBuilder 'type' cannot be null.");
        }
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
    
}
