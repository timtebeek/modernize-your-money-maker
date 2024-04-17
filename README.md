# Modernize your money maker
A selection of OpenRewrite recipes to modernize your legacy Java application.  
Run through the Moderne CLI, for convenience and performance.

## Getting started with the Moderne CLI
Follow https://docs.moderne.io/user-documentation/getting-started/cli-intro  
TLDR: Go to Moderne & Download the CLI.

### Download recipes
Synchronize with Moderne to get the latest recipes.  
🐌 But not on conference wifi.
```shell
mod config recipes moderne sync
```

### Build LST
Prebuild a lossless semantic tree (LST) of the code.  
⏱ Saves time when running multiple recipes.
```shell
mod build .
```

\
\
\
\
\
\
\
\
\
\
<br>

## Modernize tests
Build confidence by modernizing tests first.

✅ Green is good   
❌ Red is bad  

You're done when all tests are green.

### Hamcrest to AssertJ
Last released Oct 2019.  
😷 A simpler time.
```shell
mod run . --recipe Assertj
```

🩹 Apply changes from patch.
```shell
mod apply . --last-recipe-run
```

💾 Save our work.
```shell
mod commit . --last-recipe-run --message "Hamcrest to AssertJ"
```

🔙 Or revert for the next patch.
```shell
mod reset . --hard
```

### JUnit 3 & 4 to JUnit 5
JUnit 4 introduced in 2006.  
Jupiter introduced in 2017.  
🤷 Yet old patterns persist.
```shell
mod run . --recipe JUnit5BestPractices
```

### See also
🍹 Recipes for Mockito, WireMock, JMockit, PowerMock, ...
https://docs.openrewrite.org/recipes/java/testing/

\
\
\
\
\
\
\
\
\
\
<br>

## Perform upgrades
Get performance improvements and new features.

### Java 6, 7 , 8, 11 & 17 to 21
🛤 JAXB, Jakarta, pattern matching, records, text blocks, sequenced collections...
```shell
mod run . --recipe UpgradeToJava21
```

🩹 Apply changes from patch.
```shell
mod apply . --last-recipe-run
```

🔙 Or revert for the next patch.
```shell
mod reset . --hard
```

### Spring Boot 1.x or 2.x to 3.x
🍃 Only 3.1 supported as of November 2023!
```shell
mod run . --recipe UpgradeSpringBoot_3_1
```

### Drop Guava
🤝 Friends don't let friends use Guava.
```shell
mod run . --recipe NoGuavaJava21
```

\
\
\
\
\
\
\
\
\
\
<br>

## Code quality issues
Fix potential bugs lurking in your code.

### Common static analysis issues
Sixty rules to reduce our tech debt. 🐛🐞🕷🐜🐝🦗🦟🦂  
https://docs.openrewrite.org/recipes/staticanalysis/commonstaticanalysis
```shell
mod run ../../apache/ --recipe CommonStaticAnalysis
```

### Custom rulesets
Compose your own rulesets to suit your preferences.
https://app.moderne.io/recipes/org.openrewrite.staticanalysis.CommonStaticAnalysis

\
\
\
\
\
\
\
\
\
\
<br>

## Resolve security findings
Find and fix vulnerable dependencies, zip slip, and more.

### Zip slip
🤐 Find and fix zip slip vulnerabilities.
```shell
mod run . --recipe ZipSlip
```

### Vulnerable dependencies
🔓 Patch vulnerable dependency versions.
https://app.moderne.io/recipes/org.openrewrite.java.dependencies.DependencyVulnerabilityCheck
```shell
mod run . --recipe DependencyVulnerabilityCheck
```
