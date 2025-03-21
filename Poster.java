

class Poster {
    void showInfo() {
        System.out.println("Showing poster details...");
    }
}

class Theater {
    void show(Poster poster) {
        if (poster != null) {
            poster.showInfo();
        } else {
            System.out.println("No poster available.");
        }
    }
}