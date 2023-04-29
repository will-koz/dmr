#!/usr/bin/bash

# Simple script to turn this git repo into a single .txt file so that it can be submitted.

FILES=$(git ls-tree --full-tree --name-only -r HEAD)

tail $FILES --lines=+1 > final.txt
