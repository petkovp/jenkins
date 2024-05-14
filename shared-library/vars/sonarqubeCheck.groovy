def call() {
    echo "Hello"
    sh 'mvn clean package sonar:sonar'
    echo "Print"
    waitForQualityGate abortPipeline: false
}