package accesBDD;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.naming.NamingException;
import obj.livre;

public class DAO implements Serializable {

    private MaConnexion mc;

    public DAO() throws NamingException {
        mc = new MaConnexion();
    }

    public List<livre> selectAllLivre() throws SQLException {
        String req = "select p.titreLivre, p.sousTitreLivre, p.quantiteStockLivre from librairie p order by p.titreLivre";
        Connection cnt = (Connection) mc.getConnection();
        Statement stm = cnt.createStatement();
        List<livre> lp = new ArrayList<>();
        ResultSet rs = stm.executeQuery(req);
        while (rs.next()) {
            String titre = rs.getString("titreLivre");
            String sousTitre = rs.getString("sousTitreLivre");
            int qte = rs.getInt("quantiteStockLivre");
            livre p = new livre(titre, sousTitre, qte);
            lp.add(p);
        }
        rs.close();
        cnt.close();
        return lp;

    }
}
