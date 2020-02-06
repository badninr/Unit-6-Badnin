public class Album {
    private String name;
    private String artist;
    private int numSongs;
    private double length;

    public Album(String name, String artist, int numSongs, double length){
        this.name = name;
        this.artist = artist;
        this.numSongs = numSongs;
        this.length = length;
    }

    public double getLength(){
        return length;
    }

    public String toString(){
        return "Name: " + name + "\nArtist: " + artist + "\nNumber of Songs: " + numSongs + "\nLength: " + length;
    }

}
