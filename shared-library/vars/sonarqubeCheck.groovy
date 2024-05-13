def call() {[
    mvn clean package sonar:sonar,
    waitForQualityGate abortPipeline: false
]
}