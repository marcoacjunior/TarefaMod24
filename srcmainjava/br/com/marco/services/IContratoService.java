package br.com.marco.services;

import br.com.marco.domain.Contrato;

public interface IContratoService {

    Boolean salvar(Contrato contrato);

    Contrato buscarPorCod(Long cod);

    void excluir(Long cod);

    void alterar(Contrato contrato);

}
