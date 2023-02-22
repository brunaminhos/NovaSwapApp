package com.n.novaswapapp;

public class DataStorage {

    private String dataType;
    private String dataDesc;
    private String dataImage;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    private String key;

    public String getDataType() {
        return dataType;
    }

    public String getDataDesc() {
        return dataDesc;
    }

    public String getDataImage() {
        return dataImage;
    }

    public DataStorage(String dataType, String dataDesc, String dataImage) {
        this.dataType = dataType;
        this.dataDesc = dataDesc;
        this.dataImage = dataImage;

    }

    public DataStorage(){

    }
}
