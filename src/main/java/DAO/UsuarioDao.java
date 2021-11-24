package DAO;

import Model.Usuario;
import Util.Conexao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuarioDao {

    // criando conexao com o DB
    Conexao conexao;

    public UsuarioDao(Conexao conexao) throws SQLException {
        this.conexao = conexao;
    }
    //Create Usuario


    public void salvarUsuario(Usuario usuario) throws SQLException {

        try {
            String sql = "insert into atendente (nome, status, nivel, senioridade) values (?,?,?,?)";
            //prepareStatement quando tiver parâmetros para informar depois
            PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
            ps.setString(1, usuario.getNome().orElseThrow());
            ps.setString(2, usuario.getLogin().name());
            ps.setString(3, usuario.get().name());
            ps.setString(4, usuario.getSenioridade().name());
            ps.execute();
        }catch (Exception e){

        }
    }

    //Read usuario


    // Update usuario


    // Delete  usuario
}
