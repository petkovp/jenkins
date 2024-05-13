def call() {[
    sh '''
    mvn clean package sonar:sonar
    ''',
    waitForQualityGate abortPipeline: false
]
}