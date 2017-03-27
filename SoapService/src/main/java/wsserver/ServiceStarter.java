package wsserver;

import javax.xml.ws.Endpoint;

/**
 * Created by IT-Apps on 27/03/2017.
 */
public class ServiceStarter {

    public static void main(String[] args) {
        String url = "http://localhost:1213/hello";
        Endpoint.publish(url, new SoapService());
        System.out.println("Service started @ " + url);
    }
}
