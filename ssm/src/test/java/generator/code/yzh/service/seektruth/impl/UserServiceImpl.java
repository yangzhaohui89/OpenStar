package yzh.service.seektruth.impl;

import org.springframework.stereotype.Service;

import yzh.mapper.seektruth.UserMapper;
import yzh.model.seektruth.User;
import yzh.service.seektruth.IUserService;
import com.baomidou.framework.service.impl.SuperServiceImpl;

/**
 *
 * User 表数据服务层接口实现类
 *
 */
@Service
public class UserServiceImpl extends SuperServiceImpl<UserMapper, User> implements IUserService {


}