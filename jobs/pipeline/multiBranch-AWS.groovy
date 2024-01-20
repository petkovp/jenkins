multibranchPipelineJob('Payment-Gateway/MultiBranchAWS') {
    description('MultiBranch AWS Pipeline Job')
    displayName('MultiBranch-Pipeline-AWS')
    branchSources {
        git {
            id('multibranchAWSPipelineJob')
            remote('https://github.com/petkovp/MultiBranch-AWS.git')

        }
    }
     factory {
        workflowBranchProjectFactory {
        scriptPath('Jenkinsfile')
        }
    }
    orphanedItemStrategy {
        discardOldItems {
    }
  }
}