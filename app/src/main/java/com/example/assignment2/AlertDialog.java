package com.example.assignment2;

public class AlertDialog {

    AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

    builder.setMessage(R.string.dialog_message)
           .setTitle(R.string.dialog_title);

    AlertDialog dialog = builder.create();
}
