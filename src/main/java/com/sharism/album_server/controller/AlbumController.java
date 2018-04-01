package com.sharism.album_server.controller;

import com.github.pagehelper.PageInfo;
import com.sharism.album_server.model.AlbumInfo;
import com.sharism.album_server.service.AlbumService;
import com.sharism.album_server.utils.DateTime;
import com.sharism.album_server.utils.Result;
import com.sharism.album_server.utils.Uuid;
import com.sharism.album_server.utils.mapToBean;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

/**
 * @author DYS
 * @Package com.sharism.album_server.controller
 * @Description:
 * @date 2018/3/30-11:17
 * @Version: 1.0
 */
@CrossOrigin
@Controller
@RequestMapping(value = "album")
public class AlbumController {

    @Autowired
    private AlbumService albumService;

    @RequestMapping(value ="/createAlbum",produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public Result createAlbum(HttpServletRequest request, HttpServletResponse response){
        //TODO :获取session值
        String userId="690770002d9f4b78a10903efc3320391";

        String albumMap= request.getParameter("createAlbumMap");
        if(albumMap==null)
            return  Result.newInstance().setCode(-1).setMessage("数据为空");
        JSONObject jb = JSONObject.fromObject(albumMap);
        Map map = (Map)jb;
        AlbumInfo albumInfo=null;
        try {
            albumInfo =(AlbumInfo)mapToBean.mapToBean(map,AlbumInfo.class);
        } catch (Exception e) {
            e.printStackTrace();
            return  Result.newInstance().setCode(-2).setMessage("数据转换有误");
        }
        //相册id
        String id=Uuid.getUUID();
        albumInfo.setId(id);
        //相册用户id
        albumInfo.setUserId(userId);
        //相册创建时间
        albumInfo.setCreateDate(DateTime.getStringDate());
        try {
           albumService.createAlbum(albumInfo);
        } catch (Exception e) {
            e.printStackTrace();
            return  Result.newInstance().setCode(-3).setMessage("相册创建失败");

        }
        return  Result.newInstance().setCode(1).setMessage("相册创建成功").setValue(id);
    }

    @RequestMapping(value ="/albumList",produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public Result albumList(HttpServletRequest request, HttpServletResponse response) {
        //TODO :获取session值
        String userId = "690770002d9f4b78a10903efc3320391";



        String albumPageMap= request.getParameter("albumPageMap");
        if(albumPageMap==null)
            return  Result.newInstance().setCode(-1).setMessage("数据为空").setValue(null);
        JSONObject Page = JSONObject.fromObject(albumPageMap);
        int pageNum  = Page.getInt("pageNum");
        int pageSize = Page.getInt("pageSize");

        if(pageSize<0)
            return  Result.newInstance().setCode(-2).setMessage("数据条数不合法");
        if(pageNum<0)
            return  Result.newInstance().setCode(-3).setMessage("页数不合法");

        List<AlbumInfo> albumInfos = null;
        try {
         albumInfos = albumService.albumList(userId, pageNum, pageSize);
        } catch (Exception e) {
            e.printStackTrace();
            return  Result.newInstance().setCode(-4).setMessage("相册获取失败");
        }

        return  Result.newInstance().setCode(1).setMessage("成功").setValue(new PageInfo<>(albumInfos));

    }

    @RequestMapping(value ="/updateAlbumInfo",produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public Result updateAlbumInfo(HttpServletRequest request, HttpServletResponse response) {
        //TODO :获取session值
        String userId = "690770002d9f4b78a10903efc3320391";

        String albumMap= request.getParameter("updateAlbumInfoMap");
        if(albumMap==null)
            return  Result.newInstance().setCode(-1).setMessage("数据为空");
        JSONObject jb = JSONObject.fromObject(albumMap);
        Map map = (Map)jb;
        AlbumInfo albumInfo=null;
        try {
            albumInfo =(AlbumInfo)mapToBean.mapToBean(map,AlbumInfo.class);
        } catch (Exception e) {
            e.printStackTrace();
            return  Result.newInstance().setCode(-2).setMessage("数据转换有误");
        }
        if(albumInfo.getId()==null)
            return  Result.newInstance().setCode(-3).setMessage("相册id不能为空");

        //添加用户id
        albumInfo.setUserId(userId);
        int i=0;
        try {
          i= albumService.updateByPrimaryKeySelective(albumInfo);
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
     * 根据id查询相册信息
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "/selectAlbumById", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public Result selectAlbumById(HttpServletRequest request, HttpServletResponse response) {
        //TODO 获取session
        String userId = "690770002d9f4b78a10903efc3320391";


        String albumId = request.getParameter("albumId");
        if (albumId == null)
            return Result.newInstance().setCode(-1).setMessage("id为空").setValue(null);
        AlbumInfo albumInfo=null;
        try {
            albumInfo = albumService.selectAlbumById(albumId);
        } catch (Exception e) {
            e.printStackTrace();
            return Result.newInstance().setCode(-2).setMessage("查询失败").setValue(null);

        }
        return Result.newInstance().setCode(1).setMessage("成功").setValue(albumInfo);

    }

    @RequestMapping(value = "/test",method ={RequestMethod.POST,RequestMethod.GET})
    @ResponseBody
    public Result test(){
        return  Result.newInstance().setCode(1).setMessage("测试成功").setValue("album_server 测试");

    }

}
