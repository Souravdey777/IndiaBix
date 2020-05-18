package souravapp.indiabix;

import android.app.Activity;
import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by SOURAV on 2/19/2017.
 */
public class WEBVIEW8 extends Activity {

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
                        "document.getElementsByClassName('logo')[0].style.display='none'; " +
                        "document.getElementsByClassName('search')[0].style.display='none'; " +
                        "document.getElementsByClassName('menu')[0].style.display='none'; " +
                        "document.getElementsByClassName('pagehead')[0].style.display='none'; " +
                        "document.getElementsByClassName('breadcrumb')[0].style.display='none'; " +
                        "document.getElementsByClassName('main-right')[0].style.display='none'; " +
                        "document.getElementsByClassName('footer')[0].style.display='none'; " +
                        "document.getElementsByClassName('div-sub-menu')[0].style.display='none'; " +
                        "document.getElementsByClassName('mx-none')[0].style.display='none'; " +
                        "document.getElementsByClassName('main-left')[0].getElementsByClassName('div-ad-site-top')[0].style.display='none'; " +
                        "document.getElementsByClassName('main-left')[0].getElementsByClassName('hide-1 div-ad-wrapper-bvf')[0].style.display='none'; " +
                        "document.getElementsByClassName('main-left')[0].getElementsByClassName('show-1 div-ad-wrapper-bvr')[0].style.display='none'; " +
                        "document.getElementsByClassName('main-left')[0].getElementsByClassName('div-ad-site-bottom')[0].style.display='none'; " +
                        "document.getElementsByClassName('main-left')[0].getElementsByClassName('related-links')[0].style.display='none'; " +
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
            myWebView.loadUrl("http://www.indiabix.com/mechanical-engineering/engineering-mechanics/");
            progressBar.setTitle("Mechanical Engineering :: Engineering Mechanics");
            progressBar.show();
        }
        if (option == 1) {
            myWebView.loadUrl("http://www.indiabix.com/mechanical-engineering/hydraulics-and-fluid-mechanics/");
            progressBar.setTitle("Mechanical Engineering :: Hydraulics and Fluid Mechanics");
            progressBar.show();
        }
        if (option == 2) {
            myWebView.loadUrl("http://www.indiabix.com/mechanical-engineering/thermodynamics/");
            progressBar.setTitle("Mechanical Engineering :: Thermodynamics");
            progressBar.show();
        }
        if (option == 3) {
            myWebView.loadUrl("http://www.indiabix.com/mechanical-engineering/steam-nozzles-and-turbines/");
            progressBar.setTitle("Mechanical Engineering :: Steam Nozzles and Turbines");
            progressBar.show();
        }
        if (option == 4) {
            myWebView.loadUrl("http://www.indiabix.com/mechanical-engineering/ic-engines-and-nuclear-power-plants/");
            progressBar.setTitle("Mechanical Engineering :: IC Engines and Nuclear Power Plants");
            progressBar.show();
        }
        if (option == 5) {
            myWebView.loadUrl("http://www.indiabix.com/mechanical-engineering/compressors-gas-dynamics-and-gas-turbines/");
            progressBar.setTitle("Mechanical Engineering :: Compressors gas dynamic and gas Turbines");
            progressBar.show();
        }
        if (option == 6) {
            myWebView.loadUrl("http://www.indiabix.com/mechanical-engineering/heat-transfer-refrigeration-and-air-conditioning");
            progressBar.setTitle("Mechanical Engineering :: Heat Transfer Refrigeration and Air Conditioning");
            progressBar.show();
        }
        if (option == 7) {
            myWebView.loadUrl("http://www.indiabix.com/mechanical-engineering/production-engineering/");
            progressBar.setTitle("Mechanical Engineering :: Production Engineering");
            progressBar.show();
        }
        if (option == 8) {
            myWebView.loadUrl("http://www.indiabix.com/mechanical-engineering/industrial-engineering-and-production-management/");
            progressBar.setTitle("Mechanical Engineering :: Industrial Engineering and Production Management");
            progressBar.show();
        }
        if (option == 9) {
            myWebView.loadUrl("http://www.indiabix.com/mechanical-engineering/strength-of-materials/");
            progressBar.setTitle("Mechanical Engineering :: Strength of Materials");
            progressBar.show();
        }
        if (option == 10) {
            myWebView.loadUrl("http://www.indiabix.com/mechanical-engineering/hydraulic-machines/");
            progressBar.setTitle("Mechanical Engineering :: Hydraulic Machines");
            progressBar.show();
        }
        if (option == 11) {
            myWebView.loadUrl("http://www.indiabix.com/mechanical-engineering/steam-boilers-and-engines/");
            progressBar.setTitle("Mechanical Engineering :: Steam Boiler and Engines");
            progressBar.show();
        }
        if (option == 12) {
            myWebView.loadUrl("http://www.indiabix.com/mechanical-engineering/machine-design/");
            progressBar.setTitle("Mechanical Engineering :: Machine Design");
            progressBar.show();
        }
        if (option == 13) {
            myWebView.loadUrl("http://www.indiabix.com/mechanical-engineering/engineering-materials/");
            progressBar.setTitle("Mechanical Engineering :: Engineering Material");
            progressBar.show();
        }
        if (option == 14) {
            myWebView.loadUrl("http://www.indiabix.com/mechanical-engineering/theory-of-machines/");
            progressBar.setTitle("Mechanical Engineering :: Theory of Machines");
            progressBar.show();
        }
        if (option == 15) {
            myWebView.loadUrl("http://www.indiabix.com/mechanical-engineering/workshop-technology/");
            progressBar.setTitle("Mechanical Engineering :: Workshop Technology");
            progressBar.show();
        }
        if (option == 16) {
            myWebView.loadUrl("http://www.indiabix.com/mechanical-engineering/automobile-engineering/");
            progressBar.setTitle("Mechanical Engineering :: Automobile Engineering");
            progressBar.show();
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
