#!/usr/bin/bash

COMMAND="java Program"
DELIM="\n-------------------------\n"

make

echo -e "Run \`$COMMAND\` to execute the command w/o recompiling"
echo -e "$DELIM"

$COMMAND
