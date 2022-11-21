package com.moral.commotrade.lobotusassignment;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

class BID{
    @SerializedName("CustomerType")
    public String customerType;
    @SerializedName("FarmerID")
    public int farmerID;
    @SerializedName("BID")
    public String bID;
    @SerializedName("CustomerName")
    public String customerName;
    @SerializedName("AdharNo")
    public String adharNo;
    @SerializedName("Mobile")
    public Long mobile;
    @SerializedName("State")
    public String state;
    @SerializedName("City")
    public String city;
    @SerializedName("District")
    public String district;
    @SerializedName("Taluka")
    public String taluka;
    @SerializedName("Village")
    public String village;
    @SerializedName("Pincode")
    public int pincode;
    @SerializedName("WaterSource")
    public String waterSource;
    @SerializedName("WorkOrderNo")
    public String workOrderNo;
    @SerializedName("ProjectCode")
    public String projectCode;
    @SerializedName("ProjectName")
    public String projectName;
    @SerializedName("Status")
    public String status;
    @SerializedName("States_IDPK")
    public String states_IDPK;
    @SerializedName("Cities_IDPK")
    public String cities_IDPK;
    @SerializedName("Districts_IDPK")
    public String districts_IDPK;
    @SerializedName("AssignedToName")
    public String assignedToName;
    @SerializedName("BID_ID")
    public String bID_ID;
    @SerializedName("Farmer_SubInstaller")
    public String farmer_SubInstaller;
    @SerializedName("Farmer_InstallerId")
    public String farmer_InstallerId;
}

public class Result{
    @SerializedName("Success")
    public String success;
    @SerializedName("BID")
    public ArrayList<BID> bID;
}






