/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.directv.telecomcompany.dao;

/**
 *
 * @author Juan_Pablo
 */
public class Client {

    Integer clientId;
    String fName;
    String sName;
    boolean newClient;

    public Client(Integer clientId, String fName, String sName, boolean newClient) {
        this.clientId = clientId;
        this.fName = fName;
        this.sName = sName;
        this.newClient = newClient;
    }

    public Client() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public boolean isNewClient() {
        return newClient;
    }

    public void setNewClient(boolean newClient) {
        this.newClient = newClient;
    }

}
