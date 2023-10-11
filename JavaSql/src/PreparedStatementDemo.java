import java.sql.*;
import java.util.*;

public class PreparedStatementDemo{
    public static void main(String[] args) {
        try {
            Connection conn;
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/prime";
            String username = "root";
            String password = "";
            conn  = DriverManager.getConnection(url, username, password);
            if(conn != null) {
                System.out.println("Server Connected");
            }
            
            //inserting data using prepared statement
            //taking user input
            Scanner sc = new Scanner(System.in);
            // System.out.println("Enter your ID");
            // int id = sc.nextInt();
            // System.out.println("Enter your username");
            // String uname = sc.next();
            // System.out.println("Enter your password");
            // String pass = sc.next();
            // System.out.println("Enter your repassword");
            // String repass = sc.next();
            // System.out.println("Enter your gender");
            // String gender = sc.next(); 
            // System.out.println("Enter your course");
            // String course = sc.next();
            // //inserting into database
            // String insQuery = "insert into tbl_reg values(?,?,?,?,?,?)"; //?: data can be anything
            // PreparedStatement ps = conn.prepareStatement(insQuery);
            // ps.setInt(1, id);
            // ps.setString(2, uname);
            // ps.setString(3, pass);
            // ps.setString(4, repass);
            // ps.setString(5, gender);
            // ps.setString(6, course);
            // ps.execute();
            // System.out.println("data inserted");

            //display
            System.out.println("Enter course for which you want info");
            String displayCourse = sc.next();
            String disQuery = "select * from tbl_reg where course = ?";
            PreparedStatement ps1 = conn.prepareStatement(disQuery);
            ps1.setString(1, displayCourse);
            ResultSet rs = ps1.executeQuery();
            while(rs.next()){
                int disId = rs.getInt("id");
                String disUname = rs.getString("username");
                String disPass = rs.getString("password");
                String disRepass = rs.getString("repassword");
                String disGender = rs.getString("gender");
                String disCourse = rs.getString("course");
                System.out.println("id is " + disId+ "username is " +  disUname + "password is "+ disPass + "repassword is "+  disRepass + "gender is "+  disGender + "coures is "+ disCourse);

            }

        } catch (ClassNotFoundException i) {
            System.out.println(i);
            // TODO: handle exception
        }catch(SQLException e){
            System.out.println(e);
        }
    }
}