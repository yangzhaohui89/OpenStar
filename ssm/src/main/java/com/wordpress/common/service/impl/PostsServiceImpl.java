package com.wordpress.common.service.impl;

import org.springframework.stereotype.Service;

import com.wordpress.common.mapper.PostsMapper;
import com.wordpress.common.model.Posts;
import com.wordpress.common.service.IPostsService;
import com.baomidou.framework.service.impl.SuperServiceImpl;

/**
 *
 * Posts 表数据服务层接口实现类
 *
 */
@Service
public class PostsServiceImpl extends SuperServiceImpl<PostsMapper, Posts> implements IPostsService {


}