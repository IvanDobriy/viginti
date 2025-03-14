project.group = "com.rid.virginti"
project.version = extensions.getByType<VersionCatalogsExtension>().named("libs").findVersion("virgintiVersion").get().toString()


plugins{
    `java-library`
}

