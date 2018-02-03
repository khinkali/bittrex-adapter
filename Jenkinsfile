node {
    stage('test') {
        sh "export KUBE_LATEST_VERSION=\"v1.9.2\""
        sh "curl -LO  https://storage.googleapis.com/kubernetes-release/release/${KUBE_LATEST_VERSION}/bin/linux/amd64/kubectl"
        sh "chmod +x ./kubectl"
        sh "./kubectl --kubeconfig /tmp/admin.conf get no"
    }
}