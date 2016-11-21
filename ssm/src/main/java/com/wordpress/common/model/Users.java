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
@TableName("wp_users")
public class Users implements Serializable {

	@TableField(exist = false)
	private static final long serialVersionUID = 1L;

	/**  */
	@TableId
	private Long id;

	/**  */
	@TableField(value = "user_login")
	private String userLogin;

	/**  */
	@TableField(value = "user_pass")
	private String userPass;

	/**  */
	@TableField(value = "user_nicename")
	private String userNicename;

	/**  */
	@TableField(value = "user_email")
	private String userEmail;

	/**  */
	@TableField(value = "user_url")
	private String userUrl;

	/**  */
	@TableField(value = "user_registered")
	private Date userRegistered;

	/**  */
	@TableField(value = "user_activation_key")
	private String userActivationKey;

	/**  */
	@TableField(value = "user_status")
	private Integer userStatus;

	/**  */
	@TableField(value = "display_name")
	private String displayName;


	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserLogin() {
		return this.userLogin;
	}

	public void setUserLogin(String userLogin) {
		this.userLogin = userLogin;
	}

	public String getUserPass() {
		return this.userPass;
	}

	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}

	public String getUserNicename() {
		return this.userNicename;
	}

	public void setUserNicename(String userNicename) {
		this.userNicename = userNicename;
	}

	public String getUserEmail() {
		return this.userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserUrl() {
		return this.userUrl;
	}

	public void setUserUrl(String userUrl) {
		this.userUrl = userUrl;
	}

	public Date getUserRegistered() {
		return this.userRegistered;
	}

	public void setUserRegistered(Date userRegistered) {
		this.userRegistered = userRegistered;
	}

	public String getUserActivationKey() {
		return this.userActivationKey;
	}

	public void setUserActivationKey(String userActivationKey) {
		this.userActivationKey = userActivationKey;
	}

	public Integer getUserStatus() {
		return this.userStatus;
	}

	public void setUserStatus(Integer userStatus) {
		this.userStatus = userStatus;
	}

	public String getDisplayName() {
		return this.displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

}
