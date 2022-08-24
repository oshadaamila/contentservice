package com.example.contentservice.entities;

public class ContentAction {

    private String title,authorName, authorEmail, timestamp;

    public ContentAction(String title, String authorName, String authorEmail, String timestamp) {
        this.title = title;
        this.authorName = authorName;
        this.authorEmail = authorEmail;
        this.timestamp = timestamp;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorEmail() {
        return authorEmail;
    }

    public void setAuthorEmail(String authorEmail) {
        this.authorEmail = authorEmail;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}