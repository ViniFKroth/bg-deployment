pipeline {
  agent {
    dockerfile {
      filename 'Dockerfile'
    }

  }
  stages {
    stage('Build') {
      steps {
        sh 'docker build -t bgdeploy .'
      }
    }

    stage('run') {
      steps {
        sh 'sudo docker run -d bgdeploy'
      }
    }

  }
}