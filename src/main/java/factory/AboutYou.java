package factory;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "about_you", urlPatterns = {"/about_you"})
public class AboutYou extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        session.setAttribute("themeColor", req.getParameter("themeColor"));
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/make_cv/about_you.jsp");
        dispatcher.forward(req, resp);
    }
}
