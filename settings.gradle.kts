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
include(":core:widget")
include(":core:utils")
include(":core:navigation")
include(":core:utils")
include(":core:db")
include(":core:presentation")
include(":core:network")

include(":feature:home")
include(":feature:home:impl")
include(":feature:home:api")
include(":feature:homeDetail")
include(":feature:homeDetail:api")
include(":feature:homeDetail:impl")
include(":feature:favourites")
include(":feature:favourites:api")
include(":feature:favourites:impl")
include(":feature:settings")
include(":feature:settings:api")
include(":feature:settings:impl")
