package com.glimmer.service;

import com.glimmer.dto.DeleteAlertDTO;
import org.springframework.web.multipart.MultipartFile;

//报警信息service层接口,在这里定义相关的业务接口
public interface AlertTransactionService {


    /**
     * 图片文件上传
     * @param alertPhoto
     * @param caId
     * @param alertTime
     * @param alertType
     */
    void uploadPhoto(MultipartFile alertPhoto, Integer caId, Integer alertTime, String alertType);

    /**
     * 视频文件上传
     * @param alertVideo
     * @param caId
     * @param alertTime
     * @param alertType
     */
    void uploadVideo(MultipartFile alertVideo, Integer caId, Integer alertTime, String alertType);

    /**
     * 获取报警信息
     * @param getAlertDTO
     * @return
     */


    /**
     * 删除报警信息
     * @param deleteAlertDTO
     */
    void deleteAlert(DeleteAlertDTO deleteAlertDTO);

    /**
     * 发送报警信息给前端
     * @param acceptAlertDTO
     * @param response
     */

}
