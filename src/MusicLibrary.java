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

    public void sortByTitle(){
        Album temp;
        int min;

        for (int i = 0; i < library.length-1 ; i++) {
            min = i;
            for (int scan = i+1; scan < library.length ; scan++) {
                if (library[scan] != null && library[i] != null) {
                    if(library[scan].getName().compareToIgnoreCase(library[min].getName()) < 0){
                        min = scan;
                    }
                }
            }

            temp = library[min];
            library[min] = library[i];
            library[i] = temp;
        }
    }

    public void sortByArtist(){
        for (int i = 0; i < library.length ; i++) {
            Album key = library[i];
            int position = i;
            if (library[position] != null && key != null) {
                while (position > 0 && library[position - 1].getArtist().compareToIgnoreCase(key.getArtist()) > 0) {
                    library[position] = library[position - 1];
                    position--;
                }
                library[position] = key;
            }
        }
    }

    public int binarySearchName(String target) {
        sortByTitle();
        int low = 0, high = library.length-1, middle = (low + high)/2;

        while (!library[middle].getName().equals(target) && low <= high){
            if (target.compareTo(library[middle].getName()) < 0)
                high = middle - 1;
            else
                low = middle + 1;
            middle = (low + high)/2;
        }

        if (library[middle].getName().equals(target))
            return middle;
        else
            return -1;
    }

    public int binarySearchArtist(String target) {
        sortByArtist();
        int low = 0, high = library.length-1, middle = (low + high)/2;

        while (!library[middle].getArtist().equals(target) && low <= high){
            if (target.compareTo(library[middle].getArtist()) < 0)
                high = middle - 1;
            else
                low = middle + 1;
            middle = (low + high)/2;
        }

        if (library[middle].getArtist().equals(target))
            return middle;
        else
            return -1;
    }

}
