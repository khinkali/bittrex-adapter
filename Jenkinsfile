podTemplate(label: 'kubectl') {
    node('kubectl') {
        stage('do some kubectl work') {
            container('kubectl') {
                sh "kubectl get nodes"
            }
        }
    }
}