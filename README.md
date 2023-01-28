# DECIDE

**Warning: This is a university project of no use.**

This is an implementation of DECIDE function, described in [the specification](https://canvas.kth.se/courses/37918/files/6157550/download).

## Building

Our project uses Maven build system, the configuration can be found in `pom.xml`. We use JUnit for testing. To create an executable in `target/assignment-1.0-SNAPSHOT.jar` you can run:

```
mvn clean verify
```

## Code Style

The code style is enforced by the build system. The file describing the formatting rules is `format.xml`, it is in the Eclipse file-format. The code style is based on [Google Java Style Guide](https://google.github.io/styleguide/javaguide.html) with indentation by 4 spaces instead of 2. You can use Maven to automatically apply the code style by running:

```
mvn spotless:apply
```

## Contributing

You can choose any open task on the project's GitHub Issues [page](https://github.com/DD2480-group14/Assignment-1/issues) and create a branch named `issues/#` where # is the number of the issue you want to work on. After committing to the branch to the point where you feel like the work is done, you can create a pull request. All pull requests need to pass all existing project tests, as well as comply to the project's code style. Additionally, before being merged a pull request needs to be reviewed by someone else.