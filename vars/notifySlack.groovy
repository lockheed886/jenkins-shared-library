def call(Map config = [:]) {
    slackSend channel: '#devops-notifications', message: config.message
}
