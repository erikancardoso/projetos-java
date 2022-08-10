package calculo.testes;

import javax.swing.*;
import java.io.*;

public class ChecketException {
    public static void main(String[] args)  {
        String arquivo = "exception.txt";
        imprimirConteudo(arquivo);
        System.out.println("continua, apos tratamento");
        String nome = "Camila";
        int nome2 = Integer.parseInt(nome);
    }
    public static void imprimirConteudo(String nomeDoArquivo) { //esse método apenas imprime o arquivo lido
        try {
            BufferedReader br = lerArquivo(nomeDoArquivo); //chamando o metodo, quando chamamos uma nova extensão de classe precisa de new
            String line = br.readLine();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            do {
                bw.write(line);
                bw.newLine();
                line = br.readLine();
            } while (line != null);
            bw.flush();
            br.close();
        } catch (CustomizadaClassException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage()); // para mostra a mensagem que estã em super na class construtora
            ex.printStackTrace();
        } catch (IOException e){
            JOptionPane.showMessageDialog(null, "erro inesperado"+ e.getMessage());
            e.printStackTrace();
        }
    }
    public static BufferedReader lerArquivo(String nomeDoArquivo) throws CustomizadaClassException { // esse metodo faz a leitura dos arquivo
        File file = new File(nomeDoArquivo);
        try {
            return new BufferedReader(new FileReader(nomeDoArquivo));
        } catch (FileNotFoundException e) {
            throw new CustomizadaClassException(file.getName(), file.getPath());
        }
    }
}
