package com.carbon.service.impl;
import java.util.Date;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.carbon.common.ErrorCode;
import com.carbon.exception.BusinessException;
import com.carbon.mapper.InterfaceInfoMapper;
import com.carbon.model.entity.InterfaceInfo;
import com.carbon.model.entity.InterfaceInfo;
//import com.carbon.model.enums.InterfaceInfoGenderEnum;
//import com.carbon.model.enums.InterfaceInfoReviewStatusEnum;
import com.carbon.service.InterfaceInfoService;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

/**
* @author 柳如是
* @description 针对表【interface_info】的数据库操作Service实现
* @createDate 2024-07-14 16:49:09
*/
@Service
public class InterfaceInfoServiceImpl extends ServiceImpl<InterfaceInfoMapper, InterfaceInfo>
    implements InterfaceInfoService {

    // todo 信息校验，后续补充
    @Override
    public void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add) {


        if (interfaceInfo == null) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
//        Integer age = interfaceInfo.getAge();
//        Integer gender = interfaceInfo.getGender();
//        String content = interfaceInfo.getContent();
//        String job = interfaceInfo.getJob();
//        String place = interfaceInfo.getPlace();
//        String education = interfaceInfo.getEducation();
//        String loveExp = interfaceInfo.getLoveExp();
//        Integer reviewStatus = interfaceInfo.getReviewStatus();

        Long id = interfaceInfo.getId();
        String name = interfaceInfo.getName();
        String description = interfaceInfo.getDescription();
        String url = interfaceInfo.getUrl();
        String requestHeader = interfaceInfo.getRequestHeader();
        String responseHeader = interfaceInfo.getResponseHeader();
        Integer status = interfaceInfo.getStatus();
        String method = interfaceInfo.getMethod();
        Long userId = interfaceInfo.getUserId();
        Date createTime = interfaceInfo.getCreateTime();
        Date updateTime = interfaceInfo.getUpdateTime();
        Integer isDelete = interfaceInfo.getIsDelete();

        // 创建时，所有参数必须非空
//        if (add) {
//            if (StringUtils.isAnyBlank(content, job, place, education, loveExp) || ObjectUtils.anyNull(age, gender)) {
//                throw new BusinessException(ErrorCode.PARAMS_ERROR);
//            }
//        }
//        if (StringUtils.isNotBlank(content) && content.length() > 8192) {
//            throw new BusinessException(ErrorCode.PARAMS_ERROR, "内容过长");
//        }
//        if (reviewStatus != null && !InterfaceInfoReviewStatusEnum.getValues().contains(reviewStatus)) {
//            throw new BusinessException(ErrorCode.PARAMS_ERROR);
//        }
//        if (age != null && (age < 18 || age > 100)) {
//            throw new BusinessException(ErrorCode.PARAMS_ERROR, "年龄不符合要求");
//        }
//        if (gender != null && !InterfaceInfoGenderEnum.getValues().contains(gender)) {
//            throw new BusinessException(ErrorCode.PARAMS_ERROR, "性别不符合要求");
//        }
    }

}




