<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: anran
  Date: 28/12/19
  Time: 7:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="${star.name}'s resume">
    <meta name="author" content="${star.name} created on Impressume">

    <title>${star.name}</title>
    <!-- Bootstrap core CSS -->
    <link href='<c:url value="https://unpkg.com/startbootstrap-resume/vendor/bootstrap/css/bootstrap.min.css"/>'
          rel="stylesheet">
    <link href='<c:url value="https://unpkg.com/startbootstrap-resume/css/resume.min.css"/>' rel="stylesheet">
    <%--    font awesome--%>
    <link href='<c:url value="https://unpkg.com/startbootstrap-resume/vendor/fontawesome-free/css/all.min.css"/>'
          rel="stylesheet">

    <!-- Custom fonts for this template -->
    <link href="https://fonts.googleapis.com/css?family=Saira+Extra+Condensed:500,700" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Muli:400,400i,800,800i" rel="stylesheet">
    <link href="<c:url value="/imp-css/custom-styling.css"/> " rel="stylesheet">

    <script>
        document.documentElement.style
            .setProperty('--customized-theme-color', `${star.designPreference.themeColor}`);
        document.documentElement.style
            .setProperty('--customized-light-color', `${star.designPreference.lightColor}`);
        document.documentElement.style
            .setProperty('--customized-heavy-color', `${star.designPreference.heavyColor}`);
    </script>

</head>

<body id="page-top">

<nav class="navbar navbar-expand-lg navbar-dark bg-primary fixed-top" id="sideNav">
    <a class="navbar-brand js-scroll-trigger" href="#page-top">
        <span class="d-block d-lg-none">${star.name}</span>
        <span class="d-none d-lg-block">

            <c:choose>
                <c:when test="${star.imagePath != null}">
        <img class="img-fluid img-profile rounded-circle mx-auto mb-2" src='<c:url value="${star.imagePath}"/>'
             alt="${star.name}'s profile photo">
                </c:when>
                <c:otherwise>
                    <h3 class="mb-0">${star.firstName}!</h3>
                    <hr class="m-0">
                </c:otherwise>
            </c:choose>

      </span>
    </a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
            aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav">
            <li class="nav-item">
                <a class="nav-link js-scroll-trigger" href="#about">About</a>
            </li>

            <c:if test="${star.workExperiences!=null}">
                <li class="nav-item">
                    <a class="nav-link js-scroll-trigger" href="#experience">Experience</a>
                </li>
            </c:if>

            <c:if test="${star.educationExperiences!=null}">
                <li class="nav-item">
                    <a class="nav-link js-scroll-trigger" href="#education">Education</a>
                </li>
            </c:if>

            <c:if test="${star.skillStack!=null}">
                <li class="nav-item">
                    <a class="nav-link js-scroll-trigger" href="#skills">Skills</a>
                </li>
            </c:if>

            <c:if test="${star.projects!=null}">
                <li class="nav-item">
                    <a class="nav-link js-scroll-trigger" href="#projects">Projects</a>
                </li>
            </c:if>
            <c:if test="${star.communityExperiences!=null}">
                <li class="nav-item">
                    <a class="nav-link js-scroll-trigger" href="#community">Community</a>
                </li>
            </c:if>

            <c:if test="${star.awards!=null || star.certificates != null}">
                <li class="nav-item">
                    <a class="nav-link js-scroll-trigger" href="#awards">Awards</a>
                </li>
            </c:if>

            <c:if test="${star.interests!=null}">
                <li class="nav-item">
                    <a class="nav-link js-scroll-trigger" href="#interests">Interests</a>
                </li>
            </c:if>
            <c:if test="${star.references!=null}">
                <li class="nav-item">
                    <a class="nav-link js-scroll-trigger" href="#references">References</a>
                </li>
            </c:if>
            <c:if test="${star.otherInfos!=null}">
                <li class="nav-item">
                    <a class="nav-link js-scroll-trigger" href="#others">Other Info</a>
                </li>
            </c:if>
        </ul>
    </div>
</nav>

