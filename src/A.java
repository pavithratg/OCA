public class A {

	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5,6};
		int[] arr2 = null;
		
		System.arraycopy(arr1,2, arr2, 0, 2);
		
		for(int i : arr2){System.out.println(i);}
		}

	}


