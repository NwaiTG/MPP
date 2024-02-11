package Clone_Test;

public class Shadow_Clone implements Cloneable{
    private int value;

    public Shadow_Clone(int value) {
        this.value = value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // Perform a shallow copy
        return super.clone();
    }
}
