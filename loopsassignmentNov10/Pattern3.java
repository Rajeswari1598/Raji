package loopsassignmentNov10;

public class Pattern3 {
	public void hashPattern() {
		for(int i=1;i<=7;i++) {
			for(int j=1;j<=7;j++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
         Pattern3 pattern =new Pattern3();
         pattern.hashPattern();
	}

}
