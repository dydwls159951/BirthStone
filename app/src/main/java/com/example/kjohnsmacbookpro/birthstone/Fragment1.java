package com.example.kjohnsmacbookpro.birthstone;

import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.Toast;

import static android.content.Context.LAYOUT_INFLATER_SERVICE;

public class Fragment1 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // xml 로 만들어준 프레그먼트를 자바 단에서 만들어줌
        ViewGroup rootGroup = (ViewGroup) inflater.inflate(R.layout.fragment_fragment1, container, false);
        Button test = rootGroup.findViewById(R.id.popupbutton);
        test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                @Override
                public void showDialog(DialogFrag)
                {
                    FragmentManager fragmentManager = getSupportFragmentManager();
                    dialogFragment.show(fragmentManager, "dialog");
                }
            }
        });

//        FragmentTransaction ft = getFragmentManager().beginTransaction();
//        Fragment prev = getFragmentManager().findFragmentByTag("dialog");
//        if (prev != null) {
//            ft.remove(prev);
//        }
//        ft.addToBackStack(null);
//        DialogFragment dialogFragment = new DialogFrag();
//        dialogFragment.show(ft, "dialog");


        return rootGroup;

    }
}

//        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//            // xml 로 만들어준 프레그먼트를 자바 단에서 만들어줌
//            ViewGroup rootGroup =(ViewGroup)inflater.inflate(R.layout.fragment_fragment1,container,false);
//            //StatusView statusView = (TextView) findViewById(R.id.statusView);
//            Button test = (Button) rootGroup.findViewById(R.id.popupbutton);
//            View popupView = inflater.inflate(R.layout.popup, null);
//
//            test.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(final View v) {
//
//                    LayoutInflater layoutInflater = (LayoutInflater)getActivity().getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//                    View popupView = layoutInflater.inflate(R.layout.popup, null);
//                    final PopupWindow popupWindow = new PopupWindow(
//                            popupView,
//                            ViewGroup.LayoutParams.WRAP_CONTENT,
//                            ViewGroup.LayoutParams.WRAP_CONTENT);
//
//                    popupView.isShown();
//
//                }
//
//
//            });
//
//
//        Button buttonEye = (Button) popupView.findViewById(R.id.accept);
//
//        buttonEye.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(final View v) {
//
//
//            }
//        });
