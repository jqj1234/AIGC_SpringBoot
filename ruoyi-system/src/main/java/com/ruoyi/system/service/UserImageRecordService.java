package com.ruoyi.system.service;

import com.ruoyi.system.domain.vo.UserImageRecordVo;

import java.util.List;
import java.util.Map;

/**
 * @author ：jiang
 * @date ：2024/6/6 11:07
 * @description ：用户上传图片文件
 */
public interface UserImageRecordService {
    List<UserImageRecordVo> getRecordById(Map info);

    int deleteFileByIds(Long[] fileIds);
}
