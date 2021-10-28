pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh 'gradlew clean build'
      }
    }

    stage('run') {
      steps {
        sh 'java -jar /build/libs bg-deployment-0.0.1-SNAPSHOT.jar'
      }
    }

  }
}