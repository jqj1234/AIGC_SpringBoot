package com.ruoyi.aigc.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.ruoyi.common.core.domain.AjaxResult;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.HashMap;

/**
 * @author ：jiang
 * @date ：2024/6/1 12:56
 * @description ：AIGC检测接口
 */
public interface CheckService {
    /**
     * 文本检测
     * @param hashMap
     * @return
     */
//    AjaxResult checkText(MultipartFile file, String value) throws IOException;

    AjaxResult checkText(HashMap<String,String> hashMap);

    /**
     * 图片检测
     * @param info
     * @return
     */
    AjaxResult checkImage(HashMap<String,String> info);

    /**
     * 图片OCR
     * @param file
     * @return
     */
    AjaxResult photoOcr(MultipartFile file);
}
