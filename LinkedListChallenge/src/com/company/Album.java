package com.company;

import java.util.ArrayList;

public class Album {
    private ArrayList<Song> songs;

    public Album(String title, double duration) {
        this.songs = new ArrayList<Song>();
    }

    public boolean addSong(String title, double duration){
        Song newSong = new Song(title,duration);
        if(findSong(title) == null){
            this.songs.add(newSong);
            return true;
        }else
            return false;
    }

    public Song findSong(String title){
        for(int i=0; i<this.songs.size();i++){
            Song storedSong = this.songs.get(i);
            if(title == storedSong.getTitle()){
                return storedSong;
            }
        }
        return null;
    }
}
