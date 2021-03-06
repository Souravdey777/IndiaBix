package souravapp.indiabix;

import android.app.Activity;
import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by SOURAV on 2/21/2017.
 */
public class WEBVIEW14 extends Activity {

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
        progressBar.setTitle("Chemical Engineering");
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
            myWebView.loadUrl("http://www.indiabix.com/chemical-engineering/chemical-engineering-basics/");
        }
        if (option == 1) {
            myWebView.loadUrl("http://www.indiabix.com/chemical-engineering/heat-transfer/");
        }
        if (option == 2) {
            myWebView.loadUrl("http://www.indiabix.com/chemical-engineering/mass-transfer/");
        }
        if (option == 3) {
            myWebView.loadUrl("http://www.indiabix.com/chemical-engineering/fertiliser-technology/");
        }
        if (option == 4) {
            myWebView.loadUrl("http://www.indiabix.com/chemical-engineering/stoichiometry/");
        }
        if (option == 5) {
            myWebView.loadUrl("http://www.indiabix.com/chemical-engineering/chemical-engineering-thermodynamics/");
        }
        if (option == 6) {
            myWebView.loadUrl("http://www.indiabix.com/chemical-engineering/fuels-and-combustion/");
        }
        if (option == 7) {
            myWebView.loadUrl("http://www.indiabix.com/chemical-engineering/process-equipment-and-plant-design/");
        }
        if (option == 8) {
            myWebView.loadUrl("http://www.indiabix.com/chemical-engineering/nuclear-power-engineering/");
        }
        if (option == 9) {
            myWebView.loadUrl("http://www.indiabix.com/chemical-engineering/refractory-technology/");
        }
        if (option == 10) {
            myWebView.loadUrl("http://www.indiabix.com/chemical-engineering/polymer-technology/");
        }
        if (option == 11) {
            myWebView.loadUrl("http://www.indiabix.com/chemical-engineering/fluid-mechanics/");
        }
        if (option == 12) {
            myWebView.loadUrl("http://www.indiabix.com/chemical-engineering/mechanical-operations/");
        }
        if (option == 13) {
            myWebView.loadUrl("http://www.indiabix.com/chemical-engineering/petroleum-refinery-engineering/");
        }
        if (option == 14) {
            myWebView.loadUrl("http://www.indiabix.com/chemical-engineering/chemical-process/");
        }
        if (option == 15) {
            myWebView.loadUrl("http://www.indiabix.com/chemical-engineering/process-control-and-instrumentation/");
        }
        if (option == 16) {
            myWebView.loadUrl("http://www.indiabix.com/chemical-engineering/chemical-reaction-engineering/");
        }
        if (option == 17) {
            myWebView.loadUrl("http://www.indiabix.com/chemical-engineering/materials-and-construction/");
        }
        if (option == 18) {
            myWebView.loadUrl("http://www.indiabix.com/chemical-engineering/chemical-engineering-plant-economics/");
        }
        if (option == 19) {
            myWebView.loadUrl("http://www.indiabix.com/chemical-engineering/furnace-technology/");
        }
        if (option == 20) {
            myWebView.loadUrl("http://www.indiabix.com/chemical-engineering/environmental-engineering/");
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