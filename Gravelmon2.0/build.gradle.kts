plugins {
    id("java")
    id("java-library")
    kotlin("jvm") version("1.7.10")

    id("dev.architectury.loom") version("1.2-SNAPSHOT") apply false
    id("architectury-plugin") version("3.4-SNAPSHOT") apply false
}

group = "drai.dev"
version = "1.0.0-SNAPSHOT"

allprojects {
    apply(plugin = "java")
    apply(plugin = "org.jetbrains.kotlin.jvm")

    repositories {
        mavenCentral()
        maven(url = "https://dl.cloudsmith.io/public/geckolib3/geckolib/maven/")
        maven("https://maven.impactdev.net/repository/development/")
    }

    tasks.getByName<Test>("test") {
        useJUnitPlatform()
    }
}

