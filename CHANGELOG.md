# Changelog

All notable changes to the UkulimaIQ project will be documented in this file.

## [1.1.0] - 2026-07-27

### Added
- Leaflet market-locations map (20 markets across Tanzania) via local WebView assets
- ViewBinding across all screens
- ViewModels + repository layer for agronomy and market prices
- Material 3 theme with agriculture-focused green/gold palette
- Swahili string resources (`values-sw`)
- Real educational video catalog (Shamba Shape Up / conservation agriculture)
- Thumbnail + YouTube Intent playback (no nested WebViews)
- Mwanza-focused weather forecast via Yr.no with host allowlisting
- Market prices RecyclerView with proper data model
- Gradle version catalog; AGP 8.7 / Kotlin 2.0 / compileSdk 35
- Unit tests for domain models, repositories, and WebView host allowlists (18 tests)
- README screenshots and project badges

### Changed
- Package structure: `domain` / `data` / `ui`
- Renamed menu host to `MenuActivity`
- Climate WebView hardening and proper back handling
- Release builds enable R8 minify + shrink resources
- Launcher uses adaptive mipmap icons
- App version set to **1.1.0** (versionCode 5)

### Removed
- Support Library widget references from layouts
- Nested YouTube WebViews in RecyclerView
- Rick Roll placeholder video IDs
- Tracked signing keystore and release APK from the working tree
- Cleartext traffic allowance
- Unused weather font asset and dead layout stubs

### Security
- Signing keystore and release artifacts removed from version control tracking
- `usesCleartextTraffic` set to false
- WebView navigation limited to allowlisted hosts (weather + map)

## [3.0.0] - 2024-12-12

### Major Update: Complete Kotlin Migration

- Migrated from Java to Kotlin
- AndroidX, target SDK 34, Gradle 8.2
- OpenWeatherMap weather shell
- ViewHolder patterns and README refresh
