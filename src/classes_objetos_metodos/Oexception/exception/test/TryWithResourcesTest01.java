package classes_objetos_metodos.Oexception.exception.test;

import classes_objetos_metodos.Oexception.exception.domain.Reader1;
import classes_objetos_metodos.Oexception.exception.domain.Reader2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {
        readFile();
    }

    private static void readFile(){
        try(Reader1 reader1 = new Reader1();
            Reader2 reader2 = new Reader2()) {

        } catch (IOException e){

        }
    }

//    private static void readFile(){
//        try(Reader reader = new BufferedReader(new FileReader("text.txt"))){
//        } catch (IOException e){
//        }
//    }



    private static void readFile2(){
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("text.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
