package action;

import java.io.IOException;


import java.util.Properties;
import java.util.Date;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.Customer;
import service.CustomerService;
import service.impl.CustomerServiceImpl;





/**
 * Servlet implementation class GetPassword
 */
@WebServlet("/getpassword.do"
		)
public class CustomerGetPasswordservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerGetPasswordservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		Properties prop=new Properties();
		prop.setProperty("mail.smtp.host", "smtp.126.com");
		prop.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		prop.setProperty("mail.smtp.socketFactory.fallback", "false");
		prop.setProperty("mail.smtp.port","25");
		prop.setProperty("mail.smtp.socketFactory.port", "25");
		prop.setProperty("mail.smtp.auth", "true");
		Session session=Session.getDefaultInstance(prop,new Authenticator(){
		protected PasswordAuthentication getPasswordAuthentication(){
			return new PasswordAuthentication("zpf12345678910@126.com","zpf123456789");
		}
		});
		String name=request.getParameter("username");
		String email=request.getParameter("email");
		
		Customer acct=new Customer();
		String psw="1";
		acct.setUserName(name);
		acct.setEmail(email);
		CustomerServiceImpl m=new CustomerServiceImpl();
		boolean result = m.findPasswordISOK(acct);
		if(result){
			psw=m.getCustomer(acct).getPassword();
			Message message=new MimeMessage(session);
			try {
				message.setRecipient(Message.RecipientType.TO,new InternetAddress(email));
				message.setFrom(new InternetAddress("zpf12345678910@126.com"));
				message.setSubject("�һ�����");
				message.setText(psw);
				message.setSentDate(new Date());
				Transport.send(message);
			} catch (AddressException e) {
		// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (MessagingException e) {
		// TODO Auto-generated catch block
				e.printStackTrace();
			}
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}else{
				request.getRequestDispatcher("index.jsp").forward(request, response);
			}
	}
	 
}


