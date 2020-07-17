package com.example.studentsfeedbackevaluation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AdminPanelActivity extends AppCompatActivity {

    private WebView webView;

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_panel);

        webView = findViewById(R.id.Admin_Panel_WebView_Id);

        webView.setWebViewClient(new WebViewClient());

        webView.loadUrl("http://wa.rssoft.win/feedback_student/backend");

        WebSettings webSettings = webView.getSettings();

        webSettings.setJavaScriptEnabled(true);
    }

    @Override

    public void onBackPressed() {

        if (webView.canGoBack()) {

            webView.goBack();
        } else {

            super.onBackPressed();
        }
    }
}
