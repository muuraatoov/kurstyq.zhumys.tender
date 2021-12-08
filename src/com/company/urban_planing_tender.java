package com.company;

public abstract class urban_planing_tender extends urban_planing{// бұл класс дерексіз, өйткені бір бөлімнің көптеген тендерлері болуы мүмкін,
    // oop принципі абстракция бір кодтың қайталануын болдырмауға көмектеседі
    public urban_planing_tender(String name, int budget, int tender_amount) {
        super(name, budget, tender_amount);
    }

    public abstract int tender_draw(String tender_name, int tender_price);
}
