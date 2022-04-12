package ngoquang.bai1.baikt3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText Item, GiaTri;
    Button LuuThem, LuuSua, Xoa;
    ListView listView;
    ArrayList<String> listData;
    ArrayAdapter adapter;
    int vt;
    String gt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Item = (EditText) findViewById(R.id.edtItem);
        GiaTri = (EditText) findViewById(R.id.edtGiaTri);
        LuuThem = (Button) findViewById(R.id.btnLuuThem);
        LuuSua = (Button) findViewById(R.id.btnLuuSua);
        Xoa = (Button) findViewById(R.id.btnXoa);
        listView = (ListView) findViewById(R.id.lv);
        listData = new ArrayList<>();
        listData.add("Content");
        listData.add("Graphics");
        listData.add("Hardware");
        listData.add("Media");
        listData.add("NFC");
        listData.add("OS");
        listData.add("Preference");
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listData);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Item.setText(listData.get((int) l));
                GiaTri.setText("" + i);
                vt = i;
            }
        });

        LuuThem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gt = Item.getText().toString();
                listData.add(gt);
                adapter.notifyDataSetChanged();
            }
        });

        LuuSua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gt = Item.getText().toString();
                listData.set(vt, gt);
                adapter.notifyDataSetChanged();
            }
        });

        Xoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listData.remove(vt);
                adapter.notifyDataSetChanged();
            }
        });
    }
}