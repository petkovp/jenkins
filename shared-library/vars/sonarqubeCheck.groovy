def call() {
    sh 'mvn clean package sonar:sonar'
}

def quality() {
   waitForQualityGate abortPipeline: false'
}