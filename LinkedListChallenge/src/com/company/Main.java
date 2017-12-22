package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    private static Album myAlbum = new Album("encore");
    private static LinkedList<Song> playList = new LinkedList<Song>();


    public static void main(String[] args) {

        myAlbum.addSong("skyfall", 2);
        myAlbum.addSong("goldfinger", 3);
        myAlbum.addSong("riddick", 1);
        myAlbum.addSong("superman", 4);
        myAlbum.addSong("predator", 5);

        addInOrder(playList,"skyfall" );
        addInOrder(playList,"goldfinger" );
        addInOrder(playList,"riddick" );
        addInOrder(playList,"superman" );
        addInOrder(playList,"predator" );

        printSongs(playList);
        printMenu();
        playMusic(playList);





    }


    public static void addInOrder(LinkedList<Song> playList, String songName){
        ListIterator<Song> playListIterator = playList.listIterator();
        Song song = myAlbum.findSong(songName);
        if(song != null){
            playListIterator.add(song);
        }


    }

    public static void removeSong(LinkedList<Song> playList, Song song){
        ListIterator<Song> playListIterator = playList.listIterator();
        playListIterator.remove();
    }

    public static void printMenu(){
        System.out.println("Available choices are:");
        System.out.println("0 to quit.\n" +
                "1 to play next song.\n" +
                "2 to play previous song.\n" +
                "3 to replay the current song.\n" +
                "4 to print menu options.\n");
    }

    public static void printSongs(LinkedList<Song> playList){
        Iterator<Song> playListIterator = playList.iterator();
        System.out.println("Songs in your playlist:");
        while(playListIterator.hasNext()){
            System.out.println(playListIterator.next().getTitle());
        }
    }

    public static void playMusic(LinkedList<Song> playList){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<Song> playListIterator = playList.listIterator();
        if(playList.isEmpty()){
            System.out.println("No songs in the playlist.");
        }else {
            System.out.println(playListIterator.next().getTitle() + " is playing.");
            printMenu();
        }
        while(!quit){
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 0:
                    quit = true;
                    break;
                case 1:

                    if(!goingForward){
                        if(playListIterator.hasNext()){
                            playListIterator.next();
                        }
                        goingForward = true;
                    }

                    if(playListIterator.hasNext()){
                        System.out.println(playListIterator.next().getTitle() + " is playing.");
                    }else{
                        System.out.println("this is the last song on the playlist.");
                        goingForward = false;
                    }

                    break;
                case 2:
                    if(goingForward){
                        if(playListIterator.hasPrevious()){
                            playListIterator.previous();
                        }
                        goingForward = false;
                    }

                    if(playListIterator.hasPrevious()){
                        System.out.println(playListIterator.previous().getTitle() + " is currently playing.");
                    }else{
                        System.out.println(" This is the first song on the playlist.");
                        goingForward = true;
                    }
                    break;
                case 3:
                    if(playListIterator.hasPrevious()){
                        System.out.println(playListIterator.previous().getTitle() + " is currently playing.");
                    }else{
                        System.out.println(" This is the first song on the playlist.");
                        goingForward = true;
                    }
                    break;
                case 4:
                    printMenu();
            }
        }

    }
}



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