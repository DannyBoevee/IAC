import org.junit.jupiter.api.Test;
import wsclient.Fault_Exception;
import wsclient.SoapService;
import wsserver.Calculator;
import wsserver.Fault;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by IT-Apps on 27/03/2017.
 */
public class SoapServiceTest {
    @Test
    public void TestSoap() {
        Calculator cal = new Calculator();

        assertEquals(cal.AmpToWatt(2f), 480);

        assertEquals(cal.WattToAmp(240f), 1);
    }
}
