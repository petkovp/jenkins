pipeline {
  agent {
    label 'docker'
  }
  stages {
    stage('Build') {
      steps {
        echo "building"
      }
    }
    stage('AWS S3 List') {
      steps {
        withAWS(credentials:'aws-credentials') {
          sh '''
          aws s3 ls
          '''
        }
      }
    }
  }
}
