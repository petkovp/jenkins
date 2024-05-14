def call() {
    mvnBuild () {
        sh 'mvn clean package sonar:sonar'
    }
    waitForQualityGate abortPipeline: false
}