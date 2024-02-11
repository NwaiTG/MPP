package Lab3_Mailing;

import java.util.List;

public class FedEx implements ICarrier{

    public double calRate(double weight, String zone){
        if(zone.equals("IA") || zone.equals("MT") || zone.equals("OR") || zone.equals("CA")){
            return 0.35 * weight;
        }
        else if(zone.equals("TX") || zone.equals("UT")){
            return 0.3 * weight;
        }
        else if(zone.equals("FL") || zone.equals("MA") || zone.equals("OH")){
            return 0.55 * weight;
        }
        else
            return 0.43 * weight;

    }
}
