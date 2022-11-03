/* Q:2 */
package lab;
public class DuplicateElementArray {

	public static void main(String[] args) {
		int count;
int arr[]= {1,2,3,4,3,6,4};
for(int i=0;i<arr.length;i++) {
	for(int j=i+1;j<arr.length;j++) {
		if(arr[i]==arr[j]) {
			System.out.println("Duplicate array Element is= "+arr[j]);
		}
	}
}
	}

}
