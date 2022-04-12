package ngoquang.bai1.baikt2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText Nhap = findViewById(R.id.edtNhap);
        RadioButton radioButton1 = findViewById(R.id.rb1);
        RadioButton radioButton2 = findViewById(R.id.rb2);
        RadioButton radioButton3 = findViewById(R.id.rb3);
        Button Tinh = findViewById(R.id.btnTinh);
        TextView KetQua = findViewById(R.id.tvKetQua);

        Tinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a = Float.parseFloat(Nhap.getText().toString());
                //String a = Number.getText().toString();
                //float b = Float.parseFloat(a);
                if (radioButton1.isChecked()){
                    float kq = (float) (a*0.13);
                    KetQua.setText("Your tip will be $" + kq);
                    Toast.makeText(MainActivity.this, "Your tip will be $" + kq, Toast.LENGTH_SHORT).show();
                }
                else
                if (radioButton2.isChecked()){
                    float kq = (float) (a*0.15);
                    KetQua.setText("Your tip will be $" + kq);
                    Toast.makeText(MainActivity.this, "Your tip will be $" + kq, Toast.LENGTH_SHORT).show();
                }
                else
                if (radioButton3.isChecked()){
                    float kq = (float) (a*0.18);
                    KetQua.setText("Your tip will be $" + kq);
                    Toast.makeText(MainActivity.this, "Your tip will be $" + kq, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}