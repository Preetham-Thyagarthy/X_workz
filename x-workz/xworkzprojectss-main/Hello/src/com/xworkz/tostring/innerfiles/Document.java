package com.xworkz.tostring.innerfiles;

public class Document {
    private int weight;
    private String capacity;
    private double size;

    public Document(int weight, String capacity, double size) {
        this.weight = weight;
        this.capacity = capacity;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Document [weight=" + weight + ", capacity=" + capacity + ", size=" + size + "]";
    }
    @Override
    public int hashCode(){
        return 7797;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Document) {
                System.out.println("Ref is document,it will compare....");
                Document document = this;
                Document document1 = (Document) obj;
                if (document.capacity.equals(document1.capacity)) {
                    System.out.println("Both document are same");
                    return true;
                }
            }
        }
        return false;
    }
}
