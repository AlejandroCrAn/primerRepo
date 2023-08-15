package modeloVO;

public class editorialesVO {

    private int numEditorial;
    private String nombreEditorial;
    private String claveEditorial;

    public editorialesVO() {
    }

    public editorialesVO(int numEditorial, String nombreEditorial, String claveEditorial) {
        this.numEditorial = numEditorial;
        this.nombreEditorial = nombreEditorial;
        this.claveEditorial = claveEditorial;
    }

    public int getNumEditorial() {
        return numEditorial;
    }

    public void setNumEditorial(int numEditorial) {
        this.numEditorial = numEditorial;
    }

    public String getNombreEditorial() {
        return nombreEditorial;
    }

    public void setNombreEditorial(String nombreEditorial) {
        this.nombreEditorial = nombreEditorial;
    }

    public String getClaveEditorial() {
        return claveEditorial;
    }

    public void setClaveEditorial(String claveEditorial) {
        this.claveEditorial = claveEditorial;
    }

}
