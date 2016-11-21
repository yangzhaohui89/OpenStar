package com.wordpress.common.service.impl;

import org.springframework.stereotype.Service;

import com.wordpress.common.mapper.OptionsMapper;
import com.wordpress.common.model.Options;
import com.wordpress.common.service.IOptionsService;
import com.baomidou.framework.service.impl.SuperServiceImpl;

/**
 *
 * Options 表数据服务层接口实现类
 *
 */
@Service
public class OptionsServiceImpl extends SuperServiceImpl<OptionsMapper, Options> implements IOptionsService {


}