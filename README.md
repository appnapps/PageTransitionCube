# 🧊 PageTransitionCube

A 3D cube-style page transition animation for Android `ViewPager2`.

---

## ✨ Features

- 🧭 ViewPager2 3D cube rotation effect
- 🎮 Smooth and realistic page transition
- 💡 Lightweight, no extra dependencies
- 🔄 Easy plug-and-play with `PageTransformer`
- 💡 Suitable for onboarding, sliders, and galleries

---

## 📦 Installation (via JitPack)

Add the JitPack repository in your root `settings.gradle.kts`:

```kotlin
dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
        maven(url = "https://jitpack.io")
    }
}
```

Then add this to your app-level build.gradle.kts:

```kotlin
dependencies {
    implementation("com.github.appnapps:PageTransitionCube:1.0.0")
}
```
🛠 Usage
1. Set the transformer to your ViewPager2
```kotlin
val viewPager = findViewById<ViewPager2>(R.id.viewPager)
viewPager.adapter = YourAdapter(this)
viewPager.setPageTransformer(CubePageTransformer())

```
2. Example adapter with page titles
```kotlin
class SimplePagerAdapter(...) : RecyclerView.Adapter<...> {
    // Each page has different background color and text
}

```

<img src="https://github.com/appnapps/PageTransitionCube/blob/main/docs/PageTransitionCube.gif" width="320"/>

