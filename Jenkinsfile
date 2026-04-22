pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh 'javac Calculator.java'
            }
        }

        stage('Run') {
            steps {
                sh 'java Calculator'
            }
        }
    }
}
