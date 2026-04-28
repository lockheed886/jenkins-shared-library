def call(Map params = [:]) {
    echo "Slack Message: ${params.message}"
    slackSend(channel: '#devops-notifications', message: params.message)
}
