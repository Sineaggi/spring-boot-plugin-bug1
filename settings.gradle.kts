pluginManagement {
    resolutionStrategy {
        eachPlugin {
            requested.version?.let { version ->
                if (requested.id.namespace == "org.springframework" && requested.id.name == "boot") {
                    useModule("org.springframework.boot:spring-boot-gradle-plugin:$version")
                }
            }
        }
    }
    repositories {
        gradlePluginPortal()
        maven("https://repo.spring.io/milestone/")
    }
}

include("subproject")
rootProject.name = "demo"
