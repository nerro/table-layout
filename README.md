TableLayout - An Alternative to GridBagLayout
=============================================

[![Build Status](https://travis-ci.org/nerro/table-layout.svg?branch=master)](https://travis-ci.org/nerro/table-layout)

This project is a mirror of the great and powerful layout manager TableLayout by Daniel Barbalace.

Javadoc for this project is available under http://nerro.github.io/table-layout.

Maven coordinates:

    <dependency>
      <groupId>info.clearthought</groupId>
      <artifactId>table-layout</artifactId>
      <version>4.2</version>
    </dependency>


Preface
-------

Little introduction why I created this repository. In one of the projects I wanted to use this layout manager, but it was not easy to find the binaries. JAR files in maven central repository were not the same with TableLayout.jar from Oracle site:

* mvnrepository.com (http://mvnrepository.com/artifact/tablelayout/TableLayout/20050920)
* oracle.com (http://www.oracle.com/technetwork/java/tablelayout-141489.html)

Further in JARs there are java source files with examples too.


Idea
----

My idea was (is) to split old project in two projects: tablelayout (with only core files) and examples; and migrate to maven. Then I put it to github. The main motive for adaption and migration is to bring more standard (jar file name etc.) and possibly give *second breeze* for project with github pull request model.


Conclusion
----------

All rights belongs to Daniel Barbalce (http://www.clearthought.info).

I just changed the build system from ant to maven, subversion to git and extracted examples in the separate project.
