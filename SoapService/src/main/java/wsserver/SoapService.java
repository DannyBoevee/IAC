package wsserver;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * Created by IT-Apps on 27/03/2017.
 */

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class SoapService {
    public float Calculate(String from, String to, float value) throws Fault {

        if (from.isEmpty() || to.isEmpty()) {
            throw new Fault("Alle velden moet ingevult zijn");
        }

        Calculator cal = new Calculator();

        if (from.equals("Watt") && to.equals("Amp")) {
            return cal.WattToAmp(value);
        }

        if (from.equals("Amp") && to.equals("Watt")) {
            return cal.AmpToWatt(value);
        }

        return 0f;

    }

}

