package com.wordpress.common.model;

import java.io.Serializable;


import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 *
 * 
 *
 */
@TableName("wp_postmeta")
public class Postmeta implements Serializable {

	@TableField(exist = false)
	private static final long serialVersionUID = 1L;

	/**  */
	@TableId(value = "meta_id")
	private Long metaId;

	/**  */
	@TableField(value = "post_id")
	private Long postId;

	/**  */
	@TableField(value = "meta_key")
	private String metaKey;

	/**  */
	@TableField(value = "meta_value")
	private String metaValue;


	public Long getMetaId() {
		return this.metaId;
	}

	public void setMetaId(Long metaId) {
		this.metaId = metaId;
	}

	public Long getPostId() {
		return this.postId;
	}

	public void setPostId(Long postId) {
		this.postId = postId;
	}

	public String getMetaKey() {
		return this.metaKey;
	}

	public void setMetaKey(String metaKey) {
		this.metaKey = metaKey;
	}

	public String getMetaValue() {
		return this.metaValue;
	}

	public void setMetaValue(String metaValue) {
		this.metaValue = metaValue;
	}

}
