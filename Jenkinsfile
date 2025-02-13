pipeline {
    agent any
    stages {
        stage ('git checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/NIBI23/java-app1.git'
            }
        }

        stage ('mvn build and Test') {
            steps {
                sh 'mvn clean package'
            }
        }
        
        stage ('docker build') {
            steps {
                sh 'docker build -t java-app1 .'
            }
        }

        stage ('docker Run') {
            steps {
                sh 'docker run -d -p 8080:8080 java-app1'
            }
        }
    }
}