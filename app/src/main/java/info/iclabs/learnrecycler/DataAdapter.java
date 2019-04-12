package info.iclabs.learnrecycler;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

//TODO (10) : Class DataAdapter Merupakan Kelas Yang Menjadi Adapter Dan Merupakan Turunan Dari RecyclerView.Adapter
// TODO (10.1) : INFO - RecyclerView.Adapter Merupakan Generic Class Yang Harus Memiliki Parameter Class View Holder
// TODO (10.2) : INFO - RecyclerView.Adapter Merupakan Abstract Yang Wajib Di Implementasi Semua Mehtod Yang Terdapat Didalamnya
public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder>{

    // TODO (11) : INFO - Object List Data Dibawah Berfungsi Untuk Menampung Data Yang Akan Diorganisir Kedalam RecyclerView
    // TODO (11.1) : Buat Konstruktor Untuk Mengisi DataModel Dibawah Ini
    List<DataModel> listData;

    // TODO (15) : Pada Method onCreateViewHolder Dilakukan Return ViewHolder Pada Inner Class Dengan Melakukan Inflating Layout
    // TODO (16) : Gunakan Object Berikut : View view = LayoutInflater.form(GetContext Dari Parent).inflate(Layout List, Parent, Dan Nilai False Pada Attach Root);
    // TODO (17) : Kembalikan View Holder Dengan Object View : return new ViewHolder(view);
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    // TODO (13) : Isi Data Pada ViewHolder Dengan Mengakses TextView Pada Inner Class View Holder Melalui Object holder Pada Parameter
    // TODO (14) : Pada Holder Ambil Posisi Dari List Data Kemudian Ambil Data Dengan Menggunakan Method Getter Pada Class Model
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }

    // TODO (12) : Ganti 0 Dengan Nilai Ukuran Dari Object List Data Menggunakan Method size
    @Override
    public int getItemCount() {
        return 0;
    }

    // TODO (8) : Dibawah Ini Merupakan Inner Class Untuk Membuat ViewHolder yang Merupakan Extends Dari Class ViewHolder Pada Recycler View
    // TODO (8.1) : Class Dibawah Ini Wajib Memiliki Konstruktor Yang Merujuk Pada Class Induknya
    class ViewHolder extends RecyclerView.ViewHolder {

        // TODO (9) : Buatlah 3 Object TextView dengan Nama tvNama, tvNim dan tvTelp
        public ViewHolder(View itemView) {
            super(itemView);
            // TODO (9) : Gunakan Method FindViewByID untuk Menghubungkan File XML dan Java Melalui itemView
        }
    }
}
