pipelineJob('Docker') {
    description('Docker Job')
    displayName('Docker')
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
          scriptPath("Jenkinsfile-docker")
      }
    }
 }