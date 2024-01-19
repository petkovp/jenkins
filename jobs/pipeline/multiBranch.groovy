multibranchPipelineJob('MultiBranch') {
    description('MultiBranch Pipeline Job')
    displayName('MultiBranch-Pipeline')
    branchSources {
        git {
            id('multibranchPipelineJob')
            remote('https://github.com/petkovp/multiBranch.git')

        }
    }
     factory {
        workflowBranchProjectFactory {
        scriptPath('Jenkinsfile')
        }
    }
    orphanedItemStrategy {
        discardOldItems {
        numToKeep(20)
    }
}