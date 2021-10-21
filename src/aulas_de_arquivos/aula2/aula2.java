package aulas_de_arquivos.aula2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class aula2 {
    public static void main(String[] args) {
        String path = "c:\\teste\\oi.txt.txt";
        FileReader fr = null;
        BufferedReader br = null;
        try{
            fr= new FileReader(path);
            br = new BufferedReader(fr);
            String line =br.readLine();
           while(line != null){
               System.out.println(line);
              line=br.readLine();
           }
        }
        catch (IOException e){
            System.out.println("erro!!"+e.getMessage());
        }
        finally {
            try{
                if(fr!=null){
                    br.close();
                }
                if(fr!=null){
                    fr.close();
                }

            }
            catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
