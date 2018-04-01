package com.sharism.album_server.service;

import com.sharism.album_server.model.PhotoInfo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author DYS
 * @Package com.sharism.album_server.service
 * @Description:
 * @date 2018/3/30-12:12
 * @Version: 1.0
 */

public interface PhotoService {
    /**
     * 上传照片
     * @param photoInfo
     * @return
     * @throws Exception
     */
    int addPhoto(PhotoInfo photoInfo)throws  Exception;

    /**
     * 批量设置为删除状态
     * @param albumId
     * @param ids
     * @return
     * @throws Exception
     */
    int batchSetPhotoDeleteStatus(String albumId, List<String> ids)throws Exception;

    /**
     * 多条件分页查询
     * @param map
     * @return
     * @throws Exception
     */
    List<PhotoInfo> selectPhotoPageList(Map map ,int pageNum, int pageSize)throws Exception;

    /**
     * 修改照片信息
     * @param photoInfo
     * @return
     * @throws Exception
     */
    int updateByPrimaryKeySelective(PhotoInfo photoInfo)throws  Exception;

    /**
     * 根据id查询照片
     * @param id
     * @return
     * @throws Exception
     */
    PhotoInfo selectPhotoById(String id)throws  Exception;

}
