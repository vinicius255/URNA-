package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.EleitorModel;

/**
 *
 * @author Israel
 */
public class EleitorDAO extends ExecuteSQL{
    public EleitorDAO(Connection con){
        super(con);
    }
    
    public String salvar(EleitorModel eleitor){
        String sql = "INSERT INTO ELEITOR VALUES(?,?,?)";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);            
             ps.setString(1, eleitor.getNome());
             ps.setString(2, eleitor.getData());
              ps.setString(3, eleitor.getCpf());
            if(ps.executeUpdate() > 0){
                return "Produto Inserido com sucesso";
            }else{
                return "Erro ao Inserir";
            }
        } catch (SQLException e) {
            return e.getMessage();
        }
    }
    
}