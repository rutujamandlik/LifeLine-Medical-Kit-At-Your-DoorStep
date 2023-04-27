/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author divya
 */
public abstract class WorkRequest {

    private String msg;
    private UserAccount senderAccount;
    private UserAccount receiverAccount;
    private String status;
    private Date requestDate;
    private Date resolveDate;

    public WorkRequest() {
        requestDate = new Date();
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public UserAccount getSender() {
        return senderAccount;
    }

    public void setSender(UserAccount senderAccount) {
        this.senderAccount = senderAccount;
    }

    public UserAccount getReceiver() {
        return receiverAccount;
    }

    public void setReceiver(UserAccount receiverAccount) {
        this.receiverAccount = receiverAccount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }
        
    @Override
    public String toString(){
        return this.msg;
    }
}
