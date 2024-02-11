package Lab3_Mailing;

public class USMail implements ICarrier{

    public double calRate(double weigh, String zone){
        if(weigh < 3){
            return weigh * 1;
        }
        else
            return weigh * 0.55;
    }
}
