package com.sharism.album_server.model;

public class AlbumInfo {
    private String id;

    private String userId;

    private String albumSort;

    private String albumType;

    private String description;

    private String albumName;

    private String createDate;

    private Integer privacySet;

    private String albumPassword;

    private String albumIcon;

    private String iconPath;

    private String showStyle;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getAlbumSort() {
        return albumSort;
    }

    public void setAlbumSort(String albumSort) {
        this.albumSort = albumSort == null ? null : albumSort.trim();
    }

    public String getAlbumType() {
        return albumType;
    }

    public void setAlbumType(String albumType) {
        this.albumType = albumType == null ? null : albumType.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName == null ? null : albumName.trim();
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate == null ? null : createDate.trim();
    }

    public Integer getPrivacySet() {
        return privacySet;
    }

    public void setPrivacySet(Integer privacySet) {
        this.privacySet = privacySet;
    }

    public String getAlbumPassword() {
        return albumPassword;
    }

    public void setAlbumPassword(String albumPassword) {
        this.albumPassword = albumPassword == null ? null : albumPassword.trim();
    }

    public String getAlbumIcon() {
        return albumIcon;
    }

    public void setAlbumIcon(String albumIcon) {
        this.albumIcon = albumIcon == null ? null : albumIcon.trim();
    }

    public String getIconPath() {
        return iconPath;
    }

    public void setIconPath(String iconPath) {
        this.iconPath = iconPath == null ? null : iconPath.trim();
    }

    public String getShowStyle() {
        return showStyle;
    }

    public void setShowStyle(String showStyle) {
        this.showStyle = showStyle == null ? null : showStyle.trim();
    }
}