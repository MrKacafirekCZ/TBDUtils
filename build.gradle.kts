plugins {
    kotlin("jvm") version "1.6.10"
    java
    id("com.github.johnrengelman.shadow") version "7.1.2"
}

group = "moe.neat"
version = "1.0-SNAPSHOT"

repositories {
    maven { url = uri("https://papermc.io/repo/repository/maven-public/") }
    maven { url = uri("https://maven.maxhenkel.de/repository/public") }
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    compileOnly("io.papermc.paper:paper-api:1.18.1-R0.1-SNAPSHOT")
    compileOnly("de.maxhenkel.voicechat:voicechat-api:2.2.19")
}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(17))
}