
public class Max_Min_Array {

	public static void main(String[] args) {
		int arr[]= {45,29,14,0,146,1000,47};
		int max=arr[0],min=arr[0];
		for(int i=1;i<arr.length-1;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("Maximum element is:"+max);
		System.out.println("Minimum element is:"+min);
	}

}
