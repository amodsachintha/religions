package com.example.amod.religions;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        this.webView = findViewById(R.id.religionDetails);
        this.webView.getSettings().setJavaScriptEnabled(true);
        this.webView.getSettings().setDomStorageEnabled(true);
        this.webView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                view.loadUrl(request.getUrl().toString());
                return false;
            }
        });
        this.webView.loadUrl("file:///android_asset/religions/index.html");
    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.search_religion) {
            this.webView.loadUrl("file:///android_asset/search/index.html");
        } else if (id == R.id.rel_home) {
            this.webView.loadUrl("file:///android_asset/religions/index.html");
        } else if (id == R.id.buddhism_ataglance) {
            this.webView.loadUrl("file:///android_asset/religions/buddhism/ataglance/index.html");
        } else if (id == R.id.buddhism_beliefs) {
            this.webView.loadUrl("file:///android_asset/religions/buddhism/beliefs/index.html");
        } else if (id == R.id.buddhism_history) {
            this.webView.loadUrl("file:///android_asset/religions/buddhism/history/index.html");
        } else if (id == R.id.christianity_ataglance) {
            this.webView.loadUrl("file:///android_asset/religions/christianity/ataglance/index.html");
        } else if (id == R.id.christianity_beliefs) {
            this.webView.loadUrl("file:///android_asset/religions/christianity/beliefs/index.html");
        } else if (id == R.id.christianity_history) {
            this.webView.loadUrl("file:///android_asset/religions/christianity/history/index.html");
        } else if (id == R.id.islam_ataglance) {
            this.webView.loadUrl("file:///android_asset/religions/islam/ataglance/index.html");
        } else if (id == R.id.islam_beliefs) {
            this.webView.loadUrl("file:///android_asset/religions/islam/beliefs/index.html");
        } else if (id == R.id.islam_history) {
            this.webView.loadUrl("file:///android_asset/religions/islam/history/index.html");
        } else if (id == R.id.hinduism_ataglance) {
            this.webView.loadUrl("file:///android_asset/religions/hinduism/ataglance/index.html");
        } else if (id == R.id.hinduism_beliefs) {
            this.webView.loadUrl("file:///android_asset/religions/hinduism/beliefs/index.html");
        } else if (id == R.id.hinduism_history) {
            this.webView.loadUrl("file:///android_asset/religions/hinduism/history/index.html");
        } else if (id == R.id.atheism_ataglance) {
            this.webView.loadUrl("file:///android_asset/religions/atheism/ataglance/index.html");
        } else if (id == R.id.atheism_beliefs) {
            this.webView.loadUrl("file:///android_asset/religions/atheism/beliefs/index.html");
        } else if (id == R.id.atheism_history) {
            this.webView.loadUrl("file:///android_asset/religions/atheism/history/index.html");
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
