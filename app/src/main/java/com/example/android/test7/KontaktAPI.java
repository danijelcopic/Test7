package com.example.android.test7;

import java.util.LinkedList;

public class KontaktAPI {

    public static LinkedList<Kontakt> getMyContacts() {

        LinkedList<Kontakt> list = new LinkedList<>();

        list.add(new Kontakt("Ivana1 Ivanic", "111111111", Kontakt.TIP_KONTAKTA.PHONE));
        list.add(new Kontakt("Ivana2 Ivanic", "11122@dkdjk", Kontakt.TIP_KONTAKTA.EMAIL));
        list.add(new Kontakt("Ivana3 Ivanic", "cjojoisjoi", Kontakt.TIP_KONTAKTA.SKYPE));
        list.add(new Kontakt("Ivana4 Ivanic", "12222211", Kontakt.TIP_KONTAKTA.PHONE));
        list.add(new Kontakt("Ivana5 Ivanic", "1113333111", Kontakt.TIP_KONTAKTA.PHONE));
        list.add(new Kontakt("Ivana6 Ivanic", "11dkosdko", Kontakt.TIP_KONTAKTA.SKYPE));
        list.add(new Kontakt("Ivana7 Ivanic", "1114444111", Kontakt.TIP_KONTAKTA.PHONE));
        list.add(new Kontakt("Ivana8 Ivanic", "1155555111", Kontakt.TIP_KONTAKTA.PHONE));
        list.add(new Kontakt("Ivana9 Ivanic", "11999@ui11", Kontakt.TIP_KONTAKTA.EMAIL));
        list.add(new Kontakt("Ivana10 Ivanic", "1@koko.dd1", Kontakt.TIP_KONTAKTA.EMAIL));
        list.add(new Kontakt("Ivana11 Ivanic", "16666661", Kontakt.TIP_KONTAKTA.PHONE));
        list.add(new Kontakt("Ivana12 Ivanic", "1177777711", Kontakt.TIP_KONTAKTA.PHONE));



        return list;

    }
}
