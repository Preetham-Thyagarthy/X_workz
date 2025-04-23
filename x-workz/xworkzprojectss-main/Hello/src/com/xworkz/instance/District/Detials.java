package com.xworkz.instance.District;

public class Detials {
    public static void display() {
        District district = new District();

        System.out.println("Company Name is: " + district.company.compName);
        System.out.println("Company Location is: " + district.company.location);
        System.out.println("Number of Companies are: " + district.company.numOfCompany);

        System.out.println("Education Location: " + district.education.location);
        System.out.println("Qualification: " + district.education.qualification);
        System.out.println("Years of Study: " + district.education.studyYears);

        System.out.println("Has Experience of: " + district.experience.exp);
        System.out.println("Experience Company: " + district.experience.compName);
        System.out.println("Years of Experience: " + district.experience.year);

        System.out.println("Experience Place: " + district.experienceDetail.place);
        System.out.println("Years in Experience Detail: " + district.experienceDetail.noOfYear);

        System.out.println("HouseKeep People: " + district.houseKeep.noOfPeople);
        System.out.println("HouseKeep Name: " + district.houseKeep.Name);

        System.out.println("Transport Ways: " + district.transport.ways);

        System.out.println("Ward Number is: " + district.ward.WardNum);
        System.out.println("Ward Details are: " + district.ward.wardDetails);
    }
}
