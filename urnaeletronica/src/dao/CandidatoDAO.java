package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.CandidatoModel;
import tela.Candidato;

/**
 *
 * @author Israel
 */
public class CandidatoDAO extends ExecuteSQL{
    public CandidatoDAO(Connection con){
        super(con);
    }
    
    public String salvar(CandidatoModel candidato){
        String sql = "INSERT INTO CANDIDATO VALUES(?,?)";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);            
             ps.setInt(1, candidato.getNumero() );
             ps.setString(2, candidato.getNome());
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
    
