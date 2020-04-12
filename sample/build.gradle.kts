import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("org.jetbrains.kotlin.jvm")
}

dependencies {
    implementation(Dependencies.kotlinStdLib)
    implementation(project(":library"))
}

tasks {
    withType<KotlinCompile>().configureEach {
        kotlinOptions.jvmTarget = Definitions.targetJDK
    }
}