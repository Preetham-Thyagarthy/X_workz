package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.flask.Boxcap;
import com.xworkz.inheritence.internal.flask.Flask;
import com.xworkz.inheritence.internal.flask.Cap;

public class FlaskRunner {
    public static void main(String[] args) {

        Flask flask =new Flask();
        flask.fill();
        flask.frozen();
        flask.glass();
        flask.milk();
        flask.water();
        System.out.println("**************************************");
        Flask flask1 =new Cap();
        flask1.fill();
        flask1.frozen();
        flask1.glass();
        flask1.milk();
        flask1.water();

        System.out.println("**************************************");
        Cap cap = new Cap();
        cap.fill();
        cap.frozen();
        cap.glass();
        cap.milk();
        cap.water();

        System.out.println("************Casting example**************");
        Boxcap boxcap=new Boxcap();
        boxcap.flasktype(flask);
        boxcap.flasktype(flask1);
        boxcap.flasktype(cap);

    }
}
