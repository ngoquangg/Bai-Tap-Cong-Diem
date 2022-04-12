package ngoquang.bai1.baikt1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText UserName = findViewById(R.id.edtUserName);
        EditText PassWord = findViewById(R.id.edtPass);
        TextView Attempt = findViewById(R.id.tvAttempt);
        Button Login = findViewById(R.id.btnLogin);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = "maicuongtho";
                String password = "123";
                if(UserName.getText().toString().equals(username) && PassWord.getText().toString().equals(password)){
                    Toast.makeText(MainActivity.this, "User and Password is correct", Toast.LENGTH_SHORT).show();
                    Attempt.setText("User and Password is correct");
                }else{
                    Toast.makeText(MainActivity.this, "User and Password is wrong", Toast.LENGTH_SHORT).show();
                    Attempt.setText("User and Password is wrong");
                }
            }
        });
    }
}