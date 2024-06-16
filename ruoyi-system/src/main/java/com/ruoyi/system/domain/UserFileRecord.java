package com.ruoyi.system.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;


/**
 * @author ：jiang
 * @date ：2024/6/3 21:40
 * @description ：用户文本文件记录
 */
@Data
public class UserFileRecord implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private Long userId;
    private Integer type;
    private String username;
    private String fileName;
    private String url;
    private String wholeAiProb; // 通常概率应该使用浮点数或双精度浮点数
    private String wholeRealProb; // 同样，概率应该使用浮点数或双精度浮点数
    private Date datetime;

}