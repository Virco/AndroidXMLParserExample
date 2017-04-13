package com.getgood.top10;

/**
 * Created by mvbrenes on 4/11/2017.
 */

public class FeedEntry {
    private String name, artist, releaseDate, summary, imageURL;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    @Override
    public String toString() {
        return "Application{" +
                "name='" + name + '\n' +
                ", artist='" + artist + '\n' +
                //", summary='" + summary + '\n' +
                ", releaseDate='" + releaseDate + '\n' +
                ", imageURL='" + imageURL + '}';
    }
}
