
package com.impetusits;

/**
 *
 * @author Akash
 */
public class TestPlayerMap {

    public static void main(String[] args) {
        FootBallTeam dreamteam = new FootBallTeam();
        dreamteam.add("forward", "henry");
        dreamteam.add("rightwing", "ronaldo");
        dreamteam.add("goalkeeper", "kahn");

        System.out.println("Forward is " +  dreamteam.get("forward"));
        System.out.println("Right wing is " + dreamteam.get("rightwing"));
        System.out.println("Goalkeeper is " + dreamteam.get("goalkeeper"));
        dreamteam.add("goalkeeper", "subruto");
        System.out.println("Goalkeeper is " + dreamteam.get("goalkeeper"));
        System.out.println("Team Members are as Follows:");
        dreamteam.listTeamMembers();
    }
}

