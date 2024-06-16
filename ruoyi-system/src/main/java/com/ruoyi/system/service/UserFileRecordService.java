package com.ruoyi.system.service;

import com.ruoyi.system.domain.vo.UserFileRecordVo;

import java.util.List;
import java.util.Map;

/**
 * @author ：jiang
 * @date ：2024/6/3 21:47
 * @description ：用户上传文本文件
 */
public interface UserFileRecordService {

     List<UserFileRecordVo> getRecordById(Map hashMap);

     int deleteFileByIds(Long[] fileIds);
}
