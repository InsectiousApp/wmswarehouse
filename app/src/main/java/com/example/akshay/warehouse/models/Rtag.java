package com.example.akshay.warehouse.models;

import java.util.List;

/**
 * Created by akshay on 29/10/15.
 */
public class Rtag {
    private String rtagNo;
    private String clientCode;
    private boolean putAwayStatus;
    private String putAwayDate;
    private String putAwayCompletedBy;
    private List<Product> productList;

    public Rtag(String rtagNo, String clientCode, boolean putAwayStatus, String putAwayDate, String putAwayCompletedBy, List<Product> productList) {
        this.rtagNo = rtagNo;
        this.clientCode = clientCode;
        this.putAwayStatus = putAwayStatus;
        this.putAwayDate = putAwayDate;
        this.putAwayCompletedBy = putAwayCompletedBy;
        this.productList=productList;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public String getRtagNo() {
        return rtagNo;
    }

    public void setRtagNo(String rtagNo) {
        this.rtagNo = rtagNo;
    }

    public String getClientCode() {
        return clientCode;
    }

    public void setClientCode(String clientCode) {
        this.clientCode = clientCode;
    }

    public boolean isPutAwayStatus() {
        return putAwayStatus;
    }

    public void setPutAwayStatus(boolean putAwayStatus) {
        this.putAwayStatus = putAwayStatus;
    }

    public String getPutAwayDate() {
        return putAwayDate;
    }

    public void setPutAwayDate(String putAwayDate) {
        this.putAwayDate = putAwayDate;
    }

    public String getPutAwayCompletedBy() {
        return putAwayCompletedBy;
    }

    public void setPutAwayCompletedBy(String putAwayCompletedBy) {
        this.putAwayCompletedBy = putAwayCompletedBy;
    }
}
