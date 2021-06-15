public class PowerTable{
	public static void main(String[] args) {
		int power ;
		for( int i = 0; i <= 31; i++) {
			power = (int) Math.pow(2, i);
			System.out.println(2+" power "+i+" is "+power);
		}
	}
}

