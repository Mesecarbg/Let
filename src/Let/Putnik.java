
package Let;

/**
 *
 * @author JavaObuka
 */
public class Putnik extends Osoba{
    int brojPasosa;
    Sediste sediste;

    public Putnik(int brojPasosa, Sediste sediste, String ime, String prezime) {
        super(ime, prezime);
        this.brojPasosa = brojPasosa;
        this.sediste = sediste;
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
