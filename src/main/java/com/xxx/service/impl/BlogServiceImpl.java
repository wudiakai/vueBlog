package com.xxx.service.impl;

import com.xxx.entity.Blog;
import com.xxx.mapper.BlogMapper;
import com.xxx.service.IBlogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wukong
 * @since 2022-07-09
 */
@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements IBlogService {

}
