public class DocumentoFactory {
    public static Documento crearDocumento(String tipo){
        if (tipo.equalsIgnoreCase("pdf")){
            return new PDF();
        } else if (tipo.equalsIgnoreCase("word")) {
            return new Word();
        } else if (tipo.equalsIgnoreCase("html")) {
            return new HTML();
        }else {
            throw new IllegalArgumentException("Documento no valido");
        }
    }
}
