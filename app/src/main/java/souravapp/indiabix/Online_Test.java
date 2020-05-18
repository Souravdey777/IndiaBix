package souravapp.indiabix;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.ListFragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Online_Test extends AppCompatActivity {

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    private SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_online__test);


        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);


    }

    public static class GeneralOT extends ListFragment {
        public GeneralOT() {
        }
        String[] GOT={"Online Aptitude Test",
                "Online Verbal Ability Test",
                "Online Logical Reasoning Test",
                "Online Verbal Reasoning Test",
                "Online Non Verbal Reasoning Test",
                "Online Data Interpretation Test",
                "Online General Knowledge Test"};

        @Override
        public void onListItemClick(ListView l, View v, int position, long id) {
            Intent i = new Intent(getActivity(),WEBVIEW22.class);
            i.putExtra("option",position);
            startActivity(i);
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(inflater.getContext(),
                    android.R.layout.simple_list_item_activated_1,GOT);
            setListAdapter(adapter);
            return super.onCreateView(inflater, container, savedInstanceState);
        }
    }

    public static class TechnicalOT extends ListFragment {
        public TechnicalOT() {
        }
        String[] TOT={"Online C Programming Test",
                "Online Java Programming Test",
                "Online Database Test"};

        @Override
        public void onListItemClick(ListView l, View v, int position, long id) {
            Intent i = new Intent(getActivity(),WEBVIEW22.class);
            i.putExtra("option",position+7);
            startActivity(i);
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(inflater.getContext(),
                    android.R.layout.simple_list_item_activated_1,TOT);
            setListAdapter(adapter);
            return super.onCreateView(inflater, container, savedInstanceState);
        }
    }



    public static class EngineeringOT extends ListFragment {
        public EngineeringOT() {
        }
        String[] EOT={"Online Electronics Test",
                "Online Digital Electronics Test",
                "Online Electronic Devices Test",
                "Online Electrical Engineering Test",
                "Online Technical Drawing Test",
                "Online Engineering Mechanics Test"};

        @Override
        public void onListItemClick(ListView l, View v, int position, long id) {
            Intent i = new Intent(getActivity(),WEBVIEW22.class);
            i.putExtra("option",position+10);
            startActivity(i);
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(inflater.getContext(),
                    android.R.layout.simple_list_item_activated_1,EOT);
            setListAdapter(adapter);
            return super.onCreateView(inflater, container, savedInstanceState);
        }
    }

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a PlaceholderFragment (defined as a static inner class below).
            switch (position) {
                case 0:
                    GeneralOT fragment = new GeneralOT();
                    return fragment;
                case 1:
                    TechnicalOT fragment1 = new TechnicalOT();
                    return fragment1;
                case 2:
                    EngineeringOT fragment2 = new EngineeringOT();
                    return fragment2;
            }
            return null;
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return 3;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "GENERAL ONLINE TEST";
                case 1:
                    return "TECHNICAL ONLINE TEST";
                case 2:
                    return "ENGINEERING ONLINE TEST";
            }
            return null;
        }
    }
}
