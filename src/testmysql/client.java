package testmysql;

public class client {

    private String nroClie;
    private String nomClie;
    private String prenomClie;
    private String adresseClie;
    private String villeClie;
    private String nroTelClie;
    private String titreClie;
    private String passwdClient;

    public client(String nroClie, String nomClie, String prenomClie, String adresseClie, String villeClie,
            String nroTelClie, String titreClie, String passwdClient) {
        this.nroClie = nroClie;
        this.nomClie = nomClie;
        this.prenomClie = prenomClie;
        this.adresseClie = adresseClie;
        this.villeClie = villeClie;
        this.nroTelClie = nroTelClie;
        this.titreClie = titreClie;
        this.passwdClient = passwdClient;
    }

    public String getNroClie() {
        return nroClie;
    }

    public void setNroClie(String nroClie) {
        this.nroClie = nroClie;
    }

    public String getNomClie() {
        return nomClie;
    }

    public void setNomClie(String nomClie) {
        this.nomClie = nomClie;
    }

    public String getPrenomClie() {
        return prenomClie;
    }

    public void setPrenomClie(String prenomClie) {
        this.prenomClie = prenomClie;
    }

    public String getAdresseClie() {
        return adresseClie;
    }

    public void setAdresseClie(String adresseClie) {
        this.adresseClie = adresseClie;
    }

    public String getVilleClie() {
        return villeClie;
    }

    public void setVilleClie(String villeClie) {
        this.villeClie = villeClie;
    }

    public String getNroTelClie() {
        return nroTelClie;
    }

    public void setNroTelClie(String nroTelClie) {
        this.nroTelClie = nroTelClie;
    }

    public String getTitreClie() {
        return titreClie;
    }

    public void setTitreClie(String titreClie) {
        this.titreClie = titreClie;
    }

    public String getPasswdClient() {
        return passwdClient;
    }

    public void setPasswdClient(String passwdClient) {
        this.passwdClient = passwdClient;
    }

    @Override
    public String toString() {
        return "Client [nroClie=" + nroClie + ", nomClie=" + nomClie + ", prenomClie=" + prenomClie
                + ", adresseClie=" + adresseClie + ", villeClie=" + villeClie + ", nroTelClie=" + nroTelClie
                + ", titreClie=" + titreClie + ", passwdClient=" + passwdClient + "]";
    }
}
