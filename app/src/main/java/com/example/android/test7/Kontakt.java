package com.example.android.test7;

public class Kontakt {

    public enum TIP_KONTAKTA {EMAIL, PHONE, SKYPE};

    private String ime, vrednost;
    private TIP_KONTAKTA tipKontakta;

    public Kontakt() {
    }

    public Kontakt(String ime, String vrednost, TIP_KONTAKTA tipKontakta) {
        this.ime = ime;
        this.vrednost = vrednost;
        this.tipKontakta = tipKontakta;
    }

    public String getIme() {
        return ime;
    }

    public String getVrednost() {
        return vrednost;
    }

    public TIP_KONTAKTA getTipKontakta() {
        return tipKontakta;
    }
}
