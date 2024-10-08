pipeline {
    agent any

    tools {
        // Use the Docker tool configured in Jenkins
        dockerTool 'DockerDefault'
    }

    environment {
        // Define Docker Hub repository name
        DOCKERHUB_REPO = 'jannassl/tempconverter'
        // Define Docker image tag
        DOCKER_IMAGE_TAG = 'latest'
    }
    stages {
        stage('Checkout') {
            steps {
                // Checkout code from Git repository
                git 'https://github.com/Jannassl/TemperatureConverter.git'
            }
        }
        stage('Build Docker Image') {
            steps {
                // Build Docker image
                script {
                    docker.build("${DOCKERHUB_REPO}:${DOCKER_IMAGE_TAG}")
                }
            }
        }
        stage('Push Docker Image to Docker Hub') {
            steps {
                // Push Docker image to Docker Hub
                script {
                    docker.image("${DOCKERHUB_REPO}:${DOCKER_IMAGE_TAG}").push()
                }
            }
        }
    }
}