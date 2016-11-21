package com.wordpress.common.service.impl;

import org.springframework.stereotype.Service;

import com.wordpress.common.mapper.TermTaxonomyMapper;
import com.wordpress.common.model.TermTaxonomy;
import com.wordpress.common.service.ITermTaxonomyService;
import com.baomidou.framework.service.impl.SuperServiceImpl;

/**
 *
 * TermTaxonomy 表数据服务层接口实现类
 *
 */
@Service
public class TermTaxonomyServiceImpl extends SuperServiceImpl<TermTaxonomyMapper, TermTaxonomy> implements ITermTaxonomyService {


}