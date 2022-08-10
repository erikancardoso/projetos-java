package calculo.testes;

public class CustomizadaClassException extends Exception{
    private String nomeArquivo;
    private String diretorio;

    public CustomizadaClassException(String nomeArquivo, String diretorio) {
        super("O nome do arquivo "+nomeArquivo+" não foi encontrado no diretorio "+diretorio);
        this.nomeArquivo = nomeArquivo;
        this.diretorio = diretorio;
    }

    @Override
    public String toString() {
        return "CustomizadaClassException{" +
                "nomeArquivo='" + nomeArquivo + '\'' +
                ", diretorio='" + diretorio + '\'' +
                '}';
    }
}
