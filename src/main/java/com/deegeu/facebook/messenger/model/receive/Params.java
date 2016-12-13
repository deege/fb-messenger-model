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
package com.deegeu.facebook.messenger.model.receive;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.Map;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Params {

    @SerializedName("path")
    @Expose
    private Map<String, Object> path;
    @SerializedName("querystring")
    @Expose
    private Map<String, Object> querystring;
    @SerializedName("header")
    @Expose
    private Map<String, Object> header;

    /**
     * 
     * @return
     *     The path
     */
    public Map<String, Object> getPath() {
        return path;
    }

    /**
     * 
     * @param path
     *     The path
     */
    public void setPath(Map<String, Object> path) {
        this.path = path;
    }

    /**
     * 
     * @return
     *     The querystring
     */
    public Map<String, Object> getQuerystring() {
        return querystring;
    }

    /**
     * 
     * @param querystring
     *     The querystring
     */
    public void setQuerystring(Map<String, Object> querystring) {
        this.querystring = querystring;
    }

    /**
     * 
     * @return
     *     The header
     */
    public Map<String, Object> getHeader() {
        return header;
    }

    /**
     * 
     * @param header
     *     The header
     */
    public void setHeader(Map<String, Object> header) {
        this.header = header;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(path)
                .append(querystring)
                .append(header)
                .toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Params) == false) {
            return false;
        }
        Params rhs = ((Params) other);
        return new EqualsBuilder()
                .append(path, rhs.path)
                .append(querystring, rhs.querystring)
                .append(header, rhs.header)
                .isEquals();
    }

}
