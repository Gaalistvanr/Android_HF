package ro.sapi.customlistview.activity;

import android.os.StatFs;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import ro.sapi.customlistview.R;
import ro.sapi.customlistview.model.Stuff;

public class DetailActivity extends AppCompatActivity {

    public static final String EXTRA_CONTACT = "EXTRA_CONTACT";
    private Stuff mContact;
    private ImageView ivProfile;
    private TextView tvName;
    private TextView tvInfo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ivProfile = (ImageView) findViewById(R.id.imageView1ID);
        tvName = (TextView) findViewById(R.id.nameTextViewID);
        tvInfo = (TextView) findViewById(R.id.infoTextViewID);



        mContact=(Stuff) getIntent().getExtras().getSerializable(EXTRA_CONTACT);



        ivProfile.setImageResource(mContact.getImg());
        tvName.setText(mContact.getName());
        tvInfo.setText(mContact.getInfo());

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }
}