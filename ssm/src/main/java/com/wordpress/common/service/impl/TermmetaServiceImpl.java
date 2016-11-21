package com.wordpress.common.service.impl;

import org.springframework.stereotype.Service;

import com.wordpress.common.mapper.TermmetaMapper;
import com.wordpress.common.model.Termmeta;
import com.wordpress.common.service.ITermmetaService;
import com.baomidou.framework.service.impl.SuperServiceImpl;

/**
 *
 * Termmeta 表数据服务层接口实现类
 *
 */
@Service
public class TermmetaServiceImpl extends SuperServiceImpl<TermmetaMapper, Termmeta> implements ITermmetaService {


}