package pub.infoclass.myserver.protocol;

public class deleteActivityDiscuss_S {

	private int p = protocolfromserver.deleteActivityDiscuss_S;
	
	private String DiscussID = "0";
	private String ActivityID = "0";
	private String UserID = "0";
	private String UploadTime = "0";
	private String Mark = "0";
	private String Content = "0";
	public String getDiscussID() {
		return DiscussID;
	}
	public void setDiscussID(String discussID) {
		DiscussID = discussID;
	}
	public String getActivityID() {
		return ActivityID;
	}
	public void setActivityID(String activityID) {
		ActivityID = activityID;
	}
	public String getUserID() {
		return UserID;
	}
	public void setUserID(String userID) {
		UserID = userID;
	}
	public String getUploadTime() {
		return UploadTime;
	}
	public void setUploadTime(String uploadTime) {
		UploadTime = uploadTime;
	}
	public String getMark() {
		return Mark;
	}
	public void setMark(String mark) {
		Mark = mark;
	}
	public String getContent() {
		return Content;
	}
	public void setContent(String content) {
		Content = content;
	}
	public int getP() {
		return p;
	}
	
	
}
