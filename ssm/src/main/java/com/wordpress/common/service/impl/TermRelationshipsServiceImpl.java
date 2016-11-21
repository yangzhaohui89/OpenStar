package com.wordpress.common.service.impl;

import org.springframework.stereotype.Service;

import com.wordpress.common.mapper.TermRelationshipsMapper;
import com.wordpress.common.model.TermRelationships;
import com.wordpress.common.service.ITermRelationshipsService;
import com.baomidou.framework.service.impl.SuperServiceImpl;

/**
 *
 * TermRelationships 表数据服务层接口实现类
 *
 */
@Service
public class TermRelationshipsServiceImpl extends SuperServiceImpl<TermRelationshipsMapper, TermRelationships> implements ITermRelationshipsService {


}