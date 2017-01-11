(ns jobless-clj.example
  (:require
   [jobless-clj.core :refer :all]))

(def jon-bristow-resume
  (cv
   (cv-name "Jon Bristow")
   (email "jbristow+github@gmail.com")
   (location "San Diego, CA")
   (homepage "http://jondotcomdotorg.net")
   (employment
    (entry
     (title "Senior Software Developer")
     (company "Intuit")
     (homepage "http://intuit.com")
     (technologies "bash, Java, Javascript, clojure, go")
     (bulletin "Developed RESTful webservice in Java/EC2/RDS to bridge two deployment systems.")
     (bulletin "Maintained and updated clojure webservice.")
     (bulletin "Mentored junior developers on code quality and code review practices.")
     (bulletin "Provided on-call and in-person support for teams to aid in onboarding and general CICD questions.")
     (bulletin "Contributed to open source clojure development. (httpkit)")
     (start-date "July 2016")
     (end-date "Current"))
    (entry
     (title "Senior Software Developer in Quality")
     (company "Intuit")
     (homepage "http://intuit.com")
     (technologies "bash, Java, Javascript, clojure, go")
     (bulletin "Developed automation in Java, Javascript, bash, and ruby to capture test scenarios.")
     (bulletin "Assisted developers in refactoring their code for testability and code quality. (And fixed bugs in Java and clojure)")
     (bulletin "Championed code quality tools and metrics gathering.")
     (bulletin "Used innovation days to explore code security issues. (Search intuit github for meerkat and songbird)")
     (bulletin "Mentored developers on code quality and testing best practices.")
     (start-date "October 2013")
     (end-date "July 2016"))
    (entry
     (title "Lead Software Developer")
     (company "Leadfusion")
     (homepage "http://leadfusion.com")
     (technologies "Java, javascript, c, bash")
     (bulletin "Developed whole stack solutions with Spring 3 (Web and Security), JPA/Hibernate, Javascript (jQuery and Bootstrap), and ORACLE. ")
     (bulletin "Maintained and improved legacy software, including JDO (Kodo), ETL (Pervasive/ORACLE), and Spring/SpringWeb 2.0. ")
     (bulletin "Lead retrospectives, sprint and release planning. Acted as the scrum evangelist and trainer. ")
     (bulletin "Helped to improve existing Continuous Integration from CruiseControl to Jenkins. (TDD with jUnit3 and 4) ")
     (bulletin "Supported implementation engineers by researching and fixing customer issues.")
     (start-date "November 2012")
     (end-date "September 2013"))
    (entry
     (title "Senior Java Developer")
     (company "Skycreek")
     (homepage "http://skycreek.com")
     (technologies "Java, Oracle PLSQL, Javascript")
     (bulletin "Developed and maintained an ETL system in Java using Spring Batch.")
     (bulletin "Created, upgraded, and maintained automated test data creation for a dataset with 3.5 million entries.")
     (bulletin "Worked with ORACLE tools like Enterprise Manager and SqlDeveloper to create and performance tune SQL queries.")
     (bulletin "Participated in an Agile/Scrum workflow.")
     (bulletin "Used TDD (jUnit/fest) to ensure code quality and create useful unit, integration and acceptance tests.")
     (bulletin "Helped to create development processes to aid bringing our continuous deployment configuration online.")
     (start-date "August 2010")
     (end-date "November 2012"))
    (entry
     (title "Senior Java Developer")
     (company "Fairway Technologies")
     (technologies "Java, Javascript")
     (bulletin "Developed applications in Seam/Facelets, using Java, J2EE, JPA and JBoss.")
     (bulletin "Participated in an agile (Scrum) environment with Test Driven Design.")
     (bulletin "Consulted on projects and collaborated with offsite clients at BillMeLater.")
     (bulletin "Created and gave presentations on coding and development.")
     (bulletin "Helped to maintain a \"Code Club\" to expand interest in learning new programming languages.")
     (start-date "July 2009")
     (end-date "August 2010")))
   (education
    (entry
     (title "B.A. Computer Science")
     (company "University of California, San Diego")
     (start-date "2000")
     (end-date "2004")))
   (other-exp
    (entry
     (title "JokeBot")
     (homepage "https://github.com/jbristow/JokeBot")
     (description "Silly fortune file markov chain generator."))
    (entry
     (title "bgg-shelve")
     (homepage "https://github.com/jbristow/bgg-shelve")
     (description "Naiively optimizes your board games on a shelf."))
    (entry
     (title "StackOverflow")
     (homepage "http://stackoverflow.com/users/113332/jbristow")))))
