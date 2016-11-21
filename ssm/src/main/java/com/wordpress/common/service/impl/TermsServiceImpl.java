package com.wordpress.common.service.impl;

import org.springframework.stereotype.Service;

import com.wordpress.common.mapper.TermsMapper;
import com.wordpress.common.model.Terms;
import com.wordpress.common.service.ITermsService;
import com.baomidou.framework.service.impl.SuperServiceImpl;

/**
 *
 * Terms 表数据服务层接口实现类
 *
 */
@Service
public class TermsServiceImpl extends SuperServiceImpl<TermsMapper, Terms> implements ITermsService {


}