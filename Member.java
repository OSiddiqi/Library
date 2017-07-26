package Library;

import java.util.ArrayList;
import java.util.Date;

public abstract class Member implements MemberManagement {

	ArrayList<MemberManagement> members = new ArrayList<MemberManagement>();

	public Member() {
	
	int memberId;
	String memberName;
	Date dOB;
	MemberManagement n;
	
	public void addMember() { 
		members.add(memberId);
		members.add(memberName);
		members.add(dOB);
	}
	
	

	public void removeMemberByName() {
		members.remove(memberName);
		for (MemberManagement n : members) {
			if (n.equals(memberName)) {

				members.remove(n);
			} else {
				System.out.println("Cannot remove this ID");
			}

		}
	}

	public static removeMemberById(memberId) {
		members.remove(e);

	}
}}
