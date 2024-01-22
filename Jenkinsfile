pipeline {
  agent {
    kubernetes {
      inheritFrom 'aws'
      inheritFrom 'docker'
    }
  }
  stages {
    stage('Build') {
      steps {
        container('docker') {
          echo "building"
        }
      }
    }
    stage('AWS S3 List') {
      steps {
        container('aws') {
          sh '''
          aws s3 ls
          '''
        }
      }
    }
  }
}
