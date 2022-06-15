package br.com.marco.services;

import br.com.marco.dao.IContratoDAO;
import br.com.marco.domain.Contrato;

public class ContratoService implements IContratoService {

    private IContratoDAO contratoDAO;

    public ContratoService(IContratoDAO contratoDAO) {
        this.contratoDAO = contratoDAO;
    }


    @Override
    public Boolean salvar(Contrato contrato) {
        return contratoDAO.salvar(contrato);

    }

    @Override
    public Contrato buscarPorCod(Long cod) {
        return contratoDAO.buscarPorCod(cod);
    }

    @Override
    public void excluir(Long cod) {
       contratoDAO.excluir(cod);
    }

    @Override
    public void alterar(Contrato contrato) {
        contratoDAO.alterar(contrato);
    }
}
