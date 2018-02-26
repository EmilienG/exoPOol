package accesBDD;

import java.io.Serializable;
import java.util.List;
import javax.naming.NamingException;
import obj.livre;

public class DAO implements Serializable {

    private MaConnexion mc;

    public DAO() throws NamingException {
        mc = new MaConnexion();
    }
    public List<livre> selectAllLivre(){
        String req = "select p.titreLivre, p.sousTitreLivre, p.quantiteStockLivre from librairie p order by p.titreLivre";

    }
}
