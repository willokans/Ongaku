package willproject.com.ongaku;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {


    private EditText mFullNameField;
    private EditText mEmailField;
    private EditText mPasswordField;

    private Button mSignUpBtn;
    private Button mBackBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        //connect references
        mFullNameField = (EditText) findViewById(R.id.nameTextField);
        mEmailField = (EditText) findViewById(R.id.email_Field);
        mPasswordField = (EditText) findViewById(R.id.editTextPassword);

        mSignUpBtn = (Button) findViewById(R.id.signUp);
        mBackBtn = (Button) findViewById(R.id.back);
    }
}
