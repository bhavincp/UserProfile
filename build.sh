#!/bin/bash
if [ "$1" != "test" ] && [ "$1" != "production " ]; then
echo "Invalid aruguement, must be test or production"
exit 0
fi

mvn clean install

java -jar target/UserProfile-0.0.1-SNAPSHOT.jar server "src/main/resources/$1_configuration.yml"