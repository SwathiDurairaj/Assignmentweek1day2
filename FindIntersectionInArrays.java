package AssignmentWeek1Day2;

public class FindIntersectionInArrays {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
int firstArray[]= {3,2,11,4,6,7};
int secondArray[]= {1,2,8,4,9,7};
for(int i=0;i<firstArray.length;i++) {
	for(int j=0;j<secondArray.length;j++) {
		
		if(firstArray[i]==secondArray[j] ) {
		System.out.println("Intersection of two Arrays:" +secondArray[j]);	
		}
	}
}

	}

}
