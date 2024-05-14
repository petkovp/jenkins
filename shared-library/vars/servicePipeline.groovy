def call(pipelineParams) {

    pipeline {
      agent {
        kubernetes {
          inheritFrom 'maven-pvc'
        }
      }
    environment {
       BRANCH = 'pipelineParams.Branch'
       TAG = 'pipelineParams.Tag'
    }
      stages {
        stage('Build') {
          steps {
            echo pipelineParams.TAG
          }
        }
        stage('SonarQube Check') {
          steps {
            container('maven-pvc') {
            withSonarQubeEnv(installationName: 'SonarQube', credentialsId: 'sonarqube') {
            sh 'mvn clean package sonar:sonar'
              }
            }
          }
        }
        stage("Quality gate") {
          steps {
            waitForQualityGate abortPipeline: false
          }
        }
      }
    }
}