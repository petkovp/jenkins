def call() {
    sh '''
    mvn clean package sonar:sonar
    '''
}

def in() {
 waitForQualityGate abortPipeline: false
 }