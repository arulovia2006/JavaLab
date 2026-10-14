pipeline {
    agent any

    stages {
        stage('Check Environment') {
            steps {
                bat 'java -version'
                bat 'mvn -version'
            }
        }

        stage('Clean and Test') {
            steps {
                bat 'mvn clean test'
            }
        }

        stage('Package') {
            steps {
                bat 'mvn package'
            }
        }
    }

    post {
        success {
            echo 'All tests passed and package created.'
        }
        failure {
            echo 'Build failed. Check Console Output.'
        }
    }
}
