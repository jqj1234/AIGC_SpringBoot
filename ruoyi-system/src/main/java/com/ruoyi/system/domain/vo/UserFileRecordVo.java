package com.ruoyi.system.domain.vo;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.Data;

/**
 * @author ：jiang
 * @date ：2024/6/4 15:00
 * @description ：文本记录vo
 */
@Data
public class UserFileRecordVo {
    @JsonSerialize(using = ToStringSerializer.class)
    private Long id;
    private String dateTime;
    private Integer type;
    private String fileName;
    private String wholeAiProb;
    private String wholeRealProb;
}
