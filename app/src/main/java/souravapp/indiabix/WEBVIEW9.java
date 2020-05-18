package souravapp.indiabix;

import android.app.Activity;
import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by SOURAV on 2/20/2017.
 */
public class WEBVIEW9 extends Activity {

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
        progressBar.setTitle("Civil Engineering");
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
                super.onPageFinished(view, url);
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
            }
        });
        myWebView.getSettings().setJavaScriptEnabled(true);
        myWebView.getSettings().setBuiltInZoomControls(true);

        if (option == 0) {
            myWebView.loadUrl("http://www.indiabix.com/civil-engineering/building-materials/");
        }
        if (option == 1) {
            myWebView.loadUrl("http://www.indiabix.com/civil-engineering/surveying/");
        }
        if (option == 2) {
            myWebView.loadUrl("http://www.indiabix.com/civil-engineering/soil-mechanics-and-foundation-engineering/");
        }
        if (option == 3) {
            myWebView.loadUrl("http://www.indiabix.com/civil-engineering/applied-mechanics/");
        }
        if (option == 4) {
            myWebView.loadUrl("http://www.indiabix.com/civil-engineering/hydraulics/");
        }
        if (option == 5) {
            myWebView.loadUrl("http://www.indiabix.com/civil-engineering/waste-water-engineering/");
        }
        if (option == 6) {
            myWebView.loadUrl("http://www.indiabix.com/civil-engineering/rcc-structures-design/");
        }
        if (option == 7) {
            myWebView.loadUrl("http://www.indiabix.com/civil-engineering/irrigation/");
        }
        if (option == 8) {
            myWebView.loadUrl("http://www.indiabix.com/civil-engineering/railways/");
        }
        if (option == 9) {
            myWebView.loadUrl("http://www.indiabix.com/civil-engineering/construction-management/");
        }
        if (option == 10) {
            myWebView.loadUrl("http://www.indiabix.com/civil-engineering/theory-of-structures/");
        }
        if (option == 11) {
            myWebView.loadUrl("http://www.indiabix.com/civil-engineering/estimating-and-costing/");
        }
        if (option == 12) {
            myWebView.loadUrl("http://www.indiabix.com/civil-engineering/docks-and-harbours/");
        }
        if (option == 13) {
            myWebView.loadUrl("http://www.indiabix.com/civil-engineering/elements-of-remote-sensing/");
        }
        if (option == 14) {
            myWebView.loadUrl("http://www.indiabix.com/civil-engineering/upse-civil-service-exam-questions/");
        }
        if (option == 15) {
            myWebView.loadUrl("http://www.indiabix.com/civil-engineering/building-construction/");
        }
        if (option == 16) {
            myWebView.loadUrl("http://www.indiabix.com/civil-engineering/concrete-technology/");
        }
        if (option == 17) {
            myWebView.loadUrl("http://www.indiabix.com/civil-engineering/advanced-surveying/");
        }
        if (option == 18) {
            myWebView.loadUrl("http://www.indiabix.com/civil-engineering/strength-of-materials/");
        }
        if (option == 19) {
            myWebView.loadUrl("http://www.indiabix.com/civil-engineering/water-resources-engineering/");
        }
        if (option == 20) {
            myWebView.loadUrl("http://www.indiabix.com/civil-engineering/water-supply-engineering/");
        }
        if (option == 21) {
            myWebView.loadUrl("http://www.indiabix.com/civil-engineering/steel-structure-design/");
        }
        if (option == 22) {
            myWebView.loadUrl("http://www.indiabix.com/civil-engineering/highway-engineering/");
        }
        if (option == 23) {
            myWebView.loadUrl("http://www.indiabix.com/civil-engineering/airport-engineering/");
        }
        if (option == 24) {
            myWebView.loadUrl("http://www.indiabix.com/civil-engineering/si-units/");
        }
        if (option == 25) {
            myWebView.loadUrl("http://www.indiabix.com/civil-engineering/structural-design-specifications/");
        }
        if (option == 26) {
            myWebView.loadUrl("http://www.indiabix.com/civil-engineering/tunnelling/");
        }
        if (option == 27) {
            myWebView.loadUrl("http://www.indiabix.com/civil-engineering/engineering-economy/");
        }
        if (option == 28) {
            myWebView.loadUrl("http://www.indiabix.com/civil-engineering/gate-exam-questions/");
        }
    }
    @Override
    public void onBackPressed() {
        if (myWebView.canGoBack()){
            myWebView.goBack();
        }

        else{
            super.onBackPressed();
        }
    }
}