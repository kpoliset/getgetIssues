package com.VUSpring2016TopStudio.githubapi_issues;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URLConnection;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.Timer;

import org.json.JSONException;


public class UserInterface extends Thread implements ActionListener {
    IssueObjects io = new IssueObjects();
    JPanel panel = new JPanel();
    JTextField userText = new JTextField(20);
    JPasswordField passwordText = new JPasswordField(20);
    JFrame frame;
    JButton loginButton = new JButton("Extract");
    JLabel clickmessage = new JLabel("Extracting Issues");
public static void main(String args[])throws IOException, InterruptedException
{
    UserInterface UI = new UserInterface();
    UI.UserInterfaces();
}
    public void UserInterfaces() throws InterruptedException {
        frame = new JFrame("Issue Extractor");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(panel);
        placeComponents(panel);
        frame.setVisible(true);
       

    }

    private void placeComponents(final JPanel panel)throws InterruptedException {
        panel.setLayout(null);
        JLabel userLabel = new JLabel("Username");
        userLabel.setBounds(10, 10, 80, 25);
        panel.add(userLabel);

       
        userText.setBounds(100, 10, 160, 25);
        panel.add(userText);
        
        
        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 40, 80, 25);
        panel.add(passwordLabel);

        
        passwordText.setBounds(100, 40, 160, 25);
        panel.add(passwordText);
        
        
        loginButton.setBounds(100, 80, 80, 25);
        panel.add(loginButton);

        loginButton.addActionListener(this);
       
       // setVisible(true); // Shows the fram
        /*
         * JLabel clickmessage = new JLabel(); clickmessage.setBounds(10, 110,
         * 120, 25); panel.add(clickmessage);
         */ // System.out.println("Test 1");
           // Thread.sleep(100000);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == loginButton) {
            System.out.println("Hello");
            clickmessage.setBounds(10, 110, 120, 25);
            panel.add(clickmessage);
            frame.repaint();
            io.setLoginId(userText.getText());
            char[] name = passwordText.getPassword();
            String output1 = new String(name);
            io.setLoginPass(output1);
            Authentication Auth = new Authentication();
     //       getIssues getIs = new getIssues(); 
         //   System.out.println(io.getLoginId());
          //  System.out.println(io.getLoginPass());
            
            try {
                
               Auth.Authenticate();
                //int count =  getIs.AuthIssueURL(Issueurl);
               // getIs.printIssues(count);
            }
            catch (IOException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
            catch (JSONException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
            
           
        }
        // System.out.println("Haii");
        // frameToClose.dispose();

    }

}
