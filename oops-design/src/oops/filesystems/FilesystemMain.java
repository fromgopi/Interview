package oops.filesystems;

public class FilesystemMain {
    public static void main(String[] args) {
        Directory root = new Directory("root");
        File file = new File("Sample.pdf");
        root.add(file);
        Directory movie = new Directory("movie");
        root.add(movie);

        Directory englishMovie = new Directory("english");

        englishMovie.add(new File("IronFist.mp4"));
        englishMovie.add(new File("The Shawshank Redemption.mp4"));
        englishMovie.add(new File("ZotaPia.mp4"));
        File despicableMe = new File("DespicableMe.mp4");
        englishMovie.add(despicableMe);
        movie.add(englishMovie);

        root.printTree();
    }
}
