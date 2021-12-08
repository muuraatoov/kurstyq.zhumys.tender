package com.company;

public class education extends Ukimet{// әкімдіктің білім саласына жауапты мұрагері
    public education(String name, int budget, int tender_amount) {
        super(name, budget, tender_amount);
    }
    public int budget(){// бюджетті есептеу
        this.budget = super.budget/2;
        return this.budget;
    }
    public int tender_amount(){// тендерлер санын есептеу
        this.tender_amount = super.tender_amount/3;
        return this.tender_amount;
    }
    String tender_name;
    int tender_id;// алушылар мен орнатушылар
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

    public education(String name, int budget, int tender_amount, String tender_name, int tender_id) {//конструктор
        this(name, budget, tender_amount);
        this.tender_name = tender_name;
        this.tender_id = tender_id;
    }
}
