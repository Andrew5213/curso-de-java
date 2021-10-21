package aulas_de_arquivos.aula5;

import java.io.File;
import java.util.Scanner;
// nesta aula aprendemos a manipular pastas e arquivou listando elas e criar pastas
public class aula5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("digite o caminho de uma pasta");
        String strPath = in.nextLine();
        File path = new File(strPath);
        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("folders::");
        for (File folder : folders){
            System.out.println(folder);
        }
        File[] files = path.listFiles(File::isFile);
        for (File file : files){
            System.out.println(file);
        }
            boolean success = new File(strPath +"\\subdir").mkdir();
        System.out.println("diretorio criado com sucesso "+success);
        in.close();
    }
}
