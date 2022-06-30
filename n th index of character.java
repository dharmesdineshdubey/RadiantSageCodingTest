import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String a="who is the expert in the domain of corelab automation industry";
		int n,count=0;
		System.out.println(" Enter the nth");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		char ch;
		System.out.println(" enter the Character");
		ch=sc.next().charAt(0);
		char []arr=new char[a.length()];
		arr=a.toCharArray();
// 		for(int i=0;i<a.length();i++)
// 		{
// 			arr[i]=a.charAt(i);
// 			//System.out.println(arr[i]);
// 		}
		for(int i=0;i<a.length();i++)
		{
			if(arr[i]==ch) 
			{
				count++;
				if(count==n) {
				System.out.println(i);
				    
				}
			}
}
}
}