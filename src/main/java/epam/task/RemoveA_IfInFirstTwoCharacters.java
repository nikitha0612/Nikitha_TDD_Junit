package epam.task;

public class RemoveA_IfInFirstTwoCharacters {

	
		public static String remove(String string) {
			int length = string.length();
			String ans = "";
			if(length == 0) {
				ans = "";
			} else if(length == 1) {
				if(string.charAt(0) != 'A') {
					ans += string.charAt(0);
				}
			} else {

				if(string.charAt(0) != 'A') {
					ans += string.charAt(0);
				} if(string.charAt(1) != 'A') {
					ans += string.charAt(1);
				}
				if(length > 2) {
					ans += string.substring(2);
				}
			}
			return ans;
		}

	
		

	}

