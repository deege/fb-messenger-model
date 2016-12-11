
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
        return new HashCodeBuilder().append(path).append(querystring).append(header).toHashCode();
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
        return new EqualsBuilder().append(path, rhs.path).append(querystring, rhs.querystring).append(header, rhs.header).isEquals();
    }

}
