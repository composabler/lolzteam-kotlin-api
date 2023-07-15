plugins {
    kotlin("jvm") version "1.7.10"
    `maven-publish`
    application
}

dependencies {
    api("org.jetbrains.kotlinx:kotlinx-coroutines-jdk8:1.6.4")

    api("com.fasterxml.jackson.core:jackson-core:2.14.2")
    api("com.fasterxml.jackson.core:jackson-databind:2.15.1")

    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-jackson:2.9.0")
    implementation("com.squareup.okhttp3:logging-interceptor:4.10.0")

    api("com.fasterxml.jackson.module:jackson-module-kotlin:2.14.2")
    implementation("com.squareup.okhttp3:okhttp:4.10.0")

    api("com.fasterxml.jackson.module:jackson-module-kotlin:2.14.2")
    implementation("com.jakewharton.retrofit:retrofit2-kotlinx-serialization-converter:0.8.0")

    testImplementation("junit:junit:4.13.2")
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            artifactId = "lolzteam-kotlin-api"
            version = project.version.toString()
            from(components["java"])
        }
    }
}