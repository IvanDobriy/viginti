project.group = "com.rid.viginti"
project.version =
    extensions.getByType<VersionCatalogsExtension>().named("libs").findVersion("version").get().toString()

plugins {
    java
}

//dependencies{
//    implementation("com.rid.viginti:")
//}
