package br.edu.utfpr.commerce.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Entity
@Table(name="tb_nota_fiscal")
public class NotaFiscal {

     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
     
    @Column(name = "chave_acesso")
    private String chaveAcesso;
    private Calendar dataEmissao;
    
     @Column(name = "numero")
    private String numero;
    private Calendar dataSaida;
    
     
    @Column(name = "valor_frete")
    private float valorFrete;
     
     
    @Column(name = "valor_seguro")
    private float valorSeguro;
      
     
    @Column(name = "valor_desconto")
    private float valorDesconto;
       
    @Column(name = "valor_outas_despesas")
    private float valorOutrasDespesas;
    
   
    @Column(name = "observacao")
    private String observacao;
    
    
    private Filial filial;
    private Pessoa pessoa;
    private List<Produto> itens = new ArrayList<>();

    public NotaFiscal() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getChaveAcesso() {
        return chaveAcesso;
    }

    public void setChaveAcesso(String chaveAcesso) {
        this.chaveAcesso = chaveAcesso;
    }

    public Calendar getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(Calendar dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Calendar getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(Calendar dataSaida) {
        this.dataSaida = dataSaida;
    }

    public float getValorFrete() {
        return valorFrete;
    }

    public void setValorFrete(float valorFrete) {
        this.valorFrete = valorFrete;
    }

    public float getValorSeguro() {
        return valorSeguro;
    }

    public void setValorSeguro(float valorSeguro) {
        this.valorSeguro = valorSeguro;
    }

    public float getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(float valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public float getValorOutrasDespesas() {
        return valorOutrasDespesas;
    }

    public void setValorOutrasDespesas(float valorOutrasDespesas) {
        this.valorOutrasDespesas = valorOutrasDespesas;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Filial getFilial() {
        return filial;
    }

    public void setFilial(Filial filial) {
        this.filial = filial;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public List<Produto> getItens() {
        return itens;
    }

    public void setItens(List<Produto> itens) {
        this.itens = itens;
    }

}