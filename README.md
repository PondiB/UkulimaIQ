# UkulimaIQ

An Android app for Tanzania farmers to notify them on Agronomy, Climate and Markets.

## Overview

**UkulimaIQ** (Farming Intelligence Quotient) is an Android application designed specifically for farmers in the Mwanza Region of Tanzania. The app provides essential agricultural information and resources to help farmers make informed decisions about their farming practices.

## Features

The application focuses on 4 key areas:

1. **Agronomy** (Swahili: "Maelezo ya Ukulima")
   - Short educational videos on land preparation, planting techniques, and sustainable land management practices
   - Best practices for crop rotation, pest management, and soil health
   - Water management and efficient irrigation techniques

2. **Climate** (Swahili: "Hali ya Hewa")
   - Real-time weather information
   - Weather forecasts to help plan farming activities
   - Integrated with modern weather services for accurate data

3. **Market Price** (Swahili: "Bei ya Soko")
   - Up-to-date market prices for various agricultural products
   - Price information for maize, paddy rice, millet, sorghum, cassava, sweet potato, beans, and chickpea
   - Helps farmers make informed decisions about when to sell their produce

4. **Community Map** (Swahili: "Ramani ya Jumuiya") *(Planned)*
   - Interactive map showing crop distribution across regions
   - Visualization of where various crops dominate

## Technical Details

### Technology Stack

- **Language**: Kotlin (fully migrated from Java)
- **Minimum SDK**: API 21 (Android 5.0 Lollipop)
- **Target SDK**: API 34 (Android 14)
- **Build System**: Gradle 8.2
- **Architecture**: Modern Android development with AndroidX libraries

### Key Dependencies

- AndroidX Core and AppCompat
- Material Design Components
- RecyclerView and CardView for efficient list displays
- WebKit for web content integration
- Kotlin Standard Library

### Recent Updates (v3.0)

- ✅ Complete migration from Java to Kotlin
- ✅ Updated to modern AndroidX libraries
- ✅ Replaced outdated weather service with OpenWeatherMap
- ✅ Improved code quality and performance
- ✅ Enhanced UI/UX with Material Design
- ✅ Updated build tools and dependencies
- ✅ Added proper ViewHolder pattern for better list performance
- ✅ Improved WebView configuration for better content loading

## Building the App

### Prerequisites

- Android Studio Arctic Fox or later
- JDK 17 or later
- Android SDK with API 34

### Build Instructions

1. Clone the repository:
   ```bash
   git clone https://github.com/PondiB/UkulimaIQ.git
   ```

2. Open the project in Android Studio

3. Sync Gradle files

4. Build and run the app on an emulator or physical device

## Project Structure

```
app/
├── src/
│   ├── main/
│   │   ├── kotlin/          # Kotlin source files
│   │   ├── res/             # Resources (layouts, drawables, etc.)
│   │   └── AndroidManifest.xml
│   ├── test/                # Unit tests
│   └── androidTest/         # Instrumented tests
└── build.gradle             # App-level build configuration
```

## Contributing

Contributions are welcome! Please feel free to submit pull requests or open issues for bugs and feature requests.

## License

This project is open source and available for educational and agricultural development purposes.

## Screenshots

![ukulima](https://user-images.githubusercontent.com/16879290/38459751-7c8cb5e8-3ab6-11e8-8bb7-6216514ad2b0.PNG)

*Fig. 1: UkulimaIQ Android Application User Interface*

## Future Enhancements

- Integration with real-time market price APIs
- Implementation of the Community Map feature
- Offline mode for areas with limited connectivity
- Push notifications for weather alerts and price changes
- Multi-language support (English and Swahili)
- User authentication and personalized content

## Contact

For questions or suggestions, please open an issue on GitHub.

---

**Made with ❤️ for Tanzanian farmers**
