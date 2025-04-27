plugins {
    kotlin("jvm") version "2.0.10"
}

group = "edu.nazarov"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("com.google.guava:guava:33.4.8-jre")
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(17)
}