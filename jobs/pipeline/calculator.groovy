pipelineJob('Calculator-Pipeline') {
    description('Calculator Job')
    displayName('Calculator-Pipeline')
    definition {
        cpsScm {
          scm {
            git {
                remote {
                    name('Jenkins jobs')
                    url('https://github.com/petkovp/calculator.git')
                }
                branch('main')
            }
          }
          scriptPath("Jenkinsfile")
      }
    }
 }