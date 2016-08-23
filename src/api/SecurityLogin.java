package api;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class SecurityLogin {
	public boolean testUserId(HttpServletRequest request) {
		HttpSession session = request.getSession();
		String userId = request.getParameter("user_id");
		if (session.getAttribute("user") == null || session.getAttribute("user") != userId) {
			return false;
		}
		return true;
	}
}
