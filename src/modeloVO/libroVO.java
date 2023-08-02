package modeloVO;

public class libroVO {
    private String claveLibro;
    private String nombreLibro;
    private String ISBN;
    private int numPaginas;
    private String claveEditorial;

    public libroVO() {
    }

    public libroVO(String claveLibro, String nombreLibro, String ISBN, int numPaginas, String claveEditorial) {
        this.claveLibro = claveLibro;
        this.nombreLibro = nombreLibro;
        this.ISBN = ISBN;
        this.numPaginas = numPaginas;
        this.claveEditorial = claveEditorial;
    }

    public String getClaveLibro() {
        return claveLibro;
    }

    public void setClaveLibro(String claveLibro) {
        this.claveLibro = claveLibro;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public String getClaveEditorial() {
        return claveEditorial;
    }

    public void setClaveEditorial(String claveEditorial) {
        this.claveEditorial = claveEditorial;
    }
    
}
