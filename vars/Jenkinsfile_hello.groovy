pipeline {
    agent any
    stages {
        stage('Demo') {
            steps {
                echo 'Hello from the centralized Jenkinsfile'
            }
        }
    }
}
