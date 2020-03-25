package epam.task;
import java.util.*;
public class Remove_A_in_string {

	public static void main(String[] args) {
		RemoveA_IfInFirstTwoCharacters obj = new RemoveA_IfInFirstTwoCharacters();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter string");
		String string = sc.next();
		String str = string.toUpperCase();
		String ans = RemoveA_IfInFirstTwoCharacters.remove(str);
		System.out.println(ans);

	}

}
