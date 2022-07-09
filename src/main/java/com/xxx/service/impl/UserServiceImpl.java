package com.xxx.service.impl;

import com.xxx.entity.User;
import com.xxx.mapper.UserMapper;
import com.xxx.service.IUserService;
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
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
