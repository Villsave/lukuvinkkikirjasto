package lukuvinkkikirjasto;

import java.time.LocalDate;
import java.util.ArrayList;

public class Lukuvinkki {

    private Integer id;
    private final String otsikko;
    private ArrayList<String> tagit;
    private String linkki;
    private LocalDate read;

    public Lukuvinkki(final Integer id, final String otsikko) {
        this.id = id;
        this.otsikko = otsikko;
        this.tagit = new ArrayList<>();
        this.linkki = "Ei lisättyä linkkiä";

    }

    public LocalDate getRead() {
        return read;
    }

    public void setRead(LocalDate read) {
        this.read = read;
    }

    public void lisaaTagi(final String tag) {
        this.tagit.add(tag);
    }

    public void poistaTagi(final String tag) {
        this.tagit.remove(tag);
    }

    public ArrayList<String> getTagit() {
        return this.tagit;
    }

    public void lisaaLinkki(final String link) {
        this.linkki = link;
    }
    
    public void poistaLinkki() {
        this.linkki = "Ei lisättyä linkkiä";
    }

    public String getLinkki() {
        return this.linkki;
    }

    public String getOtsikko() {
        return this.otsikko;
    }

    public void setTagit(final ArrayList<String> lukuvinkinTagit) {
        this.tagit = lukuvinkinTagit;
    }

    public int getId() {
        return this.id;
    }
    
    public String toString() {
        String vinkki = otsikko + "\n" + linkki + "\n";
        if (tagit.isEmpty()) {
            vinkki += "Ei tageja";
        } else {
            for (String t: tagit) {
                vinkki += "[" + t + "] ";
            }
        }
        return vinkki;
    }
}
