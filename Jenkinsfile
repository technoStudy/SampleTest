pipeline {
    agent any

    tools {
        jdk 'ADOPT_JDK11'
    }
    stages {
        stage("Print java version") {
            steps {
                bat "java -version"
            }
        }
        stage('Test') {
            steps {
                // Run Maven on a Unix agent.
                // sh "mvn clean test"
                // To run Maven on a Windows agent, use
                bat "mvn -Dmaven.test.failure.ignore=true clean test"
            }

            post {
                always {
                    step([$class: 'Publisher', reportFilenamePattern:'**/testng-results.xml'])
                }
            }

        }
    }
}
