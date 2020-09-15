//## iteration 1
/*package com.mapbox.example

import androidx.annotation.NonNull;
import io.flutter.embedding.android.FlutterActivity
import io.flutter.embedding.engine.FlutterEngine
import io.flutter.plugins.GeneratedPluginRegistrant

class MainActivity: FlutterActivity() {
    override fun configureFlutterEngine(@NonNull flutterEngine: FlutterEngine) {
        GeneratedPluginRegistrant.registerWith(flutterEngine);
    }
}
*/


package com.mapbox.example
// MainActivity.kt
//-import android.os.Bundle
//-import io.flutter.app.FlutterActivity
+import io.flutter.embedding.android.FlutterActivity
//-import io.flutter.plugins.GeneratedPluginRegistrant

class MainActivity: FlutterActivity() {
//    -  override fun onCreate(savedInstanceState: Bundle?) {
//        -    super.onCreate(savedInstanceState)
//        -    GeneratedPluginRegistrant.registerWith(this)
//        -  }

    //-  @Override
    //-  protected void onCreate(Bundle savedInstanceState) {
    //    -    super.onCreate(savedInstanceState);
    //    -    GeneratedPluginRegistrant.registerWith(this);
    //    -  }
    @Override
    fun configureFlutterEngine(@NonNull flutterEngine: FlutterEngine) {
        GeneratedPluginRegistrant.registerWith(flutterEngine)
        MethodChannel(flutterEngine.getDartExecutor().getBinaryMessenger(), MainActivity.CHANNEL)
                .setMethodCallHandler(
                        { call, result -> }
                )
    }
}