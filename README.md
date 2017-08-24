[Codecov][0] Java Maven Example
===============================

1. Add `cobertura-maven-plugin` plugin to your pom.xml file, [see here](https://github.com/codecov/example-java-maven/blob/master/pom.xml#L47-L58)
1. Call `mvn cobertura:cobertura` during your CI tests, [see here](https://github.com/codecov/example-java-maven/blob/master/.travis.yml#L4)
1. Call `bash <(curl -s https://codecov.io/bash)` at the end of your CI build, [see here](https://github.com/codecov/example-java-maven/blob/master/.travis.yml#L7)
  - Using Travis CI, CircleCI or AppVeyor **AND** the repository is public? **You're done!** No token needed.
  - Otherwise, please add your [repository token token][5].

> Other Examples
> - [Java JaCoCo Example][1]
> - [Android Example][3]
> - [Gradle Example][2]



[0]: https://codecov.io/
[1]: https://github.com/codecov/example-java
[2]: https://github.com/codecov/example-gradle
[3]: https://github.com/codecov/example-android
[5]: http://docs.codecov.io/docs/about-the-codecov-bash-uploader#section-upload-token



[![Build Status](
https://travis-ci.org/cftang/example-java-maven.svg?branch=master)](
https://travis-ci.org/cftang/example-java-maven)
[![codecov](https://codecov.io/gh/cftang/example-java-maven/branch/master/graph/badge.svg)](https://codecov.io/gh/cftang/example-java-maven)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/09aed95b69c14cb88521890335633acc)](https://www.codacy.com/app/RocketChat/Rocket-Chat-iOS)
