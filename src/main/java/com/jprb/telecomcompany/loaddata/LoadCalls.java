/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jprb.telecomcompany.loaddata;

import com.jprb.telecomcompany.dao.Call;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Juan_Pablo
 */
public class LoadCalls {

    public List<Call> getListClientCalls(Integer clientId) {

        List<Call> listClientCalls = new ArrayList<Call>();

        Call call = new Call();

        switch (clientId) {
            case 1:
                call.setIdCall(1);
                call.setIdClient(clientId);
                call.setDay("LU");
                call.setStartTimeH(9);
                call.setStartTimeM(10);
                call.setDuration(100);
                call.setInternational(true);
                listClientCalls.add(call);

                call = new Call();
                call.setIdCall(2);
                call.setIdClient(clientId);
                call.setDay("MA");
                call.setStartTimeH(13);
                call.setStartTimeM(10);
                call.setDuration(50);
                call.setInternational(true);
                listClientCalls.add(call);

                break;

            case 2:
                call.setIdCall(3);
                call.setIdClient(clientId);
                call.setDay("DO");
                call.setStartTimeH(9);
                call.setStartTimeM(10);
                call.setDuration(10);
                call.setInternational(false);
                listClientCalls.add(call);
                
                
                break;

            case 3:
                call.setIdCall(4);
                call.setIdClient(clientId);
                call.setDay("LU");
                call.setStartTimeH(9);
                call.setStartTimeM(10);
                call.setDuration(10);
                call.setInternational(true);
                listClientCalls.add(call);
                
                call = new Call();
                call.setIdCall(5);
                call.setIdClient(clientId);
                call.setDay("MA");
                call.setStartTimeH(13);
                call.setStartTimeM(00);
                call.setDuration(10);
                call.setInternational(true);
                listClientCalls.add(call);
                
                call = new Call();
                call.setIdCall(6);
                call.setIdClient(clientId);
                call.setDay("MA");
                call.setStartTimeH(18);
                call.setStartTimeM(59);
                call.setDuration(10);
                call.setInternational(true);
                listClientCalls.add(call);

                break;

            case 4:
                call.setIdCall(7);
                call.setIdClient(clientId);
                call.setDay("LU");
                call.setStartTimeH(00);
                call.setStartTimeM(00);
                call.setDuration(10);
                call.setInternational(false);
                listClientCalls.add(call);

                break;

        }

        return listClientCalls;

    }

}
