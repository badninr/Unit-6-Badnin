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

}
