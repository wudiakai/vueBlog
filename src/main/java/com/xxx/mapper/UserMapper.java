package com.xxx.mapper;

import com.xxx.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author wukong
 * @since 2022-07-09
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
