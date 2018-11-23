package com.example.assignment2;

import android.app.Dialog;
import android.content.DialogInterface;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class UIDialogScreen extends DialogFragment {

    @Override
    public Dialog onCreateDialog (Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setMessage(R.string.dialog_read_to_fight)
                .setPositiveButton(R.string.ready, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        //FIGHT FIGHT FIGHT
                    }
                })
                .setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        //User cancels dialog and exits game
                    }
                        });

        //create the dialog/alert box and return it
        return builder.create();


       // setContentView(R.layout.activity_uidialog_screen);
    }
}
