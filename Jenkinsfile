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
                sh 'docker rmi -f java-app1'
                sh 'docker build -t java-app1 .'
            }
        }

        stage ('docker Run') {
            steps {
                sh 'docker stop java-app-container || true'
                sh 'docker rm java-app-container || true'
                sh 'docker run -d -p 80:80 --name java-app-container java-app1'
            }
        }
    }
}