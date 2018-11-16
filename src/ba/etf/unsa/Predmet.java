package ba.etf.unsa;
import java.util.List;
import java.util.ArrayList;

public class Predmet {
    private String imePredmeta;
    private int ects, brojSemestra;
    private final int MAX_BROJ_STUDENATA = 60;
    private List<Student> studentiNaPredmetu = new ArrayList<>();

    public Predmet(String imePredmeta, int ects, int brojSemestra, List<Student> studenti) {
        setImePredmeta(imePredmeta);
        setEcts(ects);
        setBrojSemestra(brojSemestra);
        setStudentiNaPredmetu(studenti);
    }

}
