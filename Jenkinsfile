node {
    stage('test') {
        sh "chmod +x /tmp/kubectl"
        sh "/tmp/kubectl --kubeconfig /tmp/admin.conf get no"
    }
}