package souravapp.indiabix;

import android.app.Activity;
import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by SOURAV on 2/14/2017.
 */
public class WEBVIEW7 extends Activity {

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

        option = getIntent().getIntExtra("option", 0);

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
            myWebView.loadUrl("http://www.indiabix.com/general-knowledge/basic-general-knowledge/");
            progressBar.setTitle("General Knowledge :: Basic General Knowledge");
            progressBar.show();
        }
        if (option == 1) {
            myWebView.loadUrl("http://www.indiabix.com/general-knowledge/general-science/");
            progressBar.setTitle("General Knowledge :: General Science");
            progressBar.show();
        }
        if (option == 2) {
            myWebView.loadUrl("http://www.indiabix.com/general-knowledge/indian-politics/");
            progressBar.setTitle("General Knowledge :: Indian Politics");
            progressBar.show();
        }
        if (option == 3) {
            myWebView.loadUrl("http://www.indiabix.com/general-knowledge/world-geography/");
            progressBar.setTitle("General Knowledge :: World Geography");
            progressBar.show();
        }
        if (option == 4) {
            myWebView.loadUrl("http://www.indiabix.com/general-knowledge/chemistry/");
            progressBar.setTitle("General Knowledge :: Chemistry");
            progressBar.show();
        }
        if (option == 5) {
            myWebView.loadUrl("http://www.indiabix.com/general-knowledge/indian-geography/");
            progressBar.setTitle("General Knowledge :: Indian Geography");
            progressBar.show();
        }
        if (option == 6) {
            myWebView.loadUrl("http://www.indiabix.com/general-knowledge/honours-and-awards/");
            progressBar.setTitle("General Knowledge :: Honours and Awards");
            progressBar.show();
        }
        if (option == 7) {
            myWebView.loadUrl("http://www.indiabix.com/general-knowledge/technology/");
            progressBar.setTitle("General Knowledge :: Technology");
            progressBar.show();
        }
        if (option == 8) {
            myWebView.loadUrl("http://www.indiabix.com/general-knowledge/indian-culture/");
            progressBar.setTitle("General Knowledge :: Indian Cultures");
            progressBar.show();
        }
        if (option == 9) {
            myWebView.loadUrl("http://www.indiabix.com/general-knowledge/world-organisations/");
            progressBar.setTitle("General Knowledge :: World Organisation");
            progressBar.show();
        }
        if (option == 10) {
            myWebView.loadUrl("http://www.indiabix.com/general-knowledge/indian-history/");
            progressBar.setTitle("General Knowledge :: Indian History");
            progressBar.show();
        }
        if (option == 11) {
            myWebView.loadUrl("http://www.indiabix.com/general-knowledge/famous-personalities/");
            progressBar.setTitle("General Knowledge :: Famous Personalities");
            progressBar.show();
        }
        if (option == 12) {
            myWebView.loadUrl("http://www.indiabix.com/general-knowledge/physics/");
            progressBar.setTitle("General Knowledge :: Physics");
            progressBar.show();
        }
        if (option == 13) {
            myWebView.loadUrl("http://www.indiabix.com/general-knowledge/indian-economy/");
            progressBar.setTitle("General Knowledge :: Indian Economy");
            progressBar.show();
        }
        if (option == 14) {
            myWebView.loadUrl("http://www.indiabix.com/general-knowledge/inventions/");
            progressBar.setTitle("General Knowledge :: Invention");
            progressBar.show();
        }
        if (option == 15) {
            myWebView.loadUrl("http://www.indiabix.com/general-knowledge/biology/");
            progressBar.setTitle("General Knowledge :: Biology");
            progressBar.show();
        }
        if (option == 16) {
            myWebView.loadUrl("http://www.indiabix.com/general-knowledge/famous-places-in-india/");
            progressBar.setTitle("General Knowledge :: Famous Places in India");
            progressBar.show();
        }
        if (option == 17) {
            myWebView.loadUrl("http://www.indiabix.com/general-knowledge/books-and-authors/");
            progressBar.setTitle("General Knowledge :: Books and Authors");
            progressBar.show();
        }
        if (option == 18) {
            myWebView.loadUrl("http://www.indiabix.com/general-knowledge/sports/");
            progressBar.setTitle("General Knowledge :: Sports");
            progressBar.show();
        }
        if (option == 19) {
            myWebView.loadUrl("http://www.indiabix.com/general-knowledge/days-and-years/");
            progressBar.setTitle("General Knowledge :: Days and Years");
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