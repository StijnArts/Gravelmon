plugins {
    id("dev.architectury.loom")
    id("architectury-plugin")
}
architectury {
    platformSetupLoomIde()
    forge()
}

loom {
    enableTransitiveAccessWideners.set(true)
    silentMojangMappingsLicense()

    mixin {
        defaultRefmapName.set("mixins.${project.name}.refmap.json")
    }
}

repositories {
    mavenCentral()
    maven("https://dl.cloudsmith.io/public/geckolib3/geckolib/maven/")
    maven("https://maven.impactdev.net/repository/development/")
    maven("https://hub.spigotmc.org/nexus/content/groups/public/")
    maven("https://cursemaven.com")
    maven ("https://thedarkcolour.github.io/KotlinForForge/")

}
java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(17))
}
dependencies {
    minecraft("net.minecraft:minecraft:1.20.1")
    mappings(loom.officialMojangMappings())
    forge("net.minecraftforge:forge:1.20.1-47.2.0")
    implementation(project(":common", configuration = "namedElements"))
    "developmentForge"(project(":common", configuration = "namedElements")) {
        isTransitive = false
    }

    modImplementation ("com.cobblemon:forge:1.4.0+1.20.1-SNAPSHOT")
    implementation("thedarkcolour:kotlinforforge:3.0.0")

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.10.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.10.0")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}