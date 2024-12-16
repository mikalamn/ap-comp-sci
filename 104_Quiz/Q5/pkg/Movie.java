package pkg;

public class Movie{
    String movieName;
    double rating;
    int numRatings;
    int revenue;
    
public Movie(){
    movieName = "Avengers";
    rating = 8.0;
    numRatings = 33;
    revenue = 623357910;
}
public Movie(String movieName, double rating, int numRatings, int revenue){
    this.movieName = movieName;
    this.rating = rating;
    this.numRatings = numRatings;
    this.revenue = revenue;
}
public void movieToString(){
    System.out.println("Movie: " + movieName);
    System.out.println("Rating: " + rating);
    System.out.println("Number of Ratings " + numRatings);
    System.out.println("Revenue: " + revenue);
}
public String getMovieName(){
    return movieName;
}
public int getRevenue(){
    return revenue;
}
public double addRating(double a){
    numRatings = numRatings + 1;
    rating = ((rating * numRatings) + a)/numRatings;
    return rating;
}
public boolean compareRatings(Movie x){
    return rating > x.rating;
}
public int revenueToString(){
return revenue;
    
}
}
