package testmysql;

public class Commande {
    private String nroCmde;
    private String dateCmde;
    private String heureCmde;
    private String nroClieCmde;
    private String nroLivrCmde;

    public Commande(String nroCmde, String dateCmde, String heureCmde, String nroClieCmde, String nroLivrCmde) {
        this.nroCmde = nroCmde;
        this.dateCmde = dateCmde;
        this.heureCmde = heureCmde;
        this.nroClieCmde = nroClieCmde;
        this.nroLivrCmde = nroLivrCmde;
    }

    // Getters and setters
    public String getNroCmde() {
        return nroCmde;
    }

    public void setNroCmde(String nroCmde) {
        this.nroCmde = nroCmde;
    }

    public String getDateCmde() {
        return dateCmde;
    }

    public void setDateCmde(String dateCmde) {
        this.dateCmde = dateCmde;
    }

    public String getHeureCmde() {
        return heureCmde;
    }

    public void setHeureCmde(String heureCmde) {
        this.heureCmde = heureCmde;
    }

    public String getNroClieCmde() {
        return nroClieCmde;
    }

    public void setNroClieCmde(String nroClieCmde) {
        this.nroClieCmde = nroClieCmde;
    }

    public String getNroLivrCmde() {
        return nroLivrCmde;
    }

    public void setNroLivrCmde(String nroLivrCmde) {
        this.nroLivrCmde = nroLivrCmde;
    }

    @Override
    public String toString() {
        return "Commande{" +
                "nroCmde='" + nroCmde + '\'' +
                ", dateCmde='" + dateCmde + '\'' +
                ", heureCmde='" + heureCmde + '\'' +
                ", nroClieCmde='" + nroClieCmde + '\'' +
                ", nroLivrCmde='" + nroLivrCmde + '\'' +
                '}';
    }
}

