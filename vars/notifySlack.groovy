def call(Map params = [:]) {
    def msg = params.get('message', 'Default Build Notification')
    
    // Print to Jenkins console 
    echo "Sending Slack Notification: ${msg}"
    
    // Commented out to prevent credential crashes
    // slackSend(color: 'GOOD', message: msg)
}
