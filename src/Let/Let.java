package Let;

import static Let.Klasa.EKONOMSKA;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author JavaObuka
 */
public class Let {

    String datum;
    String relacija;
    int kapacitetAviona=150;
    ArrayList<Osoba> spisakOsoba = new ArrayList<>();

    public Sediste ucitajSediste(int brojSedista, Klasa klasa) {
        Sediste s = new Sediste(brojSedista, klasa);
        return s;
    }

    public Putnik ucitajPutnika(int brojPasosa, Sediste sediste, String ime, String prezime) {
        Putnik p = new Putnik(brojPasosa, sediste, ime, prezime);
        return p;
    }

    public ClanPosade ucitajClanaPosade(String uloga, int godinaStaza, String ime, String prezime) {
        ClanPosade clanp = new ClanPosade(uloga, godinaStaza, ime, prezime);

        return clanp;

    }

    public String dodajClanaPosade(ClanPosade... cp) {
        StringBuilder sb = new StringBuilder();
        for (ClanPosade cp1 : cp) {
            this.spisakOsoba.add(cp1);
        }
        for (int i = 0; i < spisakOsoba.size(); i++) {
            sb.append(spisakOsoba.get(i).getIme()).append(" ").append(spisakOsoba.get(i).getPrezime()).append(" \n");
        }
        return sb.toString();
    }
    
    public String dodajPutnika(Putnik... p) {
        StringBuilder sb = new StringBuilder();
        for (Putnik p1 : p) {
            this.spisakOsoba.add(p1);
        }
        for (int i = 0; i < spisakOsoba.size(); i++) {
            sb.append(spisakOsoba.get(i).getIme()).append(" ").append(spisakOsoba.get(i).getPrezime()).append(" \n");
        }
        return sb.toString();
    }

    

    public static void main(String[] args) {
        Let l = new Let();

        Putnik putnik = l.ucitajPutnika(121, l.ucitajSediste(131, EKONOMSKA), "Ivan", "Rajic");
        Putnik putnik1 = l.ucitajPutnika(121, l.ucitajSediste(99, Klasa.BIZNIS), "Petar", "Petrovic");

        ClanPosade clanp = l.ucitajClanaPosade("pilot", 12, "Marko", "Markovic");
        ClanPosade clanp1 = l.ucitajClanaPosade("kopilot", 12, "Filip", "Markovic");

        //String spisakOsoba=l.dodajClanaPosade(cp1,cp).concat(l.dodajPutnika(putnik));
        ArrayList<String> spisakOsoba = new ArrayList<>();
        
        spisakOsoba.add(l.dodajClanaPosade(clanp1));
        spisakOsoba.add(l.dodajPutnika(putnik));
        
        System.out.println(spisakOsoba);
        //  l.spisakOsoba.add(cp);
        //  System.out.println(putnik.brojPasosa + " " + putnik.ime + " " + " " + putnik.prezime + " " + " " + putnik.sediste.klasa);
        //  System.out.println(cp.godinaStaza + " " + cp.uloga + " " + cp.ime + " " + cp.prezime);
       // System.out.println(l.dodajClanaPosade(cp1,cp));
        //System.out.println(l.dodajPutnika(putnik,putnik1));
    }

}
