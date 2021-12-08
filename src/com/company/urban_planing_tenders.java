package com.company;

public class urban_planing_tenders extends urban_planing_tender{//абстрактілі сыныптан мұраланған класс
    public urban_planing_tenders(String name, int budget, int tender_amount) {
        super(name, budget, tender_amount);
    }

    @Override
    public int tender_draw(String tender_name, int tender_price) {
        if(tender_price > 1000000){
            throw new ArithmeticException("CORUPTION");// трай кэтч
        }
        System.out.println("success");
        return 1;
    }
}
