
import org.testng.annotations.Test;

import java.sql.*;




public class JDBCTest extends connection {
    private Connection connection;
    private Object SQLException;
    public static int count;

    @Test(priority = 1)
    public void getTableData() throws SQLException {

        connection = this.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from user");
        while (resultSet.next()) {
            int uid = resultSet.getInt(1);
            String uname = resultSet.getString(2);
            String uemail = resultSet.getString(3);
            System.out.println(count + uid + "" + uname + "" + uemail + "");
            count+=1;


        }}

    @Test(priority = 2)
        public  void insertData(){
            try{
                connection = this.getConnection();
                PreparedStatement st = connection.prepareStatement("insert into user values(?,?,?)");
                st.setInt(1,2 );
                st.setString(2, "pooja");
                st.setString(3, "mayur@gmail.com");
              st.executeUpdate();
              count++;
            }catch( Exception e){
                e.printStackTrace();
            }}




    @Test(priority = 3)
        public void updateData()  {
            try{
                connection = this.getConnection();
                PreparedStatement st = connection.prepareStatement("update user set uid=?,uname=? where uemail=?");
                st.setInt(1, 3);
                st.setString(2, "mayur");
                st.setString(3, "gaurav@gmail.com");
                st.executeUpdate();
            }catch( Exception e){
                e.printStackTrace();
            }}

            @Test(priority = 4)
            public void deleteData()  {
                try{
                    connection = this.getConnection();
                    PreparedStatement st = connection.prepareStatement("DELETE FROM user  where uid=?");
                    st.setInt(1, 3);
                    st.executeUpdate();

                }catch( Exception e){
                    e.printStackTrace();
                }}}