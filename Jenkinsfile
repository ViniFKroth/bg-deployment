pipeline {
  agent {
    docker {
      image 'openjdk:11'
      args '-p 8080:8080'
    }

  }
  stages {
    stage('Build') {
      steps {
        sh './gradlew clean build'
      }
    }

    stage('run') {
      steps {
        sh 'java -jar /build/libs bg-deployment-0.0.1-SNAPSHOT.jar'
      }
    }

  }
}