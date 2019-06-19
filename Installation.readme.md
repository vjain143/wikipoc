# Jenkins Instalaltion on Ubantu
* First add the repository key to the system <br>
  wget -q -O - https://pkg.jenkins.io/debian/jenkins.io.key | sudo apt-key add -
* Run update so that apt will use the new repository: <br>
  sudo apt update
* Install Jenkins and its dependencies <br>
  sudo apt install jenkins
* Start Jenkins using systemctl <br>
  sudo systemctl start jenkins
* systemctl doesn't display output, you can use its status command to verify that Jenkins started successfully: <br>
  sudo systemctl status jenkins
 * Opening the Firewall <br>
  sudo ufw allow 8080
 * Check ufw's status to confirm the new rules: <br>
  sudo ufw status

# Setup Jenkins for very first time 
* To set up your installation, visit Jenkins on its default port, 8080<br>
  http://localhost:8080
* You should see the Unlock Jenkins screen, which displays the location of the initial password, In the terminal window, use the cat command to display the password<br>
  sudo cat /var/lib/jenkins/secrets/initialAdminPassword
* The next screen presents the option of installing suggested plugins or selecting specific plugins. We'll click the Install suggested plugins option, which will immediately begin the installation process: <br>
* Create First Admin user<br>
  Enter the name and password for your user
* Click Start using Jenkins to visit the main Jenkins dashboard<br>

# Modify Jenkins as per your need
* Change default port(8080) to any other port(9090)<br>
  sudo vi /etc/default/jenkins<br>
  The only place you need to change is:<br>
  #port for HTTP connector (default 8080; disable with -1)<br>
  HTTP_PORT = 8080<br>
  There you change to the desired port. For example:<br>
  HTTP_PORT = 8081<br>
  Finally, run this command:<br>
  sudo service jenkins restart<br>
