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
@TableName("wp_term_relationships")
public class TermRelationships implements Serializable {

	@TableField(exist = false)
	private static final long serialVersionUID = 1L;

	/**  */
	@TableId(value = "object_id")
	private Long objectId;

	/**  */
	@TableField(value = "term_taxonomy_id")
	private Long termTaxonomyId;

	/**  */
	@TableField(value = "term_order")
	private Integer termOrder;


	public Long getObjectId() {
		return this.objectId;
	}

	public void setObjectId(Long objectId) {
		this.objectId = objectId;
	}

	public Long getTermTaxonomyId() {
		return this.termTaxonomyId;
	}

	public void setTermTaxonomyId(Long termTaxonomyId) {
		this.termTaxonomyId = termTaxonomyId;
	}

	public Integer getTermOrder() {
		return this.termOrder;
	}

	public void setTermOrder(Integer termOrder) {
		this.termOrder = termOrder;
	}

}
