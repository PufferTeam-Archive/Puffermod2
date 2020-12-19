pipeline {
  agent any
  stages {
    stage('Test & Build Artifact') {
      steps {
        sh './gradlew clean build'
      }
    }

  }
}