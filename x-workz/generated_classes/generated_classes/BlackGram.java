package generated_classes.generated_classes;

public class BlackGram {
    private String texture;
    private String expiryDays;
    private String type;

    public BlackGram(String texture, String expiryDays, String type) {
        this.texture = texture;
        this.expiryDays = expiryDays;
        this.type = type;
    }

    @Override
    public String toString() {
        return "texture=" + texture + ", " + "expiryDays=" + expiryDays + ", " + "type=" + type;
    }

    @Override
    public int hashCode() {
        System.out.println("Orginal Hash Code" + super.hashCode());
        return 10;
    }

    @Override
    public boolean equals(Object object) {
        if (object != null) {
            System.out.println("object is not null");
            if (object instanceof BlackGram) {
                BlackGram blackgram = this;
                BlackGram blackgram1 = (BlackGram) object;
                if (blackgram.texture.equals(blackgram1.texture) && blackgram.expiryDays.equals(blackgram1.expiryDays) && blackgram.type.equals(blackgram1.type)) {
                    return true;
                }
            }
        }
        return false;
    }
}