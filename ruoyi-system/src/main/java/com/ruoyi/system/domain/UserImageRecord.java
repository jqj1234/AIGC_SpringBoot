package com.ruoyi.system.domain;

import lombok.Data;

import java.util.Date;

/**
 * @author ：jiang
 * @date ：2024/6/6 10:34
 * @description ：用户图片记录
 */

@Data
public class UserImageRecord {
    private Long id;
    private Long userId;
    private String username;
    private String type;
    private String url;
    private String aiProb;
    private Date datetime;
}
