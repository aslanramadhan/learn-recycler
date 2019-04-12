package info.iclabs.learnrecycler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO (1) : Tambahkan Dependency Untuk RecyclerView Dengan Membuka Gradle Level Module:app
 * TODO (1.1) : Tambahkan Baris Berikut Pada Dependency : implementation 'com.android.support:recyclerview-v7:XX.XX.XX
 * TODO (1.2) : Ganti XX.XX.XX Sesuai Dengan Versi Pada AppCompat
 *
 * TODO (2) : Tambahkan Dependency Untuk CardView Dengan Membuka Gradle Level Module:app
 * TODO (2.1) : Tambahkan Baris Berikut Pada Dependency  : implementation 'com.android.support:cardview-v7:XX.XX.XXX
 * TODO (2.2) : Ganti XX.XX.XX Sesuai Dengan Versi Pada AppCompat
 */

public class MainActivity extends AppCompatActivity {

    // TODO (19) : Buatlah Object Adapter, List dan Recycler View
    List<DataModel> data = new ArrayList<>();
    DataAdapter adapter;

    RecyclerView rvData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO (20) : Hubungkan  rvData Dengan RecyclerView Pada XML Dengan method findViewById()

        // TODO (21) : Isi Object data Dengan Menggunakan Method add() Untuk Mengisi Data Nim, Nama dan NoTelp

        // Todo (22) : Set Layout Manager Pada rvData Dengan Menggunakan Method setLayoutManager dengan Nilai Parameter new LinearLayoutManager(this)

        // TODO (23) : Isi Data Adapter Dengan Object Data Pada Constructor DataAdapter
        // TODO (23.1) : Isi Adapter Dengan : adapter = new DataAdapter(data);

        // TODO (24) : Set Adapter Pada Object RecyclerView Dengan Object adapter dari Class DataAdapter

        // TODO (25) --- SELESAI LAKUKAN DEPLOY PADA PERANGKAT ANDROID ---
    }
}
