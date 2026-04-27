package org.devops

class NotificationService implements Serializable {
    def steps

    NotificationService(steps) {
        this.steps = steps
    }

    def sendSlack(String message) {
        steps.slackSend(channel: '#jenkins-notifications', message: message)
    }
}
