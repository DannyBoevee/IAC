import RestFullService.RestFullService;
import jdk.nashorn.internal.parser.JSONParser;
import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;

import javax.ws.rs.core.Response;

import java.io.StringReader;
import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by IT-Apps on 27/03/2017.
 */
public class UnitTest {

    JSONObject jObject = new JSONObject();
    JSONArray arr = new JSONArray();

    @Test
    public void testAmpToWatt() {

        RestFullService rest = new RestFullService();

        assertEquals(rest.AmpToWatt(2), "{\"Amp naar Watt\":[480]}");

        assertEquals(rest.AmpToWatt(0), "{\"Error\":[500,\"Getal mag niet 0 of kleiner zijn\"]}");

        assertEquals(rest.WattToAmp(240), "{\"Watt naar Amp\":[1]}");

        assertEquals(rest.WattToAmp(0), "{\"Error\":[500,\"Getal mag niet 0 of kleiner zijn\"]}");
    }
}
