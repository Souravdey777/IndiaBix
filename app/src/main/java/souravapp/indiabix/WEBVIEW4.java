package souravapp.indiabix;

import android.app.Activity;
import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by SOURAV on 2/9/2017.
 */
public class WEBVIEW4 extends Activity {

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
            myWebView.loadUrl("http://www.indiabix.com/logical-reasoning/number-series/");
            progressBar.setTitle("Logical Reasoning :: Number Series");
            progressBar.show();
        }
        if (option == 1) {
            myWebView.loadUrl("http://www.indiabix.com/logical-reasoning/verbal-classification/");
            progressBar.setTitle("Logical Reasoning :: Verbal Classification");
            progressBar.show();
        }
        if (option == 2) {
            myWebView.loadUrl("http://www.indiabix.com/logical-reasoning/analogies/");
            progressBar.setTitle("Logical Reasoning :: Analogies");
            progressBar.show();
        }
        if (option == 3) {
            myWebView.loadUrl("http://www.indiabix.com/logical-reasoning/matching-definitions/");
            progressBar.setTitle("Logical Reasoning :: Matching Definitions");
            progressBar.show();
        }
        if (option == 4) {
            myWebView.loadUrl("http://www.indiabix.com/logical-reasoning/verbal-reasoning/");
            progressBar.setTitle("Logical Reasoning :: Verbal Reasoning");
            progressBar.show();
        }
        if (option == 5) {
            myWebView.loadUrl("http://www.indiabix.com/logical-reasoning/logical-games/");
            progressBar.setTitle("Logical Reasoning :: Logical Games");
            progressBar.show();
        }
        if (option == 6) {
            myWebView.loadUrl("http://www.indiabix.com/logical-reasoning/statement-and-assumption/");
            progressBar.setTitle("Logical Reasoning :: Statements and Assumptions");
            progressBar.show();
        }
        if (option == 7) {
            myWebView.loadUrl("http://www.indiabix.com/logical-reasoning/statement-and-conclusion/");
            progressBar.setTitle("Logical Reasoning :: Statement and Conclusion");
            progressBar.show();
        }
        if (option == 8) {
            myWebView.loadUrl("http://www.indiabix.com/logical-reasoning/cause-and-effect/");
            progressBar.setTitle("Logical Reasoning :: Cause and Effect");
            progressBar.show();
        }
        if (option == 9) {
            myWebView.loadUrl("http://www.indiabix.com/logical-reasoning/logical-deduction/");
            progressBar.setTitle("Logical Reasoning :: Logical Deductions");
            progressBar.show();
        }
        if (option == 10) {
            myWebView.loadUrl("http://www.indiabix.com/logical-reasoning/letter-and-symbols-series/");
            progressBar.setTitle("Logical Reasoning :: Letter and Symbols Series");
            progressBar.show();
        }
        if (option == 11) {
            myWebView.loadUrl("http://www.indiabix.com/logical-reasoning/essential-part/");
            progressBar.setTitle("Logical Reasoning :: Essential Part");
            progressBar.show();
        }
        if (option == 12) {
            myWebView.loadUrl("http://www.indiabix.com/logical-reasoning/artificial-language/");
            progressBar.setTitle("Logical Reasoning :: Artificial Language");
            progressBar.show();
        }
        if (option == 13) {
            myWebView.loadUrl("http://www.indiabix.com/logical-reasoning/making-judgements/");
            progressBar.setTitle("Logical Reasoning :: Making Judgements");
            progressBar.show();
        }
        if (option == 14) {
            myWebView.loadUrl("http://www.indiabix.com/logical-reasoning/logical-problems/");
            progressBar.setTitle("Logical Reasoning :: Logical Problems");
            progressBar.show();
        }
        if (option == 15) {
            myWebView.loadUrl("http://www.indiabix.com/logical-reasoning/analyzing-arguments/");
            progressBar.setTitle("Logical Reasoning :: Analyzing Arguments");
            progressBar.show();
        }
        if (option == 16) {
            myWebView.loadUrl("http://www.indiabix.com/logical-reasoning/course-of-action/");
            progressBar.setTitle("Logical Reasoning :: Course of Action");
            progressBar.show();
        }
        if (option == 17) {
            myWebView.loadUrl("http://www.indiabix.com/logical-reasoning/theme-detection/");
            progressBar.setTitle("Logical Reasoning :: Theme Detections");
            progressBar.show();
        }
        if (option == 18) {
            myWebView.loadUrl("http://www.indiabix.com/logical-reasoning/statement-and-argument/");
            progressBar.setTitle("Logical Reasoning :: Statement and Argument");
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