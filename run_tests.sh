#!/bin/bash

set -e

echo "Compiling..."

javac -cp .:junit-platform-console-standalone.jar StringExercises.java StringExercisesTest.java

echo "Running tests..."

java -jar junit-platform-console-standalone.jar \
  --class-path . \
  --scan-class-path \
  --details summary
