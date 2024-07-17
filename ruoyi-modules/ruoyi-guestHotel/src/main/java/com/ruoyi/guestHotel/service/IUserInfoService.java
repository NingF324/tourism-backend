package com.ruoyi.guestHotel.service;

import com.ruoyi.guestHotel.domain.SysUserInfo;

public interface IUserInfoService {
    public SysUserInfo login(String username, String password);
    public void register(String username, String password);
}
