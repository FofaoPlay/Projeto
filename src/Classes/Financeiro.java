package Classes;

import java.sql.Connection;
import java.sql.Date;
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
    private double total;
    private Date datacompra;
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
    

    public void cadastrar(Connection conn) {
        String sqlInsert = "INSERT INTO contas(Parceiro, Produto, ValorUnit, Quantidade, Total, DataCompra, Vencimento, Tipo, Status) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        PreparedStatement stm = null;
        java.util.Date hoje = new java.util.Date();
        SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
        Calendar c = Calendar.getInstance();
        
        for (int count = 0; count < getParcelas(); count++) {
            c.setTime(hoje);
            c.add(Calendar.DATE, +30 * (count + 1));
            setVencimento(dataFormatada.format(dataFormatada.format(c.getTime())));
        
        setDatacompra((java.sql.Date) hoje);
        
        try {
            stm = conn.prepareStatement(sqlInsert);

            stm.setString(1, getParceiro());
            stm.setString(2, getProduto());
            stm.setDouble(3, getValorunit());
            stm.setInt(4, getQuantidade());
            stm.setDouble(5, getTotal());
            stm.setDate(6, getDatacompra());
            stm.setString(7, getVencimento());
            stm.setString(8, getTipo());
            stm.setString(9, getStatus());

            stm.execute();
        } catch (SQLException u) {
            System.out.println("Erro de Banco de dados");
        }
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
    public Date getDatacompra() {
        return datacompra;
    }

    /**
     * @param datacompra the datacompra to set
     */
    public void setDatacompra(Date datacompra) {
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



}
