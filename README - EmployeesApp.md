<!-- PROJECT SHIELDS -->
[![LinkedIn][linkedin-shield]][linkedin-url]

<!-- PROJECT LOGO -->
<br />
<div align="center">
    <img src="./Logo Polar Fox Games.png" alt="Logo" width="80" height="80">

  <h3 align="center">Employees Management Application</h3>
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
      </ul>
    </li>
    <li><a href="#contact">Contact</a></li>
  </ol>
</details>

<!-- ABOUT THE PROJECT -->
## About The Project

As part of a study project, we were asked to create a Java J2EE (Jakarta) application for a Human Resources service.

This application is a REST API enabling to manage employees.

This application is persistent.


### Built With

Back-end languages and tools

* [![JaxRS][JaxRS]][JaxRS-url]
* [![Java][Java]][Java-url]
* [![Hibernate][Hibernate]][Hibernate-url]
* [![MySQL][MySql]][MySQL-url]


## Getting Started

### Prerequisites

You should first install Java on your device.

Also, you have to install an applications server like Tomcat.

My IDE : **IntelliJ**  
JDK : **Oracle OpenJDK 22**  
My compiler : **Maven**  
Web Server : **Tomcat 10.1.25** (https://tomcat.apache.org/download-10.cgi)


### Installation

_Below is how you can import the project and configure it._

1. Clone the repository
```sh
git clone https://github.com/JaceyStew6/ECF4.git
```

2. Add `hibernate` and `mysql` dependencies in the file named `pom.xml`
   ```xml
       <dependencies>
        <dependency>
            <groupId>org.hibernate</groupId>
            <artifactId>hibernate-entitymanager</artifactId>
            <version>5.6.15.Final</version>
        </dependency>


        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.28</version>
        </dependency>

    </dependencies>
   ```

3. Add configuration files to link your projet to the database
The first one is `hibernate.cfg.xml`
```xml
<?xml version='1.0' encoding='utf-8'?>
<!DOCTYPE hibernate-configuration PUBLIC
        "-//Hibernate/Hibernate Configuration DTD//EN"
        "http://hibernate.sourceforge.net/hibernate-configuration-3.0.dtd">
<hibernate-configuration>
    <session-factory>
        <mapping class="org.example.ecf4_employeesmanagementapp.model.Employee"/>
        <mapping class="org.example.ecf4_employeesmanagementapp.model.Job"/>
        <mapping class="org.example.ecf4_employeesmanagementapp.model.Department"/>
    </session-factory>
</hibernate-configuration>
```

The second is `hibernate.properties`
```java
## MYSQL
#hibernate.dialect = org.hibernate.dialect.MariaDBDialect
hibernate.dialect = org.hibernate.dialect.MySQL8Dialect
hibernate.connection.driver_class = com.mysql.jdbc.Driver
hibernate.connection.url = jdbc:mysql://localhost/employees_management_app
hibernate.connection.username = root
hibernate.connection.password = ****
hibernate.show_sql = true
hibernate.hbm2ddl.auto = update
hibernate.connection.autocommit = false
```

<!-- CONTACT -->
## Contact

Project Link: [https://github.com/JaceyStew6/ECF4](https://github.com/JaceyStew6/ECF4)





<!-- MARKDOWN LINKS & IMAGES -->
[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555
[linkedin-url]: https://www.linkedin.com/in/p-roxane/

<!-- back-end links -->
[Java]: https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white
[Java-url]: https://dev.java/learn/getting-started/
[Hibernate]: https://img.shields.io/badge/Hibernate-blue?style=for-the-badge&logo=hibernate
[Hibernate-url]: https://hibernate.org/
[MySql]: https://img.shields.io/badge/MySQL-00000F?style=for-the-badge&logo=mysql&logoColor=white
[MySQL-url]: https://www.mysql.com/fr/

[JaxRS]: https://img.shields.io/badge/JaxRS-274759?style=for-the-badge
[JaxRS-url]: https://www.baeldung.com/jax-rs-spec-and-implementations