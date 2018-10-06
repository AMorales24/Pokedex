package angelomorales.com.pokedex;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;

public class PokemonFragment extends Fragment {
    private EditText mTitleField;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPokemon = new Pokemon();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_pokemon, container, false);

        mTitleField = (EditText) v.findViewById(R.id.pokemon_title);
        mTitleField.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(
                    CharSequence s, int start, int count, int after) {
                // Blank
            }

            @Override
            public void onTextChanged(
                    CharSequence s, int start, int before, int count) {
                mPokemon.setTitle(s.toString());
            }
            @Override
            public void afterTextChanged(Editable s) {

            }



        });



        return v;

    }
}


}
