This text make servlet failed to load
import javax.servlet.ServletContext;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse
public class TestServlet2 extends HttpServlet {
	
		@Override
		public void init() {
			System.out.println("TestServlet2 init ");
			this.undefinedObject
		}
	
		@Override
		public void doGet(HttpServletRequest request, HttpServletResponse response) {
			try {
				PrintWriter out = response.getWriter();
				out.println("TestServlet2 loaded successfully");
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	
		@Override
		public void doPost(HttpServletRequest request, HttpServletResponse response) {
	
		}
	
		@Override
		public void destroy() {
			System.out.println("TestServlet2 destroyed ");
		}
	}