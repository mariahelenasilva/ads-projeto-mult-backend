package br.com.senaisp.bauru.prjCtrlFinanceiro.models;

import java.math.BigDecimal;
import java.time.LocalDate;

//import br.com.senaisp.bauru.prjCtrlFinanceiro.models.enums.TipoLancamento;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
//import jakarta.persistence.EnumType;
//import jakarta.persistence.Enumerated;
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
    
    public Lancamento(String descricao, BigDecimal valor, LocalDate data_lancamento, String observacao, Long categoria_id, Long usuario_id) {
            this.descricao = descricao;
            this.valor = valor;
            this.data_lancamento = data_lancamento;
            this.observacao = observacao;
            this.categoria_id = categoria_id;
            this.usuario_id = usuario_id;
    }
    
    //Getters e setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public LocalDate getData_lancamento() {
		return data_lancamento;
	}

	public void setData_lancamento(LocalDate data_lancamento) {
		this.data_lancamento = data_lancamento;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Long getCategoria_id() {
		return categoria_id;
	}

	public void setCategoria_id(Long categoria_id) {
		this.categoria_id = categoria_id;
	}

	public Long getUsuario_id() {
		return usuario_id;
	}

	public void setUsuario_id(Long usuario_id) {
		this.usuario_id = usuario_id;
	}

}
