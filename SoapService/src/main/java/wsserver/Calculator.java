package wsserver;

/**
 * Created by IT-Apps on 27/03/2017.
 */
public class Calculator {

    public float AmpToWatt(float amp) {

        float result = amp * 240f;

        return result;

    }

    public float WattToAmp(float watt) {


        float result = watt / 240f;

        return result;

    }
}
