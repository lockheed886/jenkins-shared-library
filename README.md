# Jenkins Shared Library

This repository contains reusable Jenkins pipeline steps and logic for our DevOps projects.

## Structure
- `src/org/devops/`: Groovy classes for encapsulate logic (e.g., `NotificationService`, `DockerHelper`).
- `vars/`: Global variables representing custom steps that can be called directly in Jenkinsfiles.

## Available Steps
- `notifySlack(message: 'Hello World')`: Sends a slack notification.
- `buildAndPushImage('my-image', 'v1.0')`: Builds and pushes a Docker image.
- `runSonarScan()`: Runs a SonarQube scan.