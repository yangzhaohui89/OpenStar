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
@TableName("wp_links")
public class Links implements Serializable {

	@TableField(exist = false)
	private static final long serialVersionUID = 1L;

	/**  */
	@TableId(value = "link_id")
	private Long linkId;

	/**  */
	@TableField(value = "link_url")
	private String linkUrl;

	/**  */
	@TableField(value = "link_name")
	private String linkName;

	/**  */
	@TableField(value = "link_image")
	private String linkImage;

	/**  */
	@TableField(value = "link_target")
	private String linkTarget;

	/**  */
	@TableField(value = "link_description")
	private String linkDescription;

	/**  */
	@TableField(value = "link_visible")
	private String linkVisible;

	/**  */
	@TableField(value = "link_owner")
	private Long linkOwner;

	/**  */
	@TableField(value = "link_rating")
	private Integer linkRating;

	/**  */
	@TableField(value = "link_updated")
	private Date linkUpdated;

	/**  */
	@TableField(value = "link_rel")
	private String linkRel;

	/**  */
	@TableField(value = "link_notes")
	private String linkNotes;

	/**  */
	@TableField(value = "link_rss")
	private String linkRss;


	public Long getLinkId() {
		return this.linkId;
	}

	public void setLinkId(Long linkId) {
		this.linkId = linkId;
	}

	public String getLinkUrl() {
		return this.linkUrl;
	}

	public void setLinkUrl(String linkUrl) {
		this.linkUrl = linkUrl;
	}

	public String getLinkName() {
		return this.linkName;
	}

	public void setLinkName(String linkName) {
		this.linkName = linkName;
	}

	public String getLinkImage() {
		return this.linkImage;
	}

	public void setLinkImage(String linkImage) {
		this.linkImage = linkImage;
	}

	public String getLinkTarget() {
		return this.linkTarget;
	}

	public void setLinkTarget(String linkTarget) {
		this.linkTarget = linkTarget;
	}

	public String getLinkDescription() {
		return this.linkDescription;
	}

	public void setLinkDescription(String linkDescription) {
		this.linkDescription = linkDescription;
	}

	public String getLinkVisible() {
		return this.linkVisible;
	}

	public void setLinkVisible(String linkVisible) {
		this.linkVisible = linkVisible;
	}

	public Long getLinkOwner() {
		return this.linkOwner;
	}

	public void setLinkOwner(Long linkOwner) {
		this.linkOwner = linkOwner;
	}

	public Integer getLinkRating() {
		return this.linkRating;
	}

	public void setLinkRating(Integer linkRating) {
		this.linkRating = linkRating;
	}

	public Date getLinkUpdated() {
		return this.linkUpdated;
	}

	public void setLinkUpdated(Date linkUpdated) {
		this.linkUpdated = linkUpdated;
	}

	public String getLinkRel() {
		return this.linkRel;
	}

	public void setLinkRel(String linkRel) {
		this.linkRel = linkRel;
	}

	public String getLinkNotes() {
		return this.linkNotes;
	}

	public void setLinkNotes(String linkNotes) {
		this.linkNotes = linkNotes;
	}

	public String getLinkRss() {
		return this.linkRss;
	}

	public void setLinkRss(String linkRss) {
		this.linkRss = linkRss;
	}

}
