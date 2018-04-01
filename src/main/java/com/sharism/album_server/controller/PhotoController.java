package com.sharism.album_server.controller;

import com.github.pagehelper.PageInfo;
import com.sharism.album_server.model.AlbumInfo;
import com.sharism.album_server.model.PhotoInfo;
import com.sharism.album_server.service.PhotoService;
import com.sharism.album_server.utils.*;
import net.sf.json.JSONObject;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


/**
 * @author DYS
 * @Package com.sharism.album_server.controller
 * @Description:
 * @date 2018/3/30-12:17
 * @Version: 1.0
 */
@CrossOrigin
@Controller
@RequestMapping(value = "photo")
public class PhotoController {
    @Autowired
    private PhotoService photoService;
 /**
    * @ProjectName:    PhotoController
    * @Description:    添加照片
    * @Author:         DYS
    * @CreateDate:     2018/3/30-13:33
    * @UpdateUser:     DYS
    * @UpdateDate:
    * @UpdateRemark:   The modified content
    * @Version:        1.0
    */
    @RequestMapping(value = "/addPhhoto",produces = {"application/json;charset=UTF-8"} )
    @ResponseBody
    public Result addPhoto(HttpServletRequest request, HttpServletResponse response){
        //TODO :获取session值
        String userId="690770002d9f4b78a10903efc3320391";

        String addPhotoMap= request.getParameter("addPhotoMap");
        if(addPhotoMap==null)
            return  Result.newInstance().setCode(-1).setMessage("数据为空");
        JSONObject jb = JSONObject.fromObject(addPhotoMap);
        Map photoMap = (Map)jb;
        PhotoInfo photoInfo=null;
        try {
            photoInfo=(PhotoInfo)mapToBean.mapToBean(photoMap, PhotoInfo.class);
        } catch (Exception e) {
            e.printStackTrace();
            return  Result.newInstance().setCode(-2).setMessage("数据转换有误");
        }
        //照片id
        String id=Uuid.getUUID();
        photoInfo.setId(id);
        //照片上传时间
        photoInfo.setAddTime(DateTime.getStringDate());
        //删除状态
        photoInfo.setDel(PublicValue.PHOTO_NOT_DEL);
        //照片存储路径storage
        photoInfo.setStoragePath(photoInfo.getPhotoPath().substring(PublicValue.SERVER_ADDRESS_LENGTH+2));
        try {
            photoService.addPhoto(photoInfo);
        } catch (Exception e) {
            e.printStackTrace();
            return  Result.newInstance().setCode(-3).setMessage("照片保存失败");
        }
        return  Result.newInstance().setCode(1).setMessage("成功").setValue(id);

    }
     /**
        * @ProjectName:    PhotoController
        * @Description:    删除照片
        * @Author:         DYS
        * @CreateDate:     2018/3/30-13:38
        * @UpdateUser:     DYS
        * @UpdateDate:
        * @UpdateRemark:   The modified content
        * @Version:        1.0
        */
    @RequestMapping(value = "/deletePhoto",produces = {"application/json;charset=UTF-8"} )
    @ResponseBody
    public Result deletePhoto(HttpServletRequest request, HttpServletResponse response){
        //TODO :获取session值
        String userId="690770002d9f4b78a10903efc3320391";

        String photoArrayList= request.getParameter("photoArrayList");
        String albumId= request.getParameter("albumId");

        if(albumId==null)
            return  Result.newInstance().setCode(-1).setMessage("相册为空");

        if(photoArrayList==null)
            return  Result.newInstance().setCode(-2).setMessage("数据为空");
        String[] split = photoArrayList.split(",");

        if(split.length==0)
            return  Result.newInstance().setCode(-3).setMessage("数据为空");
        List<String> list =new ArrayList<>();
        for(String tmp:split) {
            list.add(tmp);
        }
        int i=0;
        try {
          i=  photoService.batchSetPhotoDeleteStatus(albumId,list);
        } catch (Exception e) {
            e.printStackTrace();
            Result.newInstance().setCode(-4).setMessage("删除失败");
        }

        return  Result.newInstance().setCode(1).setMessage("成功").setValue(i);

    }
    @RequestMapping(value = "/selectPhotoPageList",produces = {"application/json;charset=UTF-8"} )
    @ResponseBody
    public Result selectPhotoPageList(HttpServletRequest request, HttpServletResponse response) {
        //TODO :获取session值
        String userId="690770002d9f4b78a10903efc3320391";

        String photoPageList= request.getParameter("photoPageList");

        if(photoPageList==null)
            return  Result.newInstance().setCode(-1).setMessage("数据为空");
        JSONObject Page = JSONObject.fromObject(photoPageList);
        int pageNum  = Page.getInt("pageNum");
        int pageSize = Page.getInt("pageSize");

        if(pageSize<0)
            return  Result.newInstance().setCode(-2).setMessage("数据条数不合法");
        if(pageNum<0)
            return  Result.newInstance().setCode(-3).setMessage("页数不合法");

        Map map=(Map)Page;
        List<PhotoInfo> photoInfos=null;
        try {
           photoInfos = photoService.selectPhotoPageList(map, pageNum, pageSize);
        } catch (Exception e) {
            e.printStackTrace();
            Result.newInstance().setCode(-4).setMessage("相册获取失败");
        }

        return  Result.newInstance().setCode(1).setMessage("成功").setValue( new PageInfo<>(photoInfos));

    }

    @RequestMapping(value ="/updatePhotoInfo",produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public Result updatePhotoInfo(javax.servlet.http.HttpServletRequest request, HttpServletResponse response) {
        //TODO :获取session值
        String userId = "690770002d9f4b78a10903efc3320391";

        String photoInfoMap= request.getParameter("updatePhotoInfoMap");
        if(photoInfoMap==null)
            return  Result.newInstance().setCode(-1).setMessage("数据为空");
        JSONObject jb = JSONObject.fromObject(photoInfoMap);
        Map map = (Map)jb;
        PhotoInfo photoInfo=null;
        try {
            photoInfo =(PhotoInfo)mapToBean.mapToBean(map,PhotoInfo.class);
        } catch (Exception e) {
            e.printStackTrace();
            return  Result.newInstance().setCode(-2).setMessage("数据转换有误");
        }
        if(photoInfo.getId()==null)
            return  Result.newInstance().setCode(-3).setMessage("照片id不能为空");


        int i=0;
        try {
            i= photoService.updateByPrimaryKeySelective(photoInfo);
        } catch (Exception e) {
            e.printStackTrace();
            return  Result.newInstance().setCode(-4).setMessage("更新失败");
        }
        if(i>0)
            return  Result.newInstance().setCode(1).setMessage("更新成功");
        else
            return  Result.newInstance().setCode(0).setMessage("没有要更新的");

    }
    /**
     * 根据id查询照片信息
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "/selectPhotoById", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public Result selectPhotoById(javax.servlet.http.HttpServletRequest request, HttpServletResponse response) {
        //TODO 获取session
        String userId = "690770002d9f4b78a10903efc3320391";


        String photoId = request.getParameter("photoId");
        if (photoId == null)
            return Result.newInstance().setCode(-1).setMessage("id为空").setValue(null);
        PhotoInfo photoInfo=null;
        try {
            photoInfo = photoService.selectPhotoById(photoId);
        } catch (Exception e) {
            e.printStackTrace();
            return Result.newInstance().setCode(-2).setMessage("查询失败").setValue(null);

        }
        return Result.newInstance().setCode(1).setMessage("成功").setValue(photoInfo);

    }


}
