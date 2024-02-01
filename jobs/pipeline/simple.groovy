pipelineJob('Simple-Pipeline') {
    description('Simple Job')
    displayName('Simple-Pipeline')
    definition {
        cpsScm {
          scm {
            git {
                remote {
                    name('Jenkins jobs')
                    url('https://github.com/petkovp/simple-java.git')
                }
                branch('main')
            }
          }
          scriptPath("Jenkinsfile")
      }
    }
 }