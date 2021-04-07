import java.util.*;

public class Actor{
    private String name;
    private ArrayList<Movie> movies;

    public Actor(String name, ArrayList<Movie> movies) {
        this.name = name;
        this.movies = new ArrayList<>();
        this.movies.addAll(movies);
    }

    public Actor() {
        this.name = "";
        this.movies = new ArrayList<>();
    }
 
    public int hashCode() {
        return name.hashCode();
    }

    public int compareTo(Actor that) {
        return this.getName().compareTo(that.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Movie> getMovies() {
        return movies;
	}
	
	public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return name.equals(actor.name);
    }

    private ArrayList<String> getMovieNames() {
        ArrayList<String> movieNames = new ArrayList<>();
        for (Movie movie: this.movies) {
            movieNames.add(movie.getName());
        }
        return movieNames;
    }

    public void addMovie(Movie movie) {
        if (!this.getMovieNames().contains(movie.getName())) {
            this.movies.add(movie);
        }
    }
}