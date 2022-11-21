package com.moral.commotrade.lobotusassignment;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class RidResult {

    @SerializedName("Success")
    public String success;

    @SerializedName("data")
    public ArrayList<RID> data;
}

class RID{
    @SerializedName("ID")
    public int iD;
    @SerializedName("RID")
    public String rID;
    @SerializedName("ControllerItemCode")
    public String controllerItemCode;
    @SerializedName("ControllerItemCodeDesc")
    public String controllerItemCodeDesc;
    @SerializedName("ControllerSerialNumber")
    public String controllerSerialNumber;
    @SerializedName("MotorItemCode")
    public String motorItemCode;
    @SerializedName("MotorItemCodeDesc")
    public String motorItemCodeDesc;
    @SerializedName("MotorSerialNumber")
    public String motorSerialNumber;
    @SerializedName("PumpHeadItemCode")
    public String pumpHeadItemCode;
    @SerializedName("PumpHeadItemCodeDesc")
    public String pumpHeadItemCodeDesc;
    @SerializedName("PumpHeadSrNo")
    public String pumpHeadSrNo;
    @SerializedName("PumpSetItemCode")
    public String pumpSetItemCode;
    @SerializedName("PumpSetItemCodeDesc")
    public String pumpSetItemCodeDesc;
    @SerializedName("ProjectID")
    public String projectID;
    @SerializedName("ProjectCode")
    public String projectCode;
    @SerializedName("ProjectName")
    public String projectName;
    @SerializedName("Year")
    public String year;
    @SerializedName("InstallationID")
    public int installationID;
    @SerializedName("AssignedToID")
    public String assignedToID;
    @SerializedName("AssignedToName")
    public String assignedToName;
    @SerializedName("CustomerName")
    public String customerName;
    @SerializedName("SubInstaller")
    public String subInstaller;
    @SerializedName("HP")
    public String hP;
    @SerializedName("Head")
    public String head;
    @SerializedName("RID_InvoiceNo")
    public String rID_InvoiceNo;
    @SerializedName("RID_InvoiceDate")
    public String rID_InvoiceDate;
    @SerializedName("RID_PumpHeadType")
    public String rID_PumpHeadType;
    @SerializedName("RID_PumpType")
    public String rID_PumpType;
}
