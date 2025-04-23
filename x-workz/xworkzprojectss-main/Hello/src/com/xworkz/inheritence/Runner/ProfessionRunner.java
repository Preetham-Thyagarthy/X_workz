package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.profession.Engineer;
import com.xworkz.inheritence.internal.profession.Profession;

public class ProfessionRunner {
    public static void main(String[] args) {


        Profession profession=new Profession();
        profession.work();
        profession.salary();
        profession.skills();
        profession.education();

        System.out.println("**************************************");
        Profession profession1 =new Engineer();
        profession1.work();
        profession1.salary();
        profession1.skills();
        profession1.education();

        System.out.println("-----------");
        Engineer engineer = new Engineer();
        engineer.work();
        engineer.salary();
        engineer.skills();
        engineer.education();
    }
}
