package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.skill.Skill;
import com.xworkz.inheritence.internal.skill.Java;

public class SkillRunner {
    public static void main(String[] args) {


        Skill lang = new Skill();
        lang.speak();
        lang.write();
        lang.communicate();
        lang.grammar();
        lang.origin();
        System.out.println("**************************************");
        Skill lang1 = new Java();
        lang1.speak();
        lang1.write();
        lang1.communicate();
        lang1.grammar();
        lang1.origin();

        System.out.println("**************************************");
        Java java=new Java();
        java.speak();
        java.write();
        java.communicate();
        java.grammar();
        java.origin();

        System.out.println("**************************************");


    }
}
