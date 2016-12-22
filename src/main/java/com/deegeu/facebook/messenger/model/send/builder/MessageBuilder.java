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
import com.deegeu.facebook.messenger.model.send.Message;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 *
 * @author dspiess
 */
final public class MessageBuilder {

    private Attachment attachment;

    private String text;

    private String quickReply;

    private Boolean isEcho;

    private String metadata;

    public void attachment(Attachment attachment) {
        this.attachment = attachment;
    }

    public void text(String text) {
        if (attachment != null) {
            throw new IllegalArgumentException("Message text and attachment cannot both be set.");
        }
        
        if (text.length() > 640) {
            throw new IllegalArgumentException("Metadata cannot be longer than 640 characters.");
        }
        this.text = text;
    }

    public void quickReply(String quickReply) {
        this.quickReply = quickReply;
    }

    public void isEcho(Boolean isEcho) {
        this.isEcho = isEcho;
    }

    public void metadata(String metadata) {
        if (metadata.length() > 1000) {
            throw new IllegalArgumentException("Metadata cannot be longer than 1000 characters.");
        }
               
        this.metadata = metadata;
    }
    
    public Message build() {
        if ((attachment != null) && (text != null)) {
            throw new IllegalArgumentException("Message text and attachment cannot both be set.");
        }
        
        if ((attachment == null) && (text == null)) {
            throw new IllegalArgumentException("Either message text or attachment must be set.");
        }
        
        Message message = new Message();
        
        message.setAttachment(attachment);
        message.setIsEcho(isEcho);
        message.setMetadata(metadata);
        message.setQuickReply(quickReply);
        message.setText(text);
        
        return message;
    }
    
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
   
}
