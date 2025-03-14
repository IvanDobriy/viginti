project.group = "com.rid.viginti"
project.version =
    extensions.getByType<VersionCatalogsExtension>().named("libs").findVersion("virgintiVersion").get().toString()

plugins {
    java
}

//dependencies{
//    implementation("com.rid.viginti:")
//}