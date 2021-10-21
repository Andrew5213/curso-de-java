package aulas_de_arquivos.aula6;

import java.io.File;
import java.util.Scanner;

public class aula6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("digite o caminho do arquivo");
        String srtPath = in.nextLine();
        File path = new File(srtPath);
        System.out.println("getnmame :"+path.getName());
        System.out.println("getparent :"+path.getParent());
        System.out.println("getpath :"+path.getPath());
        in.close();


    }
}
