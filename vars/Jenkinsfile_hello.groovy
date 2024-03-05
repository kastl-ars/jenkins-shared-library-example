#!/usr/bin/env groovy

import org.jenkinsci.plugins.pipeline.modeldefinition.Utils

def call(Map pipelineParams) {
    node() {
        stage('Greeting') {
          try {
              echo "Hello"
          } // try
          catch (err) {
              error "${err}"
          } // catch
        } // stage
    } // node
} // definition
