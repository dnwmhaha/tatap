package app.tatap.tatap;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.parse.ParseUser;

/**
 * Created by ethanswoo on 12/17/14.
 */
public class DispatchActivity extends Activity {

    public DispatchActivity() { }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        // check the current user
        if(ParseUser.getCurrentUser() != null)
        {
            startActivity(new Intent(this, MainActivity.class));
        }
        else
        {
            startActivity(new Intent(this, WelcomeActivity.class));
        }
    }
}
