<!-- PROJECT SHIELDS -->
[![LinkedIn][linkedin-shield]][linkedin-url]

<!-- PROJECT LOGO -->
<br />
<div align="center">
    <img src="./Logo Polar Fox Games.png" alt="Logo" width="80" height="80">

  <h3 align="center">Recruitment Management Application</h3>
</div>

<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#built-with">Built With</a></li>
      </ul>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#prerequisites">Prerequisites</a></li>
        <li><a href="#installation">Installation</a></li>
        <li><a href="#structure-of-the-project">Project Structure</a></li>
      </ul>
    </li>
    <li>
      <a href="#application">Application Documentation</a>
      <ul>
        <li><a href="#recruiter-portal">Recruiter Portal</a></li>
        <li><a href="#candidates-portal">Candidates Portal</a></li>
      </ul>
    </li>
    <li><a href="#contact">Contact</a></li>
  </ol>
</details>

<!-- ABOUT THE PROJECT -->
## About The Project

![HomePage][homepage-screenshot]

As part of a study project, we were asked to create a Spring  application for a Human Resources service.

This application enables to manage the recruitments and allows employes to create and manage job offers and candidates.
There's also a portal enabling candidates to apply to the different job offers.

This application is persistent.

The different portals (both recruiter and candidates) are not secured yet and the status of the job offers and the candidates cannot be changed yet.

### Built With

Back-end languages and tools

* [![Spring][Spring]][Spring-url]
* [![Java][Java]][Java-url]
* [![Hibernate][Hibernate]][Hibernate-url]
* [![MySQL][MySql]][MySQL-url]


## Getting Started

### Prerequisites

You should first install Java on your device.

My IDE : **IntelliJ**  
JDK : **Oracle OpenJDK 22**  
My compiler : **Maven**  

I initialize my project and its dependencies with `spring initializr` (https://start.spring.io/).

Here is the basis of my project:

![SpringInit][springinit-screenshot]

### Installation

_Below is how you can import the project and configure it._

1. Clone the repository
```sh
git clone https://github.com/JaceyStew6/ECF4.git
```

2. Add configuration to link your projet to the database in the `application.properties` file  
*The path to find this file is: scr>main>resources*
```java
spring.application.name=RecruitmentManagementApplication
spring.datasource.url=jdbc:mysql://localhost:3306/recruitment_app
spring.datasource.username=root
spring.datasource.password=****
spring.jpa.hibernate.ddl-auto=update
```

### Structure of the project

![ProjectStructure][projectstructure-screenshot]


---
<!-- APPLICATION -->
## Application

### Recruiter Portal
1. Add Job Offer
2. Get a list of job offers
3. Get a list of candidates by job offer
3. Add an appointment with a candidate and get the details of it


**Home page**
![HomePage][homepage-screenshot]

**Add a job offer**
![AddJob][addjob-screenshot]

**Candidates by Job Offer**
![CandidatesByOffer][candidatesbyoffer-screenshot]

**Add an appointment**
![AddAppointment][addappointment-screenshot]

**Job Interviews by candidates**
![JobInterviewsList][jobinterviewslist-screenshot]

---
### Candidates Portal
1. Get a list of job offers
2. Apply to a job offer

**Candidates main page**
![CandidatesMainPage][candidatesMain-screenshot]

**Apply to an offer**
![ApplyForm][applyform-screenshot]


<!-- CONTACT -->
## Contact

Project Link: [https://github.com/JaceyStew6/ECF4](https://github.com/JaceyStew6/ECF4)





<!-- MARKDOWN LINKS & IMAGES -->
[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555
[linkedin-url]: https://www.linkedin.com/in/p-roxane/
[interface-screenshot]: ./Documentation%20projet/Auth-view.png

[homepage-screenshot]:./Recruitment%20App%20Screens/HomePage_RecruiterPortal.png
[springinit-screenshot]: ./Recruitment%20App%20Screens/springInitializr.png
[projectstructure-screenshot]: ./Recruitment%20App%20Screens/ProjectStructure.png

[addjob-screenshot]: ./Recruitment%20App%20Screens/JobOfferForm.png
[candidatesbyoffer-screenshot]: ./Recruitment%20App%20Screens/CandidateManagementPage.png
[addappointment-screenshot]: ./Recruitment%20App%20Screens/AddAppointment.png
[jobinterviewslist-screenshot]: ./Recruitment%20App%20Screens/AppointmentList.png

[candidatesMain-screenshot]: ./Recruitment%20App%20Screens/CandidatesPortal.png
[applyform-screenshot]: ./Recruitment%20App%20Screens/ApplyToJobOffer.png

<!-- back-end links -->
[Java]: https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white
[Java-url]: https://dev.java/learn/getting-started/
[Hibernate]: https://img.shields.io/badge/Hibernate-blue?style=for-the-badge&logo=hibernate
[Hibernate-url]: https://hibernate.org/
[MySql]: https://img.shields.io/badge/MySQL-00000F?style=for-the-badge&logo=mysql&logoColor=white
[MySQL-url]: https://www.mysql.com/fr/

[Spring]: https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white
[Spring-url]: https://spring.io/