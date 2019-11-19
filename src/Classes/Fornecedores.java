package Classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Fornecedores {
    public int id;
    public String nome;
    public String telefone;
    public String email;
    public String cnpj;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public void cadastrar(Connection conn){
        String sqlInsert = "INSERT INTO fornecedores(Nome, Telefone, Email, Cnpj) VALUES (?, ?, ?, ?)";
        
        PreparedStatement stm = null;
        try{
            stm = conn.prepareStatement(sqlInsert);
            
            
            stm.setString(1, getNome());
            stm.setString(2, getTelefone());
            stm.setString(3, getEmail());
            stm.setString(4, getCnpj());
            
            stm.execute();
        }
        catch (SQLException u) {
            System.out.println("Erro de Banco de dados");
    }
    }
    
    
    
}
