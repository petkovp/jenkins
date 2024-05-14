def call(pipelineParams) {

    pipeline {
      agent {
        kubernetes {
          inheritFrom 'maven-pvc'
        }
      }
    environment {
       BRANCH = "${GIT_BRANCH.split("/")[1]}"
       TAG = "${BRANCH}-${BUILD_TIMESTAMP}"
    }
      stages {
        stage('Build') {
          steps {
            echo ${TAG}
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