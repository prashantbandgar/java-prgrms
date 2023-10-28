import java.util.Scanner;

public class PersonService {
	static Person[]parr;
	static int cnt;
	static {
		parr=new Person [100];
		parr[0]=new Person("tanmay","asdv@");
		parr[1]=new Person("jay","asd");
		cnt=2;
		
	}
	public static void AddNew() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		String name=sc.next();
		sc.nextLine();
		System.out.println("enter emailid");
		String emailid=sc.next();
		parr[cnt]=new Person(name,emailid);
		cnt++;
		
		
	}
	public static void displayAll() {
		for(int i=0;i<cnt;i++) {
			System.out.println(parr[i]);
		}
		
	}
	

}
