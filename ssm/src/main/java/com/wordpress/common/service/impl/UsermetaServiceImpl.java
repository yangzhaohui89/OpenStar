package com.wordpress.common.service.impl;

import org.springframework.stereotype.Service;

import com.wordpress.common.mapper.UsermetaMapper;
import com.wordpress.common.model.Usermeta;
import com.wordpress.common.service.IUsermetaService;
import com.baomidou.framework.service.impl.SuperServiceImpl;

/**
 *
 * Usermeta 表数据服务层接口实现类
 *
 */
@Service
public class UsermetaServiceImpl extends SuperServiceImpl<UsermetaMapper, Usermeta> implements IUsermetaService {


}