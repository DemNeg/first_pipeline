pipeline {
    agent any
    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "M3"
    }
    stages {
        stage('compile') {
            steps {
                // Run Maven on a Unix agent.
                sh "mvn -Dmaven.test.failure.ignore=true clean compile"
            }
        }
        stage('test') {
            steps {
                // Run the test.
                sh "mvn test"
            }
        }
        stage("Package") { 
            steps { 
                 sh "mvn package" 
             } 
        }
         stage("Docker build") { 
            steps { 
                 sh "docker build -t gousindevops/calculator ." 
             } 
        }
    }
}
