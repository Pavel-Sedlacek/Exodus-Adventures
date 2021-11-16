import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

val konsole_version: String by project
val kotlinx_courutines_version: String by project

plugins {
    kotlin("jvm") version "1.5.31"
}

group = "org.knism"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://us-central1-maven.pkg.dev/varabyte-repos/public")
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "11"
}

dependencies {
    implementation("com.varabyte.konsole:konsole:$konsole_version")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:$kotlinx_courutines_version")
}