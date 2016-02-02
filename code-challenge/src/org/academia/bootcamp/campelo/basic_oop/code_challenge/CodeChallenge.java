package org.academia.bootcamp.campelo.basic_oop.code_challenge;

import org.academia.bootcamp.campelo.basic_oop.code_challenge.enterprise.Ecorp;
import org.academia.bootcamp.campelo.basic_oop.code_challenge.enterprise.Enterprise;
import org.academia.bootcamp.campelo.basic_oop.code_challenge.enterprise.Fsociety;
import org.academia.bootcamp.campelo.basic_oop.code_challenge.player.Elliot;
import org.academia.bootcamp.campelo.basic_oop.code_challenge.player.Player;

/**
 * Created by campelo on 01/02/16.
 */
public class CodeChallenge {
    private Enterprise ecorp;
    private Enterprise fsociety;

    private Player elliot;

    public CodeChallenge(){
        elliot = new Elliot();
        ecorp = new Ecorp();
        fsociety = new Fsociety();

        elliot.setAlias("Mr. Robot");
        ecorp.setGreeting("Power belongs to those who take it");
    }

    public void runTask(int taskIndex){
        switch (taskIndex){
            case 0:
                taskZero();
                break;
            case 1:
                taskOne();
                break;
            case 2:
                taskTwo();
                break;
            case 3:
                taskThree();
                break;
            case 4:
                taskFour();
                break;
            case 5:
                taskFive();
                break;

        }
    }

    private void taskZero(){
        System.out.println("============================");
        System.out.println("Task Zero (hint_ & dry run_)");

        /*
        // Please try typing and running the following code. We're sure you will find it useful.

        //Declare a new variable.
        var eCorpGreetings = "Power belongs to those who take it";

        // Show the variable content on the console.
        console.log(eCorpGreetings);
        */
        ecorp.printGreeting();

        /*
        // Declare a new variable and assign your alias to it.
        // Join your alias to the following description and show it on the console.

        var fSocietyRules = "We don't use names, only aliases. Welcome to the fsociety, ";
        */
        System.out.println(fsociety.getWelcomeGreeting(elliot));

    }

    private void taskOne(){
        System.out.println("============================");
        System.out.println("<Hacking Task> #1_");
    }

    private void taskTwo(){
        System.out.println("============================");
        System.out.println("<Hacking Task> #2_");

    }

    private void taskThree(){
        System.out.println("============================");
        System.out.println("<Hacking Task> #3_");
    }

    private void taskFour(){
        System.out.println("============================");
        System.out.println("<Hacking Task> #4_");
    }

    private void taskFive(){
        System.out.println("============================");
        System.out.println("<Hacking Task> #5_");
    }
}
