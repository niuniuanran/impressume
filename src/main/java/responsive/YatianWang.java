package responsive;

import com.fasterxml.jackson.databind.ObjectMapper;
import util.star.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStreamReader;

@WebServlet(name = "yatian_wang", urlPatterns = {"/yatian_wang"})

public class YatianWang extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        try (InputStreamReader inputStreamReader = new InputStreamReader(getServletContext().getResourceAsStream("/WEB-INF/star_jsons/yatian-wang.JSON"))){
            ObjectMapper objectMapper = new ObjectMapper();
            ResumeStar star = objectMapper.readValue(inputStreamReader, ResumeStar.class);
            req.setAttribute("star", star);
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/responsive/responsive_resume.jsp");
            dispatcher.forward(req, resp);
        }
    }
}
