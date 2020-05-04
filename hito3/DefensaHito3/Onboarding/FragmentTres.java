package com.example.defensahito3.Onboarding;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.example.defensahito3.Basica;
import com.example.defensahito3.Cientifica;
import com.example.defensahito3.Custom;
import com.example.defensahito3.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentTres extends Fragment {

    private EditText etSelectapp,etUsername;
    private Button  descbas,descient,desccustom,selectbas,selectcient,selectcustom,btLogin;
    private ViewPager viewPager;
    private View view;



    public FragmentTres()
    {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        //initialize viewpager from main activity
        initializeInflater(inflater, container);

        //initialize components
        initializeComponents();

        //add click event to text Next and prev text
        eventClickAction();

        //return
        return view;
    }

    public void initializeInflater(LayoutInflater inflater, ViewGroup container)
    {
        view = inflater.inflate(R.layout.fragment_tres, container, false);
    }

    public void initializeComponents()
    {
        viewPager = getActivity().findViewById(R.id.viewPagerContainer);

        etSelectapp = view.findViewById(R.id.etSelectapp);
        etUsername = view.findViewById(R.id.etUsername);

        btLogin = view.findViewById(R.id.btLogin);

        descbas = view.findViewById(R.id.descbas);
        descient = view.findViewById(R.id.descient);
        desccustom = view.findViewById(R.id.desccustom);
        selectbas = view.findViewById(R.id.selectbas);
        selectcient = view.findViewById(R.id.selectcient);
        selectcustom = view.findViewById(R.id.selectcustom);

    }

    public void eventClickAction()
    {

        selectbas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etSelectapp.setText("Basica");
            }
        });
        selectcient.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etSelectapp.setText("Cientifica");
            }
        });
        selectcustom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etSelectapp.setText("Custom");
            }
        });
        descbas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Calculadora con operaciones simples básica", Toast.LENGTH_SHORT).show();
            }
        });
        descient.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Calculadora con operaciones avanzadas", Toast.LENGTH_SHORT).show();
            }
        });
        desccustom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Calculadora con operaciones para programadores", Toast.LENGTH_SHORT).show();
            }
        });
        btLogin.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String selectapp = etSelectapp.getText().toString().trim();
                String username = etUsername.getText().toString().trim();

                if(username.equals("") || selectapp .equals(""))
                {
                    Toast.makeText(getActivity(), "Debe llenar todos los campos", Toast.LENGTH_SHORT).show();
                }
                else if(selectapp.equals("Custom"))
                {
                    Intent intent = new Intent(getActivity(), Custom.class);
                    intent.putExtra("selectapp", selectapp);
                    intent.putExtra("username", username);

                    startActivity(intent);

                }
                else if(selectapp.equals("Basica"))
                {
                    Intent intent = new Intent(getActivity(), Basica.class);
                    intent.putExtra("selectapp", selectapp);
                    intent.putExtra("username", username);

                    startActivity(intent);

                }
                else if(selectapp.equals("Cientifica")) {
                    Intent intent = new Intent(getActivity(), Cientifica.class);
                    intent.putExtra("selectapp", selectapp);
                    intent.putExtra("username", username);

                    startActivity(intent);

                }
                else{
                    Toast.makeText(getActivity(), "Seleccione Calculadora", Toast.LENGTH_SHORT).show();
                }


            }
        });
    }
}