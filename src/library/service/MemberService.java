package library.service;

import java.util.ArrayList;
import library.model.Member;
import library.exception.MemberNotFoundException;

/**
 * Handles member CRUD operations.
 */
public class MemberService {

    private ArrayList<Member> members = new ArrayList<>();

    public void addMember(Member member) {
        members.add(member);
    }

    public Member findMember(int id) throws MemberNotFoundException {
        for (Member m : members) {
            if (m.getMemberId() == id) {
                return m;
            }
        }
        throw new MemberNotFoundException("Member ID not found!");
    }
}
