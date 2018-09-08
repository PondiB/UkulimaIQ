package com.pondipb.pondibrian.ukulimaiq;


        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.webkit.WebResourceRequest;
        import android.webkit.WebView;
        import android.webkit.WebViewClient;

public class ClimateActivity extends AppCompatActivity {

    WebView ourBrowser;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_climate);

        ourBrowser = findViewById(R.id.webView);
        ourBrowser.setWebViewClient(new MyBrowser());
        ourBrowser.getSettings().setJavaScriptEnabled(true);
        ourBrowser.loadUrl("http://www.weather.com");

    }

    private class MyBrowser extends WebViewClient
    {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
            return super.shouldOverrideUrlLoading(view, request);

        }
    }
}
