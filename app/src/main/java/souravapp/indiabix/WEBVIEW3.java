package souravapp.indiabix;

import android.app.Activity;
import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by SOURAV on 2/7/2017.
 */
public class WEBVIEW3 extends Activity {

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
        myWebView.getSettings().setJavaScriptEnabled(true);
        myWebView.getSettings().setBuiltInZoomControls(true);


        if (option == 0) {
            myWebView.loadUrl("http://www.indiabix.com/verbal-ability/spotting-errors/");
            progressBar.setTitle("Verbal Ability :: Spotting Errors");
            progressBar.show();
        }
        if (option == 1) {
            myWebView.loadUrl("http://www.indiabix.com/verbal-ability/antonyms/");
            progressBar.setTitle("Verbal Ability :: Antonyms");
            progressBar.show();
        }
        if (option == 2) {
            myWebView.loadUrl("http://www.indiabix.com/verbal-ability/spellings/");
            progressBar.setTitle("Verbal Ability :: Spellings");
            progressBar.show();
        }
        if (option == 3) {
            myWebView.loadUrl("http://www.indiabix.com/verbal-ability/ordering-of-words/");
            progressBar.setTitle("Verbal Ability :: Ordering of Words");
            progressBar.show();
        }
        if (option == 4) {
            myWebView.loadUrl("http://www.indiabix.com/verbal-ability/sentence-improvement/");
            progressBar.setTitle("Verbal Ability :: Sentence Improvement");
            progressBar.show();
        }
        if (option == 5) {
            myWebView.loadUrl("http://www.indiabix.com/verbal-ability/ordering-of-sentences/");
            progressBar.setTitle("Verbal Ability :: Ordering of Sentences");
            progressBar.show();
        }
        if (option == 6) {
            myWebView.loadUrl("http://www.indiabix.com/verbal-ability/closet-test/");
            progressBar.setTitle("Verbal Ability :: Closet Test");
            progressBar.show();
        }
        if (option == 7) {
            myWebView.loadUrl("http://www.indiabix.com/verbal-ability/one-word-substitutes/");
            progressBar.setTitle("Verbal Ability :: One Word Substitutes");
            progressBar.show();
        }
        if (option == 8) {
            myWebView.loadUrl("http://www.indiabix.com/verbal-ability/change-of-voice/");
            progressBar.setTitle("Verbal Ability :: Change of Voice");
            progressBar.show();
        }
        if (option == 9) {
            myWebView.loadUrl("http://www.indiabix.com/verbal-ability/verbal-analogies/");
            progressBar.setTitle("Verbal Ability :: Verbal Analogies");
            progressBar.show();
        }
        if (option == 10) {
            myWebView.loadUrl("http://www.indiabix.com/verbal-ability/synonyms/");
            progressBar.setTitle("Verbal Ability :: Synonyms");
            progressBar.show();
        }
        if (option == 11) {
            myWebView.loadUrl("http://www.indiabix.com/verbal-ability/selecting-words/");
            progressBar.setTitle("Verbal Ability :: Selecting Words");
            progressBar.show();
        }
        if (option == 12) {
            myWebView.loadUrl("http://www.indiabix.com/verbal-ability/sentence-formation/");
            progressBar.setTitle("Verbal Ability :: Sentence Formation");
            progressBar.show();
        }
        if (option == 13) {
            myWebView.loadUrl("http://www.indiabix.com/verbal-ability/sentence-correction/");
            progressBar.setTitle("Verbal Ability :: Sentence Correction");
            progressBar.show();
        }
        if (option == 14) {
            myWebView.loadUrl("http://www.indiabix.com/verbal-ability/completing-statements/");
            progressBar.setTitle("Verbal Ability :: Completing Statements");
            progressBar.show();
        }
        if (option == 15) {
            myWebView.loadUrl("http://www.indiabix.com/verbal-ability/paragraph-formation/");
            progressBar.setTitle("Verbal Ability :: Paragraph Formation");
            progressBar.show();
        }
        if (option == 16) {
            myWebView.loadUrl("http://www.indiabix.com/verbal-ability/comprehension/");
            progressBar.setTitle("Verbal Ability :: Comprehension");
            progressBar.show();
        }
        if (option == 17) {
            myWebView.loadUrl("http://www.indiabix.com/verbal-ability/idioms-and-phrases/");
            progressBar.setTitle("Verbal Ability :: Idioms and Phrases");
            progressBar.show();
        }
        if (option == 18) {
            myWebView.loadUrl("http://www.indiabix.com/verbal-ability/change-of-speech/");
            progressBar.setTitle("Verbal Ability :: Change of Speech");
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