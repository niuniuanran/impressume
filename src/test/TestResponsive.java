package test;

import com.fasterxml.jackson.databind.ObjectMapper;
import util.info.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "test-responsive", urlPatterns = {"/test-responsive"})

public class TestResponsive extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ResumeStar testStar = new ResumeStar(1, "Anran", "Niu");
        testStar.setBriefIntro("Your up and coming full-stack developer!");

        testStar.addEducation(new EducationExperience("University of Auckland", "Master of Information Technology", 9.00, 9.00, new TimeInMonth(11, 2019), new TimeInMonth(true)));

        testStar.addEducation(new EducationExperience("Peking University", "Bachelor of Science", "Psychology", 3.62, 4.00, new TimeInMonth(9, 2012),
                new TimeInMonth(7, 2016)));
        testStar.setContactDetail(new ContactDetail("5D/10 Crown Lynn Place, New Lynn, Auckland 0600", "(64) 021 254 6006", "aniu423@aucklanduni.ac.nz"));

        testStar.addInterest("I am mostly an indoor cat, and I spend much of my free time painting and reading.");
        testStar.addInterest("When I need to get re-charged outdoors, I love ocean-swimming, hiking and well, lying in the sun for hours.");

        PersonalLinks personalLinks = new PersonalLinks();
        personalLinks.setLinkedInURL("https://www.linkedin.com/in/anran-niu-897b4b197/");
        personalLinks.setGitHubURL("https://github.com/niuniuanran");
        personalLinks.setGitLabURL("https://gitlab.com/aniu423");
        personalLinks.setQuoraURL("https://gitlab.com/aniu423");
        personalLinks.setResearchGateURL("https://gitlab.com/aniu423");
        personalLinks.setWordPressURL("https://gitlab.com/aniu423");

        SkillStack skillStack = new SkillStack(true);
        skillStack.setAdobe(true);
        skillStack.setAws(true);
        skillStack.setGulp(true);
        skillStack.setVue(true);
        skillStack.setJava(true);
        skillStack.setPython(true);
        skillStack.setPhp(true);
        skillStack.setCss3(true);
        skillStack.setHtml5(true);
        skillStack.setAngular(true);
        skillStack.setJs(true);
        skillStack.setLess(true);
        skillStack.setNodeJS(true);
        skillStack.setNpm(true);
        skillStack.setYarn(true);
        skillStack.setUbuntu(true);
        skillStack.setSuse(true);
        skillStack.setSass(true);
        skillStack.setReact(true);
        skillStack.addSkillGroup(new SkillGroup("Cloud Platform Skills", new String[]{"Amazon Web Service", "Google Cloudplatform"}));

        testStar.setSkillStack(skillStack);

        testStar.setPersonalLinks(personalLinks);
        testStar.setImagePath("./images/anran-profile.png");

        testStar.addWork(new WorkExperience("Junior Web Developer", "Air NZ", "Developed something", new TimeInMonth(11, 2020), new TimeInMonth(true), "www.airnewzealand.co.nz"));

        testStar.addAward(new Award("First place", new TimeInMonth(3, 2020), "Some contest"));
        testStar.addCertificate(new Certificate("Google web developer certificate", "google", "google.com"));
        testStar.addCertificate(new Certificate("Amazon something", "https://aws.amazon.com/", "amazon", "amazon.com"));

        testStar.addProject(new Project("impressume", "https://dashboard.heroku.com/apps/impressume", "helps people make their responsive and static resume"));

        req.setAttribute("star", testStar);
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/responsive/responsive_resume.jsp");
        dispatcher.forward(req, resp);

    }
}
