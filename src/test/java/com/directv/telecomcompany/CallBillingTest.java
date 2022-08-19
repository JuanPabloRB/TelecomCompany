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
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Juan_Pablo
 */
public class CallBillingTest {

    public CallBillingTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testCallBilling() {

        BillingCalls billingCalls = new BillingCalls();
        LoadCalls loadCalls = new LoadCalls();
        LoadClient loadClient = new LoadClient();
        double costCalls = 0;

        List<Call> listCall = loadCalls.getListClientCalls(3);
        Client client = loadClient.getClient(3);

        for (Call call : listCall) {

            costCalls += billingCalls.calcCostCall(client, call);

        }

        DecimalFormat df = new DecimalFormat("#.##");

        assertEquals("3", df.format(costCalls));

    }

}
