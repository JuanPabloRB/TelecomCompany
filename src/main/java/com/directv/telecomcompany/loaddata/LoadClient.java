/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.directv.telecomcompany.loaddata;

import com.directv.telecomcompany.dao.Client;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Juan_Pablo
 */
public class LoadClient {

  
    public Client getClient(Integer clientId) {

        Client client = new Client();
        try {
            switch (clientId) {
                case 1: //Reguar Calls
                    client.setClientId(clientId);
                    client.setfName("Juan");
                    client.setsName("Perez");
                    client.setNewClient(true);
                    break;
                case 2: //late night calls
                    client.setClientId(clientId);
                    client.setfName("Lorena");
                    client.setsName("Martinez");
                    client.setNewClient(false);
                    break;
                case 3: // weekend calls
                    client.setClientId(clientId);
                    client.setfName("Pedro");
                    client.setsName("Rodriguez");
                    client.setNewClient(false);
                    break;
                case 4: // weekend calls
                    client.setClientId(clientId);
                    client.setfName("Jose");
                    client.setsName("Portela");
                    client.setNewClient(false);
                    break;
                default: //Cliente no encontrado
                    client.setClientId(0);
                    break;

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return client;

    }

}
