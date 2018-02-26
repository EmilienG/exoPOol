package accesBDD;

import java.io.Serializable;
import java.sql.SQLException;
import javax.jms.Connection;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class MaConnexion implements Serializable{
    private DataSource ds;
    
    public MaConnexion() throws NamingException{
        InitialContext context = new InitialContext();
        ds = (DataSource) context.lookup("jsbc/librairie");
    }
    
    public Connection getConnection() throws SQLException{
        Connection cnt = (Connection) ds.getConnection();
        return cnt;
    }
}