pipeline {
    stages {
            stage('Build') {
                steps {
                    sh './mvnw -B -DskipTests clean package'
                }
            }
        }
}