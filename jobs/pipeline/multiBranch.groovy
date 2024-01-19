multibranchPipelineJob('MultiBranch') {
    description('MultiBranch Pipeline Job')
    displayName('MultiBranch-Pipeline')
    branchSources {
        git {
            id('multibranchPipelineJob')
            remote('https://github.com/petkovp/multiBranch.git')

        }
    }
    orphanedItemStrategy {
    discardOldItems {
        numToKeep(20)
    }
     factory {
        workflowBranchProjectFactory {
        scriptPath('Jenkinsfile')
        }
    }
}