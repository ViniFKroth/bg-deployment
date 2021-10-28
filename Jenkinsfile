pipeline {
  agent {
    dockerfile {
      filename 'Dockerfile'
    }

  }
  stages {
    stage('Build') {
      steps {
        sh 'sudo docker build -t bgdeploy .'
      }
    }

    stage('run') {
      steps {
        sh 'sudo docker run -d bgdeploy'
      }
    }

  }
}