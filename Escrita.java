import java.io.*;

public class Escrita {
    public static void main(String[] args) throws IOException {

        FileOutputStream arquivo = new FileOutputStream("entrada2.txt");
        Writer leitor = new OutputStreamWriter(arquivo);
        BufferedWriter escritorbuffer = new BufferedWriter(leitor);

        escritorbuffer.write("teste escreve linha");
        escritorbuffer.newLine();
        escritorbuffer.write("linha 2");

        escritorbuffer.close();


    }

}
