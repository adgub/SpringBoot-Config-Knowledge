package com.project.knowledge.mapper;

import com.project.knowledge.domain.UserInfo;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    public UserInfo getUserInfoByName(@Param("userName") String name);

}
