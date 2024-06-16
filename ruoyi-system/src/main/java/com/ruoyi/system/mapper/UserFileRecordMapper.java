package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.UserFileRecord;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;
import java.util.Map;

/**
 * @author ：jiang
 * @date ：2024/6/3 21:45
 * @description ：用户上传文本文件
 */

public interface UserFileRecordMapper {
    void insert(UserFileRecord userFileRecord);

//    @Select("select * from user_file_records where user_id = #{userId}")
    List<UserFileRecord> getRecordById(Map map);

    int deleteFileByIds(Long[] fileIds);
}
