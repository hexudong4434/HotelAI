package com.cn.stbu.hotel.domain;

import java.math.BigDecimal;

/**
 * @Author: yaya
 * @Description:
 * @Date: Create in 下午 01:54 2020/2/12
 */
public class FaceInfo {
    private BigDecimal faceInfoId;
    private String imgName;
    private String faceImgPath;
    private String faceFeature;

    public BigDecimal getFaceInfoId() {
        return faceInfoId;
    }

    public void setFaceInfoId(BigDecimal faceInfoId) {
        this.faceInfoId = faceInfoId;
    }

    public String getImgName() {
        return imgName;
    }

    public void setImgName(String imgName) {
        this.imgName = imgName;
    }

    public String getFaceImgPath() {
        return faceImgPath;
    }

    public void setFaceImgPath(String faceImgPath) {
        this.faceImgPath = faceImgPath;
    }

    public String getFaceFeature() {
        return faceFeature;
    }

    public void setFaceFeature(String faceFeature) {
        this.faceFeature = faceFeature;
    }
}
