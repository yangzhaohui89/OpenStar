package com.wordpress.common.service.impl;

import org.springframework.stereotype.Service;

import com.wordpress.common.mapper.UsersMapper;
import com.wordpress.common.model.Users;
import com.wordpress.common.service.IUsersService;
import com.baomidou.framework.service.impl.SuperServiceImpl;

/**
 *
 * Users 表数据服务层接口实现类
 *
 */
@Service
public class UsersServiceImpl extends SuperServiceImpl<UsersMapper, Users> implements IUsersService {


}