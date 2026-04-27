/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author HP
 */
// main.java
public class main {
    public static void main(String[] args) {

        // object constructor pertama
        makanan m1 = new makanan();
        m1.tampilData();

        System.out.println();

        // object constructor kedua
        makanan m2 = new makanan("Ayam Geprek", 20000);
        m2.tampilData();

        System.out.println();

        // method dengan nilai balik
        System.out.println("Info Makanan : " + m2.getInfo());
    }
}
