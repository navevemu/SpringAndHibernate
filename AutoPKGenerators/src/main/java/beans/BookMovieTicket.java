package beans;

import java.sql.Date;

public class BookMovieTicket {
	private int id;
	private String movieName;
	private int showtime;
	private int seatno;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public int getShowtime() {
		return showtime;
	}
	public void setShowtime(int showtime) {
		this.showtime = showtime;
	}
	public int getSeatno() {
		return seatno;
	}
	public void setSeatno(int seatno) {
		this.seatno = seatno;
	}
	@Override
	public String toString() {
		return "BookMovieTicket [id=" + id + ", movieName=" + movieName + ", showtime=" + showtime + ", seatno="
				+ seatno + "]";
	}
	
	

}
