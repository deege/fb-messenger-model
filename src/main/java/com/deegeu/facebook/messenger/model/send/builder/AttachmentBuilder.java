/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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

    private String type;
    private Payload payload;
    
    public AttachmentBuilder() { }

    public AttachmentBuilder type(String type) {
        this.type = type;
        return this;
    }

    public AttachmentBuilder payload(Payload payload) {
        this.payload = payload;
        return this;
    }
    
    public Attachment build() {
        Attachment attachment = new Attachment();
        
        if (this.payload == null) {
            throw new IllegalArgumentException(
                    "AttachmentBuilder 'payload' cannot be null.");
        }
        if (this.type == null) {
            throw new IllegalArgumentException(
                    "AttachmentBuilder 'type' cannot be null.");
        }
        
        attachment.setPayload(payload);
        attachment.setType(type);
        
        return attachment;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
    
}
