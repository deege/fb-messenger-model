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

import com.deegeu.facebook.messenger.model.send.QuickReply;
import java.net.URL;

/**
 *
 * @author dspiess
 */
final public class QuickReplyBuilder {
    final static public long MAX_TITLE_LENGTH = 20;
    final static public long MAX_PAYLOAD_LENGTH = 1000;
    
    public enum ContentType {
        TEXT("text"), LOCATION("location");
        
        final private String contentType;
        
        ContentType(String contentType) {
            this.contentType = contentType;
        }
        
        public String type() {
            return this.contentType;
        }
    }
    
    private ContentType contentType;

    private String title;

    private String payload;

    private URL imageUrl;

    public QuickReplyBuilder contentType(ContentType contentType) {
        this.contentType = contentType;
        return this;
    }

    public QuickReplyBuilder title(String title) {
        this.title = title;
        return this;
    }

    public QuickReplyBuilder payload(String payload) {
        this.payload = payload;
        return this;
    }

    public QuickReplyBuilder imageUrl(URL imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    
    public QuickReply build() {
        switch (this.contentType) {
            case TEXT: {
                if (this.title.length() > MAX_TITLE_LENGTH) {
                    throw new IllegalArgumentException(
                            "QuickReplyBuilder 'title' cannot be longer than " 
                                    + MAX_TITLE_LENGTH + " characters.");
                }
                if (this.payload.length() > MAX_PAYLOAD_LENGTH) {
                    throw new IllegalArgumentException(
                            "QuickReplyBuilder 'payload' cannot be longer than " 
                                    + MAX_PAYLOAD_LENGTH + " characters.");
                }
                break;
            }
            case LOCATION: {
                // these are unused for location quick replies
                this.title = null;
                this.payload = null;
                break;
            }
            default: {
                throw new IllegalArgumentException(
                        "QuickReplyBuilder: Unknown content type (" 
                         + this.contentType + ")");
            }
        }
        
        QuickReply reply = new QuickReply();
        
        reply.setContentType(this.contentType.type());
        reply.setImageUrl(this.imageUrl.toString());
        reply.setPayload(this.payload);
        reply.setTitle(this.title);
        
        return reply;
    }
}
