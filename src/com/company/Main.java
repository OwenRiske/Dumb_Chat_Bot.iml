//Owen Riske

package com.company;

public class Main {

    public static void main(String[] args) {
        //introduce and ask name
        String name=Answer.userAnswer("Hello, I am Dumb Chat Bot \n\nWhat is your name?");

        //reply to favourite colour
        System.out.println("\nHello " + name+"\n");

        //ask favourite book genre
        String genre=Answer.userAnswer("What is your favourite book genre?");
        //reply to favourite book genre
        System.out.println("My favourite genre is Fantasy but " + genre +" is also good");

        //ask favourite colour
        String colour=Answer.userAnswer("What is your favourite colour?");

        //reply to favourite colour
        System.out.println(colour +" is a cool colour. My favourite is green.");

        //ask hobby
        String hobby=Answer.userAnswer("What is a hobby of your's?");

        //reply to favourite colour
        System.out.println(hobby+" is a good hobby. Mine is answering dumb questions");

        //regurgitate info
        System.out.println("\n\n\nYour name is " +name +". You like "+genre+" and your favourite colour is " +colour+".\nLastly your hobby is "+hobby);



    }
}
