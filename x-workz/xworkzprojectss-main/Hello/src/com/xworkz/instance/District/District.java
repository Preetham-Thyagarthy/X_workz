package com.xworkz.instance.District;

public class District {
    Company company = new Company();
    Education education = new Education();
    Experience experience = new Experience();
    Experiencedetail experienceDetail = new Experiencedetail();
    Housekeep houseKeep = new Housekeep();
    Transport transport = new Transport();
    Ward ward = new Ward();

    public District() {
        this.company.location = "Mangalore";
        this.company.numOfCompany = 120;
        this.company.compName = "Cognizant";

        this.education.location = "Shivamogga";
        this.education.qualification = "B.E";
        this.education.studyYears = 16;

        this.experience.exp = true;
        this.experience.compName = "Info";
        this.experience.year = 13;

        this.experienceDetail.place = "Banglalore";
        this.experienceDetail.noOfYear = 13;

        this.houseKeep.noOfPeople = 6;
        this.houseKeep.Name = "Kanyaka";

        this.transport.ways = "Little";

        this.ward.WardNum = 651;
        this.ward.wardDetails = "Given in file";
    }
}
