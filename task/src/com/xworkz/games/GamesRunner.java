package com.xworkz.games;

import com.xworkz.games.videogames.VideoGames;

public class GamesRunner {
    public static void main(String[] args) {
        VideoGames videoGames = new VideoGames();
        videoGames.category();
        videoGames.platform();
        videoGames.rating();

        Games games = new Games();
        games.category();
        games.platform();
        games.rating();
    }
}
