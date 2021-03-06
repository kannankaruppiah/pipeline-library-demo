#!/usr/bin/env groovy

def call(String name = 'human') {
  
  nexusArtifactUploader(
                   artifacts: [[
                     artifactId: 'spring-app',
                     classifier: '',
                     file: '/home/ubuntu/jenkins-agent/workspace/test_pipeline/target/spring-app-1.0-SNAPSHOT.jar',
                     type: 'jar'
                   ]],
                   credentialsId: 'jfrog',
                   groupId: 'com.quickfix.app',
                   nexusUrl: 'ec2-18-191-250-128.us-east-2.compute.amazonaws.com:8081/artifactory',
                   nexusVersion: 'nexus2',
                   protocol: 'http',
                   repository: 'ip-172-31-19-164-snapshots',
                   version: '1.0-SNAPSHOT'
                   ) 
}
