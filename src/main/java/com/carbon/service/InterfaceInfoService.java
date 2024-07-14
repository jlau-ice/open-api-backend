package com.carbon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.carbon.model.entity.InterfaceInfo;
import com.carbon.model.entity.Post;

/**
* @author 柳如是
* @description 针对表【interface_info】的数据库操作Service
* @createDate 2024-07-14 16:49:09
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {
    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);

}
