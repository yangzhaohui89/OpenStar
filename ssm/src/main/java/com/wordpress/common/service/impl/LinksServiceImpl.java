package com.wordpress.common.service.impl;

import org.springframework.stereotype.Service;

import com.wordpress.common.mapper.LinksMapper;
import com.wordpress.common.model.Links;
import com.wordpress.common.service.ILinksService;
import com.baomidou.framework.service.impl.SuperServiceImpl;

/**
 *
 * Links 表数据服务层接口实现类
 *
 */
@Service
public class LinksServiceImpl extends SuperServiceImpl<LinksMapper, Links> implements ILinksService {


}