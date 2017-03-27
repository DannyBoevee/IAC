package RestFullService;

import org.json.*;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by IT-Apps on 27/03/2017.
 */

@Path("/calculate")
public class RestFullService {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getMessage() {
        return "Hello world!";
    }

    @GET
    @Path("Amp/Watt/{amp}")
    public String AmpToWatt(@PathParam("amp") int amp) {

        JSONObject jObject = new JSONObject();
        JSONArray arr = new JSONArray();

        if (amp <= 0) {
            String error = Error("Getal mag niet 0 of kleiner zijn", 500);
            return error;
        }

        float result = (float)amp * 240f;

        arr.put(result);

        System.out.println(result);
        jObject.put("Amp naar Watt", arr);

        return jObject.toString();

    }

    @GET
    @Path("Watt/Amp/{watt}")
    public String WattToAmp(@PathParam("watt") int watt) {

        JSONObject jObject = new JSONObject();
        JSONArray arr = new JSONArray();

        if (watt <= 0) {
            String error = Error("Getal mag niet 0 of kleiner zijn", 500);
            return error;
        }

        float result = (float)watt / 240f;

        arr.put(result);

        System.out.println(result);
        jObject.put("Watt naar Amp", arr);

        return jObject.toString();

    }

    public String Error(String message, int code){
        JSONObject jObject = new JSONObject();

        JSONArray error = new JSONArray();
        error.put(code);
        error.put(message);
        jObject.put("Error", error);

        return jObject.toString();
    }
}
