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
public class WEBVIEW12 extends Activity {

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
        progressBar.setTitle("Electrical Engineering");
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
            myWebView.loadUrl("http://www.indiabix.com/electrical-engineering/quantities-and-units/");
        }
        if (option == 1) {
            myWebView.loadUrl("http://www.indiabix.com/electrical-engineering/ohms-law/");
        }
        if (option == 2) {
            myWebView.loadUrl("http://www.indiabix.com/electrical-engineering/series-circuits/");
        }
        if (option == 3) {
            myWebView.loadUrl("http://www.indiabix.com/electrical-engineering/series-parallel-circuits/");
        }
        if (option == 4) {
            myWebView.loadUrl("http://www.indiabix.com/electrical-engineering/branch-loop-and-node-analyses/");
        }
        if (option == 5) {
            myWebView.loadUrl("http://www.indiabix.com/electrical-engineering/alternating-current-and-voltage/");
        }
        if (option == 6) {
            myWebView.loadUrl("http://www.indiabix.com/electrical-engineering/inductors/");
        }
        if (option == 7) {
            myWebView.loadUrl("http://www.indiabix.com/electrical-engineering/rc-circuits/");
        }
        if (option == 8) {
            myWebView.loadUrl("http://www.indiabix.com/electrical-engineering/rlc-circuits-and-resonance/");
        }
        if (option == 9) {
            myWebView.loadUrl("http://www.indiabix.com/electrical-engineering/circuit-theorems-in-ac-analysis/");
        }
        if (option == 10) {
            myWebView.loadUrl("http://www.indiabix.com/electrical-engineering/three-phase-systems-in-power-applications/");
        }
        if (option == 11) {
            myWebView.loadUrl("http://www.indiabix.com/electrical-engineering/voltage-current-and-resistance/");
        }
        if (option == 12) {
            myWebView.loadUrl("http://www.indiabix.com/electrical-engineering/energy-and-power/");
        }
        if (option == 13) {
            myWebView.loadUrl("http://www.indiabix.com/electrical-engineering/parallel-circuits/");
        }
        if (option == 14) {
            myWebView.loadUrl("http://www.indiabix.com/electrical-engineering/circuit-theorems-and-conversions/");
        }
        if (option == 15) {
            myWebView.loadUrl("http://www.indiabix.com/electrical-engineering/magnetism-and-electromagnetism/");
        }
        if (option == 16) {
            myWebView.loadUrl("http://www.indiabix.com/electrical-engineering/capacitors/");
        }
        if (option == 17) {
            myWebView.loadUrl("http://www.indiabix.com/electrical-engineering/transformers/");
        }
        if (option == 18) {
            myWebView.loadUrl("http://www.indiabix.com/electrical-engineering/rl-circuits/");
        }
        if (option == 19) {
            myWebView.loadUrl("http://www.indiabix.com/electrical-engineering/passive-filters/");
        }
        if (option == 20) {
            myWebView.loadUrl("http://www.indiabix.com/electrical-engineering/time-response-of-reactive-circuits/");
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

