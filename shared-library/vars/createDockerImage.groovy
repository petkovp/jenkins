def call() {
    sh '''
      /kaniko/executor  \
        --cache-ttl=48h \
        --context . \
        --dockerfile Dockerfile \
        --build-arg AWS_REGION=${AWS_REGION} \
        --build-arg AWS_ACCESS_KEY_ID=${AWS_ACCESS_KEY_ID} \
        --build-arg AWS_SECRET_ACCESS_KEY=${AWS_SECRET_ACCESS_KEY} \
        --destination ${REGISTRY}:${TAG}
    '''
}