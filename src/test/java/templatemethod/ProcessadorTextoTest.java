package templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProcessadorTextoTest {

    @Test
    void testProcessadorTextoHTML() {
        ProcessadorTexto processador = new ProcessadorTextoHTML();
        String texto = "Exemplo de texto";

        assertEquals("Texto processado: <html><body>Exemplo de texto</body></html>", processador.processarTexto(texto));
    }

    @Test
    void testProcessadorTextoPlano() {
        ProcessadorTexto processador = new ProcessadorTextoPlano();
        String texto = "Exemplo de texto";

        assertEquals("Texto processado: EXEMPLO DE TEXTO", processador.processarTexto(texto));
    }
}
