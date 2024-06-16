package com.ruoyi.system.domain.vo;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.Data;

import java.util.Date;

/**
 * @author ：jiang
 * @date ：2024/6/6 11:14
 * @description ：用户图片历史记录Vo
 */
@Data
public class UserImageRecordVo {
    @JsonSerialize(using = ToStringSerializer.class)
    private Long id;
    private Long userId;
    private String username;
    private String type;
    private String url;
    private String aiProb;
    private String datetime;
}
