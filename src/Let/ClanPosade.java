
package Let;

/**
 *
 * @author JavaObuka
 */
public class ClanPosade extends Osoba{
    String uloga;
    int godinaStaza;

    public ClanPosade(String uloga, int godinaStaza, String ime, String prezime) {
        super(ime, prezime);
        this.uloga = uloga;
        this.godinaStaza = godinaStaza;
    }

    @Override
    public String getIme() {
        return ime;
    }

    @Override
    public void setIme(String ime) {
        this.ime = ime;
    }

    @Override
    public String getPrezime() {
        return prezime;
    }

    @Override
    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }
    
}
