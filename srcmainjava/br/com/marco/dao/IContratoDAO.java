package br.com.marco.dao;

import br.com.marco.domain.Contrato;

public interface IContratoDAO {
    Boolean salvar(Contrato contrato);

    Contrato buscarPorCod(Long cod);

    void excluir(Long cod);

    void alterar(Contrato contrato);

}
