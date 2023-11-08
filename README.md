# Modernize your money maker

## Getting started with the Moderne CLI
Follow https://docs.moderne.io/user-documentation/getting-started/cli-intro  
TLDR: Login with GitHub & Download the CLI.

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

### JUnit 3 & 4 to JUnit 5
Introduced in 2017.  
🤷 Yet old patterns persist.
```shell
mod run . --recipe JUnit5BestPractices
```
🩹 Apply changes from patch.
```shell
mod apply . --last-recipe-run
```

### See also
Recipes for Mockito, WireMock, JMockit, PowerMock, ...
https://docs.openrewrite.org/recipes/java/testing/
