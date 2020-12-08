plugins {
    kotlin("jvm") version "1.4.20"
    kotlin("kapt") version "1.4.20"
}

group = "org.example"
version = "1.0-SNAPSHOT"

buildscript {
    repositories {
        mavenCentral()
        jcenter()
    }
}

allprojects {

    repositories {
        mavenCentral()
        jcenter()
        maven("https://dl.bintray.com/arrow-kt/arrow-kt/")
    }

    apply(plugin = "kotlin")
    apply(plugin = "kotlin-kapt")

    val arrowVersion = "0.11.0"
    val exposedVersion = "0.28.1"

    java {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    dependencies {
        implementation(kotlin("stdlib"))
        implementation("io.arrow-kt:arrow-core:$arrowVersion")
        implementation("io.arrow-kt:arrow-syntax:$arrowVersion")
        kapt("io.arrow-kt:arrow-meta:$arrowVersion")
        implementation("io.github.config4k:config4k:0.4.2")
        implementation("actor.proto:proto-actor:0.0.5")
        implementation("io.reactivex.rxjava3:rxkotlin:3.0.0") {
            exclude("io.reactivex.rxjava3", "rxjava")
        }
        implementation("io.reactivex.rxjava3:rxjava:3.0.5")
        implementation("actor.proto:proto-actor:latest.release") {
            exclude("org.jetbrains.kotlin", "kotlin-stdlib-jdk7")
            exclude("org.jetbrains.kotlin", "kotlin-stdlib-jdk8")
        }
        implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.4.2")
        implementation("org.jetbrains.kotlinx:kotlinx-io:0.1.16")
        implementation("org.slf4j:slf4j-simple:1.7.30")
        implementation("org.jetbrains.exposed:exposed-core:${exposedVersion}")
        implementation("org.jetbrains.exposed:exposed-dao:${exposedVersion}")
        implementation("org.jetbrains.exposed:exposed-jdbc:${exposedVersion}")
        implementation("org.postgresql:postgresql:42.2.15")
    }
}
