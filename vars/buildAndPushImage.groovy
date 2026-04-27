import org.devops.DockerHelper

def call(String imageName, String tag = 'latest') {
    echo "Building and Pushing Image: ${imageName}:${tag}"
    def dockerHelper = new DockerHelper(this)
    dockerHelper.buildImage(imageName, tag)
    dockerHelper.pushImage(imageName, tag)
}
