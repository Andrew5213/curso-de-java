package aulas_de_arquivos.aula1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        File file = new File( "c:\\teste\\oi.txt.txt");
        Scanner sc = null;
        try{
            sc= new Scanner(file);
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        }
        catch (IOException e){
            System.out.println("ERROR:"+ e.getMessage());
        }
        finally{
            if(sc != null) {
                sc.close();
            }
        }
    }
}
