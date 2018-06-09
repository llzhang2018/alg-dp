import java.util.Scanner;
/**
 * 子串相加求和
 * @author DELL
 *
 */
public class Sumofallsubstrings {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();		
		for(int i=0;i<T;i++){
		    int a=sc.nextInt();
		    String str=a+"";
		    System.out.println(getSum(str));
		}
		
		sc.close();
	}
	public static int getSum(String str){
		int n=str.length();
		int[] arr=new int[n];
		
		arr[0]=str.charAt(0)-'0'; //初值
		
		for(int i=1;i<n;i++){ //转移方程
			int diff=0;
			for(int j=i;j>=0;j--){
				diff+=Integer.valueOf(str.substring(j,i+1));
			}			
			arr[i]=arr[i-1]+diff;
		}
		
		return arr[n-1];
	}
}
