package com.sharism.album_server.mapper;

import com.sharism.album_server.model.PhotoInfo;
import com.sharism.album_server.model.PhotoInfoExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface PhotoInfoMapper {
    long countByExample(PhotoInfoExample example);

    int deleteByExample(PhotoInfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(PhotoInfo record);

    int insertSelective(PhotoInfo record);

    List<PhotoInfo> selectByExample(PhotoInfoExample example);

    PhotoInfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PhotoInfo record, @Param("example") PhotoInfoExample example);

    int updateByExample(@Param("record") PhotoInfo record, @Param("example") PhotoInfoExample example);

    int updateByPrimaryKeySelective(PhotoInfo record);

    int updateByPrimaryKey(PhotoInfo record);

    /**
     * 批量设置为删除状态
     * @param albumId
     * @param ids
     * @return
     */
    int batchSetPhotoDeleteStatus(@Param(value="albumId")String albumId,@Param(value="list") List<String>  ids);

    /**
     * 多条件分页查询
     * @param map
     * @return
     */
    List<PhotoInfo> selectPhotoPageList(Map map);
}