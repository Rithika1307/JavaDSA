
public class greatestin_Array {

	public static void main(String[] args) {
		int[] arr= {23,12,65,3,4};
		int avg=0;
        for(int i=0;i<5;i++) {
        	avg=avg+arr[i];
        }
        avg=avg/5;
        for(int i=0;i<5;i++) {
        	if(arr[i]>avg) {
        		System.out.println(arr[i]);
        	}
        }
	}

}
