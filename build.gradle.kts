plugins {
    id("java")
    application
}

group = "me.tibinonest"
version = "1.0-SNAPSHOT"
val graal_version = "22.2.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.graalvm.js:js:$graal_version")
}

application.mainClass.set("me.tibinonest.javasaurus.Main")