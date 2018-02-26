package accesBDD;

import java.io.Serializable;
import javax.naming.NamingException;

public class DAO implements Serializable {

    private MaConnexion mc;

    public DAO() throws NamingException {
        mc = new MaConnexion();
    }

}
