/*Movie Theatre Management System, where you can create two classes one is main another one is movie, 
movie class can have two methods setMovie,getMovie where you can create movieName,movieStartTime,movieEndTime,
MovieTicketPrice as instance variables
  */
package assignments;
public class Movie {
private int MovieTicketPrice;
private String movieName,movieStartTime,movieEndTime;
void setMovie(int movieticket,String moviename,String moviestarttime,String movieendtime) {
	this.MovieTicketPrice=movieticket;
this.movieName=moviename;
this.movieStartTime=moviestarttime;
this.movieEndTime=movieendtime;
}
void getMovie() {
	System.out.println("Movie name: "+this.movieName+"\nStart Time:"+this.movieStartTime+"\nEnd Time: "+this.movieEndTime+"\nTicket price:"+this.MovieTicketPrice );
}
}
