package org.pltw.examples.collegeapp2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by rshowalter on 12/4/2017.
 */
public class ProfileFragment extends android.support.v4.app.Fragment
{

    private Profile mProfile;
    TextView mFirstName;
    TextView mLastName;

    EditText mEditFirstName;
    EditText mEditLastName;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        super.onCreateView(inflater, container, savedInstanceState);
        View rootView = inflater.inflate(R.layout.fragment_profile, container, false);

        //2.1.5#11 creates the object of the Profile class so that the First Name can be assigned to the text view item
        mProfile = new Profile();

        //2.1.5#11 wires the TextView item in the fragment_family_member.xml file to the instance vars mFirstName and mLastName
        mFirstName = (TextView) rootView.findViewById(R.id.ProfileFirstNameTextView);
        mLastName = (TextView) rootView.findViewById(R.id.ProfileLastNameTextView);

        //2.1.5#11 uses the field firstName from the mProfile object to set the value of mFirstName and mLastName
        //...which is the TextView label in the fragment_family_member.xml
        mFirstName.setText(mProfile.getFirstName());
        mLastName.setText(mProfile.getLastName());


        return rootView;
    }
}
