package br.com.marco.dao;

import br.com.marco.domain.Contrato;

public class ContratoDAO implements IContratoDAO{

    @Override
    public Boolean salvar(Contrato contrato) {
    return true;
    }

    @Override
    public Contrato buscarPorCod(Long cod) {
        return null;
    }

    @Override
    public void excluir(Long cod) {

    }

    @Override
    public void alterar(Contrato contrato) {

    }
}
