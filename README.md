# ScalaJS-TravisCI-Template [![Build Status](https://travis-ci.org/MaxInertia/ScalaJS-TravisCI-Template.svg?branch=master)](https://travis-ci.org/MaxInertia/ScalaJS-TravisCI-Template)
A basic project template for a SBT ScalaJS application which integrates with Travis CI.

## Complications

1. **Problem:** `sbt test` produces the following error: `Cannot find module 'jsdom'`   
**Solution:** Run `npm install jsdom@9.12.0` in project root.   
(`npm install jsdom` will get a more recent version, but it is causing other problems)
