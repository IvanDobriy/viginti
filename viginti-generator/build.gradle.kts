group = "com.rid.viginti"
version =
    extensions.getByType<VersionCatalogsExtension>().named("libs").findVersion("version").get().toString()

plugins {
    java
}

dependencies{
    implementation("com.rid.viginti:viginti-core:$version")
}
