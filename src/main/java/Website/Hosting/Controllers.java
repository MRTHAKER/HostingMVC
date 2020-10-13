package Website.Hosting;
import javax.servlet.http.*;

import java.sql.*;
import java.io.*;
import org.springframework.stereotype.Controller;  
import org.springframework.ui.*;  
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;  

@Controller
public class Controllers{
	@RequestMapping("/login")
	public ModelAndView Index(HttpServletRequest req,Model m) {
		return new ModelAndView("Login");
	} 
	@RequestMapping("/header")
	public ModelAndView header(HttpServletRequest req,Model m) {
		return new ModelAndView("header");
	}
	@RequestMapping("/footer")
	public ModelAndView footer(HttpServletRequest req,Model m) {
		return new ModelAndView("footer");
	}
	@RequestMapping("loginAction")
	public void LoginAction(HttpServletRequest req,Model m,HttpServletResponse res) throws ClassNotFoundException, SQLException, IOException {
		String url="jdbc:mysql://localhost:3306/mahek?useUnicode=yes&characterEncoding=UTF-8";
		String uname="root";
		String pass="Sumo@123";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con =DriverManager.getConnection(url,uname,pass);
		String username=req.getParameter("username");
		String userpassword=req.getParameter("pass");
		Statement st=con.createStatement();
		String sql="select email,password from register where email='"+username+"'";
		ResultSet rs=st.executeQuery(sql);
		if(rs.next()==false){
		m.addAttribute("message","You are not registered");
		res.sendRedirect("http://localhost:8080/Hosting/login");
		}
		else {
			String fromdbuname=rs.getString(1);
			String fromdbpass=rs.getString(2);
			if(username.equals(fromdbuname)){
			if(userpassword.equals(fromdbpass)){
			HttpSession session=req.getSession(true);
			session.setAttribute("name",username);
			m.addAttribute("message","You are logged in now");
			res.sendRedirect("http://localhost:8080/Hosting/dashboard");
	    }
	   }
	  }

	}
	@RequestMapping("dashboard")
	public ModelAndView Dashboard(HttpServletRequest res,HttpServletResponse req,Model m) throws IOException{
		try {
		HttpSession session=res.getSession(true);
		String user=(String)session.getAttribute("name");
		String url="jdbc:mysql://localhost:3306/mahek";
		String uname="root";
		String pass="Sumo@123";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con =DriverManager.getConnection(url,uname,pass);
		Statement st=con.createStatement();
		String sql="select git from register where email='"+user+"'";
		ResultSet rs=st.executeQuery(sql);
		rs.next();
		m.addAttribute("user",user);
		m.addAttribute("git",rs.getString(1));
		}
		catch(Exception e) {
			req.sendRedirect("http://localhost:8080/Hosting/login");
		}
		return new ModelAndView("dashboard");
	}
	@RequestMapping("after_login_header")
	public ModelAndView getAfterLoginHeader(HttpServletRequest res,Model m) {
		HttpSession session=res.getSession(true);
		String user=(String)session.getAttribute("name");
		m.addAttribute("user",user);
		return new ModelAndView("after_login_header");
	}
	@RequestMapping("Password_Reset")
		public ModelAndView passwordReset(HttpServletRequest req,Model m) {
			return new ModelAndView("password_reset");
		}
	@RequestMapping("/logout")
	public void Logout(HttpServletRequest req,HttpServletResponse res) throws IOException {
		HttpSession session=req.getSession(true);
		String name=(String)session.getAttribute("name");
		if(name==null){
		res.sendRedirect("http://localhost:8080/Hosting");
		}else{
		session.setAttribute("name",null);
		res.sendRedirect("http://localhost:8080/Hosting/login");
	}
	}
	
	}

