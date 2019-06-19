# Jenkins Instalaltion on Ubantu
* First add the repository key to the system <br>
  wget -q -O - https://pkg.jenkins.io/debian/jenkins.io.key | sudo apt-key add -
* Run update so that apt will use the new repository:  <br>
  sudo apt update
* Install Jenkins and its dependencies<br>
  sudo apt install jenkins
