

 class DisplayRunner {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Display display = new Display();

        shop.ads(display); // Valid case
        shop.ads(null); // Null case
    }
}
