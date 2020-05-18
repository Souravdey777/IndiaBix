package souravapp.indiabix;

import android.app.Activity;
import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by SOURAV on 2/11/2017.
 */
public class WEBVIEW0 extends Activity {
    int option;
    WebView myWebView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.web);

        final ProgressDialog progressBar = new ProgressDialog(this);
        progressBar.setIcon(R.drawable.drawerlogo);
        progressBar.setMessage("Loading...");
        progressBar.setCancelable(false);

        option = getIntent().getIntExtra("Option",0);

        myWebView = (WebView)findViewById(R.id.webview);
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
                        "document.getElementsByClassName('logo')[0].style.display='none'; " +
                        "document.getElementsByClassName('search')[0].style.display='none'; " +
                        "document.getElementsByClassName('menu')[0].style.display='none'; " +
                        "document.getElementsByClassName('pagehead')[0].style.display='none'; " +
                        "document.getElementsByClassName('breadcrumb')[0].style.display='none'; " +
                        "document.getElementsByClassName('main-right')[0].style.display='none'; " +
                        "document.getElementsByClassName('footer')[0].style.display='none'; " +
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
                super.onPageFinished(view, url);
            }
        });
        myWebView.getSettings().setJavaScriptEnabled(true);
        myWebView.getSettings().setBuiltInZoomControls(true);

        if(option==1){
        myWebView.loadUrl("http://www.meritanswers.com/questions/my-questions/");
            progressBar.setTitle("Discussion Forum :: My Questions");
            progressBar.show();
        }

        if(option==2){
        myWebView.loadUrl("http://www.meritanswers.com/questions/");
            progressBar.setTitle("Discussion Forum :: Recent Questions");
            progressBar.show();
        }

        if(option==3){
        myWebView.loadUrl("http://www.meritanswers.com/questions/ask/");
            progressBar.setTitle("Discussion Forum :: Ask a Question");
            progressBar.show();
        }


    }
}