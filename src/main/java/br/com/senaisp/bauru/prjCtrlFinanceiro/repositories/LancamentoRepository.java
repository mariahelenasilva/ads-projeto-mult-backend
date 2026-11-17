package br.com.senaisp.bauru.prjCtrlFinanceiro.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.senaisp.bauru.prjCtrlFinanceiro.models.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long> {
	
    List<Lancamento> findByUsuarioId(Long usuarioId);
    Optional<Lancamento> findByUsuarioIdAndId(Long usuarioId, Long id);
}

