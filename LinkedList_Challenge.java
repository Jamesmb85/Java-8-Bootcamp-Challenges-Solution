package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    // To create an object of Scanner class, we usually pass the predefined object System.in, which represents the standard input stream.
    private static Scanner sc = new Scanner(System.in);

    //arraylist of albums
    private static ArrayList<Album> gymPlayList = new ArrayList<Album>();

    public static void main(String[] args) {
	// write your code here
        // Create a program that implements a playlist for songs
        // Create a Song class having Title and Duration for a song.
        // The program will have an Album class containing a list of songs.
        // The albums will be stored in an ArrayList
        // Songs from different albums can be added to the playlist and will appear in the list in the order
        // they are added.
        // Once the songs have been added to the playlist, create a menu of options to:-
        // Quit,Skip forward to the next song, skip backwards to a previous song.  Replay the current song.
        // List the songs in the playlist
        // A song must exist in an album before it can be added to the playlist (so you can only play songs that
        // you own).
        // Hint:  To replay a song, consider what happened when we went back and forth from a city before we
        // started tracking the direction we were going.
        // As an optional extra, provide an option to remove the current song from the playlist
        // (hint: listiterator.remove()

        //create new Album
        Album newEdition = new Album("New Edition's Greatest Hits", "New Edition");

        //add song to album
        newEdition.addSong("Candy Girl", 3.45);
        newEdition.addSong("Cool it now", 3.00);
        newEdition.addSong("Can you stand the rain", 4.45);
        newEdition.addSong("If it isn't love", 5.56);

        //add whole album to gymlist
        gymPlayList.add(newEdition);


        //create another album
        Album hipHop = new Album("90s hip hop", "various");

        //add song to album
        hipHop.addSong("I don't want to be a player no more ", 4.21);
        hipHop.addSong("Stan ", 6.32);
        hipHop.addSong("Jamboree ", 3.67);

        //add whole to gymlist
        gymPlayList.add(hipHop);


        LinkedList<Songs> playlist = new LinkedList<Songs>();
        gymPlayList.get(1).addToPlayList(1, playlist); //adding "I don't want to be a player no more" as the first song
        gymPlayList.get(0).addToPlayList(2, playlist); //adding "Candy Girl" as the second song
        gymPlayList.get(0).addToPlayList(3, playlist); //adding "Cool it now" as third song
        //gymPlayList.get(0).addToPlayList(5, playlist); //track number doesn't exist

        //call play function
        play(playlist);

    }

    //method to print playlist menu
    public static void printMenu(){
        System.out.println("Available options \npress");
        System.out.println("0 - to quit \n" +
                "1 - go to the next song\n"+
                "2 - go to the previous song\n" +
                "3 - replay the current song\n" +
                "4 - list songs in playlist\n" +
                "4 - print menu againt\n" +
                "5 - remove current song from playlist");
    }


    //method to print current songs in playlist
    private static void printPlayList(LinkedList<Songs> hypemusic){
        //need an iterator
        Iterator<Songs> songsInList = hypemusic.iterator();

        System.out.println("======================================");

        while(songsInList.hasNext() ){
            System.out.println(songsInList.next());
        }

        System.out.println("======================================");
    }


    //method for play functons
    private static void play(LinkedList<Songs> hypemusic){

        //variables
        boolean quit = false;
        boolean goForward = true;



        //use iterator to go through LinkedList
        //hypemusic is a collections object and calls iterator
        //currentSong is of type Iterator
        ListIterator<Songs> currentSong = hypemusic.listIterator();


        if(hypemusic.size() == 0){
            System.out.println("No songs in playlist");
            return;
        }

        printMenu();


        while(!quit){
            System.out.println("\n");
            System.out.println("Enter a menu option: ");
            int action = sc.nextInt();

            //clear the input line
            sc.nextLine();

            switch(action){
                case 0:
                    System.out.println("Workout is over. Closing playlist");
                    quit = true;
                    break;
                case 1:
                    //block of code test if iterator has another element in the LinkedList and then goes to it
                    /////////////////////////////////////////
                    if(!goForward){
                        if (currentSong.hasNext() ){
                            // Returns true if the iterator has more elements
                            currentSong.next();
                            //currentSong.next(). returns the next elements in the iteration

                        }
                    }
                    goForward = true;
                    /////////////////////////////////////////

                    if (currentSong.hasNext() ){
                        // Returns true if the iterator has more elements
                        System.out.println("Now listening to  " + currentSong.next().toString() );
                    }

                    else{
                        //no next element in the LinkedList
                        System.out.println("You've reached the end of the playlist");
                        goForward = false;
                    }
                    break;
                case 2:
                    //block of code test if iterator has previous element in the LinkedList and then goes to it
                    /////////////////////////////////////////
                    if(goForward){
                        if (currentSong.hasPrevious() ){
                            // Returns true if the iterator has more elements behind current position
                            currentSong.previous();
                            //currentSong.previous() returns the previous elements in the iteration

                        }
                    }
                    goForward = false;
                    /////////////////////////////////////////
                    if (currentSong.hasPrevious() ){
                        System.out.println("Now listening to " + currentSong.previous() );
                    }
                    else {
                        System.out.println("We are at the beginning of the playlist");
                        goForward = true;
                    }
                    break;
                case 3:
                    if(goForward){
                        //if you want to repeat the previous song
                        if(currentSong.hasPrevious() ){
                            System.out.println("Now replaying " + currentSong.previous().toString() );
                            goForward = false;
                        }
                        else{
                            //there is no previous song
                            System.out.println("We are at the beginning of the list");
                        }
                    }

                    else{
                        //if you want to repeat the next song
                        if(currentSong.hasNext() ){
                            System.out.println("Now replaying " + currentSong.next().toString() );
                            goForward = true;
                        }
                        else{
                            //there is no next song
                            System.out.println("We are at the end of the list");
                        }
                    }

                    break;
                case 4:
                    printPlayList(hypemusic);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    currentSong.remove(); //removes the current song
                    //need to remove the iterator
                    if(currentSong.hasNext() ){
                        System.out.println("Now playing " + currentSong.next() );
                    }
                    else if(currentSong.hasPrevious()){
                        System.out.println("Now playing " + currentSong.previous() );
                    }
                    break;
            }
        }



    }


}


