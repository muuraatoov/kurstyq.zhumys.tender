package com.company;

public class Ukimet {
    //әкімдік класс
    String name;//үкіметтін аты
    int budget;//бюджет
    int tender_amount;//тендер саны

    public Ukimet(String name, int budget, int tender_amount) { // класстын конструкторы
        this.name = name;
        this.budget = budget;
        this.tender_amount = tender_amount;
    }

    // геттер жане сэттер
    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public int getTender_amount() {
        return tender_amount;
    }

    public void setTender_amount(int tender_amount) {
        this.tender_amount = tender_amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
