package com.VUSpring2016TopStudio.githubapi_issues;

import java.net.URLConnection;

public class IssueObjects {
    
    private static String loginId;
    private static String loginPass;
    private static int number;
    private URLConnection Issueurl;
   

    private String id ="nikhil";
    private static String[] state = new String[10];
    private static String[] title = new String[10];
    private static String[] body = new String[10]; 
    private String createdAt;
    private String closedAt;
    public User getUser() {
        return user;
    }

    private User user;
    private User assignee;
    public URLConnection getIssueurl() {
        return Issueurl;
    }
    public void setIssueurl(URLConnection issueurl) {
        Issueurl = issueurl;
    }
    public String getLoginId() {
        return loginId;
    }
    public void setLoginId(String loginId) {
        IssueObjects.loginId = loginId;
    }
    public String getLoginPass() {
        return loginPass;
    }
    public void setLoginPass(String output1) {
        IssueObjects.loginPass = output1;
    }
    public User getAssignee() {
        return assignee;
    }
    public void setAssignee(User assignee) {
        this.assignee = assignee;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public String getId() {
        return this.id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getState(int count) {
        return state[count];
    }
    public void setState(int count,String state1) {
        this.state[count] = state1;
    }
    public String getTitle(int count) {
        return title[count];
    }
    public void setTitle(int count, String title1) {
        this.title[count] = title1;
    }
    public String getBody(int count) {
        return body[count];
    }
    public void setBody(int count,String body1) {
        this.body[count] = body1;
    }
    public String getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
    public String getClosedAt() {
        return closedAt;
    }
    public void setClosedAt(String closedAt) {
        this.closedAt = closedAt;
    }
    
    @Override
    public boolean equals(Object arg0) {
        // TODO Auto-generated method stub
        return super.equals(arg0);
    }
    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

    public class User {
        String login;
        int id;
        public String getLogin() {
            return login;
        }
        public void setLogin(String login) {
            this.login = login;
        }
        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
        }
        
    }
    
}
