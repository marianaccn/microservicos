tasks.withType<org.springframework.boot.gradle.tasks.bundling.BootJar> {
    isEnabled = false
}

plugins {
    `java-library`
}

dependencies {
    implementation(project(":domain"))

    implementation("org.postgresql:postgresql:${rootProject.extra["postgres"]}")
    implementation("org.flywaydb:flyway-core:${rootProject.extra["flyway"]}")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.data:spring-data-envers")
}