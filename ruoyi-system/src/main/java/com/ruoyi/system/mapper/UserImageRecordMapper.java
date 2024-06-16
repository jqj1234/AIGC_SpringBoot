package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.UserImageRecord;

import java.util.List;
import java.util.Map;

/**
 * @author ：jiang
 * @date ：2024/6/6 10:49
 * @description ：用户上传图片
 */
public interface UserImageRecordMapper {
    void insert(UserImageRecord userImageRecord);

    List<UserImageRecord> getRecordByInfo(Map hashMap);

    int deleteImageByIds(Long[] fileIds);
}
