package com.sharism.album_server.model;

public class PhotoInfo {
    private String id;

    private String albumId;

    private String photoName;

    private String photoDescribe;

    private String photoPath;

    private String storagePath;

    private String addTime;

    private Integer del;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getAlbumId() {
        return albumId;
    }

    public void setAlbumId(String albumId) {
        this.albumId = albumId == null ? null : albumId.trim();
    }

    public String getPhotoName() {
        return photoName;
    }

    public void setPhotoName(String photoName) {
        this.photoName = photoName == null ? null : photoName.trim();
    }

    public String getPhotoDescribe() {
        return photoDescribe;
    }

    public void setPhotoDescribe(String photoDescribe) {
        this.photoDescribe = photoDescribe == null ? null : photoDescribe.trim();
    }

    public String getPhotoPath() {
        return photoPath;
    }

    public void setPhotoPath(String photoPath) {
        this.photoPath = photoPath == null ? null : photoPath.trim();
    }

    public String getStoragePath() {
        return storagePath;
    }

    public void setStoragePath(String storagePath) {
        this.storagePath = storagePath == null ? null : storagePath.trim();
    }

    public String getAddTime() {
        return addTime;
    }

    public void setAddTime(String addTime) {
        this.addTime = addTime == null ? null : addTime.trim();
    }

    public Integer getDel() {
        return del;
    }

    public void setDel(Integer del) {
        this.del = del;
    }
}