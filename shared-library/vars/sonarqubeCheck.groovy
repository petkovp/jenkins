def call() {
    echo "Hello"
    sh 'mvn clean package sonar:sonar'
}

def quality() {
   echo "Print"
   waitForQualityGate abortPipeline: false
}