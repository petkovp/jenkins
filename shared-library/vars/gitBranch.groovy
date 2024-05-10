def call() {
    sh '''
    echo Hello World
    echo ${TAG}
    '''
}