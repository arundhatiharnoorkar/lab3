pipeline {
    agent any

    stages {
        stage('Compile') {
            steps {
                sh 'javac Calculator.java'
            }
        }

        stage('Execute') {
            steps {
                sh 'java Calculator'
            }
        }
    }
}
