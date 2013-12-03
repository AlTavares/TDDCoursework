ncl_csc2021_tddCoursework
=========================

This is an Eclipse Project used as a framework to support coursework on Test-Driven Development as part of the Software Engineering Module CSC2021 in the School of Computing Science at Newcastle University.

#Usage

1. Clone the repo, or download and extract the zip
2. Start Eclipse into your normal workspace, or a new workspace
3. Import this project into Eclipse:
  1. File->Import->General->Existing Projects into Workspace
  2. Next
  3. Select root directory to location of downloaded project
  4. Finish
4. Confirm working
  1. Open ```ExampleLoggingTest.java```
  2. Run->Run As->JUnit Test (keyboard shortcut: F11)
  3. Console output should be:
      ```
      INFO : TestSuite [com.example.tddCoursework.ExampleLoggingTest] started
      WARN :   Test [test]   failed with exception [Not yet implemented]
      INFO :   Test [test2]   succeeded 
      INFO : TestSuite [com.example.tddCoursework.ExampleLoggingTest] finished
      ```
  4. Additionally, there should be an html log file at ```ncl_csc2021_tddCoursework/log```
    1. Open the log file in your browser to check it has log data in it - it should be showing a log session that started very recently
5. You are good to go


#Notes

1. There is an example test class called ```ExampleLoggingTest.java``` that should be useful to get you started
2. **ALL** your test classes need to extend ```AbstractLoggingJUnitTest```, which provides the build hooks to log test events
3. You **can** have multiple test classes, as long as they all extend ```AbstractLoggingJUnitTest```
4. If you're using git for versioning, the present .gitignore ignores everything in log/ so you'll want to change this
