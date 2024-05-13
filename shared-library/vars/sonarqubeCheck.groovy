import hudson.model.*
import jenkins.model.*
import hudson.plugins.sonar.*
import hudson.plugins.sonar.model.TriggersConfig
import hudson.tools.*

def sonarqube = "SonarQube"
def sonarqubeId = "sonarqube"


def call() {
    sh 'mvn clean package sonar:sonar'
    waitForQualityGate abortPipeline: false
}