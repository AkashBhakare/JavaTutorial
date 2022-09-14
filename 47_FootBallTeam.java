
package com.impetusits;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Akash
 */
public class FootBallTeam {

    private final HashMap<String,String> players;
    /**
     * Construct a FootBall team with no players initially
     */
    public FootBallTeam() {
        players = new HashMap<>();
    }
    
    /**
     * Takes the position of the player as its 
     * argument and returns the player playing at that position
     * @param playing_position
     * @return Returns the name of the player
     */
    public String get(String playing_position) {
        return players.get(playing_position);
       
    }

    /**
     * This method takes player position and name as argument
     * and store the same
     * @param position
     * @param name 
     */
    public void add(String position, String name) {
        players.put(position, name);
    }
    
    /**
     * List the players in the team; with their position and name
     */
    public void listTeamMembers(){
        Set<Map.Entry<String,String>> set;
        set = players.entrySet();
        
        Iterator<Map.Entry<String,String>> iter;
        iter = set.iterator();
        
        Map.Entry<String,String> entry;
        while(iter.hasNext()){
//            System.out.println(iterator.next());
            entry = iter.next();
            System.out.print("Key:"+entry.getKey());
            System.out.println("\tValue:"+entry.getValue());
        }
    }
}
