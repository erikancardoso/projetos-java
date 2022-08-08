package calculo.testes;

import java.io.*;

public class ChecketException {
    public static void main(String[] args) throws IOException {
        String arquivo = "exception.txt";
        imprimirConteudo(arquivo);
        System.out.println("continua, apos tratamento");
    }
    public static void imprimirConteudo(String leituraArquivo) throws IOException {
        File file = new File(leituraArquivo);
        BufferedReader br = new BufferedReader(new FileReader(file.getName()));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        do {
            bw.write(line);
            bw.newLine();
            line=br.readLine();
        }while(line != null);
        bw.flush();
        br.close();
    }
}
