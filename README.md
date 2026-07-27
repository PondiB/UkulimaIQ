# UkulimaIQ

[![Kotlin](https://img.shields.io/badge/Kotlin-2.0-7F52FF?logo=kotlin&logoColor=white)](https://kotlinlang.org/)
[![Platform](https://img.shields.io/badge/Platform-Android-3DDC84?logo=android&logoColor=white)](https://developer.android.com/)
[![API](https://img.shields.io/badge/API-21%2B-brightgreen)](https://developer.android.com/studio/releases/platforms)
[![Target SDK](https://img.shields.io/badge/Target%20SDK-35-green)](https://developer.android.com/google/play/requirements/target-sdk)
[![Material 3](https://img.shields.io/badge/Material-3-757575?logo=materialdesign&logoColor=white)](https://m3.material.io/)
[![Leaflet](https://img.shields.io/badge/Map-Leaflet-199900?logo=leaflet&logoColor=white)](https://leafletjs.com/)
[![Version](https://img.shields.io/badge/Version-1.1.0-1B5E20)](CHANGELOG.md)
[![Tests](https://img.shields.io/badge/Unit%20tests-JUnit%204-blue)](#tests)
[![GitHub](https://img.shields.io/badge/GitHub-PondiB%2FUkulimaIQ-181717?logo=github)](https://github.com/PondiB/UkulimaIQ)

Farming intelligence for farmers in the **Mwanza Region of Tanzania** — agronomy guidance, weather, market prices, and a map of agricultural markets.

<p align="center">
  <img src="docs/screenshots/01-splash.png" width="180" alt="Splash screen" />
  <img src="docs/screenshots/02-menu.png" width="180" alt="Main menu" />
  <img src="docs/screenshots/03-agronomy.png" width="180" alt="Agronomy videos" />
</p>
<p align="center">
  <img src="docs/screenshots/06-climate.png" width="180" alt="Weather and climate" />
  <img src="docs/screenshots/04-prices.png" width="180" alt="Market prices" />
  <img src="docs/screenshots/05-map.png" width="180" alt="Market map" />
</p>

## Screenshots

| Splash | Menu | Agronomy |
|:---:|:---:|:---:|
| ![Splash](docs/screenshots/01-splash.png) | ![Menu](docs/screenshots/02-menu.png) | ![Agronomy](docs/screenshots/03-agronomy.png) |

| Climate | Market prices | Market map |
|:---:|:---:|:---:|
| ![Climate](docs/screenshots/06-climate.png) | ![Prices](docs/screenshots/04-prices.png) | ![Map](docs/screenshots/05-map.png) |

## Features

1. **Agronomy** (`Maelezo ya Ukulima`) — educational farming videos (opens in YouTube)
2. **Climate** (`Hali ya Hewa`) — Mwanza weather forecast (Yr.no)
3. **Market prices** (`Bei ya Soko`) — reference crop prices for planning
4. **Market map** (`Ramani ya Masoko`) — Leaflet map of agricultural markets across Tanzania

## Stack (v1.1.0)

| Area | Choice |
|------|--------|
| Language | Kotlin 2.0 |
| UI | Material 3 + ViewBinding |
| Architecture | Activities · ViewModels · repositories |
| Map | Leaflet + OpenStreetMap (WebView assets) |
| Build | AGP 8.7 · Gradle version catalog |
| SDK | min 21 · compile/target 35 |

## Project layout

```
app/src/main/
  assets/map/     # Leaflet market map (index.html, markets.js)
  kotlin/.../
    domain/       # AgronomyVideo, MarketPrice
    data/         # repositories
    ui/           # main, menu, agronomy, climate, prices, map
  res/values-sw/  # Swahili strings
```

## Build

**Prerequisites:** Android Studio Hedgehog+, JDK 17, Android SDK 35

```bash
git clone https://github.com/PondiB/UkulimaIQ.git
cd UkulimaIQ
./gradlew assembleDebug
```

Open the project in Android Studio, sync Gradle, then run on a device or emulator.

## Tests

Unit tests cover domain models, repository mapping, and WebView host allowlists (map + weather).

```bash
./gradlew testDebugUnitTest
```

| Area | What’s covered |
|------|----------------|
| `AgronomyVideo` / `MarketPrice` | URL helpers, data class behavior |
| `AgronomyRepository` / `MarketPriceRepository` | Array → model mapping, missing metadata |
| `MapRepository` / `WeatherRepository` | Allowed hosts, Mwanza forecast URL |

### Release signing

Do **not** commit keystores. Create a local `keystore.properties` (gitignored) if you need release builds:

```properties
storeFile=../path/to/your.keystore
storePassword=...
keyAlias=...
keyPassword=...
```

## Localization

Default strings are English; Swahili overrides live in `res/values-sw/`.

## Partners

Built with support context from USAID / CIAT branding assets included in the app.

## Changelog

See [CHANGELOG.md](CHANGELOG.md) for v1.1.0 modernization notes.
