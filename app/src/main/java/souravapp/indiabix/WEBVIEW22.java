package souravapp.indiabix;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by SOURAV on 2/26/2017.
 */
public class WEBVIEW22 extends Activity {

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
        progressBar.setTitle("Online Test");
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

                myWebView.loadUrl("javascript:(function() { " +
                        "document.getElementsByClassName('logo')[0].style.display='none'; " +
                        "document.getElementsByClassName('search')[0].style.display='none'; " +
                        "document.getElementsByClassName('menu')[0].style.display='none'; " +
                        "document.getElementsByClassName('div-sub-menu')[0].style.display='none'; " +
                        "document.getElementsByClassName('pagehead')[0].style.display='none'; " +
                        "document.getElementsByClassName('breadcrumb')[0].style.display='none'; " +
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
        myWebView.setWebChromeClient(new WebChromeClient(){
            @Override
            public boolean onJsAlert(WebView view, String url, String message, final JsResult result) {
                AlertDialog dialog = new AlertDialog.Builder(view.getContext()).
                        setTitle("Submit Test::").
                        setMessage(message).
                        setIcon(R.drawable.drawerlogo).
                        setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                result.confirm();
                            }
                        }).
                        setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                result.cancel();
                            }
                        }).create();
                dialog.show();
                return true;
            }
        });
        myWebView.getSettings().setBuiltInZoomControls(true);
        myWebView.getSettings().setJavaScriptEnabled(true);

        if (option == 0) {
            myWebView.loadUrl("http://www.indiabix.com/online-test/aptitude-test/");
        }
        if (option == 1) {
            myWebView.loadUrl("http://www.indiabix.com/online-test/verbal-ability-test/");
        }
        if (option == 2) {
            myWebView.loadUrl("http://www.indiabix.com/online-test/logical-reasoning-test/");
        }
        if (option == 3) {
            myWebView.loadUrl("http://www.indiabix.com/online-test/verbal-reasoning-test/");
        }
        if (option == 4) {
            myWebView.loadUrl("http://www.indiabix.com/online-test/non-verbal-reasoning-test/");
        }
        if (option == 5) {
            myWebView.loadUrl("http://www.indiabix.com/online-test/data-interpretation-test/");
        }
        if (option == 6) {
            myWebView.loadUrl("http://www.indiabix.com/online-test/general-knowledge-test/");
        }
        if (option == 7) {
            myWebView.loadUrl("http://www.indiabix.com/online-test/c-programming-test/");
        }
        if (option == 8) {
            myWebView.loadUrl("http://www.indiabix.com/online-test/java-programming-test/");
        }
        if (option == 9) {
            myWebView.loadUrl("http://www.indiabix.com/online-test/database-test/");
        }
        if (option == 10) {
            myWebView.loadUrl("http://www.indiabix.com/online-test/electronics-test/");
        }
        if (option == 11) {
            myWebView.loadUrl("http://www.indiabix.com/online-test/digital-electronics-test/");
        }
        if (option == 12) {
            myWebView.loadUrl("http://www.indiabix.com/online-test/electronic-devices-test/");
        }
        if (option == 13) {
            myWebView.loadUrl("http://www.indiabix.com/online-test/electrical-engineering-test/");
        }
        if (option == 14) {
            myWebView.loadUrl("http://www.indiabix.com/online-test/technical-drawing-test/");
        }
        if (option == 15) {
            myWebView.loadUrl("http://www.indiabix.com/online-test/engineering-mechanics-test/");
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
