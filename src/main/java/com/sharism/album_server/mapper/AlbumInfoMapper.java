package com.sharism.album_server.mapper;

import com.sharism.album_server.model.AlbumInfo;
import com.sharism.album_server.model.AlbumInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AlbumInfoMapper {
    long countByExample(AlbumInfoExample example);

    int deleteByExample(AlbumInfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(AlbumInfo record);

    int insertSelective(AlbumInfo record);

    List<AlbumInfo> selectByExample(AlbumInfoExample example);

    AlbumInfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") AlbumInfo record, @Param("example") AlbumInfoExample example);

    int updateByExample(@Param("record") AlbumInfo record, @Param("example") AlbumInfoExample example);

    int updateByPrimaryKeySelective(AlbumInfo record);

    int updateByPrimaryKey(AlbumInfo record);

    /**
     * 根据用户id获取相册列表
     * @param id
     * @return
     */
    List<AlbumInfo>  selectByUserId(String id);
}