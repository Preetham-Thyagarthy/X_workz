package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.academy.Academy;
import com.xworkz.inheritence.internal.academy.Harvard;
import com.xworkz.inheritence.internal.academy.Institute;

public class AcademyRunner {
    public static void main(String[] args) {

        Academy acc = new Academy();
        acc.education();
        acc.research();
        acc.students();
        acc.faculty();
        acc.campus();
        System.out.println("**************************************");

        Academy academy = new Harvard();
        academy.education();
        academy.research();
        academy.students();
        academy.faculty();
        academy.campus();

        System.out.println("**************************************");

        Harvard harvard = new Harvard();
        harvard.education();
        harvard.research();
        harvard.students();
        harvard.faculty();
        harvard.campus();

        System.out.println("************Casting****************");
        Institute institute=new Institute();
        institute.device(acc);
        institute.device(academy);
        institute.device(harvard);

    }
}
