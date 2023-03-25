import java.sql.*;

public class Main {
    public static void main(String[] args) {

        String url="jdbc:postgresql://localhost:5432/EmpDatabase";
        String username="postgres";
        String password="TestPassword1234";
        /*
        try
        {
            Connection conn= DriverManager.getConnection(url,username,password);
            String sqlStr="INSERT INTO employees (firstname,lastname,position,salary,age) VALUES (?,?,?,?,?)";

            PreparedStatement stmt= conn.prepareStatement(sqlStr);

            stmt.setString(1,"Angle");
            stmt.setString(2,"Doe");
            stmt.setString(3,"Developer");
            stmt.setInt(4,35000);
            stmt.setInt(5,26);

            int rowsAffected=stmt.executeUpdate();
            System.out.println("Row affected : "+rowsAffected);


        } catch (SQLException e) {
            e.printStackTrace();
        }
*/
        try
        {
            Connection conn= DriverManager.getConnection(url,username,password);
            String sqlStr="DELETE FROM employees WHERE  id= ?";

            PreparedStatement stmt= conn.prepareStatement(sqlStr);


            stmt.setInt(1,3);


            int rowsAffected=stmt.executeUpdate();
            System.out.println("Row affected : "+rowsAffected);



        } catch (SQLException e) {
            e.printStackTrace();
        }



        try{
            Connection conn= DriverManager.getConnection(url,username,password);
            Statement stmt= conn.createStatement();
            String sqlStr="Select * from employees";
            ResultSet rs= stmt.executeQuery(sqlStr);

            while (rs.next())
            {
                int id= rs.getInt("id");
                String firstname= rs.getString("firstname");
                String lastname=rs.getString("lastname");
                String position= rs.getString("position");
                int salary= rs.getInt("salary");
                int age= rs.getInt("age");

                System.out.println(id+"."+lastname+","+firstname+" "+position+" "+salary+"("+age+")");
            }

            //Close all
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }




    }
}