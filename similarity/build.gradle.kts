/*
 * This file was generated by the Gradle 'init' task.
 *
 * This generated file contains a sample Java project to get you started.
 * For more details take a look at the Java Quickstart chapter in the Gradle
 * User Manual available at https://docs.gradle.org/5.5.1/userguide/tutorial_java_projects.html
 */

plugins {
    // Apply the java plugin to add support for Java
    java

    // Apply the application plugin to add support for building a CLI application
    application
}

repositories {
    mavenCentral()
    jcenter()
}

dependencies {
    // This dependency is used by the application.
    implementation("com.google.guava:guava:27.1-jre")
    implementation("org.mongodb:mongo-java-driver:3.6.2")
    implementation("com.opencsv:opencsv:4.6")

    // Use JUnit test framework
    testImplementation("junit:junit:4.12")
}

application {
    // Define the main class for the application
    mainClassName = "similarity.App"
}
