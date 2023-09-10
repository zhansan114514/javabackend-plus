package com.glimmer.mapper;

import com.glimmer.entity.Box;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * mapper层接口，用于与数据库进行交互
 */
@Mapper
public interface BoxTransactionMapper {

    /**
     * 动态查询检测框数据
     * @param box
     * @return
     */

    /**
     * 插入检测框数据
     * @param
     */


    /**
     * 根据caId删除检测框数据
     * @param caId
     */
    @Delete("delete from box where ca_id = #{caId}")
    void deleteByCaId(Integer caId);

    /**
     * 根据caId获取检测框数据
     * @param caId
     * @return
     */
    @Select("select * from box where ca_id = #{caId}")
    List<Box> getByCaId(Integer caId);

}
