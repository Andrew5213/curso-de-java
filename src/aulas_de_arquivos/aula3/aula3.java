package aulas_de_arquivos.aula3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class aula3 {
    public static void main(String[] args) {
        String path = "c:\\teste\\oi.txt.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))){

            String line =br.readLine();
            while(line != null){
                System.out.println(line);
                line=br.readLine();
            }
        }
        catch (IOException e){
            System.out.println("erro!!"+e.getMessage());
        }

    }

    }

