/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_modul4;

import java.util.Scanner;

public class Tugas_modul4 {

    public static void menu(){
        System.out.println("               TERANG BULAN WENAX");
        System.out.println("           dibuat dengan sepenuh hati");
        System.out.println("################################################");
        System.out.println("");      
        System.out.println("                 Selamat Datang");
        System.out.println("                  Variasi Rasa");
        System.out.println("");
        System.out.println("               1. Cokelat Kacang");
        System.out.println("               2. Keju Campur");      
        System.out.println("               3. Oreo Nutella");      
        System.out.println("               4. Kitkat Greentea");      
        System.out.println("               5. Tobeleron Keju");      
        System.out.println("               6. Chunky Bar Susu");
        System.out.println("               7. Delfi Kacang");
        System.out.println("");
        System.out.println("################################################");
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
    int pilih;
    
    String[][] anggota = {{"Reehan Putra", "21120119130047"}, {"Andika Auli ", "21120119130113"}};
    System.out.println(anggota[0][0]+"\t"+anggota[0][1]);
    System.out.println(anggota[1][0]+"\t"+anggota[1][1]);
    System.out.println("\t\t  \t");

    while (true) {
    menu();
      System.out.print("Masukkan Pilihan Variasi Rasa : ");
      pilih = Integer.parseInt(input.next());
      switch(pilih){
         case 1 :
           System.out.println("TERANG BULAN Cokelat Kacang anda segera kami kirim");
           System.out.println("Terima Kasih atas pembelian anda");
           System.out.println("        Salam dari kami -TERANG BULAN WENAX");
           System.out.println("");
           System.exit(0);
         break;
         case 2 :
           System.out.println("TERANG BULAN Keju Campur anda segera kami kirim");
           System.out.println("Terima Kasih atas pembelian anda");
           System.out.println("        Salam dari kami -TERANG BULAN WENAX");
           System.out.println("");
           System.exit(0);
         break; 
         case 3 :
           System.out.println("Mohon Maaf TERANG BULAN Oreo Nutella Telah Out Of Order");
           System.out.println("Silahkan Order Variasi Rasa lain");
           System.out.println("        Salam dari kami -TEANG BULAN WENAX");
           System.out.println("");
           System.exit(0);
         break;
         case 4 :
           System.out.println("TERANG BULAN Kitkat Greentea anda segera kami kirim");
           System.out.println("Terima Kasih atas pembelian anda");
           System.out.println("        Salam dari kami -TERANG BULAN WENAX");
           System.out.println("");
           System.exit(0);
         break;
         case 5 :
           System.out.println("TERANG BULAN Tobeleron Keju anda segera kami kirim");
           System.out.println("Terima Kasih atas pembelian anda");
           System.out.println("        Salam dari kami -TERANG BULAN WENAX");
           System.out.println("");
           System.exit(0);
         break;
         case 6 :
           System.out.println("Mohon Maaf TERANG BULAN Chunky Bar Susu Telah Out Of Order");
           System.out.println("Silahkan Order Variasi Rasa lain");
           System.out.println("        Salam dari kami -TERANG BULAN WENAX");
           System.out.println("");
           System.exit(0);
         break;
         case 7 :
           System.out.println("TERANG BULAN Delfi Kacang anda segera kami kirim");
           System.out.println("Terima Kasih atas pembelian anda");
           System.out.println("        Salam dari kami -TERANG BULAN WENAX");
           System.out.println("");
           System.exit(0);
         break;
         default:
           System.out.println("Silahkan Masukkan Pilihan Variasi Rasa");
         break;
      } 
    }
  }
}
