pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://repo.papermc.io/repository/maven-public/")
    }
}

rootProject.name = "Mirai"

include("mirai-api", "mirai-server", "paper-api-generator")