//////////////////////////////////////////////////////Album Class//////////////////////////////////////////////////////////////
package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String albumName;
    private String artistName;

    //albums are stored in an ArrayList
    private ArrayList<Songs> songList;

    //overload constructor
    public Album(String albumName, String artist) {
        this.albumName = albumName;
        this.artistName = artist;
        //need to initialize the ArrayList with all of the songs from the Songs class.
        this.songList = new ArrayList<Songs>();

    }

    //methods

    //find song in album
    private Songs findSong(String searchSong){
        //return type is of type Songs(class) type
        //call contain method to see if ArrayList songList contains a string

        //need to loop through Arraylist to see if song exist
        for(int i = 0; i < songList.size(); i++){
            //create a new object and assign a value greater than or equal to 0
            Songs doesSongExist = this.songList.get(i);

            //doesSongExist instance can call method from Songs class
            //getName returns a name and equals method returns a true or false
            if(doesSongExist.getTitle().equals(searchSong)){
                return doesSongExist;
            }

        }

        return null;

    }

    //add song to album
    public boolean addSong(String songName, double songLength){

        //check to see if song already exist on the album
        //use findsong method above
        if (findSong(songName) == null){
            //if songname doesn't exist, then add new Instance of Songs to ArrayList
            this.songList.add(new Songs(songName, songLength));
            return true;
        }

        //songname exist so do nothing
        return false;

    }

    //method to add songs from an album to the playlist
    //parameters are the trackNumber and the playlist
    public boolean addToPlayList(int trackNumber, LinkedList<Songs> playlist){
        int index = trackNumber - 1;

        //check to see if song is in playlist already at this index
        if( (index >= 0) && (index <= this.songList.size() ) ){
            //add song to the playlist object that was passed at the index
            playlist.add(this.songList.get(index));
            return true;
        }

        System.out.println("This album does not have a a track we want to add");
        return false;
    }


}
//////////////////////////////////////////////////////Album Class//////////////////////////////////////////////////////////////


//////////////////////////////////////////////////////Songs Class//////////////////////////////////////////////////////////////
package com.company;

public class Songs {
    private String title;
    private double duration;

     /*Parameterized Constructor: A constructor that has parameters is known as parameterized constructor. If we want to initialize fields of the class
    with your own values, then use parameterized constructor*/

    // Parameterized constructor would initialized data members
    // with the values of passed arguments while
    // object of that class created.
    public Songs(String title, double duration) {
        //this keyword means the variable(private String title) is updated with the parameter(String title) in the method
        //during code execution, this.title is replaced by obj.title, and title on the left hand side is the instance variable
        //and title on the right side is the local variable(parameter)
        this.title = title;
        this.duration = duration;
    }

    //getters for each variable
    //getter is a method that reads value of a variable
    public String getTitle() {
        return title;
    }

    public double getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return this.title + " : " + this.duration;
    }
}
//////////////////////////////////////////////////////Songs Class//////////////////////////////////////////////////////////////
