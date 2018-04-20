package iks;

import java.math.BigInteger;

/**
 * Created by kiiv0317 on 22.12.2017.
 */
public class HistoryItem {
    private String userName;
    private BigInteger userId;
    private String changeDate;
    private String createdWhen;
    private String message;
    private String objectName;
    private BigInteger objectId;
    private String objectTypeName;
    private String oldParamValue;
    private String newParamValue;

    public HistoryItem() {
    }

    public String getUserName() {
        return userName;
    }

    public BigInteger getUserId() {
        return userId;
    }

    public String getChangeDate() {
        return changeDate;
    }

    public String getCreatedWhen() {
        return createdWhen;
    }

    public String getMessage() {
        return message;
    }

    public String getObjectName() {
        return objectName;
    }

    public BigInteger getObjectId() {
        return objectId;
    }

    public String getObjectTypeName() {
        return objectTypeName;
    }

    public String getOldParamValue() {
        return oldParamValue;
    }

    public String getNewParamValue() {
        return newParamValue;
    }

    public HistoryItem setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public HistoryItem setUserId(BigInteger userId) {
        this.userId = userId;
        return this;
    }

    public HistoryItem setChangeDate(String changeDate) {
        this.changeDate = changeDate;
        return this;
    }

    public HistoryItem setCreatedWhen(String createdWhen) {
        this.createdWhen = createdWhen;
        return this;
    }

    public HistoryItem setMessage(String message) {
        this.message = message;
        return this;
    }

    public HistoryItem setObjectName(String objectName) {
        this.objectName = objectName;
        return this;
    }

    public HistoryItem setObjectId(BigInteger objectId) {
        this.objectId = objectId;
        return this;
    }

    public HistoryItem setObjectTypeName(String objectTypeName) {
        this.objectTypeName = objectTypeName;
        return this;
    }

    public HistoryItem setOldParamValue(String oldParamValue) {
        this.oldParamValue = oldParamValue;
        return this;
    }

    public HistoryItem setNewParamValue(String newParamValue) {
        this.newParamValue = newParamValue;
        return this;
    }
}
