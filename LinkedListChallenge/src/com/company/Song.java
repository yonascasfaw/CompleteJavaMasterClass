package com.company;

public class Song {
    private String title;
    private double Duration;

    public Song(String title, double duration) {
        this.title = title;
        Duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public double getDuration() {
        return Duration;
    }
}
