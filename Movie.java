/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package in.project;
//import com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Entity;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import javafx.scene.control.Label;
//import javafx.scene.image.Image;
//import javafx.scene.image.ImageView;
import javax.persistence.Table;



/**
 *
 * @author janawalaa
 */
//
 @ Entity
 @ Table(name="Movie")
 
public class Movie implements java.io.Serializable{

   
   @Id
   @ Column(name="MovieID") 
   private int  movieID ;

   @ Column(name="MovieName") 
   private String movieName;
   @ Column(name="Description")
   private String description;
  @ Column(name="MovieGenre")
   private String movieGenre;
  @ Column(name="MovieTrailer")
   private String movieTrailer;
 @ Column(name="MoviePoster")
   private String moviePoster;
////  @ Column(name="MoviePrice")
//   private int moviePrice;

//  private  Label mlable ;
   
public Movie(){


}
   public Movie(int  movieID ,String movieName,String description,String movieGenre,String movieTrailer,String moviePoster){
     this.movieID = movieID;
     this.movieName = movieName;
     this.description = description;
     this.movieGenre = movieGenre;
     this.movieTrailer = movieTrailer;
     this.moviePoster = moviePoster;
    
   }
   
   
    public int getMovieID() {
        return movieID;
    }

    public void setMovieID(int movieID) {
        this.movieID = movieID;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMovieGenre() {
        return movieGenre;
    }

    public void setMovieGenre(String movieGenre) {
        this.movieGenre = movieGenre;
    }

    public String getMovieTrailer() {
        return movieTrailer;
    }

    public void setMovieTrailer(String movieTrailer) {
        this.movieTrailer = movieTrailer;
    }

    public String getMoviePoster() {
        return moviePoster;
    }

    public void setMoviePoster(String moviePoster) {
        this.moviePoster = moviePoster;
    }

//    public int getMoviePrice() {
//        return moviePrice;
//    }
//
//    public void setMoviePrice(int moviePrice) {
//        this.moviePrice = moviePrice;
//    }
//    
    
//    public void setLable () throws FileNotFoundException{
//     ImageView imageView_add = new ImageView(new Image(new FileInputStream(moviePoster))); 
//        imageView_add.setFitHeight(80);
//        imageView_add.setFitWidth(80);
//    mlable=new Label(movieName,imageView_add);
    
    }
    
//    
//    public Label getLable(){
//        
//   return mlable;
//    }
//    
   
    
//    
//}   
//    
//}
