package br.usjt.deswebmob.activitylifecycle;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import br.usjt.deswebmob.activitylifecycle.util.StatusTracker;

public class ActivityB extends Activity {
    private String mActivityName;
    private TextView mStatusView;
    private TextView mStatusAllView;
    private StatusTracker mStatusTracker = StatusTracker.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

    }
}
