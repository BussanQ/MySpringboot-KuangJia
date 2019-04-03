#!/usr/bin/env bash
base_dir=$(dirname $0)/..


# loading dependency jar in lib directory
for file in $base_dir/lib/*.jar;
do
  CLASSPATH=$CLASSPATH:$file
done

if [ -z "$PUBLISH_CONFIG_OPTS" ]; then
  PUBLISH_CONFIG_OPTS="-Dpublish-config=$base_dir/conf/application.yml"
fi
#if [ -z "$PUBLISH_PROFILE_OPTS" ]; then
#  PUBLISH_PROFILE_OPTS="-Dspring.profiles.active=production"
#fi


java_option="$PUBLISH_CONFIG_OPTS "

class_path="$CLASSPATH"

$base_dir/bin/daemon.sh start "$java_option" "$class_path"

