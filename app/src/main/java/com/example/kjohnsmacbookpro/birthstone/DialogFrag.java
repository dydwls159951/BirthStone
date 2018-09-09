package com.example.kjohnsmacbookpro.birthstone;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
public class DialogFrag extends DialogFragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {
            return new AlertDialog.Builder(getActivity())
                    .setTitle("Title")
                    .setMessage("Sure you wanna do this!")
                    .setNegativeButton(R.string.cancel, new OnClickListener() {
                        @Override
                        public void onClick(View view) {

                        }
                    })
                    .setPositiveButton(android.R.string.yes,  new OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            // do something
                        }
                    })
                    .create();
        }
    }
}