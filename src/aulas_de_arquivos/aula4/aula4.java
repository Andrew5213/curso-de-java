package aulas_de_arquivos.aula4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class aula4 {
    public static void main(String[] args) {
        String[] lines = new String[]{"ola eu sou o andrew " , "sou top em programacao", "ainda bem"};
        String path = "c:\\teste\\out.txt";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
            for(String line : lines ){
                bw.write(line);
                bw.newLine();
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
