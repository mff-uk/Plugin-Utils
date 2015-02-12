#!/bin/bash

# Build base projects.
echo "building base projects .."
cd ../base 
 cd unifiedviews-base
  mvn clean install
 cd ../unifiedviews-dpu-base
  mvn clean install
 cd ../unifiedviews-lib-base
  mvn clean install
 cd ..

# Build libraries.
echo "building libs .."
cd ../libs
 for f in utils-*; do
   cd $f
    mvn clean install
   cd ..
  done
 for f in boost-*; do
   cd $f
    mvn clean install
   cd ..
  done

# Build templates.
echo "preparing maven templates .."
cd ../templates
 cd dpu
  mvn clean install
 cd ..

# Go back to tools.
cd ../tools
echo "done"
