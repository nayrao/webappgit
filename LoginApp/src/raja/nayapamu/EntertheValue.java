package raja.nayapamu;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class EntertheValue extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	public void doGet(HttpServletRequest request,HttpServletResponse response) {
		
		String fi=request.getParameter("first");
		String se=request.getParameter("second");
		String s=fi+se;
		System.out.println(s);
	}
	
}
