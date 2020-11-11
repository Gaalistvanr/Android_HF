package ro.sapi.customlistview.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.List;

import ro.sapi.customlistview.R;
import ro.sapi.customlistview.adapter.CycleAdapter;
import ro.sapi.customlistview.model.Stuff;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvContacts;
    private CycleAdapter mAdapter;
    private List<Stuff> contacts;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvContacts = (RecyclerView) findViewById(R.id.listviewID);

        rvContacts.setHasFixedSize(true);

        final LinearLayoutManager layout=new LinearLayoutManager(MainActivity.this);


        rvContacts.setLayoutManager(layout);

        contacts = Stuff.getStuff();


        mAdapter = new CycleAdapter(MainActivity.this, contacts);


        rvContacts.setAdapter(mAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        return super.onOptionsItemSelected(item);
    }

}
