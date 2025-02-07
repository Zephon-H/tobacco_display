package edu.ecnu.tobacco_display.model.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

/**
 * @author TruthK
 */
public class Device {
    @JsonProperty("device_id")
    private String deviceId;
    @JsonProperty("device_name")
    private String deviceName;
    @JsonProperty("station_id")
    private String stationId;
    @JsonProperty("station_name")
    private String stationName;

    @JsonProperty("location")
    private String location;
    @JsonProperty("parent_location")
    private String parentLocation;

    @JsonProperty("address")
    private String address;
    @JsonProperty("head")
    private String head;
    @JsonProperty("head_phone")
    private String headPhone;

    @JsonProperty("kind")
    private int kind;

    @JsonProperty("create_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

    public Device() {
    }

    public Device(String deviceId, String deviceName, String stationId, String stationName, String location, String parentLocation, String address, String head, String headPhone, int kind, Date createTime) {
        this.deviceId = deviceId;
        this.deviceName = deviceName;
        this.stationId = stationId;
        this.stationName = stationName;
        this.location = location;
        this.parentLocation = parentLocation;
        this.address = address;
        this.head = head;
        this.headPhone = headPhone;
        this.kind = kind;
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Device{" +
                "deviceId='" + deviceId + '\'' +
                ", deviceName='" + deviceName + '\'' +
                ", stationId='" + stationId + '\'' +
                ", stationName='" + stationName + '\'' +
                ", location='" + location + '\'' +
                ", parentLocation='" + parentLocation + '\'' +
                ", address='" + address + '\'' +
                ", head='" + head + '\'' +
                ", headPhone='" + headPhone + '\'' +
                ", kind=" + kind +
                ", createTime=" + createTime +
                '}';
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getParentLocation() {
        return parentLocation;
    }

    public void setParentLocation(String parentLocation) {
        this.parentLocation = parentLocation;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getHeadPhone() {
        return headPhone;
    }

    public void setHeadPhone(String headPhone) {
        this.headPhone = headPhone;
    }

    public int getKind() {
        return kind;
    }

    public void setKind(int kind) {
        this.kind = kind;
    }

}