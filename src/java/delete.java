package d1;
import javax.servlet.*;
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class delete extends HttpServlet
{
    @Override
    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
    {
        String R=req.getParameter("param1");
        try
        {   DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3309/d1","root","123456");
            String sql="delete from todo where todos=?";
            PreparedStatement ps=cn.prepareStatement(sql);
            ps.setString(1, R);
            ps.executeUpdate();
            res.sendRedirect("index.jsp");
            cn.close();
        }
        catch(Exception ex)
        {
        }
    }
}