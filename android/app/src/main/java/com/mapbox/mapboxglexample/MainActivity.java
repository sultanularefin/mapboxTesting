
package com.mapbox.mapboxglexample;
// iteration 1..
/*package com.mapbox.mapboxglexample;

import android.os.Bundle;
import io.flutter.app.FlutterActivity;
import io.flutter.plugins.GeneratedPluginRegistrant;

public class MainActivity extends FlutterActivity {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    GeneratedPluginRegistrant.registerWith(this);
  }
}

*/


// MainActivity.java
//-import android.os.Bundle;
//-import io.flutter.app.FlutterActivity;
import io.flutter.embedding.android.FlutterActivity;
//-import io.flutter.plugins.GeneratedPluginRegistrant;

import androidx.annotation.NonNull;
import io.flutter.embedding.android.FlutterActivity;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.GeneratedPluginRegistrant;



public class MainActivity extends FlutterActivity {

  private static final String CHANNEL = "samples.flutter.dev/battery";
//-  @Override
//-  protected void onCreate(Bundle savedInstanceState) {
//    -    super.onCreate(savedInstanceState);
//    -    GeneratedPluginRegistrant.registerWith(this);
//    -  }


    
  @Override
  public void configureFlutterEngine(@NonNull FlutterEngine flutterEngine) {
    GeneratedPluginRegistrant.registerWith(flutterEngine);
    new MethodChannel(flutterEngine.getDartExecutor().getBinaryMessenger(), CHANNEL)
            .setMethodCallHandler(
                    (call, result) -> {
                      // Your existing code
                    }
            );
  }


}
