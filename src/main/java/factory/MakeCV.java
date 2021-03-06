package factory;
import util.star.ContactDetail;
import util.star.DesignPreference;
import util.star.ResumeStar;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "make-cv", urlPatterns = {"/make_cv"})
public class MakeCV extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ResumeStar star = new ResumeStar(req.getParameter("firstName"), req.getParameter("lastName"));
        star.setContactDetail(new ContactDetail(req.getParameter("city") + ", " + req.getParameter("country"), null, null));


        star.setDesignPreference(new DesignPreference(req.getParameter("themeColor")));

        HttpSession session = req.getSession();
        session.setAttribute("star", star);
        session.setAttribute("currStep", req.getParameter("currStep"));

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/make_cv/make_cv.jsp");
        dispatcher.forward(req, resp);

    }
}
