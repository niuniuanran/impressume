package factory;

import com.fasterxml.jackson.databind.ObjectMapper;
import util.info.ResumeStar;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.InputStreamReader;

@WebServlet(name = "make-cv", urlPatterns = {"/make_cv"})
public class MakeCV extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException {

        HttpSession starSession = req.getSession();


    }
}
