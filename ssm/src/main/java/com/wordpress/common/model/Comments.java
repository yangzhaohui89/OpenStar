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
@TableName("wp_comments")
public class Comments implements Serializable {

	@TableField(exist = false)
	private static final long serialVersionUID = 1L;

	/**  */
	@TableId(value = "comment_ID")
	private Long commentId;

	/**  */
	@TableField(value = "comment_post_ID")
	private Long commentPostId;

	/**  */
	@TableField(value = "comment_author")
	private String commentAuthor;

	/**  */
	@TableField(value = "comment_author_email")
	private String commentAuthorEmail;

	/**  */
	@TableField(value = "comment_author_url")
	private String commentAuthorUrl;

	/**  */
	@TableField(value = "comment_author_IP")
	private String commentAuthorIp;

	/**  */
	@TableField(value = "comment_date")
	private Date commentDate;

	/**  */
	@TableField(value = "comment_date_gmt")
	private Date commentDateGmt;

	/**  */
	@TableField(value = "comment_content")
	private String commentContent;

	/**  */
	@TableField(value = "comment_karma")
	private Integer commentKarma;

	/**  */
	@TableField(value = "comment_approved")
	private String commentApproved;

	/**  */
	@TableField(value = "comment_agent")
	private String commentAgent;

	/**  */
	@TableField(value = "comment_type")
	private String commentType;

	/**  */
	@TableField(value = "comment_parent")
	private Long commentParent;

	/**  */
	@TableField(value = "user_id")
	private Long userId;


	public Long getCommentId() {
		return this.commentId;
	}

	public void setCommentId(Long commentId) {
		this.commentId = commentId;
	}

	public Long getCommentPostId() {
		return this.commentPostId;
	}

	public void setCommentPostId(Long commentPostId) {
		this.commentPostId = commentPostId;
	}

	public String getCommentAuthor() {
		return this.commentAuthor;
	}

	public void setCommentAuthor(String commentAuthor) {
		this.commentAuthor = commentAuthor;
	}

	public String getCommentAuthorEmail() {
		return this.commentAuthorEmail;
	}

	public void setCommentAuthorEmail(String commentAuthorEmail) {
		this.commentAuthorEmail = commentAuthorEmail;
	}

	public String getCommentAuthorUrl() {
		return this.commentAuthorUrl;
	}

	public void setCommentAuthorUrl(String commentAuthorUrl) {
		this.commentAuthorUrl = commentAuthorUrl;
	}

	public String getCommentAuthorIp() {
		return this.commentAuthorIp;
	}

	public void setCommentAuthorIp(String commentAuthorIp) {
		this.commentAuthorIp = commentAuthorIp;
	}

	public Date getCommentDate() {
		return this.commentDate;
	}

	public void setCommentDate(Date commentDate) {
		this.commentDate = commentDate;
	}

	public Date getCommentDateGmt() {
		return this.commentDateGmt;
	}

	public void setCommentDateGmt(Date commentDateGmt) {
		this.commentDateGmt = commentDateGmt;
	}

	public String getCommentContent() {
		return this.commentContent;
	}

	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}

	public Integer getCommentKarma() {
		return this.commentKarma;
	}

	public void setCommentKarma(Integer commentKarma) {
		this.commentKarma = commentKarma;
	}

	public String getCommentApproved() {
		return this.commentApproved;
	}

	public void setCommentApproved(String commentApproved) {
		this.commentApproved = commentApproved;
	}

	public String getCommentAgent() {
		return this.commentAgent;
	}

	public void setCommentAgent(String commentAgent) {
		this.commentAgent = commentAgent;
	}

	public String getCommentType() {
		return this.commentType;
	}

	public void setCommentType(String commentType) {
		this.commentType = commentType;
	}

	public Long getCommentParent() {
		return this.commentParent;
	}

	public void setCommentParent(Long commentParent) {
		this.commentParent = commentParent;
	}

	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

}
