/*Nama 	 : Ade Eki Nurhakim
NIM 	 : 10119702
Fakultas : Teknik Dan Ilmu Komputer
Prodi 	 : Teknik Informatika
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nilaiterbesarterkecil;

/**
 *
 * @author Ekiw
 */
import java.util.Scanner;
public class NilaiTerbesarTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scan=new Scanner(System.in);
    System.out.print("Masukkan Berapa Kali Input: ");
        int panjangArray = scan.nextInt();
        int angka[]=new int[panjangArray];
        int min,max;
        for(int i=0;i<panjangArray;i++)
        {
            System.out.print("Masukkan angka ke-"+i+" : ");
            angka[i]= scan.nextInt();
        }
        min=angka[0];
        max=angka[0];
       
        for(int i=0;i<panjangArray;i++)
        {
            if(angka[i]<min)
                min=angka[i];
            if(angka[i]>max)
                max=angka[i];
            System.out.println("Bilangan : "+angka[i]);
        }
   
    System.out.println("Bilangan Terkecil:" +min);
    System.out.println("Bilangan Terbesar:" +max);
    }
    
}
