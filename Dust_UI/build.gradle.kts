group = "org.example"
version = "1.0-SNAPSHOT"

buildscript {
    repositories {
        jcenter()
    }

    dependencies {
        classpath("org.koin:koin-gradle-plugin:2.1.6")
    }
}

repositories {
    mavenCentral()
    jcenter()
}

apply(plugin = "koin")

val koinVersion = "2.1.6"

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

dependencies {
    implementation("org.koin:koin-core:$koinVersion")
    implementation("org.koin:koin-core-ext:$koinVersion")
    testImplementation("org.koin:koin-test:$koinVersion")
}
