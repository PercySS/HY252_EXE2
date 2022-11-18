package csd.uoc.gr.A23.battle;

import csd.uoc.gr.A23.person.*;
import csd.uoc.gr.A23.person.Character;
import csd.uoc.gr.A23.utilities.Utilities;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private final String groupName;
    private List<Member> members;


    public Group (String name) {
        //not sure if you wanted to finish the program, so I give a name in order to not finish so early.
        //System.exit(1);
        this.groupName = (name == null ? "Anonymous" : name);
        this.members = new ArrayList<Member>();
    }

    public String getGroupName() {
        return this.groupName;
    }

    public int getSize() {
        return this.members.size();
    }

    public int getNumberOfAliveMembers() {
        int ctr = 0;
//        for (int i = 0; i < members.size(); i++) {
//            if (members.get(i).isAlive()) {
//                ctr++
//            }
//        }
        for (Member member : members) {
            if (member.isAlive()) {
                ctr++;
            }
        }
        return ctr;
    }

    public boolean isDefeated() {
        return getNumberOfAliveMembers() == 0;
    }

    public Member pickRandomAliveMember() {
        if (this.getNumberOfAliveMembers() == 0) return null;

        while (true) {
            int rand = Utilities.getRandomVal(0, members.size() - 1);
            if (members.get(rand).isAlive()) {
                return members.get(rand);
            }
        }
    }

    public void addMember(Character member) {
        //not sure what you wanted to do in null character, so I finish the program.
        if (member == null) { System.exit(1); }
        this.members.add((Member) member);
    }
}
