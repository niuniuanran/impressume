package test;

import util.info.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="test-responsive", urlPatterns = {"/test-responsive"})

public class TestResponsive extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ResumeStar testStar = new ResumeStar(1,"Anran", "Niu");
        testStar.setBriefIntro("Your up and coming full-stack developer!");
        testStar.addEducation(new EducationExperience("Peking University", "Bachelor of Science", "Psychology", 3.62, new TimeInMonth(9, 2012),
                new TimeInMonth(7, 2016)));
        testStar.addEducation(new EducationExperience("University of Auckland", "Master of Information Technology", 9.00, new TimeInMonth(11, 2019), new TimeInMonth(true)));
        testStar.setContactDetail(new ContactDetail("5D/10 Crown Lynn Place, New Lynn, Auckland 0600", "(64) 021 254 6006", "aniu423@aucklanduni.ac.nz"));

        PersonalLinks personalLinks = new PersonalLinks();
        personalLinks.setLinkedInURL("https://www.linkedin.com/in/anran-niu-897b4b197/");
        personalLinks.setGitHubURL("https://github.com/niuniuanran");
        testStar.setPersonalLinks(personalLinks);
        testStar.setImagePath("./images/profile.jpg");

        req.setAttribute("star", testStar);

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/responsive/responsive_resume.jsp");
        dispatcher.forward(req, resp);






    }
}
