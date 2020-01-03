package test;

import com.fasterxml.jackson.databind.ObjectMapper;
import util.info.ResumeStar;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

@WebServlet(name = "test-json-to-responsive", urlPatterns = {"/test-json-to-responsive"})
public class TestJsonToResponsive extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(Thread.currentThread().getContextClassLoader());

        try (InputStreamReader inputStreamReader = new InputStreamReader(getServletContext().getResourceAsStream("/WEB-INF/star_jsons/yatian-wang.JSON"))){
            ObjectMapper objectMapper = new ObjectMapper();
            ResumeStar star = objectMapper.readValue(inputStreamReader, ResumeStar.class);
            req.setAttribute("star", star);
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/responsive/responsive_resume.jsp");
            dispatcher.forward(req, resp);

        }

    }
}
