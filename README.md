# Cosmetic Shop - Android Application

Cosmetic Shop is an e-commerce Android application for selling cosmetic products. It provides users with a smooth and intuitive interface to browse a wide range of products, add items to their cart, and complete their purchases securely.

## Features

- **User-friendly Interface:** A simple and intuitive design that enhances the user experience.
- **Product Catalog:** Browse a variety of cosmetic products with detailed descriptions and prices.
- **Shopping Cart:** Add and manage products in the shopping cart.
- **User Authentication:** Secure user registration and login functionality.
- **Order Management:** View order history and track the status of current orders.
- **Search and Filter:** Easily find products using search and filter options.

## Technologies Used

- **Android SDK:** The official software development kit for Android.
- **Java:** The primary programming language for the application.
- **Firebase:**
  - **Firebase Realtime Database:** For storing and synchronizing product data.
  - **Firebase Authentication:** For managing user authentication.
  - **Firebase Analytics:** For tracking user engagement and application usage.
- **Google Maps API:** For location-based services.
- **Material Design:** For a modern and consistent user interface.
- **Dexter:** For simplifying the process of requesting runtime permissions.

## Installation

To get a local copy up and running, follow these simple steps:

1. **Clone the repository:**
   ```sh
   git clone https://github.com/your-username/cosmetic-shop.git
   ```
2. **Open the project in Android Studio:**
   - Launch Android Studio.
   - Select "Open an existing Android Studio project."
   - Navigate to the cloned repository and click "OK."
3. **Sync Gradle:**
   - Android Studio will automatically sync the project with the required Gradle files.

## Configuration

To run the application, you need to set up a Firebase project:

1. **Create a Firebase project:**
   - Go to the [Firebase Console](https://console.firebase.google.com/).
   - Click "Add project" and follow the on-screen instructions.
2. **Add your Android app to the Firebase project:**
   - In the Firebase project dashboard, click the Android icon to add a new Android app.
   - Enter the package name: `com.example.onlineproductsapp`.
   - Follow the instructions to download the `google-services.json` file.
3. **Add `google-services.json` to your project:**
   - Copy the downloaded `google-services.json` file to the `app/` directory of your project.

## Contributing

Contributions are what make the open-source community such an amazing place to learn, inspire, and create. Any contributions you make are **greatly appreciated**.

If you have a suggestion that would make this better, please fork the repo and create a pull request. You can also simply open an issue with the tag "enhancement."

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request
