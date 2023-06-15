package com.wms.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.wms.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author hhx
 * @since 2023-06-12
 */
public interface UserService extends IService<User> {
    public List<User> selectAll();
    IPage pageC(IPage<User> page);

    IPage pageCC(IPage<User> page, Wrapper wrapper);
}
