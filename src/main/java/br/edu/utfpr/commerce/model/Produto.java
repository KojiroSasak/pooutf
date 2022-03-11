package br.edu.utfpr.commerce.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="tb_produto")
public class Produto {

     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
     
    
    @Column(name = "nome")
    private String nome;
      
      
    @Column(name = "descricao")
    private String descricao;
       
       
    @Column(name = "unidade_medida")
    private String unidadeMedida;
        
   
    @Column(name = "percentual_ipi")
    private Float percentualIpi;
         
      
    @Column(name = "valor_unitario")
    private Float valorUnitario;
          
         
    @Column(name = "prso_liquido")
    private Float pesoLiquido;
           
            
    @Column(name = "peso_bruto")
    private Float pesoBruto;
            
    @Column(name = "marca")
    private Marca marca;
             
             
    private Categoria categoria;
    private List<Estoque> estoques = new ArrayList<>();

    public Produto() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getUnidadeMedida() {
        return unidadeMedida;
    }

    public void setUnidadeMedida(String unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }

    public Float getPercentualIpi() {
        return percentualIpi;
    }

    public void setPercentualIpi(Float percentualIpi) {
        this.percentualIpi = percentualIpi;
    }

    public Float getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(Float valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public Float getPesoLiquido() {
        return this.pesoLiquido;
    }

    public void setPesoLiquido(Float pesoLiquido) {
        this.pesoLiquido = pesoLiquido;
    }

    public Float getPesoBruto() {
        return this.pesoBruto;
    }

    public void setPesoBruto(Float pesoBruto) {
        this.pesoBruto = pesoBruto;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public List<Estoque> getEstoques() {
        return estoques;
    }

    public void setEstoques(List<Estoque> estoques) {
        this.estoques = estoques;
    }

}
