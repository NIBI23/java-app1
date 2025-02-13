pipeline {
    agent any
    stages {
        stage ('git checkout') {
            steps {
                git '
            }
        }

        stage ('mvn build and Test') {
            steps {
                sh 'mvn clean package'
            }
        }

    }
}