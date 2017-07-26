package Library;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public interface MemberManagement {

	public default void ConsoleMenu() {

		Scanner input = new Scanner(System.in);
		int selection = 0;

		while (selection < 4) {
			System.out.println("1. Add a new member");
			System.out.println("2. Delete a member by ID");
			System.out.println("3. Delete a member by name");

			selection = input.nextInt();

			int memberId;
			String memberName;
			Date dOB = null;
			
			switch (selection) {
			case 1: // add a member
				System.out.println("Enter the new member ID number: ");
				memberId = input.nextInt();
				System.out.println("Enter full name: ");
				memberName = input.nextLine();
				System.out.println("Enter Date of birth in the format DD/MM/YYYY");
				String date = input.nextLine();
				try {
					Date dOB1 = new SimpleDateFormat("dd/MM/yyyy").parse(date);
					
				} catch (ParseException e1) {
					e1.printStackTrace();
					return;
				}
				break;

			case 2: // delete a member by ID
				System.out.println("Enter the member ID you want to delete: ");
				memberId = input.nextInt();
				Member.removeMemberById(memberId);
				break;

			case 3: // delete a member by name
				System.out.println("Enter the member name you want to delete: ");
			default:
				System.out.println("Please enter an accepted value between 1 and 3");

			}
			input.close();
		}
	}
}
