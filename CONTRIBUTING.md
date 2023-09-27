# Contributing

## Table of Contents

- [Code of Conduct](#code-of-conduct)
- [How Can I Contribute?](#how-can-i-contribute)
    - [Reporting Bugs](#reporting-bugs)
    - [Suggesting Enhancements](#suggesting-enhancements)
    - [Code Contributions](#code-contributions)
- [Getting Started](#getting-started)
- [Development Setup](#development-setup)
- [Submitting a Pull Request](#submitting-a-pull-request)
- [Review Process](#review-process)
- [License](#license)

## Code of Conduct

Before you start contributing, please read and follow our [Code of Conduct](CODE_OF_CONDUCT.md). We expect all
contributors to adhere to this code to create a respectful and inclusive environment.

## How Can I contribute?

### Reporting Bugs

If you encounter a bug or issue with DSAL, please check the
[issue tracker](https://github.com/gorkiiuss/DSAL/issues) to see if it has already been reported. If not, please
[open a new issue](https://github.com/gorkiiuss/DSAL/issues/new) and provide the following information:

- A clear and descriptive title.
- A detailed description of the issue, including steps to reproduce it.
- Your environment (e.g., operating system, Java version).
- Any relevant screenshots or error messages.

### Suggesting Enhancements

We welcome suggestions for improving DSAL. To suggest an enhancement, please
[open a new issue](https://github.com/yourrepository/DSAL/issues/new) with the following information:

- A clear and descriptive title.
- A detailed description of the enhancement you are proposing.

### Code Contributions

If you would like to contribute code to DSAL, please follow these steps:

## Getting Started

Before you start contributing, make sure you have:

- Java Development Kit (JDK) installed. The language level must be 17.
- Maven installed.
- Git installed.
- A GitHub account.

**You must ensure that what you will add to the package does not exist in it.**

## Development Setup

1. Fork the DSAL repository to your GitHub account.
2. Clone your forked repository to your local machine:

   ````bash
   git clone https://github.com/gorkiiuss/DSAL.git
   ````

3. Create a new branch for your work. Branching follows strict guidelines for implementation based on the Gitflow way of
   working:

    1. Only one feature will be accepted for each fork that you want to pull-request.
    2. Never branch from master, if you want to contribute with new code, create a feature branch from develop.
    3. The feature branch must follow this name convention:
       > feature/feature-name
    4. If you need to create sub-features that have to do with the feature you are developing, you must create a
       sub-feature branch from the feature. This new branch must have the following name convention:
       > s1feature/sub-feature-name
    5. The creation of sub-features is recursive and every level must be branched from its superior one. The naming
       would
       be as follows (where <X> is the level of the sub-feature):
       > s<X>feature/sub-feature-name
    6. There must be a bidirectional relation between packages and branches. For every new package you create you should
       create, check out and work in a new branch.

4. Your commits must have the following pattern:

    `````text
    c<Library Version>-<Commit number of feature>-<Descriptive title>
    <Contributor name>
    <Date (DD/MM/YYYY)>
    <Description (Optional)>
    `````
   
    An example of a commit could be:

    ````text
    c0.0.0-3-Implemented Coordinates class
    gorkiiuss
    27/09/2023
    Finished implementing Coordinates class using other classes from the package.
    ````

## Submitting a Pull Request

1. Ensure your changes follow our coding style and guidelines.
2. Push your branch to your GitHub repository:

   ````bash
   git push origin feature-name
   ````

3. Open a pull request from your branch to the DSAL `develop` branch.
4. Provide a clear and descriptive title for your pull request.
5. Describe the changes you have made and their purpose.
6. Be responsive to any feedback or requests for changes.

## Review Process

All pull requests will be reviewed by maintainers and contributors. Feedback and discussions may occur to ensure the
quality and consistency of the codebase. Once your pull request is approved, it will be merged into the project.

## License

By contributing to DSAL, you agree that your contributions will be licensed under the MIT License. See the
[LICENSE](LICENSE) file for more details.

Thank you for contributing to DSAL! Your help is greatly appreciated.

[Return to README](README.md)
