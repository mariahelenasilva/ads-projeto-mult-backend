package br.com.senaisp.bauru.prjCtrlFinanceiro.models;

import java.math.BigDecimal;
import java.time.LocalDate;

import br.com.senaisp.bauru.prjCtrlFinanceiro.models.enums.TipoLancamento;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "lancamentos")
public class Lancamento {
    //Fields
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String descricao;
    
    private BigDecimal valor;
   
    private LocalDate data_lancamento;
    
    private String observacao;
    
    private Long categoria_id;
    
    private Long usuario_id;

    //Constructors
    public Lancamento() {}
    
    public Lancamento(String descricao, TipoLancamento tipo, LocalDate dataLancamento) {
//            this.descricao = descricao;
//            this.tipo = tipo;
//            this.dataLancamento = dataLancamento;
    }
//    //Getters e setters
//    public String getDescricao() {
//        return descricao;
//    }
//
//    public void setDescricao(String descricao) {
//        this.descricao = descricao;
//    }
//
//    public TipoLancamento getTipo() {
//        return tipo;
//    }
//
//    public void setTipo(TipoLancamento tipo) {
//        this.tipo = tipo;
//    }
//
//    public Boolean getAtiva() {
//        return ativa;
//    }
//
//    public void setAtiva(Boolean ativa) {
//        this.ativa = ativa;
//    }
//
//    public Long getId() {
//        return id;
//    }
}
