package templatemethod;

public class ProcessadorTextoPlano extends ProcessadorTexto {

    @Override
    public String transformarTexto(String texto) {
        return texto.toUpperCase();
    }
}
