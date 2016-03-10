package univ.bigdata.course.movie;

import java.util.Date;

public class MovieReview {

    private Movie movie;

    private String userId;

    private String profileName;

    private String helpfulness;

    private Date timestamp;

    private String summary;

    private String review;

    public MovieReview() {
    }

    public MovieReview(Movie movie, String userId, String profileName, String helpfulness, Date timestamp, String summary, String review) {
        this.movie = movie;
        this.userId = userId;
        this.profileName = profileName;
        this.helpfulness = helpfulness;
        this.timestamp = timestamp;
        this.summary = summary;
        this.review = review;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getProfileName() {
        return profileName;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    public String getHelpfulness() {
        return helpfulness;
    }

    public void setHelpfulness(String helpfulness) {
        this.helpfulness = helpfulness;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    @Override
    public String toString() {
        return "MovieReview{" +
                "movie=" + movie +
                ", userId='" + userId + '\'' +
                ", profileName='" + profileName + '\'' +
                ", helpfulness='" + helpfulness + '\'' +
                ", timestamp=" + timestamp +
                ", summary='" + summary + '\'' +
                ", review='" + review + '\'' +
                '}';
    }
}
