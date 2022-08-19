/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.directv.telecomcompany;

import com.directv.telecomcompany.dao.Call;
import com.directv.telecomcompany.dao.CallPlan;
import com.directv.telecomcompany.dao.Client;
import com.directv.telecomcompany.loaddata.LoadCallPlan;

/**
 *
 * @author Juan_Pablo
 */
public class BillingCalls {

    /**
     * Calcula el costo de una llamada
     *
     * 1- regular calls at 0.05 pence per minute 2- late night calls (for
     * example from 10pm to 4am) at 0.02 pence per minute 3- weekend calls at
     * 0.01 pence per minute
     *
     * day = día de la semana.Los valores permitidos son: Lu, Ma, Mi, Ju, Vi,
     * Sa, Do hora = hora de la llamada en formato de 24 horas duration = tiempo
     * que duró la llamada
     *
     * @param client Información del cliente se usará para determinar si es un
     * nuevo cliente
     * @param call se usará para calcular el costo de la llamada basado en su
     * duración y el momento que se realizó
     * @return costo de la llamada para los parametros dados
     */
    public static double calcCostCall(Client client, Call call) {

        LoadCallPlan loadCallPlan = new LoadCallPlan();
        CallPlan callPlan = new CallPlan();
        int h = call.getStartTimeH();
        int m = call.getStartTimeM(); //No se utilizan solo se tienen en cuenta por si el horario nocturno no fuera en de 22 a 4 en punto
        String day = call.getDay();
        double tariff;
        double costCall;

        //Tarifa de fin de semana corresponde al tipo de tarifa 3
        if (day.equalsIgnoreCase("SA") || day.equalsIgnoreCase("DO")) {
            //Sabados y Domingos
            callPlan = loadCallPlan.getTariff(3);
            tariff = callPlan.getCost();
        } else {
            //De Luneas a Viernes nuevos clientes
            //Calculo de nuevos clientes
            if (client.isNewClient()) {
                callPlan = loadCallPlan.getTariff(2);
                tariff = callPlan.getCost();
            } else {
                //Calculo para llamadas regulares
                if (h >= 4 && h <= 22) {
                    callPlan = loadCallPlan.getTariff(1);
                    tariff = callPlan.getCost();
                } else {
                    //Calculo para llmadas nocturnas clientes regulares   
                    callPlan = loadCallPlan.getTariff(2);
                    tariff = callPlan.getCost();
                }
            }

        }

        costCall = (tariff * call.getDuration());

        //International calls double the rate per minute
        if (call.isInternational()) {
            costCall = costCall * 2;
        }

        return costCall;
    }

}
