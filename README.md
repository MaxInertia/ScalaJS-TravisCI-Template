# ScalaJS-TravisCI-Template [![Build Status](https://travis-ci.org/MaxInertia/ScalaJS-TravisCI-Template.svg?branch=master)](https://travis-ci.org/MaxInertia/ScalaJS-TravisCI-Template)
A basic project template for a SBT ScalaJS application which integrates with Travis CI.

Useful Link: [Travis reference for Scala Projects](https://docs.travis-ci.com/user/languages/scala/)   
- The link above does not mention Scala 2.12.2. However the only lines in the .travis.yml relevant to compiling for this version of Scala are...   
   
   `scala: 2.12.2`   
   `jdk: oraclejdk8`  
      
   Note: Previous versions of Scala do not require specifying the `jdk`, since jdk7 is used as the default.

## Complications

1. **Problem:** `sbt test` produces the following error: `Cannot find module 'jsdom'`   
   
   **Solution:** Run `npm install jsdom@9.12.0` in project root.   
(`npm install jsdom` will get a more recent version, but it is causing other problems)
