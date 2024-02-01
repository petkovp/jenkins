pipelineJob('SonarQube-Pipeline') {
    description('SonarQube Job')
    displayName('SonarQube-Pipeline')
    definition {
        cpsScm {
          scm {
            git {
                remote {
                    name('Jenkins jobs')
                    url('https://github.com/petkovp/sonarqube.git')
                }
                branch('main')
            }
          }
          scriptPath("Jenkinsfile")
      }
    }
 }