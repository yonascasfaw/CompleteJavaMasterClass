package com.company;

import java.util.ArrayList;

public class Album {
    private String title;
    private ArrayList<Song> songs;

    public Album(String title) {
        this.songs = new ArrayList<Song>();
        this.title = title;
    }

    public boolean addSong(String title, double duration){
        if(findSong(title) == null){
            this.songs.add(new Song(title,duration));
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
