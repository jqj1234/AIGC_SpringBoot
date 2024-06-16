package com.ruoyi.system.service.impl;

import com.ruoyi.common.core.domain.model.LoginUser;
import com.ruoyi.system.domain.UserImageRecord;
import com.ruoyi.system.domain.vo.UserFileRecordVo;
import com.ruoyi.system.domain.vo.UserImageRecordVo;
import com.ruoyi.system.mapper.UserImageRecordMapper;
import com.ruoyi.system.service.UserImageRecordService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static com.ruoyi.common.utils.SecurityUtils.getLoginUser;

/**
 * @author ：jiang
 * @date ：2024/6/6 11:07
 * @description ：用户图片历史记录
 */
@Service
public class UserImageRecordServiceImpl implements UserImageRecordService {

    @Autowired
    private UserImageRecordMapper userImageRecordMapper;
    @Override
    public List<UserImageRecordVo> getRecordById(Map hashMap) {
        LoginUser loginUser = getLoginUser();
        Long userId = loginUser.getUserId();
        hashMap.put("userId",userId);
        List<UserImageRecord> recordByInfo = userImageRecordMapper.getRecordByInfo(hashMap);
        List<UserImageRecordVo> list = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        for (int i = 0; i < recordByInfo.size(); i++) {
            UserImageRecordVo userImageRecordVo = new UserImageRecordVo();
            userImageRecordVo.setDatetime(sdf.format(recordByInfo.get(i).getDatetime()));
            BeanUtils.copyProperties(recordByInfo.get(i),userImageRecordVo);
            list.add(userImageRecordVo);
        }
        return list;
    }

    /**
     * 根据id删除图片文件
     * @param fileIds
     * @return
     */
    @Override
    public int deleteFileByIds(Long[] fileIds) {

        return userImageRecordMapper.deleteImageByIds(fileIds);
    }
}
