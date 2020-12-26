Feature: epam website testing

  Scenario: run a searching test
     Given we have https://www.epam.com/ open
      When click search button
      When search for RPA
      Then we have https://www.epam.com/search?q=RPA


  Scenario: run a external links test
     Given we have https://www.epam.com/ open
      When click LinkedIN button
      Then we have https://www.linkedin.com/company/epam-systems/ open

  Scenario: run a simple button test
     Given we have https://www.epam.com/ open
      When we click on our work
      Then we have https://www.epam.com/our-work open

  Scenario: run a simple button test
     Given we have https://www.epam.com/ open
      When we click on insights
      Then we have https://www.epam.com/insights open

  Scenario: run a main page service buttons test
     Given we have https://www.epam.com/ open
      When we click on Design button
      Then we have https://www.epam.com/services/consult-and-design open

  Scenario: run a submenu button test
     Given we have https://www.epam.com/ open
      When we click on our work Life Sciences button
      Then we have https://www.epam.com/our-work/life-sciences open

  Scenario: run a blog test
     Given we have https://www.epam.com/ open
      When we click on blog button
      Then we have blog article open 

  Scenario: run a simple menu buttons test
     Given we have https://www.epam.com/ open
      When we click on menu button
      When we click on service button
      Then we have https://www.epam.com/services open
      
      