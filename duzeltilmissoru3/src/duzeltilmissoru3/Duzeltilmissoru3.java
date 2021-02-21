/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duzeltilmissoru3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author HASAN
 */
public class Duzeltilmissoru3 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) throws IOException {   
        Scanner oku = new Scanner(System.in);
        ArrayList<Integer> sayilar = new ArrayList();
            FileWriter dosyayazici = new FileWriter("metin.txt");
            BufferedWriter yazici = new BufferedWriter(dosyayazici);          
            while(true){              
                try{
                    System.out.println("lütfen sayısal değer giriniz");
                    String line = oku.nextLine();
                    if(line.isEmpty()){
                        break;
                    }              
                    int number = Integer.valueOf(line);
                    sayilar.add(number);
                }catch(Exception ex){
                    System.out.println("Hata : "+ex);
                }
            }
            Collections.sort(sayilar);
            // girilen değerlerin consola artan sirada yazılma islemi aynı zamanda dosyaya yazma işlemi
            System.out.println("========================>");
            System.out.println("Girilen degerlerin artan sırada yazılma islemi ");
            for(int a=0; a<sayilar.size(); a++){
                // girilen sayilari metin.txt adlı dosyaya artan sırada yazma işlemi 
                yazici.write("" + sayilar.get(a) + "\n");
                // girilen değerlerin artan sırada consola yazma işlemi
                System.out.println(sayilar.get(a));
               
            }
            yazici.flush();
            yazici.close();   
    }
}
