class MovieLibrary {
    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.title = "Forrest Gump";
        movie.description = "Historia życia Forresta, chłopca o niskim ilorazie inteligencji " +
                "z niedowładem kończyn, który staje się miliarderem i bohaterem wojny w Wietnamie.";
        movie.director = "Robert Zemeckis";
        movie.rating = 9;
        movie.oscars = true; // dodano inicjalizację zmiennej

        System.out.println("Informacje o filmie:");
        System.out.printf("Tytuł: %s\n", movie.title);
        System.out.printf("Opis: %s\n", movie.description);
        System.out.printf("Reżyser: %s\n", movie.director);
        System.out.printf("Ocena: %d/10\n", movie.rating); // zmiana %f(formats the floating-point numbers) na %d (formats decimal integers)
        System.out.printf("Czy otrzymał Oskara: %s\n", movie.oscars);
    }
}