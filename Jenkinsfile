pipeline {
  agent {
    label 'aws'
  }
  stages {
    stage('Build') {
      steps {
        echo "building"
      }
    }
    stage('AWS S3 List') {
      steps {
        withAWS(region:'eu-central-1',credentials:'aws-credentials') {
          sh '''
          aws s3 ls
          '''
          }
      }
    }
  }
}
