class moviedetails{
    String name;
    int releaseYear;
    double rating;

   void display(){
        System.out.println("Movie Name: " + name);
        System.out.println("Release Year: " + releaseYear);
        System.out.println("Rating: " + rating);
    }
}
public class movie {
    public static void main(String[] args) {
       moviedetails obj1=new moviedetails();
            obj1.name="Inception";
            obj1.releaseYear=2021;
            obj1.rating=8.8; 
            obj1.display();
       moviedetails obj2=new moviedetails();
            obj2.name="The Dark Knight";
            obj2.releaseYear=2022;
            obj2.rating=9.0;
            obj2.display();
            moviedetails obj3=new moviedetails();
            obj3.name="Interstellar";
            obj3.releaseYear=2023;
            obj3.rating=8.6;
            obj3.display();
            moviedetails obj4=new moviedetails();
            obj4.name="The Matrix";
            obj4.releaseYear=2024;
            obj4.rating=8.7;
            obj4.display();
            moviedetails obj5=new moviedetails();
            obj5.name="The Shawshank Redemption";
            obj5.releaseYear=2025;
            obj5.rating=9.3;
            obj5.display();  
    }
    
}
