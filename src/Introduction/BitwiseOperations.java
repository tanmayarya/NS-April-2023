package Introduction;

public class BitwiseOperations {
	
	public static int setIthBit(int n, int i) {
		int mask = 1 << i;
		return n | mask;
	}
	
	public static int unsetIthBit(int n, int i) {
		int mask = ~(1 << i);
		return n & mask;
	}

	public static int toogleIthBit(int n, int i) {
		int mask = 1 << i;
		return n ^ mask;
	}
	public static void main(String[] args) {
		System.out.println(setIthBit(10, 2)); // 1010 -> 1110
		System.out.println(unsetIthBit(10, 1)); // 1010 -> 1000
		System.out.println(toogleIthBit(10, 1)); // 1010 -> 1000
		System.out.println(toogleIthBit(10, 0)); // 1010 -> 1011
	}

}
