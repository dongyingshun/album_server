package com.sharism.album_server.service;

import com.sharism.album_server.model.AlbumInfo;

import java.util.List;

/**
 * @author DYS
 * @Package com.sharism.album_server.service
 * @Description:
 * @date 2018/3/30-11:06
 * @Version: 1.0
 */
public interface AlbumService {

    /**
     * 创建相册
     * @param albumInfo
     * @return
     * @throws Exception
     */
    int createAlbum(AlbumInfo albumInfo)throws Exception;

    /**
     * 根据userId获取相册列表
     * @param id
     * @return
     * @throws Exception
     */
    List<AlbumInfo> albumList(String id,int  pageNum, int pageSize)throws Exception;

    /**
     * 修改相册信息
     * @param albumInfo
     * @return
     * @throws Exception
     */
    int updateByPrimaryKeySelective(AlbumInfo albumInfo)throws Exception;

    /**
     * 根据id查询相册信息
     * @param id
     * @return
     * @throws Exception
     */
    AlbumInfo selectAlbumById(String id)throws Exception;

}
