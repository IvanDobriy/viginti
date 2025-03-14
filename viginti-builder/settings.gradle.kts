
rootProject.name = "viginti-builder"

includeBuild("../viginti-core")
includeBuild("../viginti-generator")
includeBuild("../viginti-gradle-plugin")
includeBuild("../viginti-doc")
includeBuild("../viginti-tests")
includeBuild("../viginti-examples")


enableFeaturePreview("VERSION_CATALOGS")

dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {
            from(files("./libs.versions.toml"))
        }
    }
}

