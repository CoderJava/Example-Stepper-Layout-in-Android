package com.ysn.codepolitan_examplestepperlayout;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Step3Fragment extends Fragment {

    private View view;
    private TextView textViewNamaLengkap;
    private TextView textViewAlamat;
    private TextView textViewNamaIbu;
    private TextView textViewNamaAyah;

    public Step3Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_step3, container, false);
        loadComponent();
        return view;
    }

    private void loadComponent() {
        textViewNamaLengkap = (TextView) view.findViewById(R.id.text_view_nama_lengkap);
        textViewAlamat = (TextView) view.findViewById(R.id.text_view_alamat);
        textViewNamaIbu = (TextView) view.findViewById(R.id.text_view_nama_ibu);
        textViewNamaAyah = (TextView) view.findViewById(R.id.text_view_nama_ayah);

        Bundle bundle = getArguments();
        textViewNamaLengkap.setText(bundle.getString("namaLengkap"));
        textViewAlamat.setText(bundle.getString("alamat"));
        textViewNamaIbu.setText(bundle.getString("namaIbu"));
        textViewNamaAyah.setText(bundle.getString("namaAyah"));
    }

}
