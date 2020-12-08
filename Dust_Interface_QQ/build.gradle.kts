dependencies {
    implementation(project(":Dust_Core"))
    implementation("net.mamoe:mirai-core-qqandroid:1.3.3") {
        exclude("org.jetbrains.kotlin", "kotlin-stdlib-jdk7")
    }
}
