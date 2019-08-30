<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:sharedUserId="chat.rocket.android"
    package="chat.rocket.android">

    <uses-permission android:name="android.permission.INTERNET" />
    <uses-permission android:name="android.permission.VIBRATE" />
    <uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE" />
    <uses-permission android:name="android.permission.CAMERA" />
    <uses-permission android:name="android.permission.RECORD_AUDIO" />

    <application
        android:name=".app.RocketChatApplication"
        android:allowBackup="true"
        android:fullBackupContent="@xml/backup_config"
        android:icon="@mipmap/ic_launcher"
        android:label="@string/app_name"
        android:networkSecurityConfig="@xml/network_security_config"
        android:roundIcon="@mipmap/ic_launcher_round"
        android:supportsRtl="true"
        tools:replace="android:name">

        <activity
            android:name=".authentication.ui.AuthenticationActivity"
            android:configChanges="orientation"
            android:launchMode="singleTask"
            android:screenOrientation="portrait"
          
            android:theme="@style/AppTheme"
            android:windowSoftInputMode="adjustResize">

            <intent-filter>
                <action android:name="android.intent.action.MAIN" />

                <category android:name="android.intent.category.DEFAULT" />
                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>

            <intent-filter>
                <action android:name="android.intent.action.VIEW" />

                <category android:name="android.intent.category.BROWSABLE" />
                <category android:name="android.intent.category.DEFAULT" />

                <data
                    android:host="auth"
                    android:scheme="rocketchat" />

                <data
                    android:host="go.rocket.chat"
                    android:path="/auth"
                    android:scheme="https" />
            </intent-filter>

            <intent-filter>
                <action 