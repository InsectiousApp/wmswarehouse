package com.example.akshay.warehouse.putaway;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Spinner;

import com.example.akshay.warehouse.R;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by akshay on 31/10/15.
 */
public class PutawayListSearchFragment extends Fragment {



    private Button bDisplayDateFrom;
   // private DatePicker dpResult;
    private Button btnChangeDate;

    private int year;
    private int month;
    private int day;

    static final int DATE_DIALOG_ID = 999;





    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.putaway_search_fragment, container, false);

        bDisplayDateFrom = (Button) rootView.findViewById(R.id.bdatefrom);
      //  btnChangeDate = (Button) findViewById(R.id.btnChangeDate);
      //  dpResult = (DatePicker)rootView.findViewById(R.id.dpResult);

        setCurrentDateOnView();
        addListenerOnButton();


        Spinner spinner = (Spinner)rootView.findViewById(R.id.spinner);

        // Spinner click listener
     //   spinner.setOnItemSelectedListener(getActivity());

        // Spinner Drop down elements
        List<String> categories = new ArrayList<String>();
        categories.add("Automobile");
        categories.add("Business Services");
        categories.add("Computers");
        categories.add("Education");
        categories.add("Personal");
        categories.add("Travel");

        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, categories);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner.setAdapter(dataAdapter);



        return rootView;
    }



    // display current date
    public void setCurrentDateOnView() {



        final Calendar c = Calendar.getInstance();
        year = c.get(Calendar.YEAR);
        month = c.get(Calendar.MONTH);
        day = c.get(Calendar.DAY_OF_MONTH);

        // set current date into textview
        bDisplayDateFrom.setText(new StringBuilder()
                // Month is 0 based, just add 1
                .append(month + 1).append("-").append(day).append("-")
                .append(year).append(" "));

        // set current date into datepicker
      //  dpResult.init(year, month, day, null);

    }




    public void addListenerOnButton() {



        bDisplayDateFrom.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Log.i("TAG", "reached onClick");

                getActivity().showDialog(DATE_DIALOG_ID);
                onCreateDialog(DATE_DIALOG_ID);
            }

        });

    }



    public Dialog onCreateDialog(int id) {

        Log.i("TAG", "reached onCreateDialogMethod");

        switch (id) {
            case DATE_DIALOG_ID:
                // set date picker as current date
                Log.i("TAG", "reached swichcase");
                return new DatePickerDialog(getActivity(), datePickerListener, year, month,day);
        }
        return null;
    }

    private DatePickerDialog.OnDateSetListener datePickerListener
            = new DatePickerDialog.OnDateSetListener() {

        // when dialog box is closed, below method will be called.
        public void onDateSet(DatePicker view, int selectedYear,
                              int selectedMonth, int selectedDay) {
            year = selectedYear;
            month = selectedMonth;
            day = selectedDay;

            // set selected date into textview
            bDisplayDateFrom.setText(new StringBuilder().append(month + 1)
                    .append("-").append(day).append("-").append(year)
                    .append(" "));

            // set selected date into datepicker also
         //   dpResult.init(year, month, day, null);

        }
    };




}
