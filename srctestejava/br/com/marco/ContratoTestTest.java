package br.com.marco;

import br.com.marco.dao.ContratoDaoMock;
import br.com.marco.dao.IContratoDAO;
import br.com.marco.domain.Contrato;
import br.com.marco.services.ContratoService;
import br.com.marco.services.IContratoService;
import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;


public class ContratoTestTest {

    private IContratoService contratoService;

    private Contrato contrato;

    public ContratoTestTest(){
        IContratoDAO dao = new ContratoDaoMock();
        contratoService = new ContratoService(dao);
    }

    @Before
    public void init() {
        contrato = new Contrato();
        contrato.setCod(123456L);
        contrato.setNome("Casa de Tintas");
        contrato.setCidade("Belo Horizonte");
        contrato.setEnd("Rua YYYYY");
        contrato.setEstado("MG");
        contrato.setNumero(15);
        contrato.setTel(3433333434L);
        contratoService.salvar(contrato);
    }

    @Test
    public void pesquisarContrato() {

        Contrato contratoConsultado = contratoService.buscarPorCod(contrato.getCod());
        Assert.assertNotNull(contratoConsultado);

    }

    @Test
    public void salvarContrato() {
        Boolean retorno = contratoService.salvar(contrato);
        Assert.assertTrue(retorno);

    }

    @Test
    public void excluirContrato () {
    contratoService.excluir(contrato.getCod());

    }

    @Test
    public void alterarContrato() {
        contrato.setNome("Novo Contrato");
        contratoService.alterar(contrato);

        Assert.assertEquals("Novo Contrato", contrato.getNome());
    }

}