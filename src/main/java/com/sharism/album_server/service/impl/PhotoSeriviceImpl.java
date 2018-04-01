package com.sharism.album_server.service.impl;

import com.github.pagehelper.PageHelper;
import com.sharism.album_server.mapper.PhotoInfoMapper;
import com.sharism.album_server.model.PhotoInfo;
import com.sharism.album_server.service.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author DYS
 * @Package com.sharism.album_server.service.impl
 * @Description:
 * @date 2018/3/30-12:14
 * @Version: 1.0
 */
@Service("PhotoService")
public class PhotoSeriviceImpl implements PhotoService{
    @Autowired
    private PhotoInfoMapper photoInfoMapper;

    /**
     * 上传照片
     * @param photoInfo
     * @return
     * @throws Exception
     */
    @Override
    public int addPhoto(PhotoInfo photoInfo) throws Exception {
        return photoInfoMapper.insert(photoInfo);
    }

    /**
     * 批量设置为删除状态
     * @param albumId
     * @param ids
     * @return
     * @throws Exception
     */
    @Override
    public int batchSetPhotoDeleteStatus(String albumId, List<String> ids) throws Exception {
        return photoInfoMapper.batchSetPhotoDeleteStatus(albumId,ids);
    }

    /**
     * 多条件分页查询
     * @param map
     * @return
     * @throws Exception
     */
    @Override
    public List<PhotoInfo> selectPhotoPageList(Map map, int pageNum, int pageSize) throws Exception {
        //不进行count查询。第三个參数设为false (pageNum, pageSize,false)
        PageHelper.startPage(pageNum, pageSize);
        return photoInfoMapper.selectPhotoPageList(map);
    }

    /**
     * 修改照片信息
     * @param photoInfo
     * @return
     * @throws Exception
     */
    @Override
    public int updateByPrimaryKeySelective(PhotoInfo photoInfo) throws Exception {
        return photoInfoMapper.updateByPrimaryKeySelective(photoInfo);
    }

    /**
     * 根据id查询照片信息
     * @param id
     * @return
     * @throws Exception
     */
    @Override
    public PhotoInfo selectPhotoById(String id) throws Exception {
        return photoInfoMapper.selectByPrimaryKey(id);
    }


}
