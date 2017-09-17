
package Let;

/**
 *
 * @author JavaObuka
 */
public abstract class Osoba {
  
   String ime;
   String prezime;

    public Osoba(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
    }

    public abstract String getIme();
    public abstract void setIme(String ime) ;
    public abstract String getPrezime() ;
    public abstract void setPrezime(String prezime) ;
    
}
