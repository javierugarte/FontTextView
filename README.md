# FontTextView

This library include custom view `FontTextView` and `FontTextLayout` and a Util class `FontUtils`. You can replace font with the custom view in layout file, or use interface provided by `FontUtils` class in java code.


## Download


- Using Gradle

```
	compile 'com.bikomobile:FontTextView:1.0.0'
```

- Using Maven

```xml
    <dependency>
        <groupId>com.bikomobile</groupId>
        <artifactId>FontTextView</artifactId>
        <version>1.0.0</version>
        <type>pom</type>
    </dependency>
```


## How to use this library


#### Way 1

Use `FontTextView` in xml layout file:

```
    <com.bikomobile.widget.fontview.FontTextView
    	android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="@string/hello_world"
        app:font_path="fonts/my_font.ttf"
        />
```

Use `FontTextView` in java code:

```
    FontTextView fontTextView = new FontTextView(this);
    fontTextView.setFontPath("fonts/my_font.ttf");
    fontTextView.setText("Hello world!");
```

Use `FontTextLayout` to wrap your views in xml layout file:

```
    <com.bikomobile.widget.fontview.FontTextLayout
        android:id="@+id/font_text_layout"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginTop="5dp"
        android:layout_marginBottom="5dp"
        app:ftl_font_path="fonts/my_font.ttf"
        >
        <!-- your views that want to change font -->
    </com.bikomobile.FontTextLayout>
```

#### Way 2

Use `FontUtils` to replace default font of specified view and it's children:

```
    View root = findViewById(R.id.layout);
    FontUtils.getInstance().replaceFontFromAsset(root, "fonts/my_font.ttf");
```

#### Way 3

This method will replace system default font which will affect all text font:
.

```
    FontUtils.getInstance().replaceSystemDefaultFontFromAsset(context, "fonts/my_font.ttf");
```
You should set the app default typeface to 'monospace' to make it work:

```
    <style name="AppTheme" parent="Theme.AppCompat.Light.DarkActionBar">
        <!-- Customize your theme here. -->
        <item name="android:typeface">monospace</item>
    </style>
```

## Contribute

## About me

## License

```
Copyright 2016 Bikomobile

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```

