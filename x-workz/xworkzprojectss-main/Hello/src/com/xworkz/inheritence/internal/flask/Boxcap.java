package com.xworkz.inheritence.internal.flask;

public class Boxcap {
    public void flasktype(Flask flask) {
        flask.fill();
        flask.water();
        flask.milk();
        flask.glass();
        flask.frozen();

        if (flask instanceof Cap) {
            System.out.println("This is an instance of Cap");
            Cap cap = (Cap) flask;
            cap.shape();
        }
    }
}
