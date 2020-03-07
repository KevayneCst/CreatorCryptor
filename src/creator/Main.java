package creator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		
		int p=1;
		int n=1;
		
		System.out.println("\nVeuillez saisir la puissance du mixeur:");
		try {
			BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
			String choix = bufferRead.readLine();
			p=Integer.parseInt(choix);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("\nVeuillez saisir le nombre de mixeur:");
		try {
			BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
			String choix = bufferRead.readLine();
			n=Integer.parseInt(choix);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		for (int i=0; i<n; i++) {
			Mixeur mixCOM = new Mixeur(p,Type.COMPLEXE);
			System.out.println(mixCOM+"\n");
					
		}
		
	}
}
