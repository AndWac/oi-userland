@Library("BuildLib") _
pipeline {
    agent {
        node {
            label 'userland'
        }
    }
    stages {
        stage('Ensure is ready to build') {
            steps {
                sh 'mountall -F nfs
            }
        }
        stage('Git Checkout') {
            steps {
                withSharedWs() {
                    git branch: 'oi/hipster', url: 'https://github.com/OpenIndiana/oi-userland.git'
                }
            }
        }
        stage('Gmake Setup') {
            steps {
                sh 'rm -f components/components.mk'
                sh 'rm -f components/depends.mk'
                withPublisher('openindiana.org', 'incremental') {
                    sh 'gmake setup'
                }
            }
        }
        stage('Gmake Publish') {
            steps {
                withPublisher('openindiana.org', 'incremental') {
                    sh './tools/jenkinshelper-main.ksh -s build_changed'
                }
            }
        }
        stage('copy packages') {
            steps {
                pkgcopy()
            }
        }
        stage('update system') {
            steps {
                update()
            }
        }
    }
}

