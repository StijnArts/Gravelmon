plugins {
    id("dev.architectury.loom")
    id("architectury-plugin")
}

architectury {
    platformSetupLoomIde()
    fabric()
}

loom {
    enableTransitiveAccessWideners.set(true)
    silentMojangMappingsLicense()
    mixin {
        defaultRefmapName.set("mixins.${project.name}.refmap.json")
    }

    runs {
        // This adds a new gradle task that runs the datagen API: "gradlew runDatagen"

    }
}

dependencies {
    minecraft("net.minecraft:minecraft:1.20.1")
    mappings(loom.layered() {
        officialMojangMappings()
        // Use parchment mappings. NOTE: Parchment maven must be manually added. (https://maven.parchmentmc.org)
        mappings("net.fabricmc:yarn:1.20.1+build.9")
    })

    modImplementation("net.fabricmc:fabric-loader:0.14.21")

    modImplementation("net.fabricmc.fabric-api:fabric-api:0.90.0+1.20.1")
    implementation(project(":common", configuration = "namedElements"))
    "developmentFabric"(project(":common", configuration = "namedElements"))

    modImplementation("com.cobblemon:fabric:1.4.0+1.20.1-SNAPSHOT")
    modImplementation("net.fabricmc:fabric-language-kotlin:1.8.3+kotlin.1.7.10")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.10.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.10.0")
    implementation(kotlin("script-runtime"))
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}