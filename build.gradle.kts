plugins {
    id("java")
    id("org.jetbrains.intellij.platform") version "2.2.0"
}

group = "com.zitiger.plugin"
version = "1.1"


repositories {
    maven ("https://maven.aliyun.com/repository/public")
    maven ("https://maven.aliyun.com/repository/google")
    maven ("https://maven.aliyun.com/repository/gradle-plugin")
    maven ("https://jitpack.io")
    mavenCentral()

    intellijPlatform {
        defaultRepositories()
    }
}

dependencies {
    intellijPlatform {
        intellijIdeaCommunity("2024.3.1")
        bundledPlugin("com.intellij.java")
    }
}

intellijPlatform {
    pluginConfiguration {
        name = "SmartConverter"
        version = "1.1"
        group = "com.zitiger.plugin"
    }
}

