package com.company;

public class urban_planing extends Ukimet{//әкімдіктің қала құрылысы басқармасы
    public urban_planing(String name, int budget, int tender_amount) {
        super(name, budget, tender_amount);
    }// конструктор
    public int budget(){ // бюджетті есептеу
        this.budget = super.budget/2;
        return this.budget;
    }
    public int tender_amount(){// // тендерлер санын есептеу
        this.tender_amount = super.tender_amount/3;
        return this.tender_amount;
    }
    String tender_name;
    int tender_id;

    public String getTender_name() {
        return tender_name;
    }

    public void setTender_name(String tender_name) {
        this.tender_name = tender_name;
    }

    public int getTender_id() {
        return tender_id;
    }

    public void setTender_id(int tender_id) {
        this.tender_id = tender_id;
    }

    public urban_planing(String name, int budget, int tender_amount, String tender_name, int tender_id) {
        this(name, budget, tender_amount);
        this.tender_name = tender_name;
        this.tender_id = tender_id;
    }

}
