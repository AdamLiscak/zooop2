package sk.stuba.fiit.adam_liscak.second_exercise;
import java.util.Scanner;

public class KeyboardReader {
	public void read(){
		Scanner sc = new Scanner(System.in);
			System.out.println("Enter first String");
			while(!sc.hasNext(":q")){
				System.out.println("You entered"+sc.nextLine());
				System.out.println("Enter next String");
			}
			sc.close();
			// citam tu z input bufferu cez while loop cez
			// java.util.Scanner
			//kym nenapisete :q tak to pojde do nekonecna
	}
}

