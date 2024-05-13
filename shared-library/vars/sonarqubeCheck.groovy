def call() {
    sh '''
    mvn clean package sonar:sonar
    '''
}

def call() {
 waitForQualityGate abortPipeline: false
 }