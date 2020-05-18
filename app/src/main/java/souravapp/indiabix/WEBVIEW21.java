package souravapp.indiabix;

import android.app.Activity;
import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by SOURAV on 2/25/2017.
 */
public class WEBVIEW21 extends Activity {

    int option;
    WebView myWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.web);

        option = getIntent().getIntExtra("option", 0);

        final ProgressDialog progressBar = new ProgressDialog(this);
        progressBar.setIcon(R.drawable.drawerlogo);
        progressBar.setMessage("Loading...");
        progressBar.setCancelable(false);
        progressBar.setTitle("Technical Interview:: Body Language");
        progressBar.show();

        myWebView = (WebView) findViewById(R.id.webview);
        myWebView.setVisibility(View.GONE);
        myWebView.setWebViewClient(new WebViewClient() {

            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                myWebView.setVisibility(View.GONE);
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                myWebView.loadUrl("javascript:(function() { " +
                        "document.getElementsByClassName('main-left')[0].getElementsByClassName('div-ad-site-top')[0].style.display='none'; " +
                        "document.getElementsByClassName('main-left')[0].getElementsByClassName('hide-1 div-ad-wrapper-bvf')[0].style.display='none'; " +
                        "document.getElementsByClassName('main-left')[0].getElementsByClassName('show-1 div-ad-wrapper-bvr')[0].style.display='none'; " +
                        "document.getElementsByClassName('main-left')[0].getElementsByClassName('div-ad-site-bottom')[0].style.display='none'; " +
                        "})()");
                if (progressBar.isShowing()) {
                    progressBar.dismiss();
                }

                myWebView.setVisibility(View.VISIBLE);
                super.onPageFinished(view, url);
            }
        });
        myWebView.getSettings().setBuiltInZoomControls(true);
        myWebView.getSettings().setJavaScriptEnabled(true);

        if (option == 0) {
            myWebView.loadUrl("http://www.indiabix.com/body-language/basic-understanding/");
        }
        if (option == 1) {
            myWebView.loadUrl("http://www.indiabix.com/body-language/territories-and-zones/");
        }
        if (option == 2) {
            myWebView.loadUrl("http://www.indiabix.com/body-language/palm-gestures/");
        }
        if (option == 3) {
            myWebView.loadUrl("http://www.indiabix.com/body-language/hand-and-arm-gestures/");
        }
        if (option == 4) {
            myWebView.loadUrl("http://www.indiabix.com/body-language/hand-to-face-gestures/");
        }
        if (option == 5) {
            myWebView.loadUrl("http://www.indiabix.com/body-language/arm-barriers-gestures/");
        }
        if (option == 6) {
            myWebView.loadUrl("http://www.indiabix.com/body-language/leg-barriers-gestures/");
        }
        if (option == 7) {
            myWebView.loadUrl("http://www.indiabix.com/body-language/popular-gestures-and-actions/");
        }
        if (option == 8) {
            myWebView.loadUrl("http://www.indiabix.com/body-language/eye-signal-gestures/");
        }
        if (option == 9) {
            myWebView.loadUrl("http://www.indiabix.com/body-language/courtship-signal-gestures/");
        }
        if (option == 10) {
            myWebView.loadUrl("http://www.indiabix.com/body-language/cigars-and-glasses-gestures/");
        }
        if (option == 11) {
            myWebView.loadUrl("http://www.indiabix.com/body-language/ownership-gestures/");
        }
        if (option == 12) {
            myWebView.loadUrl("http://www.indiabix.com/body-language/mirror-image-gestures/");
        }
        if (option == 13) {
            myWebView.loadUrl("http://www.indiabix.com/body-language/body-lowering-gestures/");
        }
        if (option == 14) {
            myWebView.loadUrl("http://www.indiabix.com/body-language/pointing-gestures/");
        }
    }
    @Override
    public void onBackPressed() {
        if(myWebView.canGoBack()){
            myWebView.goBack();
        }

        else{
            super.onBackPressed();
        }
    }
}
