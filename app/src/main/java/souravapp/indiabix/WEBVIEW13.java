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
public class WEBVIEW13 extends Activity {

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
        progressBar.setTitle("Computer Science");
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
            myWebView.loadUrl("http://www.indiabix.com/computer-science/computer-fundamentals/");
        }
        if (option == 1) {
            myWebView.loadUrl("http://www.indiabix.com/computer-science/computer-hardware/");
        }
        if (option == 2) {
            myWebView.loadUrl("http://www.indiabix.com/computer-science/operating-systems-concepts/");
        }
        if (option == 3) {
            myWebView.loadUrl("http://www.indiabix.com/computer-science/disk-operating-system-dos/");
        }
        if (option == 4) {
            myWebView.loadUrl("http://www.indiabix.com/computer-science/unix/");
        }
        if (option == 5) {
            myWebView.loadUrl("http://www.indiabix.com/computer-science/linux/");
        }
        if (option == 6) {
            myWebView.loadUrl("http://www.indiabix.com/computer-science/networking/");
        }
        if (option == 7) {
            myWebView.loadUrl("http://www.indiabix.com/computer-science/windows-nt/");
        }
        if (option == 8) {
            myWebView.loadUrl("http://www.indiabix.com/computer-science/windows-2000-server/");
        }
        if (option == 9) {
            myWebView.loadUrl("http://www.indiabix.com/computer-science/artificial-intelligence/");
        }
        if (option == 10) {
            myWebView.loadUrl("http://www.indiabix.com/computer-science/database-systems/");
        }
        if (option == 11) {
            myWebView.loadUrl("http://www.indiabix.com/computer-science/management-information-systems/");
        }
        if (option == 12) {
            myWebView.loadUrl("http://www.indiabix.com/computer-science/system-analysis-and-design/");
        }
        if (option == 13) {
            myWebView.loadUrl("http://www.indiabix.com/computer-science/automation-system/");
        }
        if (option == 14) {
            myWebView.loadUrl("http://www.indiabix.com/computer-science/digital-computer-electronics/");
        }
        if (option == 15) {
            myWebView.loadUrl("http://www.indiabix.com/computer-science/electronic-principles/");
        }
        if (option == 16) {
            myWebView.loadUrl("http://www.indiabix.com/computer-science/language-processors/");
        }
        if (option == 17) {
            myWebView.loadUrl("http://www.indiabix.com/computer-science/object-oriented-programming-using-cpp/");
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
