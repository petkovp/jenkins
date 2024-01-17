multibranchPipelineJob('MultiBranch') {
    description('MultiBranch Pipeline Job')
    displayName('MultiBranch-Pipeline')
    branchSources {
        git {
            remote('https://github.com/petkovp/multiBranch.git')

        }
    }
    scriptPath("Jenkinsfile")
}