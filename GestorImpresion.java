public class GestorImpresion {
    private static GestorImpresion instancia;
    public GestorImpresion(){
        System.out.println("Iniciando gestor de documentos");
    }

    public static GestorImpresion getInstancia() {
        if (instancia==null){
            instancia= new GestorImpresion();
        }
        return instancia;
    }
    public void imprimir(Documento d){
        d.Imprimir();
    }
}
