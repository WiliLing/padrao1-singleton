import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class documentoTest {
    @Test
    public void deveRetornarNomePessoa() {
        documento.getInstance().setNomePessoa("Joao Jose");
        assertEquals("Joao Jose", documento.getInstance().getNomePessoa());
    }

    @Test
    public void deveRetornarOrgaoEmissor() {
        documento.getInstance().setOrgaoEmissor("PCMG");
        assertEquals("PCMG", documento.getInstance().getOrgaoEmissor());
    }

    @Test
    public void deveRetornarDataEmissao() {
        documento.getInstance().setDataEmissao("10/10/2022");
        assertEquals("10/10/2022", documento.getInstance().getDataEmissao());
    }

    @Test
    public void deveRetornarNumeroDocumento() {
        documento.getInstance().setNumeroDocumento(11458711);
        assertEquals(11458711, documento.getInstance().getNumeroDocumento());
    }

    @Test
    public void deveRetornarDataVencimento() {
        documento.getInstance().setDataVencimento("10/10/2032");
        assertEquals("10/10/2032", documento.getInstance().getDataVencimento());
    }
}