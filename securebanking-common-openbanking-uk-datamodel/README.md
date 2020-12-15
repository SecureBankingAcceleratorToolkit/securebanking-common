[<img src="https://raw.githubusercontent.com/ForgeRock/forgerock-logo-dev/master/Logo-fr-dev.png" align="right" width="220px"/>](https://developer.forgerock.com/)

<!--TODO: fix up these references! -->
| |Current Status|
|---|---|
|Build|[![Build Status](https://img.shields.io/endpoint.svg?url=https%3A%2F%2Factions-badge.atrox.dev%2FOpenBankingToolkit%2Fopenbanking-uk-datamodel%2Fbadge%3Fref%3Dmaster&style=flat)](https://actions-badge.atrox.dev/OpenBankingToolkit/openbanking-uk-datamodel/goto?ref=master)|
|Code coverage|[![codecov](https://codecov.io/gh/OpenBankingToolkit/openbanking-uk-datamodel/branch/master/graph/badge.svg)](https://codecov.io/gh/OpenBankingToolkit/openbanking-uk-datamodel)
|Bintray|[![Bintray](https://img.shields.io/bintray/v/openbanking-toolkit/OpenBankingToolkit/openbanking-uk-datamodel.svg?maxAge=2592000)](https://bintray.com/openbanking-toolkit/OpenBankingToolkit/openbanking-uk-datamodel)|
|License|![license](https://img.shields.io/github/license/ACRA/acra.svg)|

**_This repository is part of the Secure Banking Accelerator Toolkit. If you just found this repository looking for our tool kit,_
_we recommend having a first read to_ https://github.com/SecureBankingAcceleratorToolkit**

## securebanking-common-openbanking-uk-datamodel

A Java SDK to help implementing the Open Banking standard : https://www.openbanking.org.uk/read-write-apis/  .
This project is compiled with JDK 14.

## Usage

In your pom file you should use the `securebanking-common-bom` import (see the README.md for that project) to pull in the correct securebanking-common versions. Then declare your pom dependency;

```
<dependency>
    <groupId>com.forgerock.securebanking</groupId>
    <artifactId>securebanking-common-openbanking-uk-datamodel</artifactId>
</dependency>

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
cd securebanking-common/securebanking-common-openbanking-uk-datamodel
mvn clean install
```

## Class generation
Many of the classes are generated from the OB Swagger documentation. The project is set-up to make it easy to generate
the  OB model classes and skeleton API classes using Maven. For efficiency, the default maven profile does not generate
the code, but it is easy to do so using `code-gen` profile (see below).

The configuration for the swagger generation is currently within `securebanking-openbanking-aspsp-mock/pom.xml` 
and the swagger specification is within `securebanking-openbanking-aspsp-mock/src/main/resources/specification`.

When a new version of OB API is released, the following steps should be performed:
 1. Download the Swagger json files from OB Spec pages (https://github.com/OpenBankingUK/read-write-api-specs)
    > Note: there are currently swagger files for Accounts, Payments, Funds Confirmation, Callback and TPP Events
 1. Run ```mvn clean install -Pcode-gen```
    > This will generate classes into `securebanking-openbanking-aspsp-mock/target/generated-sources/swagger`
 1. Check the generated files and copy them into the appropriate source folder (e.g. `src/main/java`), but **DO NOT**
 overwrite existing classes.
 1. Remove Links, Meta, OBError1 and OBErrorResponse1 - we use shared generic versions of these classes.
 1. Uncomment the relevant `<inputSpec>` listing within the `openapi-generator-maven-plugin` in the pom for the next
 swagger spec (and repeat for each new swagger json file).
 1. If using Intellij, run format and optimise imports on newly generated files.
 1. Run build to ensure everything compiles and copyrights are generated for new source files.
 1. Commit and raise PR.

## Contributing

Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

## License 

Released under an Apache 2.0 license