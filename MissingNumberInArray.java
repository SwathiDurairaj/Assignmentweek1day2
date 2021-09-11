package AssignmentWeek1Day2;

public class MissingNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] givnum = { 1, 2, 3, 4, 6, 7, 8 };
		int[] open = new int[givnum.length];
		for (int i : givnum) {
			open[i] = 1;
		}
		System.out.println("The Missing Number is:");
		for (int i = 0; i < open.length; i++) {
			if (open[i] == 0) {
				System.out.println(i);
			}

		}

	}

}

