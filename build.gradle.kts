plugins {
    kotlin("jvm") version "1.9.22"
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.mysql:mysql-connector-j:8.0.33")
}

application {
    mainClass.set("MainKt")
}

kotlin {
    jvmToolchain(17)
}
