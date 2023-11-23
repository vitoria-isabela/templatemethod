package templatemethod;


public abstract class ProcessadorTexto {

    public abstract String transformarTexto(String texto);

    public String processarTexto(String texto) {
        return "Texto processado: " + transformarTexto(texto);
    }
}
