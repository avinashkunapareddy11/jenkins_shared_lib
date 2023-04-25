def call(credentialsId){
    withSonarQubeEnv(credentialsId: credentialsId) {

    sh 'mvn package sonar:sonar'
    }
}
