plugins {
    id("dev.architectury.loom")
    id("architectury-plugin")
}

dependencies {
    minecraft("com.mojang:minecraft:1.20.1")
    mappings("net.fabricmc:yarn:1.20.1+build.9")
    modCompileOnly("com.cobblemon:mod:1.4.0+1.20.1-SNAPSHOT") {
        isTransitive = false
    }

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.10.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.10.0")
    implementation(kotlin("script-runtime"))
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}

