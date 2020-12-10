# securebanking-common-bom



This is a 'Bill of Materials' project that allows projects dependent on `securebanking-commons` to include all the correct versions of commons by simply importing the securebanking-common-bom in the `dependencyManagement` section of their pom file;

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
        </dependencies>
    </dependencyManagement>
```



Then the commons module required can simply be referenced in the dependencies section of the pom;

```
<dependencies>
   <dependency>
       <groupId>com.forgerock.securebanking</groupId>
       <artifiactId>securebanking-common-error</artifiactId>
   <dependency>
</dependencies>
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
cd securebanking-common/securebanking-common-bom
mvn clean install
```

## Contributing

Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

## License 

Released under an Apache 2.0 license