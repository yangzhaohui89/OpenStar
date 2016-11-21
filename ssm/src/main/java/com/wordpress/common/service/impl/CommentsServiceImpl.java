package com.wordpress.common.service.impl;

import org.springframework.stereotype.Service;

import com.wordpress.common.mapper.CommentsMapper;
import com.wordpress.common.model.Comments;
import com.wordpress.common.service.ICommentsService;
import com.baomidou.framework.service.impl.SuperServiceImpl;

/**
 *
 * Comments 表数据服务层接口实现类
 *
 */
@Service
public class CommentsServiceImpl extends SuperServiceImpl<CommentsMapper, Comments> implements ICommentsService {


}