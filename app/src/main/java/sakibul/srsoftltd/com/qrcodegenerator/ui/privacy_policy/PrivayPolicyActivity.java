package sakibul.srsoftltd.com.qrcodegenerator.ui.privacy_policy;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import sakibul.srsoftltd.com.qrcodegenerator.R;
import sakibul.srsoftltd.com.qrcodegenerator.databinding.ActivityPrivayPolicyBinding;

import android.os.Bundle;
import android.view.MenuItem;

public class PrivayPolicyActivity extends AppCompatActivity {

    ActivityPrivayPolicyBinding activity_privay_policy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activity_privay_policy= DataBindingUtil.setContentView(this, R.layout.activity_privay_policy);
        initializeToolbar();
    }


    private void initializeToolbar() {
        setSupportActionBar(activity_privay_policy.toolbar);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setDisplayShowHomeEnabled(true);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                break;

            default:
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
