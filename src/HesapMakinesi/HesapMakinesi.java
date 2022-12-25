package HesapMakinesi;

import java.util.Scanner;

public class HesapMakinesi {

	public static void main(String[] args) {
		int sayı1;
		int sayı2;
		int secim;
		Scanner input=new Scanner(System.in);
		System.out.println("sayı1 i giriniz:");
		sayı1=input.nextInt();
		System.out.println("sayı2 yi giriniz:");
		sayı2=input.nextInt();
		System.out.println("lütfen yapmak istediginiz işlemi seciniz:");
		System.out.println("1-toplama\n 2-çıkarma\n 3-çarpma\n 4-bölme\n ");
		System.out.println("seçiminiz:");
		secim=input.nextInt();
		if(secim==1) {
			System.out.println("toplama:"+(sayı1+sayı2));
			}
		else if(secim==2) {
			System.out.println(sayı1-sayı2);
			
		}
		else if(secim==3) {
			System.out.println(sayı1*sayı2);
			
		}

		else if(secim==4) {
			System.out.println(sayı1/sayı2);
		}
		
		
	}

}
