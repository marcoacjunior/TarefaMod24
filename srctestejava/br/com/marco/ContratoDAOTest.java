package br.com.marco;


import br.com.marco.dao.ContratoDAO;
import br.com.marco.dao.ContratoDaoMock;
import br.com.marco.dao.IContratoDAO;
import br.com.marco.domain.Contrato;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ContratoDAOTest {

    private IContratoDAO contratoDAO;

    private Contrato contrato;

    public ContratoDAOTest() {
        contratoDAO = new ContratoDaoMock();
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
        contratoDAO.salvar(contrato);
    }

    @Test
    public void pesquisarContrato(){

        Contrato contratoConsultado = contratoDAO.buscarPorCod(contrato.getCod());

        Assert.assertNotNull(contratoConsultado);

    }

    @Test
    public void salvarContrato() {
        Boolean retorno = contratoDAO.salvar(contrato);
        Assert.assertTrue(retorno);

    }

    @Test
    public void excluirContrato () {
        contratoDAO.excluir(contrato.getCod());

    }
    @Test
    public void alterarContrato() {
        contrato.setNome("Novo Contrato");
        contratoDAO.alterar(contrato);

        Assert.assertEquals("Novo Contrato", contrato.getNome());
    }

}
