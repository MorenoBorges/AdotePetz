package Control;
import java.sql.*;
import Model.pet;
import View.ConsultaAdotar;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class daoPet {
     private Connection connection;
     
    //definindo metodos
    public daoPet(){
        this.connection = new Conexao().getConnection();
    }
    public void Incluir(pet u)
    {
        String sql ="INSERT INTO animal (nome_doador,animal, vacinado, porte, rua, cor, idade, endereco) VALUES (?, ?,?,?,?,?,?,?);";
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, u.getNome_doador());
            stmt.setString(2, u.getAnimal());
            stmt.setString(3, u.getVacinado());
            stmt.setString(4, u.getPorte());
            stmt.setString(5, u.getCasa());
            stmt.setString(6, u.getCor());
            stmt.setString(7, u.getIdade());
            stmt.setString(8, u.getEndereco());
            stmt.execute();   
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
    public void Consultar(pet u){
        ConsultaAdotar ca = new ConsultaAdotar();
        String sql = " select * from animal where animal = ? and rua = ? and vacinado = ? and porte = ?";
		try (PreparedStatement statement = connection.prepareStatement(sql)){
			statement.setString(1, u.getAnimal());
			statement.setString(2, u.getCasa());
                        statement.setString(3, u.getVacinado());
                        statement.setString(4, u.getPorte());
			ResultSet result = statement.executeQuery();
                        while(result.next()){
                            //Declarando a tela Consultar_Venda
                            
                            //Declarando a tabela de Vendas
                            DefaultTableModel dtmVenda = dtmVenda = (DefaultTableModel) ca.jTable1.getModel();
                            //Salvando os dados recebidos
                            int i = dtmVenda.getRowCount()+1;
                            Object dados[] = {result.getString("nome_doador"), result.getString("animal"), result.getString("endereco"),result.getString("idade"), };
                            dtmVenda.addRow(dados);
                        }
			
		}catch(SQLException e){
			e.printStackTrace();
		}
                ca.show();
    }
}
    
