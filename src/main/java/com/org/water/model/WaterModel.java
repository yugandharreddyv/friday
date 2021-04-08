package com.org.water.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Getter
@Setter
public class WaterModel {
    @Id
    public String waterName;
    public String waterType;
    public double waterPrize;
    public String waterQuality;

    public String getWaterName() {
        return waterName;
    }

    public void setWaterName(String waterName) {
        this.waterName = waterName;
    }


    public String getWaterType() {
        return waterType;
    }

    public void setWaterType(String waterType) {
        this.waterType = waterType;
    }

    public double getWaterPrize() {
        return waterPrize;
    }

    public void setWaterPrize(double waterPrize) {
        this.waterPrize = waterPrize;
    }

    public String getWaterQuality() {
        return waterQuality;
    }

    public void setWaterQuality(String waterQuality) {
        this.waterQuality = waterQuality;
    }
}
