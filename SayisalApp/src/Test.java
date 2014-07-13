import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Tahmini oynanan kupon
		List<Integer> sayisalsayilar = new ArrayList<>();
			
		for (int i = 1; i <= 49; i++) {
			sayisalsayilar.add(i);
			}
		
		Collections.shuffle(sayisalsayilar);
		
		ArrayList< Integer> oynananKupon = new ArrayList<Integer>();
		
		
		oynananKupon.addAll(sayisalsayilar.subList(1, 7));
		
		
			
			System.out.println(" Oynanan kupon " + oynananKupon.get(0) +" "+ oynananKupon.get(1) 
					+" " + oynananKupon.get(2)+" " + oynananKupon.get(3) +" "+ oynananKupon.get(4) +" "+ oynananKupon.get(5) 		);
			
			// Kazanan Numaralar
		
		Collections.shuffle(sayisalsayilar);
		
		ArrayList< Integer> cikanSayilar = new ArrayList<Integer>();
		
		
		cikanSayilar.addAll(sayisalsayilar.subList(1, 7));
		
		System.out.println(" �ansl� Say�lar " + cikanSayilar.get(0) +" "+ cikanSayilar.get(1) 
				+" " + cikanSayilar.get(2)+" " + cikanSayilar.get(3) +" "+ cikanSayilar.get(4) +" "+ cikanSayilar.get(5) 		);
		
		// Tahmin edilen rakamlar�n kontrol�
		
		int sayac=0;
		
		
		for (int i = 0; i < cikanSayilar.size(); i++) {
			
			if ((Collections.binarySearch(oynananKupon, cikanSayilar.get(i))>0)){
				sayac++;
				
			}
			
		}
		System.out.println(sayac + " adet say�y� tahmin ettiniz....");
		
		
		switch (sayac) {
		case 3:
			 System.out.println("Tebrikler 300TL kazand�n�z....");
			 break;
		case 4:
			 System.out.println("Tebrikler 500TL kazand�n�z....");
			 break;
		case 5:
			 System.out.println("Tebrikler 10000TL kazand�n�z....");
			 break;
		case 6:
			 System.out.println("Tebrikler 500000TL kazand�n�z....");
			 break;

		default:
			 System.out.println("Tekrardan deneyin....");
			break;
		}
		
		
		
		}
	}
	



		
		
		

		
		
		
		
		

	


