pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "moduleapp"
include(":app")

include(":core")
include(":core:designsystem")
include(":core:utils")
include(":core:widget")
include(":core:network")
include(":core:presentation")
include(":core:db")
include(":core:navigation")

include(":feature:home")
include(":feature:home:api")
include(":feature:home:impl")
