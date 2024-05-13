def call() {
    sh 'mvn clean package sonar:sonar'
    withSonarQubeEnv(installationName: 'SonarQube', credentialsId: 'sonarqube')
    waitForQualityGate abortPipeline: false
}