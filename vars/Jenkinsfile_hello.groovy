#!/usr/bin/env groovy

import org.jenkinsci.plugins.pipeline.modeldefinition.Utils


def call(Map pipelineParams) {
    node('markdownlint') {
        try {

            echo "Hello"

        } // try
        catch (err) {
            error "${err}"
        } // catch
    } // node
} // definition
