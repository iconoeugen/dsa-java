plugins {
    id("application")
}

group = "eu.vlad.digitalstack.dsa"
version = "1.0-SNAPSHOT"

application {
    mainClass = "eu.vlad.digitalstack.dsa.FizzBuzz"
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}