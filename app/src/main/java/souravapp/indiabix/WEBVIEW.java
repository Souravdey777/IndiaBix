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
public class WEBVIEW extends Activity {

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

        option = getIntent().getIntExtra("option",0);

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

        if(option==0) {myWebView.loadUrl("http://www.indiabix.com/aptitude/problems-on-trains/");
            progressBar.setTitle("Arithmetic Aptitude :: Problems on Train");
            progressBar.show();
        }
        if(option==1) {myWebView.loadUrl("http://www.indiabix.com/aptitude/height-and-distance/");
            progressBar.setTitle("Arithmetic Aptitude :: Height and Distance");
            progressBar.show();
        }
        if(option==2) {myWebView.loadUrl("http://www.indiabix.com/aptitude/simple-interest/");
            progressBar.setTitle("Arithmetic Aptitude :: Simple Interest");
            progressBar.show();
        }
        if(option==3) {myWebView.loadUrl("http://www.indiabix.com/aptitude/profit-and-loss/");
            progressBar.setTitle("Arithmetic Aptitude :: Profit and Loss");
            progressBar.show();
        }
        if(option==4) {myWebView.loadUrl("http://www.indiabix.com/aptitude/percentage/");
            progressBar.setTitle("Arithmetic Aptitude :: Percentage");
            progressBar.show();
        }
        if(option==5) {myWebView.loadUrl("http://www.indiabix.com/aptitude/calendar/");
            progressBar.setTitle("Arithmetic Aptitude :: Calender");
            progressBar.show();
        }
        if(option==6) {myWebView.loadUrl("http://www.indiabix.com/aptitude/average/");
            progressBar.setTitle("Arithmetic Aptitude :: Average");
            progressBar.show();
        }
        if(option==7) {myWebView.loadUrl("http://www.indiabix.com/aptitude/volume-and-surface-area/");
            progressBar.setTitle("Arithmetic Aptitude :: Volume and Surface Area");
            progressBar.show();
        }
        if(option==8) {myWebView.loadUrl("http://www.indiabix.com/aptitude/numbers/");
            progressBar.setTitle("Arithmetic Aptitude :: Numbers");
            progressBar.show();
        }
        if(option==9) {myWebView.loadUrl("http://www.indiabix.com/aptitude/problems-on-hcf-and-lcm/");
            progressBar.setTitle("Arithmetic Aptitude :: Problems on HCF and LCM");
            progressBar.show();
        }
        if(option==10) {myWebView.loadUrl("http://www.indiabix.com/aptitude/simplification/");
            progressBar.setTitle("Arithmetic Aptitude :: Simplification");
            progressBar.show();
        }
        if(option==11) {myWebView.loadUrl("http://www.indiabix.com/aptitude/surds-and-indices/");
            progressBar.setTitle("Arithmetic Aptitude :: Surds and Indices");
            progressBar.show();
        }
        if(option==12) {myWebView.loadUrl("http://www.indiabix.com/aptitude/chain-rule/");
            progressBar.setTitle("Arithmetic Aptitude :: Chain Rule");
            progressBar.show();
        }
        if(option==13) {myWebView.loadUrl("http://www.indiabix.com/aptitude/boats-and-streams/");
            progressBar.setTitle("Arithmetic Aptitude :: Boats and Streams");
            progressBar.show();
        }
        if(option==14) {myWebView.loadUrl("http://www.indiabix.com/aptitude/logarithm/");
            progressBar.setTitle("Arithmetic Aptitude :: Logarithm");
            progressBar.show();
        }
        if(option==15) {myWebView.loadUrl("http://www.indiabix.com/aptitude/stocks-and-shares/");
            progressBar.setTitle("Arithmetic Aptitude :: Stocks and Shares");
            progressBar.show();
        }
        if(option==16) {myWebView.loadUrl("http://www.indiabix.com/aptitude/true-discount/");
            progressBar.setTitle("Arithmetic Aptitude :: True Discount");
            progressBar.show();
        }
        if(option==17) {myWebView.loadUrl("http://www.indiabix.com/aptitude/odd-man-out-and-series/");
            progressBar.setTitle("Arithmetic Aptitude :: Odd Man Out and Series");
            progressBar.show();
        }
        if(option==18) {myWebView.loadUrl("http://www.indiabix.com/aptitude/time-and-distance/");
            progressBar.setTitle("Arithmetic Aptitude :: Time and Distance");
            progressBar.show();
        }
        if(option==19) {myWebView.loadUrl("http://www.indiabix.com/aptitude/time-and-work/");
            progressBar.setTitle("Arithmetic Aptitude :: Time and Work");
            progressBar.show();
        }
        if(option==20) {myWebView.loadUrl("http://www.indiabix.com/aptitude/compound-interest/");
            progressBar.setTitle("Arithmetic Aptitude :: Compound Interest");
            progressBar.show();
        }
        if(option==21) {myWebView.loadUrl("http://www.indiabix.com/aptitude/partnership/");
            progressBar.setTitle("Arithmetic Aptitude :: Partnership");
            progressBar.show();
        }
        if(option==22) {myWebView.loadUrl("http://www.indiabix.com/aptitude/problems-on-ages/");
            progressBar.setTitle("Arithmetic Aptitude :: Problems on Ages");
            progressBar.show();
        }
        if(option==23) {myWebView.loadUrl("http://www.indiabix.com/aptitude/clock/");
            progressBar.setTitle("Arithmetic Aptitude :: Clock");
            progressBar.show();
        }
        if(option==24) {myWebView.loadUrl("http://www.indiabix.com/aptitude/area/");
            progressBar.setTitle("Arithmetic Aptitude :: Area");
            progressBar.show();
        }
        if(option==25) {myWebView.loadUrl("http://www.indiabix.com/aptitude/Permuatation-and-combination/");
            progressBar.setTitle("Arithmetic Aptitude :: Permutation and Combination");
            progressBar.show();
        }
        if(option==26) {myWebView.loadUrl("http://www.indiabix.com/aptitude/problems-on-numbers/");
            progressBar.setTitle("Arithmetic Aptitude :: Problem on Numbers");
            progressBar.show();
        }
        if(option==27) {myWebView.loadUrl("http://www.indiabix.com/aptitude/decimal-fraction/");
            progressBar.setTitle("Arithmetic Aptitude :: Decimal Fraction");
            progressBar.show();
        }
        if(option==28) {myWebView.loadUrl("http://www.indiabix.com/aptitude/square-root-and-cube-root/");
            progressBar.setTitle("Arithmetic Aptitude :: Square Root and Cube Root");
            progressBar.show();
        }
        if(option==29) {myWebView.loadUrl("http://www.indiabix.com/aptitude/ratio-and-proportion/");
            progressBar.setTitle("Arithmetic Aptitude :: Ratio and Proportion");
            progressBar.show();
        }
        if(option==30) {myWebView.loadUrl("http://www.indiabix.com/aptitude/pipes-and-cistern/");
            progressBar.setTitle("Arithmetic Aptitude :: Pipes and Cistern");
            progressBar.show();
        }
        if(option==31) {myWebView.loadUrl("http://www.indiabix.com/aptitude/alligation-or-mixture/");
            progressBar.setTitle("Arithmetic Aptitude :: Allegation or Mixture");
            progressBar.show();
        }
        if(option==32) {myWebView.loadUrl("http://www.indiabix.com/aptitude/races-and-games/");
            progressBar.setTitle("Arithmetic Aptitude :: Races and Games");
            progressBar.show();
        }
        if(option==33) {myWebView.loadUrl("http://www.indiabix.com/aptitude/probability/");
            progressBar.setTitle("Arithmetic Aptitude :: Probability");
            progressBar.show();
        }
        if(option==34) {myWebView.loadUrl("http://www.indiabix.com/aptitude/bankers-discount/");
            progressBar.setTitle("Arithmetic Aptitude :: Banker's Discount");
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
