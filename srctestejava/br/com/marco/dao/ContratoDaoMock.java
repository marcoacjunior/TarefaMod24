package br.com.marco.dao;

import br.com.marco.domain.Contrato;

public class ContratoDaoMock implements IContratoDAO{


    @Override
    public Boolean salvar(Contrato contrato) {
    return true;
    }

    @Override
    public Contrato buscarPorCod(Long cod) {
        Contrato contrato = new Contrato();
        contrato.setCod(cod);
        return contrato;
    }

    @Override
    public void excluir(Long cod) {

    }

    @Override
    public void alterar(Contrato contrato) {

    }
}
