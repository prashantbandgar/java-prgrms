import java.util.Scanner;

public class TestPersonervice {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice=0;
		do {
			System.out.println("1.enter name\n 2.displayAll\n 3.exit\n choice:");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				PersonService.AddNew();
				break;
			case 2:
				PersonService.displayAll();
				break;
			case 3:
				System.out.println("Thank you for visiting.....");
				break;
				
			}
			
		}while(choice!=0);
		

	}

}
