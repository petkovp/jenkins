pipelineJob('First-Pipeline') {
    description('Pipeline Job')
    displayName('First-Pipeline')
    definition {
        cpsScm {
          scm {
            git {
                remote {
                    name('Jenkins jobs')
                    url('https://github.com/petkovp/jenkins.git')
                }
                branch('main')
            }
          }
          scriptPath("Jenkinsfile")
      }
    }
 }