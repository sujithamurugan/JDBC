package model;

public class BookRatings {
	int userid;
	int bookid;
	int rating;
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "BookRatings [userid=" + userid + ", bookid=" + bookid + ", rating=" + rating + ", getUserid()="
				+ getUserid() + ", getBookid()=" + getBookid() + ", getRating()=" + getRating() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
