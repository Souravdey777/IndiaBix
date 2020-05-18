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
public class WEBVIEW15 extends Activity {

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
        progressBar.setTitle("C Programming");
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
            myWebView.loadUrl("http://www.indiabix.com/c-programming/declarations-and-initializations/");
        }
        if (option == 1) {
            myWebView.loadUrl("http://www.indiabix.com/c-programming/expressions/");
        }
        if (option == 2) {
            myWebView.loadUrl("http://www.indiabix.com/c-programming/functions/");
        }
        if (option == 3) {
            myWebView.loadUrl("http://www.indiabix.com/c-programming/pointers/");
        }
        if (option == 4) {
            myWebView.loadUrl("http://www.indiabix.com/c-programming/strings/");
        }
        if (option == 5) {
            myWebView.loadUrl("http://www.indiabix.com/c-programming/input-output/");
        }
        if (option == 6) {
            myWebView.loadUrl("http://www.indiabix.com/c-programming/bitwise-operators/");
        }
        if (option == 7) {
            myWebView.loadUrl("http://www.indiabix.com/c-programming/const/");
        }
        if (option == 8) {
            myWebView.loadUrl("http://www.indiabix.com/c-programming/variable-number-of-arguments/");
        }
        if (option == 9) {
            myWebView.loadUrl("http://www.indiabix.com/c-programming/library-functions/");
        }
        if (option == 10) {
            myWebView.loadUrl("http://www.indiabix.com/c-programming/control-instructions/");
        }
        if (option == 11) {
            myWebView.loadUrl("http://www.indiabix.com/c-programming/floating-point-issues/");
        }
        if (option == 12) {
            myWebView.loadUrl("http://www.indiabix.com/c-programming/c-preprocessor/");
        }
        if (option == 13) {
            myWebView.loadUrl("http://www.indiabix.com/c-programming/arrays/");
        }
        if (option == 14) {
            myWebView.loadUrl("http://www.indiabix.com/c-programming/structures-unions-enums//");
        }
        if (option == 15) {
            myWebView.loadUrl("http://www.indiabix.com/c-programming/command-line-arguments/");
        }
        if (option == 16) {
            myWebView.loadUrl("http://www.indiabix.com/c-programming/typedef/");
        }
        if (option == 17) {
            myWebView.loadUrl("http://www.indiabix.com/c-programming/memory-allocation/");
        }
        if (option == 18) {
            myWebView.loadUrl("http://www.indiabix.com/c-programming/complicated-declarations/");
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
