pipeline {
  agent {
    docker {
      image 'openjdk:11'
      args '-p 8081:8080'
    }

  }
  stages {
    stage('Build') {
      steps {
        sh './gradlew clean build'
      }
    }

  }
}