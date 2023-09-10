package com.glimmer.mapper;

import com.glimmer.entity.Camera;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * mapper层接口，用于与数据库进行交互
 */
@Mapper
public interface CameraTransactionMapper {

    /**
     * 通过用户名获取摄像头信息
     * @param name
     * @return
     */


    /**
     * 插入摄像头数据
     * @param camera
     */


    /**
     * 查询返回所有摄像头数据
     * @return
     */
    @Select("select * from camera")
    List<Camera> list();


    /**
     * 动态修改摄像头数据
     * @param camera
     */


    /**
     * 根据名称删除摄像头
     * @param name
     */


}
