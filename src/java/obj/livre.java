package obj;

public class livre {

    private String titreLivre;
    private String sousTitreLivre;
    private int quantiteStockLivre;

    public livre() {
    }

    public livre(String titreLivre, String sousTitreLivre, int quantiteStockLivre) {
        this.titreLivre = titreLivre;
        this.sousTitreLivre = sousTitreLivre;
        this.quantiteStockLivre = quantiteStockLivre;
    }

    public String getTitreLivre() {
        return titreLivre;
    }

    public void setTitreLivre(String titreLivre) {
        this.titreLivre = titreLivre;
    }

    public String getSousTitreLivre() {
        return sousTitreLivre;
    }

    public void setSousTitreLivre(String sousTitreLivre) {
        this.sousTitreLivre = sousTitreLivre;
    }

    public int getQuantiteStockLivre() {
        return quantiteStockLivre;
    }

    public void setQuantiteStockLivre(int quantiteStockLivre) {
        this.quantiteStockLivre = quantiteStockLivre;
    }

    @Override
    public String toString() {
        return "livre{" + "titreLivre=" + titreLivre + ", quantiteStockLivre=" + quantiteStockLivre + '}';
    }

}
