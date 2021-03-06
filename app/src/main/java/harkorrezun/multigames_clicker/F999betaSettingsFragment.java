package harkorrezun.multigames_clicker;

import android.content.Context;
import android.content.SharedPreferences;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class F999betaSettingsFragment extends  Fragment {
SharedPreferences sharedPreferences;
SharedPreferences.Editor editor;
EditText carrots;
EditText multiplay;
Button save;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.activity_f999_beta_settings,container,false);
        sharedPreferences=getContext().getSharedPreferences("harkor.multigamesclicker",Context.MODE_PRIVATE);
        editor=sharedPreferences.edit();
        carrots=view.findViewById(R.id.carrots);
        multiplay=view.findViewById(R.id.multiplay);
        save=view.findViewById(R.id.save);
        getAll();
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String pass=multiplay.getText().toString();
                if(pass.equals("147")){
                    editor.putInt("carrots",Integer.parseInt(carrots.getText().toString()));
                    editor.commit();
                    Toast.makeText(getContext(),"Saved!",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getContext(),"WRONG PASSWORD!",Toast.LENGTH_SHORT).show();
                }
            }
        });
        return view;
    }
    public void getAll(){
    carrots.setText(sharedPreferences.getInt("carrots",0)+"");
    }


}