<div class="container-fluid p-0">

    <section class="resume-section p-3 p-lg-5 d-flex align-items-center" id="about">
        <div class="w-100">
            <h1 class="mb-0">${star.firstName}
                <span class="text-primary">${star.lastName}</span>
            </h1>
            <div class="subheading mb-5">${star.contactDetail.address}
                <c:if test="${star.contactDetail.phone!=null}">· ${star.contactDetail.phone} </c:if>
                <c:if test="${star.contactDetail.email!=null}">·<a href="mailto:${star.contactDetail.email}" target="_blank">${star.contactDetail.email}</a></c:if>
            </div>
            <p class="lead mb-5">${star.briefIntro}</p>

            <div class="social-icons">
                <c:if test="${star.personalLinks.linkedInURL != null}">
                    <a href="${star.personalLinks.linkedInURL}" target="_blank">
                        <i class="fab fa-linkedin-in" style="line-height: 3.5rem;"></i>
                            <%--
                            The style of line-height is added here
                            because css style casting order in html and in jsp is different.
                            In blackrockdigital's original html, the style of the font-awesome class for .fab is overwritten by line-height specified for .social-icon a
                            in resume.min.css, while in the jsp the font-awesome class for .fab overwrites rules for <a>.
                            This is why an inline rule is added here to avoid trouble.
                            --%>
                    </a>
                </c:if>

                <c:if test="${star.personalLinks.gitHubURL != null}">
                    <a href="${star.personalLinks.gitHubURL}" target="_blank">
                        <i class="fab fa-github" style="line-height: 3.5rem;"></i>
                    </a>
                </c:if>

                <c:if test="${star.personalLinks.gitLabURL != null}">
                    <a href="${star.personalLinks.gitLabURL}" target="_blank">
                        <i class="fab fa-gitlab" style="line-height: 3.5rem;"></i>
                    </a>
                </c:if>

                <c:if test="${star.personalLinks.researchGateURL != null}">
                    <a href="${star.personalLinks.researchGateURL}" target="_blank">
                        <i class="fab fa-researchgate" style="line-height: 3.5rem;"></i>
                    </a>
                </c:if>

                <c:if test="${star.personalLinks.wordPressURL != null}">
                    <a href="${star.personalLinks.wordPressURL}" target="_blank">
                        <i class="fab fa-wordpress" style="line-height: 3.5rem;"></i>
                    </a>
                </c:if>

                <c:if test="${star.personalLinks.quoraURL != null}">
                    <a href="${star.personalLinks.quoraURL}" target="_blank">
                        <i class="fab fa-quora" style="line-height: 3.5rem;"></i>
                    </a>
                </c:if>

                <c:if test="${star.personalLinks.twitterURL != null}">
                    <a href="${star.personalLinks.twitterURL}" target="_blank">
                        <i class="fab fa-twitter" style="line-height: 3.5rem;"></i>
                    </a>
                </c:if>

                <c:if test="${star.personalLinks.facebookURL != null}">
                    <a href="${star.personalLinks.facebookURL}" target="_blank">
                        <i class="fab fa-facebook-f" style="line-height: 3.5rem;"></i>
                    </a>
                </c:if>
            </div>
        </div>
    </section>
    <hr class="m-0">

    <%--Work experience section starts--%>
    <c:if test="${star.workExperiences!=null}">
        <section class="resume-section p-3 p-lg-5 d-flex justify-content-center" id="experience">
            <div class="w-100">
                <h2 class="mb-5">Experience</h2>

                <c:forEach var="experience" items="${star.workExperiences}">

                    <div class="resume-item d-flex flex-column flex-md-row justify-content-between mb-5">

                        <div class="resume-content">
                            <h3 class="mb-0">${experience.title}</h3>
                            <c:choose>
                                <c:when test="${experience.organizationLink==null}">
                                    <div class="subheading mb-3">${experience.organizationName}</div>
                                </c:when>
                                <c:otherwise>
                                    <div class="subheading mb-3"><a
                                            href='<c:url value="${experience.organizationLink}"/>'
                                            target="_blank">${experience.organizationName}</a></div>
                                </c:otherwise>
                            </c:choose>


                            <c:forEach var="description" items="${experience.descriptions}">
                                <li>
                                        ${description}
                                </li>
                            </c:forEach>

                        </div>

                        <div class="resume-date text-md-right ">
                            <c:choose>
                                <c:when test="${experience.place != null}">
                                    <p class="text-primary mt-3 mb-0">${experience.place}</p>
                                    <p class="text-primary mt-0">${experience.from} - ${experience.to}</p>
                                </c:when>
                                <c:otherwise>
                                    <p class="text-primary mt-3">${experience.from} - ${experience.to}</p>
                                </c:otherwise>
                            </c:choose>
                        </div>

                    </div>

                </c:forEach>
            </div>
        </section>
        <hr class="m-0">
    </c:if>
    <%--    work experience section ends  --%>

    <%--    education starts --%>
    <c:if test="${star.educationExperiences!=null}">
        <section class="resume-section p-3 p-lg-5 d-flex align-items-center" id="education">
            <div class="w-100">
                <h2 class="mb-5">Education</h2>

                <c:forEach var="education" items="${star.educationExperiences}">
                    <div class="resume-item d-flex flex-column flex-md-row justify-content-between mb-5">
                        <div class="resume-content">
                            <h3 class="mb-0">${education.institute}</h3>
                            <div class="subheading mb-3">${education.name}</div>
                            <c:if test="${education.specification != null}">
                                <div>${education.specification}</div>
                            </c:if>
                            <c:if test="${education.GPA != null}">
                                <p>GPA: ${education.GPA} / ${education.fullGPA}</p>
                            </c:if>
                        </div>
                        <div class="resume-date text-md-right">
                            <span class="text-primary mt-4">${education.from} - ${education.to}</span>
                        </div>
                    </div>
                </c:forEach>
            </div>
        </section>
        <hr class="m-0">
    </c:if>
    <%--    education ends --%>

    <%--skill stack starts--%>
    <c:if test="${star.skillStack!=null}">
        <section class="resume-section p-3 p-lg-5 d-flex align-items-center" id="skills">
            <div class="w-100">
                <h2 class="mb-5">Skills</h2>

                <c:if test="${star.skillStack.hasProgramming}">
                    <div class="subheading mb-1">Programming Languages &amp; Tools</div>
                    <ul class="list-inline dev-icons">

                        <c:if test="${star.skillStack.java}">
                            <li class="list-inline-item">
                                <i class="fab fa-java"></i>
                            </li>

                        </c:if>
                        <c:if test="${star.skillStack.python}">
                            <li class="list-inline-item">
                                <i class="fab fa-python"></i>
                            </li>
                        </c:if>

                        <c:if test="${star.skillStack.html5}">
                            <li class="list-inline-item">
                                <i class="fab fa-html5"></i>
                            </li>
                        </c:if>
                        <c:if test="${star.skillStack.css3}">

                            <li class="list-inline-item">
                                <i class="fab fa-css3-alt"></i>
                            </li>

                        </c:if>
                        <c:if test="${star.skillStack.js}">

                            <li class="list-inline-item">
                                <i class="fab fa-js-square"></i>
                            </li>
                        </c:if>
                        <c:if test="${star.skillStack.nodeJS}">
                            <li class="list-inline-item">
                                <i class="fab fa-node-js"></i>
                            </li>
                        </c:if>
                        <c:if test="${star.skillStack.angular}">

                            <li class="list-inline-item">
                                <i class="fab fa-angular"></i>
                            </li>
                        </c:if>
                        <c:if test="${star.skillStack.react}">

                            <li class="list-inline-item">
                                <i class="fab fa-react"></i>
                            </li>
                        </c:if>
                        <c:if test="${star.skillStack.vue}">

                            <li class="list-inline-item">
                                <i class="fab fa-vuejs"></i>
                            </li>
                        </c:if>

                        <c:if test="${star.skillStack.php}">
                            <li class="list-inline-item">
                                <i class="fab fa-php"></i>
                            </li>
                        </c:if>

                        <c:if test="${star.skillStack.sass}">
                            <li class="list-inline-item">
                                <i class="fab fa-sass"></i>
                            </li>
                        </c:if>
                        <c:if test="${star.skillStack.less}">
                            <li class="list-inline-item">
                                <i class="fab fa-less"></i>
                            </li>
                        </c:if>
                        <c:if test="${star.skillStack.wordpress}">

                            <li class="list-inline-item">
                                <i class="fab fa-wordpress"></i>
                            </li>
                        </c:if>
                        <c:if test="${star.skillStack.gulp}">

                            <li class="list-inline-item">
                                <i class="fab fa-gulp"></i>
                            </li>
                        </c:if>
                        <c:if test="${star.skillStack.grunt}">

                            <li class="list-inline-item">
                                <i class="fab fa-grunt"></i>
                            </li>
                        </c:if>
                        <c:if test="${star.skillStack.npm}">

                            <li class="list-inline-item">
                                <i class="fab fa-npm"></i>
                            </li>
                        </c:if>
                        <c:if test="${star.skillStack.yarn}">
                            <li class="list-inline-item">
                                <i class="fab fa-yarn"></i>
                            </li>
                        </c:if>

                        <c:if test="${star.skillStack.swift}">
                            <li class="list-inline-item">
                                <i class="fab fa-swift"></i>
                            </li>
                        </c:if>
                        <c:if test="${star.skillStack.adobe}">
                            <li class="list-inline-item">
                                <i class="fab fa-adobe"></i>
                            </li>
                        </c:if>
                        <c:if test="${star.skillStack.aws}">
                            <li class="list-inline-item">
                                <i class="fab fa-aws"></i>
                            </li>
                        </c:if>
                        <c:if test="${star.skillStack.suse}">
                            <li class="list-inline-item">
                                <i class="fab fa-suse"></i>
                            </li>
                        </c:if>
                        <c:if test="${star.skillStack.ubuntu}">
                            <li class="list-inline-item">
                                <i class="fab fa-ubutu"></i>
                            </li>
                        </c:if>
                    </ul>
                </c:if>


                <c:forEach var="skillGroup" items="${star.skillStack.skillGroups}">
                    <div class="subheading mb-1 mt-3">${skillGroup.name}</div>
                    <ul class="fa-ul mb-0">
                        <c:forEach var="skill" items="${skillGroup.skills}">
                            <li>
                                <i class="fa-li fa fa-check"></i>
                                    ${skill}
                            </li>

                        </c:forEach>
                    </ul>
                </c:forEach>


            </div>
        </section>
        <hr class="m-0">
    </c:if>
    <%--    skill stack ends--%>

    <%--    projects starts  --%>
    <c:if test="${star.projects!=null}">
        <section class="resume-section p-3 p-lg-5 d-flex align-items-center" id="projects">
            <div class="w-100">
                <h2 class="mb-5">Projects</h2>
                <ul class="fa-ul mb-0">
                    <c:forEach items="${star.projects}" var="project">
                        <li>
                            <i class="fa-li fa fa-project-diagram text-warning"></i>
                            <c:if test="${project.projectLink == null}">
                                ${project.name}
                            </c:if>
                            <c:if test="${project.projectLink!=null}">
                                <a href="${project.projectLink}" target="_blank"> ${project.name}</a>
                            </c:if>
                            <p>${project.description}</p>
                        </li>
                    </c:forEach>
                </ul>
            </div>
        </section>
        <hr class="m-0">
    </c:if>
    <%--    projects ends--%>

    <%--    community starts--%>
    <c:if test="${star.communityExperiences!=null}">
        <section class="resume-section p-3 p-lg-5 d-flex justify-content-center" id="community">
            <div class="w-100">
                <h2 class="mb-5">Community Experiences</h2>

                <c:forEach var="experience" items="${star.communityExperiences}">

                    <div class="resume-item d-flex flex-column flex-md-row justify-content-between mb-5">
                        <div class="resume-content">
                            <h3 class="mb-0">${experience.title}</h3>

                            <c:choose>
                                <c:when test="${experience.organizationLink==null}">
                                    <div class="subheading mb-3">${experience.organizationName}</div>
                                </c:when>
                                <c:otherwise>
                                    <div class="subheading mb-3"><a
                                            href='<c:url value="${experience.organizationLink}"/>'
                                            target="_blank">${experience.organizationName}</a></div>
                                </c:otherwise>
                            </c:choose>

                            <c:forEach var="description" items="${experience.descriptions}">
                                <li>
                                        ${description}
                                </li>
                            </c:forEach>

                        </div>
                        <div class="resume-date text-md-right ">
                            <c:choose>
                                <c:when test="${experience.place != null}">
                                    <p class="text-primary mt-3 mb-0">${experience.place}</p>
                                    <p class="text-primary mt-0">${experience.from} - ${experience.to}</p>
                                </c:when>
                                <c:otherwise>
                                    <p class="text-primary mt-3">${experience.from} - ${experience.to}</p>
                                </c:otherwise>
                            </c:choose>
                        </div>
                    </div>

                </c:forEach>
            </div>
        </section>
        <hr class="m-0">
    </c:if>
    <%--    community experience section ends  --%>


    <%--    awards and certificates section starts--%>
    <c:if test="${star.awards != null || star.certificates != null}">
        <section class="resume-section p-3 p-lg-5 d-flex align-items-center" id="awards">
            <div class="w-100">
                <h2 class="mb-5">Awards &amp; Certifications</h2>
                <ul class="fa-ul mb-0">
                    <c:forEach var="certificate" items="${star.certificates}">
                        <li>
                            <i class="fa-li fa fa-certificate text-warning"></i>
                            <c:if test="${certificate.certificateLink == null}">
                                ${certificate.name}
                            </c:if>
                            <c:if test="${certificate.certificateLink!=null}">
                                <a href="${certificate.certificateLink}" target="_blank"> ${certificate.name}</a>
                            </c:if>
                            <c:if test="${certificate.issuerLink!=null}">
                                · issued by: <a href="${certificate.issuerLink}"
                                                target="_blank"> ${certificate.issuerName}</a>
                            </c:if>
                            <c:if test="${certificate.issuerName!=null && certificate.issuerLink==null}">
                                · issued by: ${certificate.issuerName}
                            </c:if>
                        </li>

                    </c:forEach>
                </ul>

                <ul class="fa-ul mb-0 mt-3">
                    <c:forEach var="award" items="${star.awards}">
                        <li>
                            <i class="fa-li fa fa-trophy text-warning"></i>
                                ${award.name} · ${award.time}

                            <c:if test="${award.issuerName!=null}">
                                · ${award.issuerName}
                            </c:if>
                        </li>

                    </c:forEach>
                </ul>
            </div>
        </section>
    </c:if>
    <%--    awards and certificates ends --%>

    <%--    interests starts  --%>
    <c:if test="${star.interests!=null}">
        <section class="resume-section p-3 p-lg-5 d-flex align-items-center" id="interests">
            <div class="w-100">
                <h2 class="mb-5">Interests</h2>
                <c:forEach items="${star.interests}" var="interest">
                    <p>${interest}</p>
                </c:forEach>
            </div>
        </section>
        <hr class="m-0">
    </c:if>
    <%--    interests ends--%>

    <%--    references starts  --%>
    <c:if test="${star.references!=null}">
        <section class="resume-section p-3 p-lg-5 d-flex align-items-center" id="references">
            <div class="w-100">
                <h2 class="mb-5">References</h2>
                <c:forEach items="${star.references}" var="reference">
                    <p class="text-primary mb-0 mt-2">${reference.name}</p>
                    <p class="mb-0">${reference.title} · ${reference.organization}</p>
                    <c:if test="${reference.phone != null }"><p class="mb-0">${reference.phone} </p></c:if>
                    <c:if test="${reference.email != null}"><a href="mailto:${reference.email}"
                                                               target="_blank">${reference.email}</a></c:if>
                </c:forEach>
            </div>
        </section>
        <hr class="m-0">
    </c:if>
    <%--    references ends--%>

    <%--Other info starts--%>
    <c:if test="${star.otherInfos!=null}">
        <section class="resume-section p-3 p-lg-5 d-flex align-items-center" id="others">
            <div class="w-100">
                <h2 class="mb-5">Other Information</h2>
                <c:forEach items="${star.otherInfos}" var="other">
                    <p><i class="fas fa-circle-notch text-primary"></i>
                            ${other}</p>
                </c:forEach>
            </div>
        </section>
        <hr class="m-0">
    </c:if>
    <%--    other info ends--%>


</div>

<!-- Bootstrap core JavaScript -->
<script src='<c:url value="https://unpkg.com/startbootstrap-resume/vendor/jquery/jquery.min.js"/>'></script>


<!-- Plugin JavaScript -->
<script src='<c:url value="https://unpkg.com/startbootstrap-resume/vendor/bootstrap/js/bootstrap.bundle.min.js"/>'></script>


<script src='<c:url value="https://unpkg.com/startbootstrap-resume/vendor/jquery-easing/jquery.easing.min.js"/>'></script>

<!-- Custom scripts for this template -->
<script src='<c:url value="https://unpkg.com/startbootstrap-resume/js/resume.min.js"/>'></script>

</body>
</html>
