# securebanking-common

Repository containing maven modules used by two or more securebanking projects. The versions of the modules built by securebanking-common are specified in a BOM style pom (securebanking-common-bom) that may be imported into other projects as a simple way of including the latest versions of the common modules.

## Usage

Import into your dependenciesManagement sections like this (use the latest released version);

```
   <dependencyManagement>
        <dependencies>
            <!-- Secure Banking common dependencies -->
            <dependency>
                <groupId>com.forgerock.securebanking</groupId>
                <artifactId>securebanking-common-bom</artifactId>
                <version>1.0.0-SNAPSHOT</version>
                <type>pom</type>
                <scope>import</scope>
            </dependency>

            ...
        </dependencies>
    </dependencyManagement>
```

### How to Build

This is a Java Maven project. 

#### Prerequisites
You need the following on your development machine;
Java 14 or later
Maven 3.6.0 or later

#### Building

```
git checkout git@github.com:SecureBankingAcceleratorToolkit/securebanking-common.git
cd securebanking-common
mvn clean install
```

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

## License 
Released under an Apache 2.0 license