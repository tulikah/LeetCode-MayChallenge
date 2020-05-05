package mayChallenge;

public class NumberComplement {

	public static void main(String[] args) {
			int num = 5;
			int result = 0;
			int power = 1;
			while(num > 0) {
				result += (num % 2 ^ 1) * power;
				power <<= 1;
				num = num >> 1;
			}
			System.out.println(result); 
	}

}
