# Github Actions with Java

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
