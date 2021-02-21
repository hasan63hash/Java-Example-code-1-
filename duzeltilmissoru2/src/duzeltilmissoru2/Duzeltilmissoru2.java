/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duzeltilmissoru2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author HASAN
 */
public class Duzeltilmissoru2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        HashMap<String, Integer> kelime_tutucu = new HashMap();
            FileReader dosyaokuyucu = new FileReader("metin.txt");
            BufferedReader okuyucu = new BufferedReader(dosyaokuyucu);
            String satir = okuyucu.readLine();
            while(satir != null){
                satir = satir.trim();
                String[] words = satir.split("\\s+");
                for (int i = 0; i < words.length; i++) {
                    String word = words[i];
                    if(kelime_tutucu.containsKey(word)){ 
                        kelime_tutucu.put(word, kelime_tutucu.get(word) + 1);
                    }
                    else{ 
                        kelime_tutucu.put(word, 1);
                    }
                }
                satir = okuyucu.readLine();
            }
            List<String> kelimelistesi = new ArrayList<>(kelime_tutucu.keySet());
            List<Integer> sayacliste = new ArrayList<>(kelime_tutucu.values());
            for(int i=0; i<kelimelistesi.size(); i++){
                System.out.println("Bulunan kelime=  " + kelimelistesi.get(i) + " " + "Sayisi: " + sayacliste.get(i));
            }          
            dosyaokuyucu.close();
            okuyucu.close();
        
    }
    
}
