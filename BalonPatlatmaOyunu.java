/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.balonpatlatmaoyunu;

import java.util.Scanner;

/**
 *
 * @author ssila
 */
public class BalonPatlatmaOyunu {

    private static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    public static void balonPozisyonuBul(int N, int M) {
        Node head = new Node(1);
        Node current = head;
        for (int i = 2; i <= N; i++) {
            current.next = new Node(i);
            current = current.next;  
        }
        current.next = head; // Dairesel liste olmasını sağlar.
        int sayac = 1;
        while (head.next != head) { //M-1 eleman atlayarak 1 eleman kalana kadar silme işlemi yapar.
            for (int i = 1; i < M - 1; i++) {
                head = head.next;
            }
            System.out.println(sayac +". patlatılan balon: " + head.next.data);
            sayac++;
            //yeni head ve head.next belirlenerek dairesel liste yapısı korunur. 
            head.next = head.next.next;
            head = head.next;
        }
        System.out.println("Patlatılmayacak balon: " + head.data);
    }

    public static void main(String[] args) {
        boolean yeniOyun = true;
        Scanner input = new Scanner(System.in);
        while(yeniOyun){
            
            System.out.print("Toplam balon sayısını giriniz: ");
            int toplamBalonSayisi = input.nextInt();
            input.nextLine();
            System.out.print("Patlatma işlemine kaçıncı balondan başlansın giriniz: ");
            int patlayacakBalon = input.nextInt();
            input.nextLine();
            balonPozisyonuBul(toplamBalonSayisi, patlayacakBalon);
            System.out.print("Yeni bir oyuna başlamak isterseniz 'Evet' yazın.\n " +
                    "Oyunu bitirmek için Enter tuşuna basınız.");
            String cevap = input.nextLine();
            if (!cevap.equalsIgnoreCase("Evet")) {
                yeniOyun = false;
        } 
    }
    
}   
}