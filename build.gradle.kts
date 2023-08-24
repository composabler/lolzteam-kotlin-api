import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.10"
    `maven-publish`
    application
}

allprojects {
    group = "me.topilov"
    project.version = "1.0.4"

    repositories {
        mavenCentral()
        maven { url = uri("https://jitpack.io") }
        maven { url = uri("https://mvn.mchv.eu/repository/mchv/") }
    }
}

publishing {
    repositories {
        mavenLocal()
        maven {
            url = uri("https://jitpack.io")
        }
    }
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}