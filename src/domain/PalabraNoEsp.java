package domain;

public class PalabraNoEsp extends Palabra {
    private String pronunciacionEspaniol;

    public PalabraNoEsp(String palabra, String significado,
                        String idioma, String pronunciacionEspaniol) {
        super(palabra, significado, idioma);
        this.pronunciacionEspaniol = pronunciacionEspaniol;
    }

    public String getPronunciacionEspaniol() {
        return pronunciacionEspaniol;
    }
}