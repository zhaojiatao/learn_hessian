package com.zjt.learn.hession.api.impl;

import com.zjt.learn.hession.api.GetUserInfo;
import com.zjt.learn.hession.dto.User;
import org.apache.commons.lang3.StringUtils;

/**
 * Created by zhaojiatao@souche.com on 2018/4/17
 */
public class GetUserInfoImpl implements GetUserInfo {
    @Override
    public String getuserinfo(String id) {

        if(StringUtils.isNotBlank(id)){
            User user=new User();
            user.setId("1");
            user.setName("zhaojiatao");
            user.setAddress("hangzhou");
            user.setAge(18);
            user.setGender(1);
            return user.toString();
        }

        return null;
    }
}
