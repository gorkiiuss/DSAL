# DSAL (Data Structures and Algorithms Library) v0.0 (ALPHA-0)

A community library with all kind of utility elements, commonly used algorithms, ready-to-use design patterns and more.
Only standard Java libraries have been used and the code is written in such a way that it is understandable even to the
least knowledgeable. By and for lazy programmers. To see project state [click here](STATE.md).

## Table of contents

1. [Installation](#installation)
2. [Usage](#usage)
3. [Credits](#credits)
4. [License](#license)
5. [Contribution](#contribution)

## Installation

As of today, the package is not uploaded to any central repository.

     > In the future it will be uploaded for easier use of the library.

To install it, you must download it from GitHub and compile it following the following steps:

**In order to perform the following steps you must have Maven installed**
[Install here](https://maven.apache.org/install.html)

1. Go to the [GitHub repository page](https://github.com/gorkiiuss/DSAL)
2. Click on the green button that says "Code" and download the ZIP.
3. Extract the ZIP and import the project with the IDE you use. Open the project
4. Run the following Maven command from the root directory of your project:

    ````bash
    mvn clean install
    ````

With that you already have the package installed in your user folder. If you ever delete the Maven repositories, you
will need to reinstall it.

Now to use it in other projects you have to do the following:

1. Open or create a Maven project.
2. Go to the pom.xml file.
3. If there is no "dependencies" section yet, create it as follows:

    ````xml
    <dependencies>
        
    </dependencies>
    ````

4. Within the section add the dependency as follows:

    ````xml
    <dependency>
         <groupId>com.github.gorkiiuss</groupId>
         <artifactId>dsal</artifactId>
         <version>0.0.0</version>
    </dependency>
    ````

5. Update the Maven project.

With this you should now be able to use DSAL in any of your projects.

## Usage

Here you have a simple usage of the latest feature implemented in DSAL:

````java
import com.github.gorkiiuss.dsal.DSAL;

public class ReadmeCode {
    public static void main(String[] args) {
        System.out.println(DSAL.getVersion()); // Should get "0.0.0"
    }
}
````

For more information go to [the project documentation](https://gorkiiuss.github.io/DSAL)

## Credits
Original idea by gorkiiuss and created by the community.

## License
This project is under the MIT license, for more information see the [LICENSE file](LICENSE.md)

## Contribution
To contribute, please follow the guidelines outlined in the [CONTRIBUTING document](CONTRIBUTING.md).

**Please review our [Code of Conduct](CODE_OF_CONDUCT.md) before contributing.**
