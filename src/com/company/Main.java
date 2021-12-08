package com.company;

public class Main {
        public static void main(String[] args) {
            Ukimet astana = new Ukimet("Astana",1800000,2);
            urban_planing d = new urban_planing("Urban", astana.budget/2, astana.tender_amount/2);
            education z = new education("education", astana.budget- d.budget, astana.tender_amount- d.tender_amount);
            education_tenders school = new education_tenders("school", z.budget, z.tender_amount);
            school.tender_draw("School",1000500);
        }
    }

