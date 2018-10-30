package com.boxboat.jenkins.library
import com.boxboat.jenkins.library.docker.Registry

class ServerConfig {

    static final gitEmail = 'jenkins@ORG.com'
    static final String gitCredentials = 'jenkins-svc-key'
    static final Map<String, String> registryMap = [
            "dtr":  new Registry("dtr.boxboat.com","https", "dtr"),
    ]

    static final buildVersionsGitRemoteUrl = "ssh://git@github.com/ORG/build-versions.git"

    static gitRemotePath(String url) {
        def matcher = url =~ /github\.com\/(.*)\.git$/
        return matcher.hasGroup() ? matcher[0][1] : null
    }

    static gitRemoteUrl(String path) {
        return "git@github.com/${path}.git"
    }

}