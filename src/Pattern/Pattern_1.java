package Pattern;

public class Pattern_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "abc";
		PrintSubtring(str);

	}
	public static void PrintSubtring(String str) {
		int count=0;
		for (int i = 0; i < str.length(); i++) {
			
			for (int j = i+1; j <= str.length(); j++) {
				String ans= str.substring(i, j);
				count++;
				}

			System.out.println(count);

			}

		}
	}




