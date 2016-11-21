package com.wordpress.common.service.impl;

import org.springframework.stereotype.Service;

import com.wordpress.common.mapper.PostmetaMapper;
import com.wordpress.common.model.Postmeta;
import com.wordpress.common.service.IPostmetaService;
import com.baomidou.framework.service.impl.SuperServiceImpl;

/**
 *
 * Postmeta 表数据服务层接口实现类
 *
 */
@Service
public class PostmetaServiceImpl extends SuperServiceImpl<PostmetaMapper, Postmeta> implements IPostmetaService {


}