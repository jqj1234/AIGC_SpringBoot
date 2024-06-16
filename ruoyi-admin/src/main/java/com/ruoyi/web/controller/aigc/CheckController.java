package com.ruoyi.web.controller.aigc;

import com.ruoyi.aigc.service.CheckService;
import com.ruoyi.common.core.domain.AjaxResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.util.HashMap;

/**
 * @author ：jiang
 * @date ：2024/6/1 12:01
 * @description ：检测控制器接口
 */
@RequestMapping("/check")
@RestController
public class CheckController {
    @Autowired
    private CheckService checkService;
//    /**
//     * 文本检测
//     * @param file
//     * @return
//     */
//    @PreAuthorize("@ss.hasPermi('aigc:text')")
//    @PostMapping("/text")
//    public AjaxResult checkText(@RequestParam("file") MultipartFile file, @RequestParam("model") String model) throws IOException {
//        return checkService.checkText(file,model);
//    }

    /**
     * 文本检测
     * @param info
     * @return
     */
    @PreAuthorize("@ss.hasPermi('aigc:text')")
    @PostMapping("/text")
    public AjaxResult checkText(@RequestBody HashMap<String,String> info) {
        return checkService.checkText(info);
    }


    /**
     * 图片检测
     * @return
     */
//    @PostMapping("/image")
//    public AjaxResult checkImage(@RequestParam("file") MultipartFile file) throws IOException {
//        return checkService.checkImage(file);
//    }
    @PostMapping("/image")
    public AjaxResult checkImage(@RequestBody HashMap<String,String> info){
        return checkService.checkImage(info);
    }


    /**
     * 图片OCR
     * @param file
     * @return
     */
    @PostMapping("/ocr")
    public AjaxResult photoOcr(@RequestParam("file") MultipartFile file){
        return checkService.photoOcr(file);
    }
}
