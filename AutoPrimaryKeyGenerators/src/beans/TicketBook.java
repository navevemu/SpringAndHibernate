package beans;

public class TicketBook {

	private int tId;
	private String cName;
	private int seatNo;
	private String movieName;
	public int gettId() {
		return tId;
	}
	public void settId(int tId) {
		this.tId = tId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public int getSeatNo() {
		return seatNo;
	}
	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	@Override
	public String toString() {
		return "TicketBook [tId=" + tId + ", cName=" + cName + ", seatNo=" + seatNo + ", movieName=" + movieName + "]";
	}
	
}
