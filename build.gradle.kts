// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.1.2" apply false
    id("org.jlleitschuh.gradle.ktlint") version "11.0.0" apply true
}

buildscript {
    repositories {
        maven("https://plugins.gradle.org/m2/")
    }
    dependencies {
        classpath("org.jlleitschuh.gradle:ktlint-gradle:11.1.0")
    }
}

apply(plugin = "org.jlleitschuh.gradle.ktlint")
