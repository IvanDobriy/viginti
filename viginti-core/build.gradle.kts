project.group = "com.rid.virginti"
project.version = extensions.getByType<VersionCatalogsExtension>().named("libs").findVersion("version").get().toString()


plugins{
    `java-library`
}

