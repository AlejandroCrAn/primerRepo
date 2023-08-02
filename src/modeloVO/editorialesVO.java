package modeloVO;

public class editorialesVO {
    private String numEditorial;
    private String nombreEditorial;

    public editorialesVO() {
    }

    public editorialesVO(String numEditorial, String nombreEditorial) {
        this.numEditorial = numEditorial;
        this.nombreEditorial = nombreEditorial;
    }

    public String getNumEditorial() {
        return numEditorial;
    }

    public void setNumEditorial(String numEditorial) {
        this.numEditorial = numEditorial;
    }

    public String getNombreEditorial() {
        return nombreEditorial;
    }

    public void setNombreEditorial(String nombreEditorial) {
        this.nombreEditorial = nombreEditorial;
    }
    
}
