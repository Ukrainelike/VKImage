
package com.ukrainelike.vkimage;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Item {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("album_id")
    @Expose
    private Integer albumId;
    @SerializedName("owner_id")
    @Expose
    private Integer ownerId;
    @SerializedName("sizes")
    @Expose
    private List<Size> sizes = new ArrayList<Size>();
    @SerializedName("text")
    @Expose
    private String text;
    @SerializedName("date")
    @Expose
    private Integer date;
    @SerializedName("post_id")
    @Expose
    private Integer postId;

    /**
     * 
     * @return
     *     The id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The albumId
     */
    public Integer getAlbumId() {
        return albumId;
    }

    /**
     * 
     * @param albumId
     *     The album_id
     */
    public void setAlbumId(Integer albumId) {
        this.albumId = albumId;
    }

    /**
     * 
     * @return
     *     The ownerId
     */
    public Integer getOwnerId() {
        return ownerId;
    }

    /**
     * 
     * @param ownerId
     *     The owner_id
     */
    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * 
     * @return
     *     The sizes
     */
    public List<Size> getSizes() {
        return sizes;
    }

    /**
     * 
     * @param sizes
     *     The sizes
     */
    public void setSizes(List<Size> sizes) {
        this.sizes = sizes;
    }

    /**
     * 
     * @return
     *     The text
     */
    public String getText() {
        return text;
    }

    /**
     * 
     * @param text
     *     The text
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * 
     * @return
     *     The date
     */
    public Integer getDate() {
        return date;
    }

    /**
     * 
     * @param date
     *     The date
     */
    public void setDate(Integer date) {
        this.date = date;
    }

    /**
     * 
     * @return
     *     The postId
     */
    public Integer getPostId() {
        return postId;
    }

    /**
     * 
     * @param postId
     *     The post_id
     */
    public void setPostId(Integer postId) {
        this.postId = postId;
    }

}
