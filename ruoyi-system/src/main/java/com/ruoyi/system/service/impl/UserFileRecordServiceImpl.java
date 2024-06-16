package com.ruoyi.system.service.impl;

import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.domain.model.LoginUser;
import com.ruoyi.system.domain.UserFileRecord;
import com.ruoyi.system.domain.vo.UserFileRecordVo;
import com.ruoyi.system.mapper.UserFileRecordMapper;
import com.ruoyi.system.service.UserFileRecordService;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.*;

import static com.ruoyi.common.utils.SecurityUtils.getLoginUser;

/**
 * @author ：jiang
 * @date ：2024/6/3 21:48
 * @description ：用户上传文本文件
 *
 */

@Service
public class UserFileRecordServiceImpl implements UserFileRecordService {

    @Autowired
    private UserFileRecordMapper userFileRecordMapper;
    @Override
    public List<UserFileRecordVo> getRecordById(Map hashMap) {
        LoginUser loginUser = getLoginUser();
        Long userId = loginUser.getUserId();
        hashMap.put("userId",userId);
        List<UserFileRecord> list =  userFileRecordMapper.getRecordById(hashMap);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        List<UserFileRecordVo> list1 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            UserFileRecordVo userFileRecordVo = new UserFileRecordVo();
            userFileRecordVo.setDateTime(sdf.format(list.get(i).getDatetime()));
            BeanUtils.copyProperties(list.get(i),userFileRecordVo);
            list1.add(userFileRecordVo);
        }

        return list1;
    }

    /**
     * 删除文件
     * @param fileIds
     * @return
     */
    @Override
    public int deleteFileByIds(Long[] fileIds) {

        return userFileRecordMapper.deleteFileByIds(fileIds);
    }
}
