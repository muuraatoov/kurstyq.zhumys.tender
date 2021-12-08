package com.company;

public class education_tenders extends education_tender{//абстрактілі сыныптан мұраланған класс
    public education_tenders(String name, int budget, int tender_amount) {
        super(name, budget, tender_amount);
    }
    @Override
    public int tender_draw(String tender_name, int tender_price) {
        if(tender_price > 1000000){// трай-кэтч
            throw new ArithmeticException("corruption");
        }
        return 1;
    }
}
