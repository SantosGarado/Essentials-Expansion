plugins {
    id("java")
}

group = "at.helpch"
version = "2.0.0"

repositories {
    mavenCentral()
    maven("https://hub.spigotmc.org/nexus/content/groups/public/")
    maven("https://repo.helpch.at/releases/")
    maven("https://repo.essentialsx.net/releases/")
}

dependencies {
    compileOnly(libs.spigot)
    compileOnly(libs.papi)
    compileOnly(libs.ess) {
        exclude("io.papermc", "paperlib")
        exclude("io.papermc.paper", "paper-api")
    }
}