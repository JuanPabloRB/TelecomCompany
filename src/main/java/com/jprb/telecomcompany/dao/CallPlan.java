/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jprb.telecomcompany.dao;

/**
 *
 * @author Juan_Pablo
 */
public class CallPlan {

    Integer idPlan;
    Float cost;
    Integer typeOfPlan;

    public Integer getIdPlan() {
        return idPlan;
    }

    public void setIdPlan(Integer idPlan) {
        this.idPlan = idPlan;
    }

    public Float getCost() {
        return cost;
    }

    public void setCost(Float cost) {
        this.cost = cost;
    }

    public Integer getTypeOfPlan() {
        return typeOfPlan;
    }

    public void setTypeOfPlan(Integer typeOfPlan) {
        this.typeOfPlan = typeOfPlan;
    }

}
