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
public class WEBVIEW6 extends Activity {

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
            }
        });
        myWebView.getSettings().setJavaScriptEnabled(true);
        myWebView.getSettings().setBuiltInZoomControls(true);

        if (option == 0) {
            myWebView.loadUrl("http://www.indiabix.com/non-verbal-reasoning/series/");
            progressBar.setTitle("Non Verbal Reasoning :: Series");
            progressBar.show();
        }
        if (option == 1) {
            myWebView.loadUrl("http://www.indiabix.com/non-verbal-reasoning/classification/");
            progressBar.setTitle("Non Verbal Reasoning :: Classification");
            progressBar.show();
        }
        if (option == 2) {
            myWebView.loadUrl("http://www.indiabix.com/non-verbal-reasoning/mirror-images/");
            progressBar.setTitle("Non Verbal Reasoning :: Mirror Images");
            progressBar.show();
        }
        if (option == 3) {
            myWebView.loadUrl("http://www.indiabix.com/non-verbal-reasoning/embedded-images/");
            progressBar.setTitle("Non Verbal Reasoning :: Embedded Images");
            progressBar.show();
        }
        if (option == 4) {
            myWebView.loadUrl("http://www.indiabix.com/non-verbal-reasoning/figure-matrix/");
            progressBar.setTitle("Non Verbal Reasoning :: Figure Matrix");
            progressBar.show();
        }
        if (option == 5) {
            myWebView.loadUrl("http://www.indiabix.com/non-verbal-reasoning/paper-cutting/");
            progressBar.setTitle("Non Verbal Reasoning :: Paper Cutting");
            progressBar.show();
        }
        if (option == 6) {
            myWebView.loadUrl("http://www.indiabix.com/non-verbal-reasoning/grouping-of-images/");
            progressBar.setTitle("Non Verbal Reasoning :: Grouping of Images");
            progressBar.show();
        }
        if (option == 7) {
            myWebView.loadUrl("http://www.indiabix.com/non-verbal-reasoning/shape-construction/");
            progressBar.setTitle("Non Verbal Reasoning :: Shape Construction");
            progressBar.show();
        }
        if (option == 8) {
            myWebView.loadUrl("http://www.indiabix.com/non-verbal-reasoning/cubes-and-dice/");
            progressBar.setTitle("Non Verbal Reasoning :: Cubes and Dice");
            progressBar.show();
        }
        if (option == 9) {
            myWebView.loadUrl("http://www.indiabix.com/non-verbal-reasoning/analogy/");
            progressBar.setTitle("Non Verbal Reasoning :: Non Verbal Reasoning");
            progressBar.show();
        }
        if (option == 10) {
            myWebView.loadUrl("http://www.indiabix.com/non-verbal-reasoning/analytical-reasoning/");
            progressBar.setTitle("Non Verbal Reasoning :: Analytical Reasoning");
            progressBar.show();
        }
        if (option == 11) {
            myWebView.loadUrl("http://www.indiabix.com/non-verbal-reasoning/water-images/");
            progressBar.setTitle("Non Verbal Reasoning :: Water Images");
            progressBar.show();
        }
        if (option == 12) {
            myWebView.loadUrl("http://www.indiabix.com/non-verbal-reasoning/pattern-completion/");
            progressBar.setTitle("Non Verbal Reasoning :: Pattern Completions");
            progressBar.show();
        }
        if (option == 13) {
            myWebView.loadUrl("http://www.indiabix.com/non-verbal-reasoning/paper-folding/");
            progressBar.setTitle("Non Verbal Reasoning :: Paper Folding");
            progressBar.show();
        }
        if (option == 14) {
            myWebView.loadUrl("http://www.indiabix.com/non-verbal-reasoning/rule-detection/");
            progressBar.setTitle("Non Verbal Reasoning :: Rule Detection");
            progressBar.show();
        }
        if (option == 15) {
            myWebView.loadUrl("http://www.indiabix.com/non-verbal-reasoning/dot-situation/");
            progressBar.setTitle("Non Verbal Reasoning :: Dot Situation");
            progressBar.show();
        }
        if (option == 16) {
            myWebView.loadUrl("http://www.indiabix.com/non-verbal-reasoning/image-analysis/");
            progressBar.setTitle("Non Verbal Reasoning :: Image Analysis");
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
