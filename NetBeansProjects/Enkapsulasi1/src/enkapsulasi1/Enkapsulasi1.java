/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enkapsulasi1;

/**
 *
 * @author ilham
 */
public class Enkapsulasi1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //membuat objek busMini dari kelas Bus
        Busss busMini;
        busMini = new Busss();
        //memasukkan nilai jumlah penumpang dan penumpang maksimal ke dalam objek busMini
        busMini.penumpang = 5;
        busMini.maxpenumpang = 15;
        //memanggil method cetak pada kelas Bus
        busMini.cetak();

        //menambahkan penumpang pada busMini
        busMini.penumpang = busMini.penumpang + 5;
        //memanggil method cetak pada kelas Bus
        busMini.cetak();

        //mengurangi jumlah penumpang pada buaMini
        busMini.penumpang = busMini.penumpang - 2;
        busMini.cetak();

        //menambahkan jumlah penumpang pada bus Mini
        busMini.penumpang = busMini.penumpang + 8;
        busMini.cetak();
    }
}