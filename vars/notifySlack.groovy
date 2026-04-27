import org.devops.NotificationService

def call(Map config = [:]) {
    // Validation
    if (!config.message) {
        error "notifySlack: 'message' parameter is required!"
    }
    
    // Logic: use the class we just made
    echo "Sending Slack Notification: ${config.message}"
    def notificationService = new NotificationService(this)
    notificationService.sendSlack(config.message)
}
