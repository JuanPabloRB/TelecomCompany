/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.directv.telecomcompany.loaddata;

import com.directv.telecomcompany.dao.CallPlan;


/**
 *
 * @author Juan_Pablo
 * 
 *    In their call plans there are different types of tariff:
 *       1- regular calls at 0.05 pence per minute
 *       2- late night calls (for example from 10pm to 4am) at 0.02 pence per minute
 *       3- weekend calls at 0.01 pence per minute
 * 
 * 
 */
public class LoadCallPlan {
    

    public CallPlan getTariff (Integer typeOfPlan){
        
        CallPlan callPlan = new CallPlan();
        
        switch(typeOfPlan){
            case 1: //Reguar Calls
                callPlan.setIdPlan(1);
                callPlan.setCost(Float.valueOf("0.05"));
                callPlan.setTypeOfPlan(1);
                break;
            case 2: //late night calls
                callPlan.setIdPlan(1);
                callPlan.setCost(Float.valueOf("0.02"));
                callPlan.setTypeOfPlan(1);
                break;
            case 3: // weekend calls
                callPlan.setIdPlan(1);
                callPlan.setCost(Float.valueOf("0.01"));
                callPlan.setTypeOfPlan(1);
                break;
            default:
                callPlan.setIdPlan(0);
                callPlan.setCost(Float.valueOf("0.0"));
                callPlan.setTypeOfPlan(0);
                break;
                
        }
        
        return callPlan;
        
    
    }
    
}

