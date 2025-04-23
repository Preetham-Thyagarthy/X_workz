package com.xworkz.tostring.innerfiles;

public class Faucet {
    private int thickness;
    private String texture;
    private double range;

    public Faucet(int thickness, String texture, double range) {
        this.thickness = thickness;
        this.texture = texture;
        this.range = range;
    }

    @Override
    public String toString() {
        return "Faucet [thickness=" + thickness + ", texture=" + texture + ", range=" + range + "]";
    }
    @Override
    public int hashCode(){
        return 801023;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Faucet) {
                System.out.println("Ref is faucet,it will compare....");
                Faucet faucet = this;
                Faucet faucet1 = (Faucet) obj;
                if (faucet.texture.equals(faucet1.texture) && faucet.range== faucet1.range) {
                    System.out.println("Both faucet are same");
                    return true;
                }
            }
        }
        return false;
    }
}
