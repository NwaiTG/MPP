package Stream_Lab3_Mailing;

public class Package {
    String desc;
    double weight;
    String zone;

    public Package(String desc, double weight, String zone){
        this.desc = desc;
        this.weight = weight;
        this.zone = zone;
    }

    public String getDesc() {
        return desc;
    }

    public double getWeight() {
        return weight;
    }

    public String getZone() {
        return zone;
    }
}
