package com.glimmer.service.impl;

import com.glimmer.entity.Box;
import com.glimmer.entity.Camera;
import com.glimmer.mapper.BoxTransactionMapper;
import com.glimmer.mapper.CameraTransactionMapper;
import com.glimmer.service.CameraInfoService;
import com.glimmer.vo.InfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * service层摄像头监测信息接口的实现类
 * 在这里完成摄像头相关的具体的业务功能
 */
@Service
public class CameraInfoServiceImpl implements CameraInfoService {

    //依赖注入Mapper层相关接口
    @Autowired
    private CameraTransactionMapper cameraTransactionMapper;

    @Autowired
    private BoxTransactionMapper boxTransactionMapper;

    //请你根据相应数据格式实现摄像头检测区域信息获取业务

}
