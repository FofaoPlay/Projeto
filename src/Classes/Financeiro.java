package Classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Financeiro {

    private int id;
    private String parceiro;
    private String produto;
    private double valorunit;
    private int quantidade;
    private int quantidade_prod;
    private double total;
    private String datacompra;
    private String vencimento;
    private String tipo;
    private String status;
    private int parcelas;

    /*public Financeiro(double valorunit, int quantidade, double total, Date datacompra, Date vencimento) {
        this.valorunit = valorunit;
        this.quantidade = quantidade;
        this.total = total;
        this.datacompra = datacompra;
        this.vencimento = vencimento;
    }*/
    public void cadastrar(Connection conn) throws SQLException {
        String sqlInsert = "INSERT INTO contas(Parceiro, Produto, ValorUnit, Quantidade, Total, DataCompra, Vencimento, Tipo, Status) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        PreparedStatement stm = null;

        java.util.Date hoje = new java.util.Date();

        SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
        Calendar c = Calendar.getInstance();

        int diah = c.get(Calendar.DAY_OF_MONTH);
        int mesh = c.get(Calendar.MONTH) + 1;
        int anoh = c.get(Calendar.YEAR);

        String data = diah + "/" + mesh + "/" + anoh;

        setDatacompra(data);

        for (int count = 0; count < getParcelas(); count++) {
            c.setTime(hoje);
            c.add(Calendar.DATE, +30 * (count + 1));
            setVencimento(dataFormatada.format(c.getTime()));

            try {
                stm = conn.prepareStatement(sqlInsert);

                stm.setString(1, getParceiro());
                stm.setString(2, getProduto());
                stm.setDouble(3, getValorunit());
                stm.setInt(4, getQuantidade());
                stm.setDouble(5, getTotal());
                stm.setString(6, getDatacompra());
                stm.setString(7, getVencimento());
                stm.setString(8, getTipo());
                stm.setString(9, getStatus());

                stm.execute();
            } catch (SQLException u) {
                System.out.println("Erro de insert no Banco de dados");
            }
        }
        
        String sqlUpdate = "UPDATE Produtos SET Quantidade=? WHERE Codigo=" + id;
        try {
            stm = conn.prepareStatement(sqlUpdate);

            stm.setInt(1, (getQuantidade_prod()-getQuantidade()));
            stm.execute();
        } catch (SQLException u) {
            System.out.println("Erro de update no Banco de dados");
        }
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the parceiro
     */
    public String getParceiro() {
        return parceiro;
    }

    /**
     * @param parceiro the parceiro to set
     */
    public void setParceiro(String parceiro) {
        this.parceiro = parceiro;
    }

    /**
     * @return the produto
     */
    public String getProduto() {
        return produto;
    }

    /**
     * @param produto the produto to set
     */
    public void setProduto(String produto) {
        this.produto = produto;
    }

    /**
     * @return the valorunit
     */
    public double getValorunit() {
        return valorunit;
    }

    /**
     * @param valorunit the valorunit to set
     */
    public void setValorunit(double valorunit) {
        this.valorunit = valorunit;
    }

    /**
     * @return the quantidade
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * @return the total
     */
    public double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(double total) {
        this.total = total;
    }

    /**
     * @return the datacompra
     */
    public String getDatacompra() {
        return datacompra;
    }

    /**
     * @param datacompra the datacompra to set
     */
    public void setDatacompra(String datacompra) {
        this.datacompra = datacompra;
    }

    /**
     * @return the vencimento
     */
    public String getVencimento() {
        return vencimento;
    }

    /**
     * @param vencimento the vencimento to set
     */
    public void setVencimento(String vencimento) {
        this.vencimento = vencimento;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the parcelas
     */
    public int getParcelas() {
        return parcelas;
    }

    /**
     * @param parcelas the parcelas to set
     */
    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }

    /**
     * @return the quantidade_prod
     */
    public int getQuantidade_prod() {
        return quantidade_prod;
    }

    /**
     * @param quantidade_prod the quantidade_prod to set
     */
    public void setQuantidade_prod(int quantidade_prod) {
        this.quantidade_prod = quantidade_prod;
    }

    public void setId(String Codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
