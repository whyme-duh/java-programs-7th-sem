
import java.sql.*;

public class JDBCDemo {
    public static void main(String[] args) {
        //step 1: initialize jdbc DRiver on java app
        // it will throw class not foudn exception if not found
        try {
            Connection conn;
            Class.forName("com.mysql.jdbc.Driver");
            //steps 2 : connect to database using DriverMnager.getConnection();
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/prime","root", "");
            //step 3 : create a query using statement 
            Statement st = conn.createStatement();
            if(conn != null){
                System.out.println("Server Connected");
            }
            //step 4 : write sql quert and execute using statement
            //creating table 
            String tblQuery = "create table tbl_reg (id int primary key, username varchar (50), password varchar(50), repassword varchar(50), gender varchar(50), course varchar(50))";
            //step 5 : executing query
            st.executeQuery(tblQuery);
            //inserting data
            String insQuery = "insert into tbl_reg values(1, 'ram', 'abcd', 'abcd', 'male', 'csit')";
            int ans = st.executeUpdate(insQuery); //return 1 if one row is inserted
            if(ans == 1){
                System.out.println("Row inserted");
            }
            //retrieveing data 
            String disQuery = "select * from tbl_reg";
            ResultSet rs = st.executeQuery(disQuery);
            while(rs.next()){
                int id = rs.getInt("id");
                String username = rs.getString("username");
                String password = rs.getString("password");
                String repassword = rs.getString("repassword");
                String gender = rs.getString("gender");
                String course = rs.getString("course");
                System.out.println("id is " + id + ", username is " + username + ",gender is " + gender+ ",course is " + course + 
                ", password is " + password + ",repassword is " + repassword);

            }
            //updating
            String updateQuery = "update tbl_reg set username ='hari' where id = 1";
            st.execute(updateQuery);
            System.out.println("record updated");
            //deleteing
            String delQuery = "delete tbl_reg where id = 1";
            st.execute(delQuery);
            System.out.println("record deleted");
            conn.close();
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }catch(SQLException s){
            System.out.println(s);
        }
    }
}