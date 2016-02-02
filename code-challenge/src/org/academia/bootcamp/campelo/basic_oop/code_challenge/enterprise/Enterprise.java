package org.academia.bootcamp.campelo.basic_oop.code_challenge.enterprise;

import org.academia.bootcamp.campelo.basic_oop.code_challenge.player.Player;

/**
 * Created by campelo on 01/02/16.
 */
public class Enterprise {
    private String name;
    private String greeting;
    private int guards;

    public int getGuards() {
        return guards;
    }

    public void setGuards(int guards) {
        this.guards = guards;
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public void printGreeting(){
        System.out.println(greeting);
    }

    public Enterprise(){
        this.name = this.getClass().getSimpleName();
    }

    public String getWelcomeGreeting(Player player){
        String result = greeting + ", ";
        if(player.getAlias() != null && player.getAlias().length() > 0){
            result += player.getAlias();
        }
        return result;
    }
}
