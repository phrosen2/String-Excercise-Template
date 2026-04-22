#!/bin/bash

set -e

echo "Compiling..."

javac -cp ".;./junit-platform-console-standalone-1.10.2.jar" -d . StringExercises.java StringExercisesTest.java

echo "Running tests..."

java -jar junit-platform-console-standalone-1.10.2.jar \
  --class-path . \
  --scan-class-path \
  --details tree \
  | sed -r 's/\x1B\[[0-9;]*[mK]//g' > results.txt

echo "Complete! See results.txt for results."
