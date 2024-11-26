pipeline {
    agent any  // Runs on any available agent

    stages {
        // Stage 1: GitHub Access
        stage('GitHub Access') {
            steps {
                script {
                    // Clone the GitHub repository
                    echo 'Cloning the GitHub repository...'
                    git 'https://github.com/shilpa-05c0/Java-py.git'  // Your repository
                }
            }
        }

        // Stage 2: Java Program Execution
        stage('Java Program Execution') {
            steps {
                script {
                    // Compile and run the Java program on Windows
                    echo 'Compiling and running the Java program...'
                    bat 'javac HelloWorld.java'  // Compile Java program
                    bat 'java HelloWorld'        // Run Java program
                }
            }
        }

        // Stage 3: Python Program Execution
        stage('Python Program Execution') {
            steps {
                script {
                    // Run the Python script on Windows
                    echo 'Running the Python program...'
                    bat 'python hello-world.py'  // Execute Python script
                }
            }
        }
    }

    post {
        // Actions to take after the pipeline completes (successful or failed)
        always {
            echo 'Pipeline execution completed.'
        }

        success {
            echo 'Pipeline completed successfully!'
        }

        failure {
            echo 'Pipeline failed. Check logs for details.'
        }
    }
}
