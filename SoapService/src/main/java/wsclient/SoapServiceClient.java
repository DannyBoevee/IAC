package wsclient;

import wsserver.*;
import wsserver.Fault;

/**
 * Created by IT-Apps on 27/03/2017.
 */
public class SoapServiceClient {
    public static void main(String[] args) {
        SoapServiceService service = new SoapServiceService();
        SoapService hello = service.getSoapServicePort();
        float text = 0f;
        try {
            text = hello.calculate("Watt", "Amp", 3);


        } catch (Fault_Exception e) {
            e.printStackTrace();
        }
        System.out.println(text);
    }
}
