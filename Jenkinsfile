pipeline {
    agent {
        stages {
                stage('Build') {
                    steps {
                        sh './mvnw -B -DskipTests clean package'
                    }
                }
            }
    }
}