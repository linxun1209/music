package com.example.musicDemo.pojo;

public class Song {
    private Integer songid;
    private String songName;
    private String songerId;
    private String lauguage;
    private String playCount;
    private String downloadcount;
    private String collectionCount;
    private String publishCount;
    private String songTime;
    public Integer getSongid() {
        return songid;
    }

    public void setSongid(Integer songid) {
        this.songid = songid;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getSongerId() {
        return songerId;
    }

    public void setSongerId(String songerId) {
        this.songerId = songerId;
    }

    public String getLauguage() {
        return lauguage;
    }

    public void setLauguage(String lauguage) {
        this.lauguage = lauguage;
    }

    public String getPlayCount() {
        return playCount;
    }

    public void setPlayCount(String playCount) {
        this.playCount = playCount;
    }

    public String getDownloadcount() {
        return downloadcount;
    }

    public void setDownloadcount(String downloadcount) {
        this.downloadcount = downloadcount;
    }

    public String getCollectionCount() {
        return collectionCount;
    }

    public void setCollectionCount(String collectionCount) {
        this.collectionCount = collectionCount;
    }

    public String getPublishCount() {
        return publishCount;
    }

    public void setPublishCount(String publishCount) {
        this.publishCount = publishCount;
    }

    public String getSongTime() {
        return songTime;
    }

    public void setSongTime(String songTime) {
        this.songTime = songTime;
    }

}
