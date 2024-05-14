def call() {
    echo "Hello"
    sh 'mvn clean package sonar:sonar'
}