package souravapp.indiabix;

import android.app.Activity;
import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by SOURAV on 2/25/2017.
 */
public class WEBVIEW19 extends Activity {

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
        progressBar.setTitle("Interview Patterns");
        progressBar.show();
        myWebView = (WebView) findViewById(R.id.webview);
        myWebView.setVisibility(View.GONE);
        myWebView.setWebViewClient(new WebViewClient() {

            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                myWebView.setVisibility(View.GONE);
            }


            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                myWebView.loadUrl("javascript:(function() { " +
                        "document.getElementsByClassName('logo')[0].style.display='none'; " +
                        "document.getElementsByClassName('search')[0].style.display='none'; " +
                        "document.getElementsByClassName('menu')[0].style.display='none'; " +
                        "document.getElementsByClassName('div-sub-menu')[0].style.display='none'; " +
                        "document.getElementsByClassName('pagehead')[0].style.display='none'; " +
                        "document.getElementsByClassName('mx-none')[0].style.display='none'; " +
                        "document.getElementsByClassName('breadcrumb')[0].style.display='none'; " +
                        "document.getElementsByClassName('main-left')[0].getElementsByClassName('div-ad-site-top')[0].style.display='none'; " +
                        "document.getElementsByClassName('main-left')[0].getElementsByClassName('hide-1 div-ad-wrapper-bvf')[0].style.display='none'; " +
                        "document.getElementsByClassName('main-left')[0].getElementsByClassName('show-1 div-ad-wrapper-bvr')[0].style.display='none'; " +
                        "document.getElementsByClassName('main-left')[0].getElementsByClassName('div-ad-site-bottom')[0].style.display='none'; " +
                        "document.getElementsByClassName('main-left')[0].getElementsByClassName('related-links')[0].style.display='none'; " +
                        "document.getElementsByClassName('main-right')[0].style.display='none'; " +
                        "document.getElementsByClassName('footer')[0].style.display='none'; " +
                        "})()");
                if (progressBar.isShowing()) {
                    progressBar.dismiss();
                }

                myWebView.setVisibility(View.VISIBLE);
                super.onPageFinished(view, url);
            }
        });
        myWebView.setWebChromeClient(new WebChromeClient());
        myWebView.getSettings().setBuiltInZoomControls(true);
        myWebView.getSettings().setJavaScriptEnabled(true);
        myWebView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);

        if (option == 0) {
            myWebView.loadUrl("http://www.indiabix.com/placement-papers/companies/");
        }
        if (option == 1) {
            myWebView.getSettings().setJavaScriptEnabled(false);
            myWebView.loadUrl("http://www.indiabix.com/hr-interview/questions-and-answers/");
        }
        if (option == 3) {
            myWebView.getSettings().setJavaScriptEnabled(false);
            myWebView.loadUrl("http://www.indiabix.com/group-discussion/topics-with-answers/");
        }
        if (option == 5) {
            myWebView.loadUrl("http://www.indiabix.com/placement-papers/submit/");
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