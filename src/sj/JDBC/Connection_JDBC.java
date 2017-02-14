package sj.JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.* ;
/**
 * Created by Administrator on 2016-12-21.
 */
public class Connection_JDBC {
    private static String url = "jdbc:oracle:thin:@192.168.102.83:1521:fjdpcm";
    //system为登陆oracle数据库的用户名
    private static String user = "ndfjpdcm21";
    //manager为用户名system的密码
    private static String password = "ndfjpdcm21";
    private static Connection conn;
    private static PreparedStatement ps;
    private static ResultSet rs;
    private static Statement st;

    // public static Connection get_Connection() {

    //连接数据库的方法
    public void getConnection() {
        try {
            //初始化驱动包
            Class.forName("oracle.jdbc.driver.OracleDriver");
            //根据数据库连接字符，名称，密码给conn赋值
            conn = DriverManager.getConnection(url, user, password);

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

    }
   /* private static Integer getAll(){
        Connection conn = getConnection();
        String sql = "select * from pt_pubtasks order by getime  desc";
        PreparedStatement pstmt;
    }*/

    //测试能否与oracle数据库连接成功
    public static void main(String[] args) {
        Connection_JDBC basedao = new Connection_JDBC();
        basedao.getConnection();
        if (conn == null) {
            System.out.println("与oracle数据库连接失败！");
        } else {
            System.out.println("与oracle数据库连接成功！");
        }
    }

       /* try

    {

        // 第一步：装载驱动
        Class.forName("oracle.jdbc.driver.OracleDriver");

        // 第二步：定义连接字符串
        String url_Str = "jdbc:oracle:thin:@192.168.102.83:1521:ORCL";

        // 第三步：DriverManager.getConnention()获得数据库Connection连接对象
        Connection conn = DriverManager.getConnection(url_Str, "ndfjpdcm21",
                "ndfjpdcm21");

        return conn;
    } catch(
    Exception e)

    {
        e.printStackTrace();
    }
        return null;
}


    private static Integer getAll() {
        Connection conn = get_Connection();
        String sql = "select * from pt_pubtasks order by getime  desc";
        PreparedStatement pstmt;
        try {
            pstmt = (PreparedStatement)conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            int col = rs.getMetaData().getColumnCount();
            System.out.println("============================");
            while (rs.next()) {
                for (int i = 1; i <= col; i++) {
                    System.out.print(rs.getString(i) + "\t");
                    if ((i == 2) && (rs.getString(i).length() < 8)) {
                        System.out.print("\t");
                    }
                }
                System.out.println("");
            }
            System.out.println("============================");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;*/
    }

