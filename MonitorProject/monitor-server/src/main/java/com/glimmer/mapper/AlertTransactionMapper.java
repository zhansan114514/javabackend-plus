package com.glimmer.mapper;

import com.glimmer.entity.Alert;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * mapper层接口，用于与数据库进行交互
 */
@Mapper
public interface AlertTransactionMapper {


    /**
     * 查询报警视频信息
     * @param pathVideo
     * @return
     */
    @Select("select * from alert where path_video = #{pathVideo}")
    Alert getByVideoPath(String pathVideo);

    /**
     * 查询报警图片信息
     * @param pathPhoto
     * @return
     */
    @Select("select * from alert where path_photo = #{pathPhoto}")
    Alert getByPhotoPath(String pathPhoto);

    /**
     * 删除相应报警视频
     * @param pathVideo
     */
    @Delete("delete from alert where path_video = #{pathVideo}")
    void deleteByVideoPath(String pathVideo);

    /**
     *删除相应报警图片
     * @param pathPhoto
     */
    @Delete("delete from alert where path_photo = #{pathPhoto}")
    void deleteByPhotoPath(String pathPhoto);

    //其他
}
