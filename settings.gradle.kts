rootProject.name = "nay-school"


include("postgres")
project(":postgres").projectDir = File("postgres")
project(":postgres").buildFileName = "postgres.gradle.kts"