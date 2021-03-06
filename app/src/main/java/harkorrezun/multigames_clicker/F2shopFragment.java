package harkorrezun.multigames_clicker;

import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Harkor on 2018-03-26.
 */

public class F2shopFragment extends Fragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_f2_shop,container,false);
        ConstraintLayout scat1=view.findViewById(R.id.scat1);
        ConstraintLayout scat2=view.findViewById(R.id.scat2);
        ConstraintLayout scat3=view.findViewById(R.id.scat3);
        scat1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toCategory(1,R.string.football);
            }
        });
        scat2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toCategory(2,R.string.rl);
            }
        });
        scat3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toCategory(3,R.string.csgo);
            }
        });
        return view;
    }
    public void toCategory(int idCategory,int nameCategory){
        Fragment fragment =new F2shop2Fragment();
        FragmentManager fragmentManager=getFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        Bundle bundle=new Bundle();
        bundle.putInt("idCategory",idCategory);
        bundle.putString("nameCategory",getResources().getString(nameCategory));
        fragment.setArguments(bundle);
        fragmentTransaction.replace(R.id.rightContent,fragment);
        fragmentTransaction.commit();
    }


}
