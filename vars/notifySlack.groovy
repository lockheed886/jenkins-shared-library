def call(Map params = [:]) {
    // Line 2: Safely check if a message was provided
    def msg = params.get('message', 'Default Build Notification')
    
    // Print to Jenkins console
    echo "Sending Slack Notification: ${msg}"
    
    // Call the actual Jenkins Slack plugin
    slackSend(color: 'GOOD', message: msg)
}
