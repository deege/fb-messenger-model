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
import com.deegeu.facebook.messenger.model.send.QuickReply;
import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 *
 * @author dspiess
 */
final public class MessageBuilder {
    private static final int MAX_META_LENGTH = 1000;
    
    private static final int MAX_TEXT_LENGTH = 640;
    
    private Attachment attachment;

    private String text;

    private List<QuickReply> quickReplies = null;

    private Boolean isEcho;

    private String metadata;

    public MessageBuilder attachment(Attachment attachment) {
        this.attachment = attachment;
        return this;
    }

    public MessageBuilder text(String text) {        
        this.text = text;
        return this;
    }

    public MessageBuilder quickReplies(List<QuickReply> quickReplies) {
        this.quickReplies = quickReplies;
        return this;
    }

    public MessageBuilder isEcho(Boolean isEcho) {
        this.isEcho = isEcho;
        return this;
    }

    public MessageBuilder metadata(String metadata) {         
        this.metadata = metadata;
        return this;
    }
    
    public Message build() {
        validateMessage();
        
        Message message = new Message();
        
        message.setAttachment(this.attachment);
        message.setIsEcho(this.isEcho);
        message.setMetadata(this.metadata);
        message.setQuickReply(this.quickReplies);
        message.setText(this.text);
        
        return message;
    }

    private void validateMessage() throws IllegalArgumentException {
        if ((this.attachment != null) && (this.text != null)) {
            throw new IllegalArgumentException("MessageBuilder 'text' and 'attachment' cannot both be set.");
        }
        
        if ((this.attachment == null) && (this.text == null)) {
            throw new IllegalArgumentException("MessageBuilder either 'text' or 'attachment' must be set.");
        }
        
        if ((this.text != null) && (this.text.length() > MAX_TEXT_LENGTH)) {
            throw new IllegalArgumentException("MessageBuilder 'text' cannot be longer than " 
                    + MAX_TEXT_LENGTH + " characters.");
        }
        
        if ((this.metadata != null) && (this.metadata.length() > MAX_META_LENGTH)) {
            throw new IllegalArgumentException("MessageBuilder 'metadata' cannot be longer than " 
                    + MAX_META_LENGTH + " characters.");
        }
    }
    
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
   
}
