/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package denemekelime;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author HASAN
 */
public class Denemekelime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        FileWriter dosyayaz = new FileWriter("metin.txt");
        PrintWriter yazıcı = new PrintWriter(dosyayaz);
        Scanner oku = new Scanner(System.in);
        int deger = 0;
        int tip = 0;
        int sayac = 0;
        while (sayac != 10) {
            System.out.println("lütfen sayısal değerler giriniz");
            deger = oku.nextInt();
            
            yazıcı.write("" + deger + " ");
            sayac++;
        }
        yazıcı.close();
    }

    
}
