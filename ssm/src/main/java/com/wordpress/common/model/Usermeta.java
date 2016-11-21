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
@TableName("wp_usermeta")
public class Usermeta implements Serializable {

	@TableField(exist = false)
	private static final long serialVersionUID = 1L;

	/**  */
	@TableId(value = "umeta_id")
	private Long umetaId;

	/**  */
	@TableField(value = "user_id")
	private Long userId;

	/**  */
	@TableField(value = "meta_key")
	private String metaKey;

	/**  */
	@TableField(value = "meta_value")
	private String metaValue;


	public Long getUmetaId() {
		return this.umetaId;
	}

	public void setUmetaId(Long umetaId) {
		this.umetaId = umetaId;
	}

	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
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
