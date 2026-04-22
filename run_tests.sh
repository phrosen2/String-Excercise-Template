#!/bin/bash

set -e

echo "Compiling..."



if [[ "$OSTYPE" == "msys" ]]; then
#For Windows
javac -cp ".;./junit-platform-console-standalone-1.10.2.jar" -d . StringExercises.java StringExercisesTest.java
else
#For Unix-based OSes
javac -cp ".:./junit-platform-console-standalone-1.10.2.jar" -d . StringExercises.java StringExercisesTest.java
fi

echo "Running tests..."

java -jar junit-platform-console-standalone-1.10.2.jar \
  --class-path . \
  --scan-class-path \
  --details tree \
  | sed -r 's/\x1B\[[0-9;]*[mK]//g' > results.txt

echo "Complete! See results.txt for results."

if grep ✘ results.txt; then
  cat results.txt
  exit 1
fi
echo "All tests passed"
exit 0
