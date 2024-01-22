pipeline {
  agent {
    kubernetes {
      inheritFrom 'aws'
    }
  }
  stages {
    stage('Build') {
      steps {
         echo "building"
        }
      }
    }
    stage('AWS S3 List') {
      steps {
          sh '''
          aws s3 ls
          '''
      }
    }
  }
}
