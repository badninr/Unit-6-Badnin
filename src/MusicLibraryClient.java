public class MusicLibraryClient {
    public static void main(String[] args) {
        MusicLibrary myLibrary = new MusicLibrary();

        Album a1 = new Album("First", "one Guy", 10, 42.5);
        Album a2 = new Album("This Music", "Some Band", 9, 36);
        Album a3 = new Album("Play", "People", 12, 39.1);
        Album a4 = new Album("a", "m", 8, 45);
        Album a5 = new Album("b", "x", 8, 45);
        Album a6 = new Album("c", "c", 8, 45);
        Album a7 = new Album("y", "b", 8, 45);
        Album a8 = new Album("z", "k", 8, 45);
        Album a9 = new Album("v", "u", 8, 45);
        Album a10 = new Album("r", "n", 8, 45);


        myLibrary.add(a1);
        myLibrary.add(a2);
        myLibrary.add(a3);
        myLibrary.add(a4);
        myLibrary.add(a5);
        myLibrary.add(a6);
        myLibrary.add(a7);
        myLibrary.add(a8);
        myLibrary.add(a9);
        myLibrary.add(a10);



        System.out.println(myLibrary);

        System.out.println("+++++++++++++++++++++++++++++++++++++++");
/*      myLibrary.doubleSize();
        System.out.println(myLibrary);
        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        System.out.println("Test Selection Sort");
        myLibrary.sortByTitle();
        System.out.println(myLibrary);
        System.out.println("+++++++++++++++++++++++++++++++++++++++");
       System.out.println("Test Insertion Sort");
        myLibrary.sortByArtist();
        System.out.println(myLibrary);
*/


        int loc = myLibrary.binarySearchName("y");
        System.out.println("Found 'y' at index: " + loc);
        System.out.println(myLibrary.getAlbum(loc));

        loc = myLibrary.binarySearchName("Second");
        System.out.println("Found 'Second' at index: " + loc);
        System.out.println(myLibrary.getAlbum(loc));

        System.out.println("+++++++++++++++++++++++++++++++++++++++");


    }
}