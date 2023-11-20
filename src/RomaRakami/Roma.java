package RomaRakami;
import java.io.*;

class cevir{
	public void romrom(String login) {
		int top = 0, iDeger = 0, sDeger = 0;
		int m, f, i;
		
		String roma = "IVXLC";
		for(int h = 0; h < login.length(); h++) {
			if(login.charAt(h) == roma.charAt(1)) {
				top += 5;
			}
			if(login.charAt(h) == roma.charAt(2)) {
				top += 10;
			}
			if(login.charAt(h) == roma.charAt(3)) {
				top += 50;
			}
			if(login.charAt(h) == roma.charAt(4)) {
				top += 100;
			}
		}
		
		
		for(i = 0; i < login.length(); i++) {
			if(login.charAt(i) == roma.charAt(1) || login.charAt(i) == roma.charAt(2) || login.charAt(i) == roma.charAt(3) || login.charAt(i) == roma.charAt(4)) {
				iDeger = i;
				break;
			}
		}
		
		
		if(iDeger != 0) {
			for(int j = 0; j < iDeger; j++) {
				top -= 1;
			}
		}
		else {
			for(int k = 0; k < login.length(); k++) {
				if(login.charAt(k) == roma.charAt(0)) {
					top += 1;
				}
			}
			System.out.println(top);
		}
	}
	
}


public class Roma {

	
	public static void main(String[] args)throws IOException {
  
		
		String giris;
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Roma Rakamını Giriniz: ");
		giris = b.readLine();
		cevir c = new cevir();
		c.romrom(giris);
		
		
		
		
		
	}

}
