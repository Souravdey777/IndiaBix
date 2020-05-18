package souravapp.indiabix;

import android.app.Activity;
import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by SOURAV on 2/22/2017.
 */
public class WEBVIEW20 extends Activity {

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
        progressBar.setTitle("Technical Interview");
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
        myWebView.getSettings().setJavaScriptEnabled(false);
        myWebView.getSettings().setBuiltInZoomControls(true);

        if (option == 1) {
            myWebView.loadUrl("http://www.indiabix.com/technical/c/the-c-language-basics/");
        }
        if (option == 2) {
            myWebView.loadUrl("http://www.indiabix.com/technical/c/bits-and-bytes/");
        }
        if (option == 3) {
            myWebView.loadUrl("http://www.indiabix.com/technical/c/preprocessors/");
        }
        if (option == 4) {
            myWebView.loadUrl("http://www.indiabix.com/technical/c/arrays/");
        }
        if (option == 5) {
            myWebView.loadUrl("http://www.indiabix.com/technical/c/data-files/");
        }
        if (option == 6) {
            myWebView.loadUrl("http://www.indiabix.com/technical/c/variables-and-data-storage/");
        }
        if (option == 7) {
            myWebView.loadUrl("http://www.indiabix.com/technical/c/functions/");
        }
        if (option == 8) {
            myWebView.loadUrl("http://www.indiabix.com/technical/c/strings/");
        }
        if (option == 9) {
            myWebView.loadUrl("http://www.indiabix.com/technical/c/pointers/");
        }
        if (option == 10) {
            myWebView.loadUrl("http://www.indiabix.com/technical/c/standard-library-functions/");
        }
        if (option == 11) {
            myWebView.loadUrl("http://www.indiabix.com/technical/data-structures/");
        }
        if (option == 12) {
            myWebView.loadUrl("http://www.indiabix.com/technical/dotnet/dot-net-framework/");
        }
        if (option == 13) {
            myWebView.loadUrl("http://www.indiabix.com/technical/dotnet/object-oriented-programming/");
        }
        if (option == 14) {
            myWebView.loadUrl("http://www.indiabix.com/technical/dotnet/ado-dot-net/");
        }
        if (option == 15) {
            myWebView.loadUrl("http://www.indiabix.com/technical/dotnet/dynamic-programming/");
        }
        if (option == 16) {
            myWebView.loadUrl("http://www.indiabix.com/technical/dotnet/asp-dot-net/");
        }
        if (option == 17) {
            myWebView.loadUrl("http://www.indiabix.com/technical/dotnet/windows-workflow-foundation/");
        }
        if (option == 18) {
            myWebView.loadUrl("http://www.indiabix.com/technical/dotnet/application-deployment/");
        }
        if (option == 19) {
            myWebView.loadUrl("http://www.indiabix.com/technical/dotnet/cloud-computing/");
        }
        if (option == 20) {
            myWebView.loadUrl("http://www.indiabix.com/technical/dotnet/dot-net-programming-concepts/");
        }
        if (option == 21) {
            myWebView.loadUrl("http://www.indiabix.com/technical/dotnet/windows-controls/");
        }
        if (option == 22) {
            myWebView.loadUrl("http://www.indiabix.com/technical/dotnet/language-integrated-query-linq/");
        }
        if (option == 23) {
            myWebView.loadUrl("http://www.indiabix.com/technical/dotnet/xml/");
        }
        if (option == 24) {
            myWebView.loadUrl("http://www.indiabix.com/technical/dotnet/web-services/");
        }
        if (option == 25) {
            myWebView.loadUrl("http://www.indiabix.com/technical/dotnet/asp-dot-net-ajax/");
        }
        if (option == 26) {
            myWebView.loadUrl("http://www.indiabix.com/technical/dotnet/dot-net-assemblies/");
        }
        if (option == 27) {
            myWebView.loadUrl("http://www.indiabix.com/technical/software-testing/software-testing-basics/");
        }
        if (option == 28) {
            myWebView.loadUrl("http://www.indiabix.com/technical/software-testing/the-software-processs/");
        }
        if (option == 29) {
            myWebView.loadUrl("http://www.indiabix.com/technical/software-testing/six-sigma/");
        }
        if (option == 30) {
            myWebView.loadUrl("http://www.indiabix.com/technical/software-testing/automated-testing/");
        }
        if (option == 31) {
            myWebView.loadUrl("http://www.indiabix.com/technical/software-testing/testing-techniques/");
        }
        if (option == 32) {
            myWebView.loadUrl("http://www.indiabix.com/technical/software-testing/cmmi/");
        }
        if (option == 33) {
            myWebView.loadUrl("http://www.indiabix.com/technical/software-testing/metrics/");
        }
        if (option == 34) {
            myWebView.loadUrl("http://www.indiabix.com/technical/software-testing/testing-estimation/");
        }
        if (option == 35) {
            myWebView.getSettings().setJavaScriptEnabled(true);
            myWebView.loadUrl("http://www.indiabix.com/technical/technical/networking/");
        }
        if (option == 36) {
            myWebView.getSettings().setJavaScriptEnabled(true);
            myWebView.loadUrl("http://www.indiabix.com/networking/networking-basics/");
        }
        if (option == 37) {
            myWebView.getSettings().setJavaScriptEnabled(true);
            myWebView.loadUrl("http://www.indiabix.com/networking/tcp-ip/");
        }
        if (option == 38) {
            myWebView.getSettings().setJavaScriptEnabled(true);
            myWebView.loadUrl("http://www.indiabix.com/networking/ios-and-security-device-manager/");
        }
        if (option == 39) {
            myWebView.getSettings().setJavaScriptEnabled(true);
            myWebView.loadUrl("http://www.indiabix.com/networking/ip-routing/");
        }
        if (option == 40) {
            myWebView.getSettings().setJavaScriptEnabled(true);
            myWebView.loadUrl("http://www.indiabix.com/networking/spanning-tree-protocol/");
        }
        if (option == 41) {
            myWebView.getSettings().setJavaScriptEnabled(true);
            myWebView.loadUrl("http://www.indiabix.com/networking/security/");
        }
        if (option == 42) {
            myWebView.getSettings().setJavaScriptEnabled(true);
            myWebView.loadUrl("http://www.indiabix.com/networking/wireless-technologies/");
        }
        if (option == 43) {
            myWebView.getSettings().setJavaScriptEnabled(true);
            myWebView.loadUrl("http://www.indiabix.com/networking/wide-area-network");
        }
        if (option == 44) {
            myWebView.getSettings().setJavaScriptEnabled(true);
            myWebView.loadUrl("http://www.indiabix.com/networking/internetworking/");
        }
        if (option == 45) {
            myWebView.getSettings().setJavaScriptEnabled(true);
            myWebView.loadUrl("http://www.indiabix.com/networking/subnetting/");
        }
        if (option == 46) {
            myWebView.getSettings().setJavaScriptEnabled(true);
            myWebView.loadUrl("http://www.indiabix.com/networking/managing-a-cisco-internetwork/");
        }
        if (option == 47) {
            myWebView.getSettings().setJavaScriptEnabled(true);
            myWebView.loadUrl("http://www.indiabix.com/networking/eigrp-and-ospf/");
        }
        if (option == 48) {
            myWebView.getSettings().setJavaScriptEnabled(true);
            myWebView.loadUrl("http://www.indiabix.com/networking/virtual-lans/");
        }
        if (option == 49) {
            myWebView.getSettings().setJavaScriptEnabled(true);
            myWebView.loadUrl("http://www.indiabix.com/networking/network-address-translation/");
        }
        if (option == 50) {
            myWebView.getSettings().setJavaScriptEnabled(true);
            myWebView.loadUrl("http://www.indiabix.com/networking/ipv6/");
        }
        if (option == 51){
            myWebView.loadUrl("http://www.indiabix.com/technical/operating-systems/");
        }
        if (option == 52){
            myWebView.loadUrl("http://www.indiabix.com/technical/core-java/");
        }
        if (option == 53){
            myWebView.loadUrl("http://www.indiabix.com/technical/java-basics/");
        }
        if (option == 54){
            myWebView.loadUrl("http://www.indiabix.com/technical/advanced-java/");
        }
        if (option == 55){
            myWebView.loadUrl("http://www.indiabix.com/technical/dbms-basics/");
        }
        if (option == 56){
            myWebView.loadUrl("http://www.indiabix.com/technical/dbms/");
        }
        if (option == 57) {
            myWebView.loadUrl("http://www.indiabix.com/technical/sql-server-general-questions/");
        }
        if (option == 58) {
            myWebView.loadUrl("http://www.indiabix.com/technical/sql-server-common-questions/");
        }
        if (option == 59) {
            myWebView.loadUrl("http://www.indiabix.com/technical/sql-server-2008/");
        }
        if (option == 60) {
            myWebView.loadUrl("http://www.indiabix.com/technical/unix-file-managemnet/");
        }
        if (option == 61){
            myWebView.loadUrl("http://www.indiabix.com/technical/unix-memory-management/");
        }
        if (option == 62){
            myWebView.loadUrl("http://www.indiabix.com/technical/unix-process-management/");
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
