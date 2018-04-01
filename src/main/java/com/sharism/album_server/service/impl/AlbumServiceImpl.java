package com.sharism.album_server.service.impl;

import com.github.pagehelper.PageHelper;
import com.sharism.album_server.mapper.AlbumInfoMapper;
import com.sharism.album_server.model.AlbumInfo;
import com.sharism.album_server.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author DYS
 * @Package com.sharism.album_server.service.impl
 * @Description:
 * @date 2018/3/30-11:15
 * @Version: 1.0
 */
@Service("AlbumService")
public class AlbumServiceImpl implements AlbumService {

    @Autowired
    private AlbumInfoMapper albumInfoMapper;

    /**
     * 创建相册
     * @param albumInfo
     * @return
     * @throws Exception
     */
    @Override
    public int createAlbum(AlbumInfo albumInfo) throws Exception {
        return albumInfoMapper.insert(albumInfo);
    }

    /**
     * 根据用户id获取相册列表
     * @param userId
     * @return
     * @throws Exception
     */
    @Override
    public List<AlbumInfo> albumList(String userId, int pageNum, int pageSize) throws Exception {
        //不进行count查询。第三个參数设为false (pageNum, pageSize,false)
        PageHelper.startPage(pageNum, pageSize);
        return albumInfoMapper.selectByUserId(userId);
    }

    /**
     * 修改相册信息
     * @param albumInfo
     * @return
     * @throws Exception
     */
    @Override
    public int updateByPrimaryKeySelective(AlbumInfo albumInfo) throws Exception {
        return albumInfoMapper.updateByPrimaryKeySelective(albumInfo);
    }

    /**
     * 根据id查询相册信息
     * @param id
     * @return
     * @throws Exception
     */
    @Override
    public AlbumInfo selectAlbumById(String id) throws Exception {
        return albumInfoMapper.selectByPrimaryKey(id);
    }
}
