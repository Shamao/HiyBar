# HiyBar

in xml file
```
 <com.hiy.hiybar.UITitleBar
        android:id="@+id/title_bar"
        android:layout_width="match_parent"
        android:layout_height="48dp"
        app:bar_bg_alpha="1" />
```

in java file

```
   UITitleBar uiTitleBar = findViewById(R.id.title_bar);

        DefaultUITitleBarDelegate delegate = new DefaultUITitleBarDelegate();
        delegate.bindLeftBack(this, uiTitleBar, new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "hello world", Toast.LENGTH_LONG).show();
            }
        });
```
