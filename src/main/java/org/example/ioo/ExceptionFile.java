package org.example.ioo;

import lombok.SneakyThrows;

import java.io.*;
import java.util.Scanner;

public class ExceptionFile {
    BufferedReader br ;

    @SneakyThrows
    public ExceptionFile() throws FileNotFoundException {
//        try {
//            this.br =new BufferedReader(new FileReader(""));;
//        } catch (IOException e){
//            e.printStackTrace();
//        }
//        try (BufferedReader br =new BufferedReader(new FileReader(""))){
//            br.readLine();
//        }catch (IOException e){
//
//        }
        this.br =new BufferedReader(new FileReader(""));;

//        try (Scanner scanner = new Scanner(new File("test.txt"))) {
//            while (scanner.hasNext()) {
//                System.out.println(scanner.nextLine());
//            }
//        } catch (FileNotFoundException fnfe) {
//            fnfe.printStackTrace();
//        }

    }
}
