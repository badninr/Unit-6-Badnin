public class MusicLibrary {
    private Album[] library;
    private Album[] prevLibrary;

    public MusicLibrary(){
        library = new Album[0];
    }

    public void add(Album inp){
        prevLibrary = new Album[library.length];
        for (int i = 0; i < prevLibrary.length; i++) {
            prevLibrary[i] = library[i];
        }

        library = new Album[prevLibrary.length+1];
        for (int i = 0; i < library.length; i++) {
            library[i] = prevLibrary[i];
        }
        library[library.length-1] = inp;
    }

    public void doubleSize(){
        prevLibrary = new Album[library.length];
        for (int i = 0; i < prevLibrary.length; i++) {
            prevLibrary[i] = library[i];
        }

        library = new Album[prevLibrary.length*2];
        for (int i = 0; i < library.length; i++) {
            library[i] = prevLibrary[i];
        }
    }

    public void remove(int index){
        prevLibrary = new Album[library.length-1];
        for (int i = 0; i < prevLibrary.length; i++) {
            if (i != index) {
                prevLibrary[i] = library[i];
            }
        }

        library = new Album[prevLibrary.length*2];
        for (int i = 0; i < library.length; i++) {
            library[i] = prevLibrary[i];
        }
    }

    public String toString(){
        return ""
    }

}
