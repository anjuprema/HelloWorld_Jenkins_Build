pipeline {
    agent any  // Runs on any available Jenkins agent

    tools {
        jdk 'JDK17'         // Use JDK configured in Jenkins
        maven 'Maven3'      // Use Maven configured in Jenkins
    }

    stages {
        
        stage('Build with Maven') {
            steps {
                powershell 'mvn -f D:/STS_workspace/HelloWorld/pom.xml clean install'
            }
        }

        stage('Run Tests') {
            steps {
                powershell 'mvn -f D:/STS_workspace/HelloWorld/pom.xml test'
            }
        }

        stage('Copy JAR to Workspace') {
            steps {
                powershell 'copy D:/STS_workspace/HelloWorld/target/*.jar D:/WORK_SPACE'
            }
        }

        stage('Archive JAR') {
            steps {
                archiveArtifacts artifacts: 'D:/STS_workspace/HelloWorld/target/*.jar', fingerprint: true //couldn't fix pipeline error
            }
        }
    }
}
