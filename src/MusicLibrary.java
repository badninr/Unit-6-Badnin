public class MusicLibrary {
    private Album[] library;


    public MusicLibrary(){
        library = new Album[10];
    }

    //Looks for spot that's null, adds album there then returns true. If no null spots, don't add, return false
    public boolean add(Album inp){
        for (int i = 0; i < library.length; i++){
            if (library[i] == null){
                library [i] = inp;
                return true;
            }
        }
        return false;
    }

    public void doubleSize(){
        Album[] prev = new Album[library.length];
        for (int i = 0; i < library.length; i++){
            prev[i] = library[i];
        }

        library = new Album[prev.length*2];
        for (int i = 0; i < prev.length; i++){
            library[i] = prev[i];
        }

    }

    public boolean remove(int index){
        if (index >= 0 && index < library.length && library[index] != null){
            library[index] = null;
            return true;
        }
        return false;
    }

    public String toString() {
        String result = "";
        for (Album a : library){
            if (a != null) {
                result += a.toString() + "\n";
            } else {
                result += "EMPTY\n";
            }
        }
        return result;
    }

    public int findTitle(String title){
        for (int i = 0; i < library.length; i++){
            if (library[i]!= null && library[i].getName().equals(title)){
                return i;
            }
        }
        return -1;
    }

    public int findArtist(String artist){
        for (int i = 0; i < library.length; i++){
            if (library[i]!= null && library[i].getArtist().equals(artist)){
                return i;
            }
        }
        return -1;
    }

    public Album getAlbum(int index){
        if (index >= 0 && index <= library.length) {
            return library[index];
        } else {
            System.out.println("Index out of bounds");
            return null;
        }
    }

    public void selectionSort(){
        for ( int i=0; i < library.length-1; i++ ){
            int min = i;
            for ( int k = i+1; k < library.length; k++ )
                if (library[k].getName().compareTo(library[min].getName()) < 0 ) min = k;

            String temp = library[i].getName();
            library[i] = library[min];
            library[min] = temp;
        }
    }


}
