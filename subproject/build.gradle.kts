plugins {
    id("org.jetbrains.kotlin.jvm")
    id("io.spring.dependency-management")
    id("org.springframework.boot")
}

repositories {
    jcenter()
    maven("https://repo.spring.io/milestone/")
}

dependencies {
    implementation(rootProject)
}

springBoot {
    mainClassName = "demo.subproject.SubAppKt"
}
