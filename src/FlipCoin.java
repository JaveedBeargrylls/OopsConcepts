public class FlipCoin {
static int head = 1;
	//static int tail = 0;
	public static void main(String[]args) {
		int count = 0;
		int count1 = 1;
		int percentage = 0,percentage1 = 0;

		for (int i = 1; i < 25; i++) {
		double flip = Math.floor(Math.random()*10)%2;
		if (flip == head) {
			//System.out.println("head");
			count = count + 1;
			percentage = ((count*100)/25);
		}
		else {
			//System.out.println("tail");
			count1 = count1 + 1;
			percentage1 = ((count1*100)/25);
		}
		}

        System.out.println("No.of times Heads came in total flips = "+count);
		System.out.println("Heads in total tosses is = "+percentage+"%");
        System.out.println("\nNo.of times Heads came in total flips = "+count1);
		System.out.println("Tails in total tosses is = "+percentage1+"%");
	}
}
