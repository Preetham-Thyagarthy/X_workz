package com.xworkz.inheritence.internal.academy;

public class Institute {
    public void device(Academy academy){
        academy.education();
        academy.research();
        academy.students();
        academy.faculty();
        academy.campus();

        if(academy instanceof Harvard){
            System.out.println("Academy instance of Hardward");
            Harvard harvard=(Harvard) academy;
            harvard.activity();
        }
    }
}
