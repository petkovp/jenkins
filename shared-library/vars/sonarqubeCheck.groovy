def call() {
    sh 'mvn clean package sonar:sonar'
}

int quality () {
    waitForQualityGate abortPipeline: false
}