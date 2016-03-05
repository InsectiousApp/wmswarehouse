package com.example.akshay.warehouse.models;

/**
 * Created by akshay on 29/10/15.
 */
public class Product {
    private String rtagNo;
    private String productId;
    private String batchNo;
    private String lotNo;
    private String barCode;
    private String loctionCode;
    private String productClass;
    private String mfgDate;
    private String expDate;
    private boolean saved;

    public boolean isSaved() {
        return saved;
    }

    public void setSaved(boolean saved) {
        this.saved = saved;
    }

    public Product(String rtagNo, String productId, String batchNo, String lotNo, String barCode, String loctionCode, String productClass, String mfgDate, String expDate,boolean issaved) {
        this.rtagNo = rtagNo;//done
        this.productId = productId;//done
        this.batchNo = batchNo;//done
        this.lotNo = lotNo;//done
        this.barCode = barCode;
        this.loctionCode = loctionCode;//done
        this.productClass = productClass;//done
        this.mfgDate = mfgDate;//done
        this.expDate = expDate;//done
        this.saved=issaved;
    }

    public String getRtagNo() {
        return rtagNo;
    }

    public void setRtagNo(String rtagNo) {
        this.rtagNo = rtagNo;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public String getLotNo() {
        return lotNo;
    }

    public void setLotNo(String lotNo) {
        this.lotNo = lotNo;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public String getLoctionCode() {
        return loctionCode;
    }

    public void setLoctionCode(String loctionCode) {
        this.loctionCode = loctionCode;
    }

    public String getProductClass() {
        return productClass;
    }

    public void setProductClass(String productClass) {
        this.productClass = productClass;
    }

    public String getMfgDate() {
        return mfgDate;
    }

    public void setMfgDate(String mfgDate) {
        this.mfgDate = mfgDate;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }
}
