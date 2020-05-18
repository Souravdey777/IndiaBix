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
public class WEBVIEW5 extends Activity {

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
            myWebView.loadUrl("http://www.indiabix.com/verbal-reasoning/logical-sequence-of-words/");
            progressBar.setTitle("Verbal Reasoning :: Logical Sequence of Words");
            progressBar.show();
        }
        if (option == 1) {
            myWebView.loadUrl("http://www.indiabix.com/verbal-reasoning/syllogism/");
            progressBar.setTitle("Verbal Reasoning :: Syllogism");
            progressBar.show();
        }
        if (option == 2) {
            myWebView.loadUrl("http://www.indiabix.com/verbal-reasoning/cause-and-effect/");
            progressBar.setTitle("Verbal Reasoning :: Cause and Effects");
            progressBar.show();
        }
        if (option == 3) {
            myWebView.loadUrl("http://www.indiabix.com/verbal-reasoning/venn-diagrams/");
            progressBar.setTitle("Verbal Reasoning :: Venn Diagrams");
            progressBar.show();
        }
        if (option == 4) {
            myWebView.loadUrl("http://www.indiabix.com/verbal-reasoning/analogy/");
            progressBar.setTitle("Verbal Reasoning :: Analogy");
            progressBar.show();
        }
        if (option == 5) {
            myWebView.loadUrl("http://www.indiabix.com/verbal-reasoning/character-puzzles/");
            progressBar.setTitle("Verbal Reasoning :: Character Puzzles");
            progressBar.show();
        }
        if (option == 6) {
            myWebView.loadUrl("http://www.indiabix.com/verbal-reasoning/classification/");
            progressBar.setTitle("Verbal Reasoning :: Classification");
            progressBar.show();
        }
        if (option == 7) {
            myWebView.loadUrl("http://www.indiabix.com/verbal-reasoning/arithmetic-reasoning/");
            progressBar.setTitle("Verbal Reasoning :: Arithmetic Reasoning");
            progressBar.show();
        }
        if (option == 8) {
            myWebView.loadUrl("http://www.indiabix.com/verbal-reasoning/blood-relation-test/");
            progressBar.setTitle("Verbal Reasoning :: Blood Relation Test");
            progressBar.show();
        }
        if (option == 9) {
            myWebView.loadUrl("http://www.indiabix.com/verbal-reasoning/series-completion/");
            progressBar.setTitle("Verbal Reasoning :: Series Completion");
            progressBar.show();
        }
        if (option == 10) {
            myWebView.loadUrl("http://www.indiabix.com/verbal-reasoning/dice/");
            progressBar.setTitle("Verbal Reasoning :: Dice");
            progressBar.show();
        }
        if (option == 11) {
            myWebView.loadUrl("http://www.indiabix.com/verbal-reasoning/cube-and-cuboid/");
            progressBar.setTitle("Verbal Reasoning :: Cube and Cuboid");
            progressBar.show();
        }
        if (option == 12) {
            myWebView.loadUrl("http://www.indiabix.com/verbal-reasoning/seating-arrangement/");
            progressBar.setTitle("Verbal Reasoning :: Seating Arrangement");
            progressBar.show();
        }
        if (option == 13) {
            myWebView.loadUrl("http://www.indiabix.com/verbal-reasoning/direction-sense-test/");
            progressBar.setTitle("Verbal Reasoning :: Direction Sense Test");
            progressBar.show();
        }
        if (option == 14) {
            myWebView.loadUrl("http://www.indiabix.com/verbal-reasoning/data-sufficiency/");
            progressBar.setTitle("Verbal Reasoning :: Data Sufficiency");
            progressBar.show();
        }
        if (option == 15) {
            myWebView.loadUrl("http://www.indiabix.com/verbal-reasoning/verification-of-truth/");
            progressBar.setTitle("Verbal Reasoning :: Verification of Truth");
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
