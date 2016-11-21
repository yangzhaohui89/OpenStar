package com.wordpress.common.service.impl;

import org.springframework.stereotype.Service;

import com.wordpress.common.mapper.CommentmetaMapper;
import com.wordpress.common.model.Commentmeta;
import com.wordpress.common.service.ICommentmetaService;
import com.baomidou.framework.service.impl.SuperServiceImpl;

/**
 *
 * Commentmeta 表数据服务层接口实现类
 *
 */
@Service
public class CommentmetaServiceImpl extends SuperServiceImpl<CommentmetaMapper, Commentmeta> implements ICommentmetaService {


}