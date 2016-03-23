package com.VUSpring2016TopStudio.githubapi_issues;


import java.util.Scanner;

public class LoginGit {
 
    public void LoginCred()
    {
        
        IssueObjects issuelog = new IssueObjects();
        System.out.println("Enter Github Username :");
        Scanner in = new Scanner(System.in);
        String inp = in.nextLine();
        System.out.println("Enter Github Password :");
    //    issuelog.setLoginPass(in.nextLine()); 
        in.close();
        
    }
    public void login()
    {
        
    }
    
}
