package templatemethod;


public class ProcessadorTextoHTML extends ProcessadorTexto {

    @Override
    public String transformarTexto(String texto) {
        return "<html><body>" + texto + "</body></html>";
    }
}

