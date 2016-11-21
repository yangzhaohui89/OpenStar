package com.wordpress.common.model;

import java.io.Serializable;
import java.util.Date;


import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 *
 * 
 *
 */
@TableName("wp_posts")
public class Posts implements Serializable {

	@TableField(exist = false)
	private static final long serialVersionUID = 1L;

	/**  */
	@TableId
	private Long id;

	/**  */
	@TableField(value = "post_author")
	private Long postAuthor;

	/**  */
	@TableField(value = "post_date")
	private Date postDate;

	/**  */
	@TableField(value = "post_date_gmt")
	private Date postDateGmt;

	/**  */
	@TableField(value = "post_content")
	private String postContent;

	/**  */
	@TableField(value = "post_title")
	private String postTitle;

	/**  */
	@TableField(value = "post_excerpt")
	private String postExcerpt;

	/**  */
	@TableField(value = "post_status")
	private String postStatus;

	/**  */
	@TableField(value = "comment_status")
	private String commentStatus;

	/**  */
	@TableField(value = "ping_status")
	private String pingStatus;

	/**  */
	@TableField(value = "post_password")
	private String postPassword;

	/**  */
	@TableField(value = "post_name")
	private String postName;

	/**  */
	@TableField(value = "to_ping")
	private String toPing;

	/**  */
	private String pinged;

	/**  */
	@TableField(value = "post_modified")
	private Date postModified;

	/**  */
	@TableField(value = "post_modified_gmt")
	private Date postModifiedGmt;

	/**  */
	@TableField(value = "post_content_filtered")
	private String postContentFiltered;

	/**  */
	@TableField(value = "post_parent")
	private Long postParent;

	/**  */
	private String guid;

	/**  */
	@TableField(value = "menu_order")
	private Integer menuOrder;

	/**  */
	@TableField(value = "post_type")
	private String postType;

	/**  */
	@TableField(value = "post_mime_type")
	private String postMimeType;

	/**  */
	@TableField(value = "comment_count")
	private Long commentCount;


	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getPostAuthor() {
		return this.postAuthor;
	}

	public void setPostAuthor(Long postAuthor) {
		this.postAuthor = postAuthor;
	}

	public Date getPostDate() {
		return this.postDate;
	}

	public void setPostDate(Date postDate) {
		this.postDate = postDate;
	}

	public Date getPostDateGmt() {
		return this.postDateGmt;
	}

	public void setPostDateGmt(Date postDateGmt) {
		this.postDateGmt = postDateGmt;
	}

	public String getPostContent() {
		return this.postContent;
	}

	public void setPostContent(String postContent) {
		this.postContent = postContent;
	}

	public String getPostTitle() {
		return this.postTitle;
	}

	public void setPostTitle(String postTitle) {
		this.postTitle = postTitle;
	}

	public String getPostExcerpt() {
		return this.postExcerpt;
	}

	public void setPostExcerpt(String postExcerpt) {
		this.postExcerpt = postExcerpt;
	}

	public String getPostStatus() {
		return this.postStatus;
	}

	public void setPostStatus(String postStatus) {
		this.postStatus = postStatus;
	}

	public String getCommentStatus() {
		return this.commentStatus;
	}

	public void setCommentStatus(String commentStatus) {
		this.commentStatus = commentStatus;
	}

	public String getPingStatus() {
		return this.pingStatus;
	}

	public void setPingStatus(String pingStatus) {
		this.pingStatus = pingStatus;
	}

	public String getPostPassword() {
		return this.postPassword;
	}

	public void setPostPassword(String postPassword) {
		this.postPassword = postPassword;
	}

	public String getPostName() {
		return this.postName;
	}

	public void setPostName(String postName) {
		this.postName = postName;
	}

	public String getToPing() {
		return this.toPing;
	}

	public void setToPing(String toPing) {
		this.toPing = toPing;
	}

	public String getPinged() {
		return this.pinged;
	}

	public void setPinged(String pinged) {
		this.pinged = pinged;
	}

	public Date getPostModified() {
		return this.postModified;
	}

	public void setPostModified(Date postModified) {
		this.postModified = postModified;
	}

	public Date getPostModifiedGmt() {
		return this.postModifiedGmt;
	}

	public void setPostModifiedGmt(Date postModifiedGmt) {
		this.postModifiedGmt = postModifiedGmt;
	}

	public String getPostContentFiltered() {
		return this.postContentFiltered;
	}

	public void setPostContentFiltered(String postContentFiltered) {
		this.postContentFiltered = postContentFiltered;
	}

	public Long getPostParent() {
		return this.postParent;
	}

	public void setPostParent(Long postParent) {
		this.postParent = postParent;
	}

	public String getGuid() {
		return this.guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public Integer getMenuOrder() {
		return this.menuOrder;
	}

	public void setMenuOrder(Integer menuOrder) {
		this.menuOrder = menuOrder;
	}

	public String getPostType() {
		return this.postType;
	}

	public void setPostType(String postType) {
		this.postType = postType;
	}

	public String getPostMimeType() {
		return this.postMimeType;
	}

	public void setPostMimeType(String postMimeType) {
		this.postMimeType = postMimeType;
	}

	public Long getCommentCount() {
		return this.commentCount;
	}

	public void setCommentCount(Long commentCount) {
		this.commentCount = commentCount;
	}

}
