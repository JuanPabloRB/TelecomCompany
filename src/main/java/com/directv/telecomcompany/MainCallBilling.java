/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.directv.telecomcompany;

import com.directv.telecomcompany.dao.Call;
import com.directv.telecomcompany.dao.Client;
import com.directv.telecomcompany.loaddata.LoadCalls;
import com.directv.telecomcompany.loaddata.LoadClient;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Juan_Pablo
 */
public class MainCallBilling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Bienvendo al sistema de que le permitirá calcular el costo de su llamada");

        LoadClient loadClient = new LoadClient();
        LoadCalls loadCalls = new LoadCalls();

        String salir = "";
        do {

            System.out.println("Deseas continuar: c = continuar o s = salir ...");
            Scanner entradaEscaner = new Scanner(System.in);
            salir = entradaEscaner.nextLine();
            if (salir.equalsIgnoreCase("s")) {
                System.exit(0);
                break;
            }
            // Capturar el cliente
            System.out.println("Ingresar el clinete a consultar: ");
            String id = "";
            entradaEscaner = new Scanner(System.in);
            id = entradaEscaner.nextLine();

            try {
                Integer clientId = Integer.parseInt(id);
                //busco el cliente
                Client client = loadClient.getClient(clientId);
                //Se setea el id en 0 si no se encuentra el cliente
                if (client.getClientId() != 0) {
                    //busco las llamadas del cliente
                    List<Call> listCall = loadCalls.getListClientCalls(clientId);
                    double costCalls = 0;
                    //calculo el cosoto de las llamadas
                    BillingCalls billingCalls = new BillingCalls();

                    for (Call call : listCall) {

                        costCalls += billingCalls.calcCostCall(client, call);

                    }
                    //solo se consideran 2 decimales
                    DecimalFormat df = new DecimalFormat("#.##");
                    System.out.println("------------------------\n");
                    System.out.println("El costo de las llamadas para el cliente:");
                    System.out.println("------------------------");
                    System.out.println("\n ID del Cliente:" + client.getClientId());
                    System.out.println("\n Nombre:" + client.getfName());
                    System.out.println("\n Apellido:" + client.getsName());
                    System.out.println("------------------------");
                    System.out.println("\n Costo Total:$" + df.format(costCalls));
                    System.out.println("------------------------ \n");

                } else {
                    System.out.println("\n------------------------");
                    System.out.println("\n Cliente no encontrado");
                    System.out.println("\n------------------------\n");
                }

            } catch (NumberFormatException e) {

                System.out.println("Error: Id de Cliente no es numerico");
                break;

            }

        } while (!"s".equals(salir));

    }

}
