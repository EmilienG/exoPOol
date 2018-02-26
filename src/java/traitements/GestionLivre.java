package traitements;

import accesBDD.DAO;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.naming.NamingException;
import obj.livre;

public class GestionLivre implements Serializable {

    private DAO pDAO;

    public void GestionLivres() throws NamingException {
        pDAO = new DAO();
    }

    public List<String> getCleDefaut() {
        List<String> clefs = new ArrayList<>();
        clefs.add("A-C");
        clefs.add("D-F");
        clefs.add("G-I");
        clefs.add("J-L");
        clefs.add("M-O");
        clefs.add("P-R");
        clefs.add("V-Z");
        return clefs;
    }

    public HashMap<String, List<livre>> findLivres() throws SQLException {
        List<String> clefs = getCleDefaut();
        HashMap<String, List<livre>> mp = new HashMap<>();
        for (String clef : clefs) {
            List<livre> lp = new ArrayList<>();
            mp.put(clef, lp);
        }
        List<livre> lp = pDAO.selectAllLivre();
        for (livre lp1 : lp) {
            String lettre = lp1.getTitreLivre().charAt(0) + "";
            for (String clef : clefs) {
                String regex = "[" + clef + "]";
                if (lettre.matches(regex)) {
                    lp = mp.get(clef);
                    lp.add(lp1);
                }
            }
        }
        return mp;
    }

}
