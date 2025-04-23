package com.xworkz.tostring.innerfiles;

public class Server {
    private int width;
    private String power;
    private double shape;

    public Server(int width, String power, double shape) {
        this.width = width;
        this.power = power;
        this.shape = shape;
    }

    @Override
    public String toString() {
        return "Server [width=" + width + ", power=" + power + ", shape=" + shape + "]";
    }

    @Override
    public int hashCode(){
        return 9600;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Server) {
                System.out.println("Ref is server,it will compare....");
                Server server = this;
                Server server1 = (Server) obj;
                if (server.width== server1.width && server.power.equals(server1.power) && server.shape== server1.shape) {
                    System.out.println("Both server are same");
                    return true;
                }
            }
        }
        return false;
    }
}
