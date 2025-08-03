//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String []args){
            Documento pdf= DocumentoFactory.crearDocumento("pdf");
            Documento word= DocumentoFactory.crearDocumento("word");
            Documento html= DocumentoFactory.crearDocumento("html");

            GestorImpresion gestorImpresion= GestorImpresion.getInstancia();
            gestorImpresion.imprimir(pdf);
            gestorImpresion.imprimir(word);
            gestorImpresion.imprimir(html);
    }
}