package Stream_Lab3_Mailing;

public class UPS implements ICarrier {

    public double calRate(double weight, String zone){
        return 0.45 * weight;
    }
}
