pipeline {
 agent any
 environment {
 PATH = "${env.PATH};C:\\Windows\\System32" // Update the PATH to include the directory of cmd.exe
 GIT_CREDENTIALS = credentials('ADirin')
 }

 stages {
 stage('Checkout') {
 steps {
 git branch: 'master', credentialsId: 'ADirin', url: 'https://github.com/ADirin/FarToCel_Fall2024.git'
 }
 }
 stage('Build') {
 steps {
 bat 'mvn clean install'
 }
 }
 stage('Test') {
 steps{
 bat 'mvn test'
 }
 post {
 success {
 // Publish JUnit test results
 junit '**/target/surefire-reports/TEST-*.xml'
 // Generate JaCoCo code coverage report
 jacoco(execPattern: '**/target/jacoco.exec')
 }
 }
 }
 }
}
