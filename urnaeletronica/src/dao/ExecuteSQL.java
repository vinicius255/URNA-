package dao;

import java.sql.Connection;


public class ExecuteSQL extends ConexaoDAO{
    private Connection con;
    
    public ExecuteSQL(Connection con){
        setCon(con);
    }
    public Connection getCon(){
        return con;
    }
    public void setCon(Connection con){
        this.con = con;
    }
    
}
