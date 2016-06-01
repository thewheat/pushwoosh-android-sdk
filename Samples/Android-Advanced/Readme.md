# Integrating PushWoosh with Intercom

## Changes needed
- app/src/main/AndroidManifest.xml
   - Based on readme_config_changes.png / http://docs.pushwoosh.com/docs/androidmanifestxml-modifications
- app/src/main/java/com/pushwoosh/sample/CustomApplication.java
    - Based on your Intercom settings
```
private static final String YOUR_API_KEY = "";
private static final String YOUR_APP_ID = "";
```
- app/src/main/java/com/pushwoosh/sample/MainActivity.java
   - Based on your Intercom settings
```
private static final String YOUR_EMAIL = "";
private static final String YOUR_USER_ID = "";
// if secure mode is used
private static final String YOUR_HMAC = "";
private static final String YOUR_DATA = "";
```

## Testing
- Open app and click "Register Intercom" to register with Intercom
- You should now be able to send push notifications to this app from
   - Intercom
   - Pushwoosh dashboard
