#!/usr/bin/env bash
export GRADLE_OPTS="-Xdebug -Xrunjdwp:transport=dt_socket,address=5005,server=y,suspend=n"
gradle clean jettyRun