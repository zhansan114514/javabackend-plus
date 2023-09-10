package com.glimmer.service.impl;

import com.glimmer.constant.MessageConstant;
import com.glimmer.dto.DeleteAlertDTO;
import com.glimmer.entity.Alert;
import com.glimmer.exception.AlertNotFoundException;
import com.glimmer.exception.BaseException;
import com.glimmer.mapper.AlertTransactionMapper;
import com.glimmer.service.AlertTransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

/**
 * service层报警信息接口的实现类
 * 在这里完成与报警信息相关的具体的业务功能
 */
@Service
public class AlertTransactionServiceImpl implements AlertTransactionService {

    @Autowired
    private AlertTransactionMapper alertTransactionMapper;

    /**
     * 上传图片文件
     *
     * @param file
     * @param caId
     * @param alertTime
     * @param alertType
     */
    @Override
    public void uploadPhoto(MultipartFile file, Integer caId, Integer alertTime, String alertType) {

    }

    /**
     * 上传视频文件
     *
     * @param file
     * @param caId
     * @param alertTime
     * @param alertType
     */
    @Override
    public void uploadVideo(MultipartFile file, Integer caId, Integer alertTime, String alertType) {

    }

    /**
     * 获取报警信息
     */






    /**
     * 删除报警信息
     *
     * @param deleteAlertDTO
     */
    @Override
    public void deleteAlert(DeleteAlertDTO deleteAlertDTO) {
        //首先判断视频路径数组是否为空，如果不为空，那么就要删除视频文件和数据库中的记录
        String[] pathPhotos = deleteAlertDTO.getPathPhotos();
        String[] pathVideos = deleteAlertDTO.getPathVideos();
        if (pathVideos != null && pathVideos.length > 0) {
            //遍历视频路径数组，删除视频文件和数据库中的记录
            for (String pathVideo : pathVideos) {
                Alert alert = alertTransactionMapper.getByVideoPath(pathVideo);
                if (alert == null) throw new AlertNotFoundException("视频路径：" + MessageConstant.NOT_EXIST);
                alertTransactionMapper.deleteByVideoPath(pathVideo);
                File file = new File(pathVideo);
                if (!file.delete()) throw new BaseException(MessageConstant.UNKNOWN_ERROR);
            }
        }
        if (pathPhotos != null && pathPhotos.length > 0) {
            //遍历视频路径数组，删除视频文件和数据库中的记录
            for (String pathPhoto : pathPhotos) {
                Alert alert = alertTransactionMapper.getByPhotoPath(pathPhoto);
                if (alert == null)
                    throw new AlertNotFoundException("图片路径" + MessageConstant.NOT_EXIST + "或已删除");
                alertTransactionMapper.deleteByPhotoPath(pathPhoto);
                File file = new File(pathPhoto);
                if (!file.delete()) throw new BaseException(MessageConstant.UNKNOWN_ERROR);
            }
        }
    }


}
