# Github Actions with Java

## Status

<!-- badges -->
[![github-release-badge]][github-release]
[![github-license-badge]][github-license]
<!-- badges -->

<!-- history badges -->
| GitHub Actions |
| -------------- |
| [![github-badge]][github] |
| [![github-history-badge]][github] |
<!-- history badges -->

## Description

Example to test Github Actions with Java.

Workflows:

**Branch master**

Simple workflow to build, test and deploy.

- Checkout
- Environment setup:
  - JDK 11
  - Maven packages caching
- Maven build
- Maven test
- Mave deploy to Github Packages
- Upload artifact to Github to be available to download

Example of workflow runs:

![Results](imgs/workflow-print.png)

## Links

- [Github Actions for Java](https://docs.github.com/en/actions/language-and-framework-guides/github-actions-for-java)


[github-release]: https://github.com/wesleyegberto/gh-actions-java/releases/latest
[github-release-badge]: https://img.shields.io/github/release/wesleyegberto/gh-actions-java.svg?logo=github&style=flat "Latest Release"
[github-license]: https://github.com/wesleyegberto/gh-actions-java/blob/master/LICENSE
[github-license-badge]: https://img.shields.io/github/license/wesleyegberto/gh-actions-java.svg?style=flat "License"
[github]: https://github.com/wesleyegberto/gh-actions-java/actions?query=branch%3Amaster
[github-badge]: https://github.com/wesleyegberto/gh-actions-java/actions/workflows/build-test-deploy.yml/badge.svg?branch=master
[github-history-badge]: https://buildstats.info/github/chart/wesleyegberto/gh-actions-java?includeBuildsFromPullRequest=false "GitHub Actions History"
