package test;

import util.info.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "yatian_wang", urlPatterns = {"/yatian_wang"})

public class Yatian_Wang extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ResumeStar testStar = new ResumeStar(2, "Yatian", "Wang");
        testStar.setBriefIntro("Seeking full time opportunities in public relations & communication fields");
        testStar.setLongerIntro("Experienced and enthusiastic Account Executive, returning to public relations and communication fields after a gap-year. Proven experience in digital marketing and PR campaigns, with serving a various of global brands, including Marina Bay Sands, HP, Shell and BMW. Organised and supported online and offline pitches and campaigns with effective coordination and cooperation. Looking to enhance and apply my knowledge and experience to a new challenge.");
        testStar.setContactDetail(new ContactDetail("Auckland, New Zealand", "(64) 021 0719641", "yatiansweet@gmail.com"));

        testStar.setImagePath("./images/yatian-profile.jpeg");
        testStar.setDesignPreference(new DesignPreference("03A1FC"));

        PersonalLinks personalLinks = new PersonalLinks();
        personalLinks.setLinkedInURL("https://www.linkedin.com/in/maggie-wang-0104b086/");
        testStar.setPersonalLinks(personalLinks);

        testStar.addEducation(new EducationExperience("University of Waikato", "Bachelor of Communication Studies", "Major: Public Relations | Minor: Management Communication", new TimeInMonth(-1, 2011), new TimeInMonth(-1, 2014)));

        WorkExperience workExperience1 = new WorkExperience("Copywriter & digital marketing specialist", "Slatplus NZ LIMITED (now merged by Skykiwi)", new TimeInMonth(-1, 2016), new TimeInMonth(-1, 2018));
        workExperience1.setPlace("Auckland");
        workExperience1.addDescription("Conducted and delivered New Zealand news and hot trends to local Chinese community and overseas");
        workExperience1.addDescription("Implemented and maintained news website and Wechat");
        workExperience1.addDescription("Launched digital campaigns to execute digital marketing projects");
        workExperience1.addDescription("Planned and implemented advertising campaigns and branding strategies");
        workExperience1.addDescription("Participated and supported traditional events and campaigns for local clients and conduct social content on news website and Wechat platform");
        testStar.addWork(workExperience1);

        WorkExperience workExperience2 = new WorkExperience("Account Executive", "Edelman", new TimeInMonth(-1, 2015), new TimeInMonth(-1, 2016));
        workExperience2.setPlace("Beijing, China");
        workExperience2.addDescription("Responsible for global clients’ daily social media operation, including daily content management, data monitoring and digital ads and campaign application");
        workExperience2.addDescription("Responsible for strategic marketing plan for clients to build brand relationship and CRM");
        workExperience2.addDescription("Manage day to day communication with clients and suggest plan for KOL strategy");
        workExperience2.addDescription("Responsible for organizing various campaigns, events and FAM trip with KOLs and coordinated to launch TVCs and ads with brands and third parties");
        workExperience2.addDescription("Clients : Marina Bay Sands, HP, Shell and BMW");
        testStar.addWork(workExperience2);


        WorkExperience workExperience3 = new WorkExperience("Media Intern", "Shandong Radio & TV Media", new TimeInMonth(-1, 2013), new TimeInMonth(-1, 2013));
        workExperience3.setPlace("Jinan, China");
        workExperience3.addDescription("Created news and social content in related to entertainment");
        workExperience3.addDescription("Day to day contact with internal media team");
        workExperience3.addDescription("Supported media team to record TV show and coordinated with each department");
        testStar.addWork(workExperience3);

        SkillStack skillStack = new SkillStack(false);
        skillStack.addSkillGroup(new SkillGroup("Communication", new String[]{"Developed strong written skills for multiple use in variety of types, including news release, brief report, Facebook, Twitter, Wechat, Weibo and Instagram",
                "Developed strong relationships with different stakeholders, including media, agent, internal members and vendors",
                "Fluent and professional in Mandarin writing and speaking"}));
        skillStack.addSkillGroup(new SkillGroup("Coordination", new String[]{"Developed time management for fluctuating workloads within tight timeframes", "Support and launch various events, campaigns, and FAM trips with stakeholders and build positive relationship with KOLs, vendors and other stakeholders",
                "Organise and support producing H5, ads and TVC in the need of marketing", "Well contributed in brainstorming, pitch and briefing and marketing and PR strategy planning"}));
        skillStack.addSkillGroup(new SkillGroup("Construction", new String[]{"Creative in brainstorming with initiative and proactive motivation and high performance", "Have a sense and knowledge in capturing hotspot trends in entertainment, hospitality and fashion and luxury fields", "Have a deep understanding of Chinese digital market and media environment to develop campaigns through social media (Wechat, Weibo and Tik Tok)"}));

        testStar.setSkillStack(skillStack);

        WorkExperience communityExperience1 = new WorkExperience("Registered Early Childhood Teacher", "Early Childhood settings", new TimeInMonth(-1, 2019), new TimeInMonth(-1, 2019));
        communityExperience1.setPlace("Waikato");
        communityExperience1.addDescription("Have a deep understanding of New Zealand Early childhood education framework");
        communityExperience1.addDescription("Have a knowledge and get involved in many diverse cultural events, especially have a knowledge of Te reo Maori and Tikanga Maori");
        communityExperience1.addDescription("Built positive relationship with children, team members and parents/whanau");
        testStar.addCommunityExperiences(communityExperience1);

        WorkExperience communityExperience2 = new WorkExperience("Volunteer", "University of Waikato", new TimeInMonth(-1, 2014), new TimeInMonth(-1, 2014));
        communityExperience2.setPlace("Waikato");
        communityExperience2.addDescription("Have opportunity to get engaged in celebrating 50 years anniversary of University of Waikato");
        communityExperience2.addDescription("Have a practical experience in event management and play a key part in coordinating and activating the event");
        communityExperience2.addDescription("Built positive and stable relationship within the stakeholders and outside of the community");
        testStar.addCommunityExperiences(communityExperience2);

        WorkExperience communityExperience3 = new WorkExperience("Volunteer", "Hamilton City Council", new TimeInMonth(-1, 2014), new TimeInMonth(-1, 2014));
        communityExperience3.setPlace("Waikato");
        communityExperience3.addDescription("Have an opportunity to get engaged in celebrating Olympics Sports Event in Maori Community");
        communityExperience3.addDescription("Have a chance to get familiar with Tikanga Maori and get touch with the community");
        communityExperience3.addDescription("Built positive and stable relationship within the community");
        testStar.addCommunityExperiences(communityExperience3);

        testStar.addReference(new Reference("Jim Zhou", "Owner", "Slatplus NZ LIMITED", "027890777", null, null));
        testStar.addReference(new Reference("Emma Whitta", "Head Teacher", "Lollipops Educare", "0220268789", null, null));

        testStar.addOtherInfo("Eligibility to work in NZ: Resident Visa");
        testStar.addOtherInfo("Fluent in Mandarin speaking and professional writing");
        testStar.addOtherInfo("NZ full driver license");
        testStar.addOtherInfo("First Aid certification at workplace");

        req.setAttribute("star", testStar);
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/responsive/responsive_resume.jsp");
        dispatcher.forward(req, resp);

    }
}
