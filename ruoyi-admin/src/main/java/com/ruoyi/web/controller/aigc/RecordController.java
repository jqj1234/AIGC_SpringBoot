package com.ruoyi.web.controller.aigc;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.system.domain.vo.UserFileRecordVo;
import com.ruoyi.system.domain.vo.UserImageRecordVo;
import com.ruoyi.system.service.UserFileRecordService;
import com.ruoyi.system.service.UserImageRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @author ：jiang
 * @date ：2024/6/4 8:58
 * @description ：历史记录接口
 */

@RequestMapping("/record")
@RestController
public class RecordController extends BaseController {

    @Autowired
    private UserFileRecordService userFileRecordService;

    @Autowired
    private UserImageRecordService userImageRecordService;

    /**
     * 分页查询历史文本记录
     * @param hashMap
     * @return
     */
    @PostMapping("/text")
    public TableDataInfo getRecordText(@RequestBody Map hashMap) {
        startPage();
        List<UserFileRecordVo> recordById = userFileRecordService.getRecordById(hashMap);
        return getDataTable(recordById);
    }

    /**
     * 批量删除文本记录
     * @param fileIds
     * @return
     */
    @DeleteMapping("/text/{fileIds}")
    public AjaxResult removeText(@PathVariable Long[] fileIds) {
        return toAjax(userFileRecordService.deleteFileByIds(fileIds));
    }


    /**
     * 分页查询历史图片记录
     * @param info
     * @return
     */
    @PostMapping("/image")
    public TableDataInfo getRecordImage(@RequestBody Map info) {
        startPage();
        List<UserImageRecordVo> recordById = userImageRecordService.getRecordById(info);
        return getDataTable(recordById);
    }

    /**
     * 批量删除图片记录
     * @param fileIds
     * @return
     */
    @DeleteMapping("/image/{fileIds}")
    public AjaxResult removeImage(@PathVariable Long[] fileIds) {
        return toAjax(userImageRecordService.deleteFileByIds(fileIds));
    }
}
